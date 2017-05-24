/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
@WebServlet(urlPatterns = {"/AdminAddUserServlet"})
public class AdminAddUserServlet extends HttpServlet {

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
            String admin_ID_add = request.getParameter("admin_ID_add");
            String admin_Username_add = request.getParameter("admin_Username_add");
            String admin_Password_add = request.getParameter("admin_Password_add");
            String result_pass = "";
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(admin_Password_add.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            result_pass = hash.toString(16);
            while(result_pass.length() < 32) {
                result_pass = "0" + result_pass;
                }
            String admin_Fullname_add = request.getParameter("admin_Fullname_add");
            String admin_Lastname_add = request.getParameter("admin_Lastname_add");
            String admin_ign_add = request.getParameter("admin_ign_add");
            String admin_Email_add = request.getParameter("admin_Email_add");
            String admin_Facebook_add = request.getParameter("admin_Facebook_add");
            String admin_Faculty_add = request.getParameter("admin_Faculty_add");
            String admin_University_add = request.getParameter("admin_University_add");
            String admin_Phone_add = request.getParameter("admin_Phone_add");
            String admin_Role_add = request.getParameter("admin_Role_add");
            String admin_Image_add = request.getParameter("admin_Image_add");
            String sql = "INSERT INTO db_accessadmin.Player (P_Username, P_Password, P_FName, P_LName, P_Ign, P_Email, P_Facebook, P_Faculty, P_University, P_Phone, P_ID , P_Roles , P_Image)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insert = conn.prepareStatement(sql);
            insert.setString(1, admin_Username_add);
            insert.setString(2, result_pass);
            insert.setString(3, admin_Fullname_add);
            insert.setString(4, admin_Lastname_add);
            insert.setString(5, admin_ign_add);
            insert.setString(6, admin_Email_add);
            insert.setString(7, admin_Facebook_add);
            insert.setString(8, admin_Faculty_add);
            insert.setString(9, admin_University_add);
            insert.setString(10, admin_Phone_add);
            out.println(admin_ID_add);
            insert.setInt(11, Integer.parseInt(admin_ID_add));
            insert.setString(12, admin_Role_add);
            insert.setString(13, admin_Image_add);
            insert.execute();
            insert.close();
            response.sendRedirect("AdminUserServlet");
        } catch (SQLException ex) {
            Logger.getLogger(AdminAddUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("/Project/ErrorJSP.jsp");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AdminAddUserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
