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
 * @author Barjord
 */
@WebServlet(urlPatterns = {"/inviteServlet"})
public class inviteServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */private Connection connection;
        public void init(){
        try {
            connection = dbesport.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CreateTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                int gameinvite = Integer.parseInt(request.getParameter("gameinvite"));
                String prouser = request.getParameter("prouser");
                int caninvite = 0;
                HttpSession session = request.getSession();
                String username = (String) session.getAttribute("username"); 
                Statement user = connection.createStatement();
                String sql = "SELECT  T.Team_Cap, T.Game_ID ,T.Team_mem_num, G.Game_Max FROM db_accessadmin.Team T \n" +
                                "right join db_accessadmin.Game G\n" +
                                "on G.Game_ID = T.Game_ID\n" +
                                "WHERE T.Team_Cap = '"+username+"' and T.Game_ID = "+gameinvite+"";
               ResultSet rs = user.executeQuery(sql);
               while (rs.next()) {
                   if (rs.getString("Team_Cap").toLowerCase().equals(username.toLowerCase())&& rs.getInt("Team_mem_num")< rs.getInt("Game_Max")){// กัปตันรึเปล่า
                         caninvite = 1;
                   } 
                    
               }
               user.close();
               Statement user1 = connection.createStatement();
                String sql1 = "SELECT  P.P_Username, T.Game_ID FROM db_accessadmin.Player_Join P\n" +
                                    "right join db_accessadmin.Team T\n" +
                                    "on T.Team_ID = P.Team_ID\n" +
                                    "WHERE P.P_Username = '"+prouser+"'";
               ResultSet rs1 = user1.executeQuery(sql1);
               while (rs1.next()) {
                   if (rs1.getInt("Game_ID")== gameinvite){// กัปตันรึเปล่า
                         caninvite = 0;
                   } 
                    
               }
               user1.close();
               
               
               if(caninvite == 1){
                   //ต้องเช็คเคส เคยชวนไปแล้วด้วย
                   
                   Statement check = connection.createStatement();
                String check_invited = "SELECT  P.P_Username, T.Game_ID FROM db_accessadmin.Player_Join P\n" +
                                    "right join db_accessadmin.Team T\n" +
                                    "on T.Team_ID = P.Team_ID\n" +
                                    "WHERE P.P_Username = '"+prouser+"'";
               ResultSet rs_in = check.executeQuery(sql1);
               while (rs_in.next()) {
                   if (rs_in.getInt("Game_ID")== gameinvite){// กัปตันรึเปล่า
                         caninvite = 0;
                   } 
                    
               }
               user1.close();
                   out.println("invited");
                   //String sql = "INSERT INTO db_accessadmin.Invite (Team_ID,Team_Name,Team_Tag,Game_ID,Team_Cap,Team_Phone,Team_mem_num)"+ 
                    //" VALUES (?, ?, ?, ?, ?, ?,?);";
                    PreparedStatement insert = connection.prepareStatement(sql);   
                    insert.setInt(7, 1);
                    insert.execute();
                    insert.close();
               }
               else if(caninvite == 0){
                   out.println("can't invited");
               }
               
            } 
            
            
            catch (SQLException e) {
                out.println(e);
            }
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
