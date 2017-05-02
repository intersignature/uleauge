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
import javax.sql.DataSource;

/**
 *
 * @author Barjord
 */
@WebServlet(urlPatterns = {"/searchServlet"})
public class searchServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Connection connection;
        public void init(){
        try {
            connection = dbesport.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CreateTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String searchuser = request.getParameter("searchuser");
           String filter = request.getParameter("filter");
           if(filter.equals("Username")){
           int P_ID = -1;
           out.println(searchuser);
            try {
                Statement user = connection.createStatement();
                String sql = "SELECT P_ID,P_Roles ,P_Username FROM db_accessadmin.Player WHERE P_Username = '" + searchuser + "'";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("P_Username").toLowerCase().equals(searchuser.toLowerCase()) && !rs.getString("P_Roles").equals("admin")) { //ถ้าซ้ำ
                          P_ID = rs.getInt("P_ID");
                    } 
                    
                }

            } catch (SQLException e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }
            if(P_ID != -1){
                response.sendRedirect("Player_001Servlet?player="+P_ID);
            }
            else{
                response.sendRedirect("searchFail.jsp");
            }
           }else if(filter.equals("Team")){
               int Team_ID = -1;
           out.println(searchuser);
            try {
                Statement user = connection.createStatement();
                String sql = "SELECT Team_ID ,Team_Name FROM db_accessadmin.Team WHERE Team_Name = '" + searchuser + "'";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("Team_Name").toLowerCase().equals(searchuser.toLowerCase())) { //ถ้าซ้ำ
                          Team_ID = rs.getInt("Team_ID");
                    } 
                    
                }

            } catch (SQLException e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }
            if(Team_ID != -1){
                response.sendRedirect("Team_001Servlet?team_id="+Team_ID);
            }
            else{
                response.sendRedirect("searchFail.jsp");
            }
           }
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
