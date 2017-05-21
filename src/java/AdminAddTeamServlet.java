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
@WebServlet(urlPatterns = {"/AdminAddTeamServlet"})
public class AdminAddTeamServlet extends HttpServlet {

    Connection conn;
    @Override
    public void init() throws ServletException {
        conn = (Connection) getServletContext().getAttribute("conn");
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
            String admin_Team_Image = request.getParameter("admin_Team_Image");
            //out.println(admin_Team_ID + admin_Team_Name +admin_Team_Tag + admin_Game_ID + admin_Team_Cap + admin_Team_Phone);
            String sql = "INSERT INTO db_accessadmin.Team (Team_ID, Team_Name, Team_Tag, Game_ID, Team_Cap, Team_Phone, Team_Image)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insert = conn.prepareStatement(sql);
            insert.setInt(1, Integer.parseInt(admin_Team_ID));
            insert.setString(2, admin_Team_Name);
            insert.setString(3, admin_Team_Tag);
            insert.setInt(4, Integer.parseInt(admin_Game_ID));
            insert.setString(5, admin_Team_Cap);
            insert.setString(6, admin_Team_Phone);
            insert.setString(7, admin_Team_Image);
            insert.execute();
            insert.close();
            
            String sql1 = "INSERT INTO db_accessadmin.Player_Join (P_Username, Team_ID)"+ " VALUES (?, ?)";
            PreparedStatement insert1 = conn.prepareStatement(sql1);
            insert1.setString(1, admin_Team_Cap);
            insert1.setInt(2, Integer.parseInt(admin_Team_ID));
            insert1.execute();
            insert1.close();
            response.sendRedirect("AdminTeamServlet");
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
