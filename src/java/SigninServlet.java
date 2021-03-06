

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
 * @author CPCust
 */
@WebServlet(urlPatterns = {"/SigninServlet"})
public class SigninServlet extends HttpServlet {

    Connection conn;

    @Override
    public void init() throws ServletException {
        conn = (Connection) getServletContext().getAttribute("conn");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            String result_pass="";
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            result_pass = hash.toString(16);
            while(result_pass.length() < 32) {
                result_pass = "0" + result_pass;
                }
            String from = request.getParameter("from");
            String roles = "";
            String useimage = "";
            int P_ID = -1;
            //out.println(from);
            //out.println(username);
            //out.println(password);
            HttpSession session = request.getSession();
            int suc = 0;
            session.setAttribute("suc", suc);
            try {
                
                Statement stmt = conn.createStatement();
                String sql = "SELECT P_Username, P_Password,P_ID, P_Roles, P_Image FROM db_accessadmin.Player WHERE P_Username = '" + username + "'";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("P_Username").equals(username) && rs.getString("P_Password").equals(result_pass)) {
                        suc = 1;
                        if(rs.getString("P_Image").equals("") || rs.getString("P_Image").equals("NoDisplay") ){
                            useimage = "http://i.imgur.com/rZjcXgi.jpg";
                        }
                        else{
                            useimage = "assets\\img\\profile user\\"+rs.getString("P_Image");
                        }
                        roles = rs.getString("P_Roles");
                    } else {
                        roles = "";
                        suc = 0;
                    }
                    P_ID = rs.getInt("P_ID");
                   
                }
                stmt.close();
                //out.println(roles);
            } catch (Exception e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }

            
           
            if (suc == 1) {
                session.setAttribute("roles", roles);
                session.setAttribute("username", username);
                session.setAttribute("suc", suc);
                session.setAttribute("P_ID", P_ID);
                session.setAttribute("useimage", useimage);
                session.setAttribute("from", from);
                if(roles.equals("admin")){
                    response.sendRedirect("AdminUserServlet");
                }
                else if(useimage.equals("http://i.imgur.com/rZjcXgi.jpg")){
                    response.sendRedirect("uploadJSP.jsp");
                }
                else{
                    response.sendRedirect(from);
                }
            } else if (suc == 0) {
                session.setAttribute("suc", suc);
                response.sendRedirect("login.html");
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
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
