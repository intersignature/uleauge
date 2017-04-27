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
@WebServlet(urlPatterns = {"/AdminCheckTeamServlet"})
public class AdminCheckTeamServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;
    private Connection connection;
    public void init(){
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
            /* TODO output your page here. You may use following sample code. */
            String admin_Team_ID = request.getParameter("admin_Team_ID");
            String admin_Team_Name = request.getParameter("admin_Team_Name");
            String admin_Team_Tag = request.getParameter("admin_Team_Tag");
            String admin_Game_ID = request.getParameter("admin_Game_ID");
            String admin_Team_Cap = request.getParameter("admin_Team_Cap");
            String admin_Team_Phone = request.getParameter("admin_Team_Phone");
            String admin_hide_Team_ID = request.getParameter("admin_hide_Team_ID");
            String admin_Team_Image = request.getParameter("admin_Team_Image");
            String sql = "UPDATE db_accessadmin.Team SET Team_ID=?,Team_Name=?,Team_Tag=?,Game_ID=?,Team_Cap=?,Team_Phone=?,Team_Image=? where Team_ID=?";
            PreparedStatement update = connection.prepareStatement(sql);
            update.setInt(1, Integer.parseInt(admin_Team_ID));
            update.setString(2, admin_Team_Name);
            update.setString(3, admin_Team_Tag);
            update.setInt(4, Integer.parseInt(admin_Game_ID));
            update.setString(5, admin_Team_Cap);
            update.setString(6, admin_Team_Phone);
            update.setString(7, admin_Team_Image);
            update.setInt(8, Integer.parseInt(admin_hide_Team_ID));
            update.execute();
            update.close();
            response.sendRedirect("AdminTeamServlet");
        } catch (SQLException ex) {
            Logger.getLogger(AdminCheckTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("/Project/ErrorJSP.jsp");
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
