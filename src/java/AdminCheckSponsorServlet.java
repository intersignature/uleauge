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
@WebServlet(urlPatterns = {"/AdminCheckSponsorServlet"})
public class AdminCheckSponsorServlet extends HttpServlet {

    Connection conn;

    @Override
    public void init() throws ServletException {
        conn = (Connection) getServletContext().getAttribute("conn");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String admin_Sponsor_ID = request.getParameter("admin_Sponsor_ID");
            String admin_Sponsor_Name = request.getParameter("admin_Sponsor_Name");
            String admin_hide_Sponsor_ID = request.getParameter("admin_hide_Sponsor_ID");
            String sql = "UPDATE db_accessadmin.Sponsor SET Sponsor_ID=?,Sponsor_Name=? where Sponsor_ID=?";
            PreparedStatement update = conn.prepareStatement(sql);
            update.setInt(1, Integer.parseInt(admin_Sponsor_ID));
            update.setString(2, admin_Sponsor_Name);
            update.setInt(3, Integer.parseInt(admin_hide_Sponsor_ID));
            update.execute();
            update.close();
            response.sendRedirect("AdminSponserServlet");
        } catch (SQLException ex) {
            Logger.getLogger(AdminCheckSponsorServlet.class.getName()).log(Level.SEVERE, null, ex);
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
