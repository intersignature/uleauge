/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author intersignature
 */
@WebServlet(urlPatterns = {"/AdminAddTourServlet"})
public class AdminAddTourServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;
    private Connection connection;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void init(){
        try {
            connection = dbesport.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SignupServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String admin_Tour_ID = request.getParameter("admin_Tour_ID");
            String admin_Tour_Maxteam = request.getParameter("admin_Tour_Maxteam");
            String admin_Tour_Location = request.getParameter("admin_Tour_Location");
            String admin_Tour_Reward = request.getParameter("admin_Tour_Reward");
            String admin_Tour_Name = request.getParameter("admin_Tour_Name");
            String admin_Tour_StartDate = request.getParameter("admin_Tour_StartDate");
            String admin_Tour_view_count = request.getParameter("admin_Tour_view_count");
            String admin_Tour_EndDate = request.getParameter("admin_Tour_EndDate");
            String admin_Organize_ID = request.getParameter("admin_Organize_ID");
            String admin_Game_ID = request.getParameter("admin_Game_ID");
            String admin_Tour_Table_Link = request.getParameter("admin_Tour_Table_Link");
            String sql = "INSERT INTO db_accessadmin.Tournament (Tour_ID, Tour_Maxteam, Tour_Location, Tour_Reward, Tour_Name, Tour_StartDate, Tour_view_count, Tour_EndDate, Organize_ID, Game_ID, Tour_Table_Link)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setInt(1, Integer.parseInt(admin_Tour_ID));
            insert.setInt(2, Integer.parseInt(admin_Tour_Maxteam));
            insert.setString(3, admin_Tour_Location);
            insert.setString(4, admin_Tour_Reward);
            insert.setString(5, admin_Tour_Name);
            insert.setString(6, admin_Tour_StartDate);
            insert.setInt(7, Integer.parseInt(admin_Tour_view_count));
            insert.setString(8, admin_Tour_EndDate);
            insert.setInt(9, Integer.parseInt(admin_Organize_ID));
            insert.setInt(10, Integer.parseInt(admin_Game_ID));
            insert.setString(11, admin_Tour_Table_Link);
            insert.execute();
            insert.close();
            response.sendRedirect("AdminTournamentServlet");
        } catch (SQLException ex) {
            Logger.getLogger(AdminAddTourServlet.class.getName()).log(Level.SEVERE, null, ex);
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
