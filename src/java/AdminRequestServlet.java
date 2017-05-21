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
import java.util.ArrayList;
import java.util.List;
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
 * @author intersignature
 */
@WebServlet(urlPatterns = {"/AdminRequestServlet"})
public class AdminRequestServlet extends HttpServlet {

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
            List<Integer> admin_Request_ID = new ArrayList<Integer>();
            List<String> admin_Request_Teamname = new ArrayList<String>();
            List<String> admin_Request_Address = new ArrayList<String>();
            List<String> admin_Request_Location = new ArrayList<String>();
            List<String> admin_Request_Exp = new ArrayList<String>();
            List<String> admin_Request_Promote = new ArrayList<String>();
            List<String> admin_Request_Email = new ArrayList<String>();
            List<String> admin_Request_Facebook = new ArrayList<String>();
            List<String> admin_Request_Cause = new ArrayList<String>();
            try {
                Statement user = conn.createStatement();
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                String sql = "SELECT * FROM db_accessadmin.Request where Request_ID >= 1";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    admin_Request_ID.add(rs.getInt("Request_ID"));
                    admin_Request_Teamname.add(rs.getString("Request_Teamname"));
                    admin_Request_Address.add(rs.getString("Request_Address"));
                    admin_Request_Location.add(rs.getString("Request_Location"));
                    admin_Request_Exp.add(rs.getString("Request_Exp"));
                    admin_Request_Promote.add(rs.getString("Request_Promote"));
                    admin_Request_Email.add(rs.getString("Request_Email"));
                    admin_Request_Facebook.add(rs.getString("Request_Facebook"));
                    admin_Request_Cause.add(rs.getString("Request_Cause"));
                }
                user.close();
            } catch (SQLException e) {
                out.println(e);
                response.sendRedirect("/Project/ErrorJSP.jsp");
            }
            HttpSession session = request.getSession();
            session.setAttribute("admin_Request_ID", admin_Request_ID);
            session.setAttribute("admin_Request_Teamname", admin_Request_Teamname);
            session.setAttribute("admin_Request_Address", admin_Request_Address);
            session.setAttribute("admin_Request_Location", admin_Request_Location);
            session.setAttribute("admin_Request_Exp", admin_Request_Exp);
            session.setAttribute("admin_Request_Promote", admin_Request_Promote);
            session.setAttribute("admin_Request_Email", admin_Request_Email);
            session.setAttribute("admin_Request_Facebook", admin_Request_Facebook);
            session.setAttribute("admin_Request_Cause", admin_Request_Cause);
            //out.println(admin_Request_ID);
            response.sendRedirect("AdminRequest.jsp");
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
