/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
 * @author intersignature
 */
@WebServlet(urlPatterns = {"/UpdateIdTourServlet"})
public class UpdateIdTourServlet extends HttpServlet {

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
            HttpSession session = request.getSession();
            String id = (String) session.getAttribute("admin_hide_Tour_ID");
            int real_id = Integer.parseInt(id)-1;
            Statement stmt = connection.createStatement();
            String sql = "SELECT Tour_ID FROM db_accessadmin.Tournament where Tour_ID > " + real_id;
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String sql1 = "UPDATE db_accessadmin.Tournament\n" +
                              "SET Tour_ID = ?" + "\n" +
                              "WHERE Tour_ID = ?" + ";";
                PreparedStatement update = connection.prepareStatement(sql1);
                update.setInt(1, Integer.parseInt(rs.getString("Tour_ID"))-1);
                update.setInt(2, Integer.parseInt(rs.getString("Tour_ID")));
                update.execute();
                update.close();
            }
            stmt.close();
            response.sendRedirect("AdminTournamentServlet");
        } catch (SQLException ex) {
            response.sendRedirect("/Project/ErrorJSP.jsp");
            Logger.getLogger(UpdateIdTourServlet.class.getName()).log(Level.SEVERE, null, ex);
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
