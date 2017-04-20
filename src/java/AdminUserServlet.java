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
@WebServlet(urlPatterns = {"/AdminUserServlet"})
public class AdminUserServlet extends HttpServlet {

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
            List<Integer> admin_ID = new ArrayList<Integer>();
            List<String> admin_Username = new ArrayList<String>();
            List<String> admin_Password = new ArrayList<String>();
            List<String> admin_Fullname = new ArrayList<String>();
            List<String> admin_Lastname = new ArrayList<String>();
            List<String> admin_ign = new ArrayList<String>();
            List<String> admin_Email = new ArrayList<String>();
            List<String> admin_Facebook = new ArrayList<String>();
            List<String> admin_Faculty = new ArrayList<String>();
            List<String> admin_University = new ArrayList<String>();
            List<String> admin_Phone = new ArrayList<String>();
            List<String> admin_Role = new ArrayList<String>();
            List<String> admin_Image = new ArrayList<String>();
            
            try {
                Statement user = connection.createStatement();
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= 1";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    admin_ID.add(rs.getInt("P_ID"));
                    admin_Username.add(rs.getString("P_Username"));
                    admin_Password.add(rs.getString("P_Password"));
                    admin_Fullname.add(rs.getString("P_FName"));
                    admin_Lastname.add(rs.getString("P_LName"));
                    admin_ign.add(rs.getString("P_Ign"));
                    admin_Email.add(rs.getString("P_Email"));
                    admin_Facebook.add(rs.getString("P_Facebook"));
                    admin_Faculty.add(rs.getString("P_Faculty"));
                    admin_University.add(rs.getString("P_University"));
                    admin_Phone.add(rs.getString("P_Phone"));
                    admin_Role.add(rs.getString("P_Roles"));
                    admin_Image.add(rs.getString("P_Image"));
                }
            } catch (SQLException e) {
                out.println(e);
            }
            
            HttpSession session = request.getSession();
            session.setAttribute("admin_ID", admin_ID);
            session.setAttribute("admin_Username", admin_Username);
            session.setAttribute("admin_Password", admin_Password);
            session.setAttribute("admin_Fullname", admin_Fullname);
            session.setAttribute("admin_Lastname", admin_Lastname);
            session.setAttribute("admin_ign", admin_ign);
            session.setAttribute("admin_Email", admin_Email);
            session.setAttribute("admin_Facebook", admin_Facebook);
            session.setAttribute("admin_Faculty", admin_Faculty);
            session.setAttribute("admin_University", admin_University);
            session.setAttribute("admin_Phone", admin_Phone);
            session.setAttribute("admin_Role", admin_Role);
            session.setAttribute("admin_Image", admin_Image);
            response.sendRedirect("AdminJSP.jsp");
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
