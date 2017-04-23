/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
 * @author LAB203_42
 */
@WebServlet(urlPatterns = {"/EditProfileServlet"})
public class EditProfileServlet extends HttpServlet {
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
            
            try {
                HttpSession session = request.getSession();
                int p_id = (int) session.getAttribute("P_ID");
                Statement conn = connection.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Player where P_ID = " + p_id;
                ResultSet rs = conn.executeQuery(sql);
                while(rs.next()){
                    session.setAttribute("username", rs.getString("P_Username"));
                    session.setAttribute("password", rs.getString("P_Password"));
                    session.setAttribute("fname", rs.getString("P_FName"));
                    session.setAttribute("lname", rs.getString("P_lName"));
                    session.setAttribute("email", rs.getString("P_Email"));
                    session.setAttribute("fb", rs.getString("P_Facebook"));
                    session.setAttribute("university", rs.getString("P_University"));
                    session.setAttribute("faculty", rs.getString("P_Faculty"));
                    session.setAttribute("phone", rs.getString("P_Phone"));
                    session.setAttribute("ign", rs.getString("P_Ign"));
                    session.setAttribute("id", rs.getString("P_ID"));
                    session.setAttribute("image", rs.getString("P_Image"));
                }
            } catch (SQLException e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }
            response.sendRedirect("EditProfileJSP.jsp");
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
