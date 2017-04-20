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
            String gameteam = request.getParameter("gameteam");
            String teamphone = request.getParameter("teamphone");
            out.println(teamname);
            out.println(teamtag);
            out.println(gameteam);
            out.println(teamphone);
            int ans_teamname = 1;
            int ans_teamtag = 1;
            int ans_teamphone = 1;
            int ans_teamunjoin = 1;
            int team_id = 0;
            int index = 0;
            String team_cap = (String) session.getAttribute("username");
            try {
                Statement user = connection.createStatement();
                String sql = "SELECT Team_Name,Game_ID,Team_Tag  FROM db_accessadmin.Team";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("Team_Name").equals(teamname) && rs.getString("Game_ID").equals(gameteam) ) { //ถ้าซ้ำ
                        ans_teamname = 0;
                    } 
                    if(rs.getString("Team_Tag").equals(teamtag) ){
                        ans_teamtag = 0;
                    }
                    index += 1;
                    
                }
                out.println(team_id);
                Statement user2 = connection.createStatement();
                String sql1 = "SELECT P_Username  FROM db_accessadmin.Player_Join";
                ResultSet rs1 = user2.executeQuery(sql1);
                while (rs1.next()) {
                    if (rs.getString("P_Username").equals(team_cap) && rs.getString("Game_ID").equals(gameteam) ) { //ถ้าซ้ำ
                        ans_teamunjoin = 0;
                    } 
                    
                }
            } catch (SQLException e) {
                out.println(e);
            }
           
            Pattern pf = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher mn = pf.matcher(teamname);
            boolean bn = mn.find();
            if("".equals(teamname)|| bn ){
                ans_teamname = 0;
            }
             if(ans_teamname == 0|| "".equals(teamname)){
                session.setAttribute("ans_teamname", '0');
            }
           Matcher mt = pf.matcher(teamtag);
            boolean bt = mt.find();
            if("".equals(teamtag)|| bt ){
                ans_teamtag = 0;
            }
            if(ans_teamtag == 0|| "".equals(teamtag)){
                session.setAttribute("ans_teamtag", '0');
            }
            
            if(teamphone.contains("[a-zA-Z]+") == true || teamphone.length() != 10){
                ans_teamphone = 0;

            }
            if(ans_teamphone == 0|| "".equals(teamphone)){
                session.setAttribute("ans_teamphone", '0');
            }
           
            if(ans_teamname+ans_teamtag+ans_teamphone == 3){
                 out.println(ans_teamname+ans_teamtag+ans_teamphone);
            String sql = "INSERT INTO db_accessadmin.Team (Team_ID,Team_Name,Team_Tag,Game_ID,Team_Cap,Team_Phone)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insert = connection.prepareStatement(sql);   
            insert.setInt(1, index);
            insert.setString(2, teamname);
            insert.setString(3, teamtag);
            insert.setString(4, gameteam);
            insert.setString(5, team_cap);
            insert.setString(6, teamphone);
            insert.execute();
            
            String sql3 = "INSERT INTO db_accessadmin.Player_Join (P_Username, Team_ID)"+ 
                    " VALUES (?, ?)";
            PreparedStatement insert1 = connection.prepareStatement(sql3);  
            insert1.setString(1, team_cap);
            insert1.setInt(2, index);
            
            insert1.execute();
            //response.sendRedirect("/Project/signupSuccess.jsp");
            }
            else{
                //response.sendRedirect("/Project/signup.html");
                //HttpSession session = request.getSession();
                session.setAttribute("username", teamname);
                session.setAttribute("fname", teamtag);
                session.setAttribute("lname", gameteam);
                session.setAttribute("email", team_cap);
                session.setAttribute("fb", teamphone);
                //response.sendRedirect("/Project/signupFailJSP.jsp");
                
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
