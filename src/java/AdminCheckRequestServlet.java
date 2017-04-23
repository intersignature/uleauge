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
@WebServlet(urlPatterns = {"/AdminCheckRequestServlet"})
public class AdminCheckRequestServlet extends HttpServlet {

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
            String admin_Request_ID = request.getParameter("admin_Request_ID");
            String admin_Request_Teamname = request.getParameter("admin_Request_Teamname");
            String admin_Request_Address = request.getParameter("admin_Request_Address");
            String admin_Request_Location = request.getParameter("admin_Request_Location");
            String admin_Request_Exp = request.getParameter("admin_Request_Exp");
            String admin_Request_Promote = request.getParameter("admin_Request_Promote");
            String admin_Request_Email = request.getParameter("admin_Request_Email");
            String admin_Request_Facebook = request.getParameter("admin_Request_Facebook");
            String admin_Request_Cause = request.getParameter("admin_Request_Cause");
            String admin_hide_Request_ID = request.getParameter("admin_hide_Request_ID");
            String sql = "UPDATE db_accessadmin.Request SET Request_ID=?,Request_Teamname=?,Request_Address=?,Request_Location=?,Request_Exp=?,Request_Promote=?,Request_Email=?,"
                    + "Request_Facebook=?,Request_Cause=? where Request_ID=?";
            PreparedStatement update = connection.prepareStatement(sql);
            update.setInt(1, Integer.parseInt(admin_Request_ID));
            update.setString(2, admin_Request_Teamname);
            update.setString(3, admin_Request_Address);
            update.setString(4, admin_Request_Location);
            update.setString(5, admin_Request_Exp);
            update.setString(6, admin_Request_Promote);
            update.setString(7, admin_Request_Email);
            update.setString(8, admin_Request_Facebook);
            update.setString(9, admin_Request_Cause);
            //update.setString(10, admin_hide_Request_ID);
            update.setInt(10, Integer.parseInt(admin_hide_Request_ID));
            update.execute();
            response.sendRedirect("AdminRequestServlet");
        } catch (SQLException ex) {
            out.println(ex);
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
