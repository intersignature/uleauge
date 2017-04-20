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
@WebServlet(urlPatterns = {"/AdminCheckUserServlet"})
public class AdminCheckUserServlet extends HttpServlet {

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
            String admin_ID = request.getParameter("admin_ID");
            String admin_Username = request.getParameter("admin_Username");
            String admin_Password = request.getParameter("admin_Password");
            String admin_Fullname = request.getParameter("admin_Fullname");
            String admin_Lastname = request.getParameter("admin_Lastname");
            String admin_ign = request.getParameter("admin_ign");
            String admin_Email = request.getParameter("admin_Email");
            String admin_Facebook = request.getParameter("admin_Facebook");
            String admin_Faculty = request.getParameter("admin_Faculty");
            String admin_University = request.getParameter("admin_University");
            String admin_Phone = request.getParameter("admin_Phone");
            String admin_Role = request.getParameter("admin_Role");
            String admin_Image = request.getParameter("admin_Image");
            String admin_hide_ID = request.getParameter("admin_hide_ID");
            String sql = "UPDATE db_accessadmin.Player SET P_Username=?,P_Password=?,P_FName=?,P_LName=?,P_Ign=?,P_Email=?,P_Facebook=?,"
                    + "P_Faculty=?,P_University=?,P_Phone=?, P_ID=?,P_Roles=?,P_Image=? where P_ID=?";
            PreparedStatement update = connection.prepareStatement(sql);   
            update.setString(1, admin_Username);
            update.setString(2, admin_Password);
            update.setString(3, admin_Fullname);
            update.setString(4, admin_Lastname);
            update.setString(5, admin_ign);
            update.setString(6, admin_Email);
            update.setString(7, admin_Facebook);
            update.setString(8, admin_Faculty);
            update.setString(9, admin_University);
            update.setString(10, admin_Phone);
            update.setInt(11, Integer.parseInt(admin_ID));
            update.setString(12, admin_Role);
            update.setString(13, admin_Image);
            update.setInt(14, Integer.parseInt(admin_hide_ID));
            update.execute();
            response.sendRedirect("AdminUserServlet");
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminCheckUserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
