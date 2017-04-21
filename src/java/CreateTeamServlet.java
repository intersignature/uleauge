/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author CPCust
 */
@WebServlet(urlPatterns = {"/CreateTeamServlet"})
public class CreateTeamServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;
    private Connection connection;
        public void init(){
        try {
            connection = dbesport.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CreateTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
          String teamname = request.getParameter("Teamname");
            String teamtag = request.getParameter("Teamtag");
            int gameteam = Integer.parseInt(request.getParameter("gameteam"));
            String teamphone = request.getParameter("teamphone");
            String con = request.getParameter("condition");
            
            out.println(teamname);
            out.println(teamtag);
            out.println(gameteam);
            out.println(teamphone);
             out.println(con);
            int ans_teamname = 1;
            int ans_teamtag = 1;
            int ans_teamphone = 1;
            int ans_teamunjoin = 1;
            int ans_con = 1;
            int index = 0;
            String team_cap = (String) session.getAttribute("username");
            try {
                Statement user = connection.createStatement();
                String sql = "SELECT Team_Name,Game_ID,Team_Tag  FROM db_accessadmin.Team";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("Team_Name").toLowerCase().equals(teamname.toLowerCase()) && rs.getInt("Game_ID")== gameteam ) { //ถ้าซ้ำ
                        ans_teamname = 0;
                    } 
                    if(rs.getString("Team_Tag").toLowerCase().equals(teamtag.toLowerCase())  && rs.getInt("Game_ID")== gameteam ){
                        ans_teamtag = 0;
                    }
                    index += 1;
                    
                }
                Statement check_user = connection.createStatement();
                String sql_check = "SELECT T.Game_ID,P.P_Username\n" +
                                " FROM db_accessadmin.Player_Join P\n" +
                                "inner join db_accessadmin.Team T\n" +
                                "on T.Team_ID = P.Team_ID\n" +
                                "where P_Username = '"+team_cap+"';";
                ResultSet rs_check = check_user.executeQuery(sql_check);
                while (rs_check.next()) {
                    if (rs_check.getInt("Game_ID")== gameteam ) { //ถ้าซ้ำ
                        ans_teamunjoin = 0;
                    } 
                }
              
                
            } catch (SQLException e) {
                out.println(e);
            }
           
            Pattern pf = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher mn = pf.matcher(teamname);
            boolean bn = mn.find();
            if("".equals(teamname)|| bn || "".equals(teamname)){
                ans_teamname = 0;
            }
               
           Matcher mt = pf.matcher(teamtag);
            boolean bt = mt.find();
            if("".equals(teamtag)|| bt){
                ans_teamtag = 0;
            }
                
            
            if(teamphone.contains("[a-zA-Z]+") == true || teamphone.length() != 10 || "".equals(teamphone)){
                ans_teamphone = 0;

            }
                
           
             if(con == null){
                    ans_con = 0;
             }
            
                 out.println(ans_con+"<<<conคอนนนนนน");
             out.println(ans_teamname+ans_teamtag+ans_teamphone+ans_con+ans_teamunjoin);
            if(ans_teamname+ans_teamtag+ans_teamphone+ans_con+ans_teamunjoin == 5){
                out.println(index);
                    
            String sql = "INSERT INTO db_accessadmin.Team (Team_ID,Team_Name,Team_Tag,Game_ID,Team_Cap,Team_Phone)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement insert = connection.prepareStatement(sql);   
            insert.setInt(1, index+1);
            insert.setString(2, teamname);
            insert.setString(3, teamtag);
            insert.setInt(4, gameteam);
            insert.setString(5, team_cap);
            insert.setString(6, teamphone);
            insert.execute();
            
            String sql3 = "INSERT INTO db_accessadmin.Player_Join (P_Username, Team_ID)"+ 
                    " VALUES (?, ?);";
            PreparedStatement insert1 = connection.prepareStatement(sql3);  
            insert1.setString(1, team_cap);
            insert1.setInt(2, index+1);
            
            insert1.execute();
            response.sendRedirect("CreateTeamSuccess.jsp");
            }
            else{
                //response.sendRedirect("/Project/signup.html");
                //HttpSession session = request.getSession();
                 session.setAttribute("ans_teamtag", ans_teamtag);
              session.setAttribute("ans_teamname", ans_teamname);
                 session.setAttribute("ans_con", ans_con);
                 session.setAttribute("ans_teamunjoin", ans_teamunjoin);
                 session.setAttribute("ans_teamphone", ans_teamphone);
                session.setAttribute("teamname", teamname);
                session.setAttribute("teamtag", teamtag);
                session.setAttribute("gameteam", gameteam);
                session.setAttribute("team_cap", team_cap);
                session.setAttribute("teamphone", teamphone);
           
                response.sendRedirect("CreateTeamFail.jsp");
                
            }
            
                
            }
        catch (SQLException ex) {
            Logger.getLogger(CreateTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}