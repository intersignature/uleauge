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
@WebServlet(urlPatterns = {"/AdminTeamServlet"})
public class AdminTeamServlet extends HttpServlet {

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
            List<Integer> admin_Team_ID = new ArrayList<Integer>();
            List<String> admin_Team_Name = new ArrayList<String>();
            List<String> admin_Team_Tag = new ArrayList<String>();
            List<Integer> admin_Game_ID = new ArrayList<Integer>();
            List<String> admin_Team_Cap = new ArrayList<String>();
            List<String> admin_Team_Phone = new ArrayList<String>();
            List<String> admin_Team_Image = new ArrayList<String>();
            try {
                Statement user = connection.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Team where Team_ID >= 1";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    admin_Team_ID.add(rs.getInt("Team_ID"));
                    admin_Team_Name.add(rs.getString("Team_Name"));
                    admin_Team_Tag.add(rs.getString("Team_Tag"));
                    admin_Game_ID.add(rs.getInt("Game_ID"));
                    admin_Team_Cap.add(rs.getString("Team_Cap"));
                    admin_Team_Phone.add(rs.getString("Team_Phone"));
                    admin_Team_Image.add(rs.getString("Team_Image"));
                }
            HttpSession session = request.getSession();
            session.setAttribute("admin_Team_ID", admin_Team_ID);
            session.setAttribute("admin_Team_Name", admin_Team_Name);
            session.setAttribute("admin_Team_Tag", admin_Team_Tag);
            session.setAttribute("admin_Game_ID", admin_Game_ID);
            session.setAttribute("admin_Team_Cap", admin_Team_Cap);
            session.setAttribute("admin_Team_Phone", admin_Team_Phone);
            session.setAttribute("admin_Team_Image", admin_Team_Image);
            response.sendRedirect("AdminTeam.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(AdminTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
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
