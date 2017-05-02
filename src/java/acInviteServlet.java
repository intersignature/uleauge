/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/acInviteServlet"})
public class acInviteServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;
 private Connection connection;

    public void init() {
        try {
            connection = dbesport.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SignupServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            int team_id = Integer.parseInt(request.getParameter("team_id"));
            HttpSession session = request.getSession();
             String username = (String) session.getAttribute("username");
            String sql = "INSERT INTO db_accessadmin.Player_Join (Team_ID,P_Username)" +
            "VALUES (?,?);";
            PreparedStatement insert = connection.prepareStatement(sql);   
            insert.setInt(1, team_id);
            insert.setString(2, username);
            insert.execute();
            insert.close();
            String sql1 = "UPDATE db_accessadmin.Team " +
"                             SET Team_mem_num += 1" +
"                             WHERE Team_ID = ?";

            PreparedStatement update = connection.prepareStatement(sql1);   
            update.setInt(1, team_id);
            update.execute();
            update.close();
            try{
               Statement stmt = connection.createStatement();
                String sql3 = "select T.Team_mem_num, G.Game_Max FROM db_accessadmin.Team T" +
                            "join db_accessadmin.Game G" +
                            "on T.Game_ID = G.Game_ID" +
                            "where T.Team_ID = '"+ team_id + "'";
                ResultSet rs3 = stmt.executeQuery(sql3);
                while (rs3.next()) {
                    if(rs3.getInt("Team_mem_num") >= rs3.getInt("Game_Max")){
                        String sql4 = "delete from db_accessadmin.Invite" +
                            " where Team_ID = ?;";
                            PreparedStatement delete = connection.prepareStatement(sql4);   
                            delete.setInt(1, team_id);
                            delete.execute();
                            delete.close();
                        }
                }
                 stmt.close();
                
            } catch (SQLException e) {
                out.println(e);
            }
            String sql5 = "delete from db_accessadmin.Invite\n" +
"                                where Team_ID in(select Team_ID\n" +
"                                from  db_accessadmin.Team\n" +
"                                where Game_ID in ( select Game_ID\n" +
"                                from  db_accessadmin.Team\n" +
"                                where Team_ID = ? ) )  and P_Username = ?";
                            PreparedStatement delete1 = connection.prepareStatement(sql5);   
                            delete1.setInt(1, team_id);
                            delete1.setString(2, username);
                            delete1.execute();
                            delete1.close();
            response.sendRedirect("newsInvite.jsp");
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
