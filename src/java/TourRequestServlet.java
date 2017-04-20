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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
@WebServlet(urlPatterns = {"/TourRequestServlet"})
public class TourRequestServlet extends HttpServlet {

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
    public void init() {
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
            String teamname = request.getParameter("teamname");
            String address = request.getParameter("address");
            String location = request.getParameter("location");
            String exp = request.getParameter("exp");
            String promote = request.getParameter("promote");
            String email = request.getParameter("email");
            String fb = request.getParameter("fb");
            String cause = request.getParameter("cause");

            //String[] condition = request.getParameterValues("condition");
            int ans_overall = 0;

            if ("".equals(teamname)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_teamname", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_teamname", '0');
                ans_overall += 1;
            }

            if ("".equals(address)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_address", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_address", '0');
                ans_overall += 1;
            }

            if ("".equals(location)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_location", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_location", '0');
                ans_overall += 1;
            }

            if ("".equals(exp)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_exp", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_exp", '0');
                ans_overall += 1;
            }

            if ("".equals(promote)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_promote", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_promote", '0');
                ans_overall += 1;
            }

            //เช็คEmail
            if (email.contains("@")) {
                HttpSession session = request.getSession();
                session.setAttribute("is_email", '0');
                ans_overall += 1;
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_email", '1');
            }

            //เช็คfblink
            if ("".equals(fb)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_fb", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_fb", '0');
                ans_overall += 1;
            }

            //เช็คuniversity
            if ("".equals(cause)) {
                HttpSession session = request.getSession();
                session.setAttribute("is_cause", '1');
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("is_cause", '0');
                ans_overall += 1;
            }

            HttpSession session = request.getSession();
            //out.print((char) session.getAttribute("condition"));

            if (ans_overall == 8) {
                //แอดข้อมูล
                String sql = "INSERT INTO db_accessadmin.Request (Teamname, Address, Location, Exp, Promote, Email, Facebook, Cause)"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement insert = connection.prepareStatement(sql);
                insert.setString(1, teamname);
                insert.setString(2, address);
                insert.setString(3, location);
                insert.setString(4, exp);
                insert.setString(5, promote);
                insert.setString(6, email);
                insert.setString(7, fb);
                insert.setString(8, cause);
                insert.execute();
                response.sendRedirect("/Project/requestSuccessJSP.jsp");
            } else {
                //response.sendRedirect("/Project/signup.html");
                //HttpSession session = request.getSession();
                session.setAttribute("teamname", teamname);
                session.setAttribute("address", address);
                session.setAttribute("location", location);
                session.setAttribute("email", email);
                session.setAttribute("fb", fb);
                session.setAttribute("exp", exp);
                session.setAttribute("promote", promote);
                session.setAttribute("cause", cause);

                response.sendRedirect("/Project/requestFailJSP.jsp");

            }
            /*response.sendRedirect("/index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("</script>");*/
        } catch (SQLException ex) {
            Logger.getLogger(SignupServlet.class.getName()).log(Level.SEVERE, null, ex);
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
