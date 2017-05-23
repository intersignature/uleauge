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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CPCust
 */
@WebServlet(urlPatterns = {"/LeaveServlet"})
public class LeaveServlet extends HttpServlet {
    private Connection conn;
    public void init(){
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
            int team_id = Integer.parseInt(request.getParameter("team_id"));
            String username = request.getParameter("username");
            String memdel = "DELETE FROM db_accessadmin.Player_Join WHERE  Team_ID = ? and P_Username = ?";
            PreparedStatement delete = conn.prepareStatement(memdel);  
            delete.setInt(1, team_id);  
            delete.setString(2, username);  
            delete.execute();
            delete.close();
            
            String memleave = "Update db_accessadmin.Team  set Team_mem_num -= 1 WHERE  Team_ID = ?";
            PreparedStatement update = conn.prepareStatement(memleave);  
            update.setInt(1, team_id);  
            update.execute();
            update.close();
            response.sendRedirect("MyTeam.jsp");
        } catch (SQLException ex) {
            response.sendRedirect("/Project/ErrorJSP.jsp");
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
