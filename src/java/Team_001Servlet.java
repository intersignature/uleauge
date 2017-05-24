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
@WebServlet(urlPatterns = {"/Team_001Servlet"})
public class Team_001Servlet extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("team_id"));
            List<String> data = new ArrayList<String>();
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Team where Team_ID = " + id;
                ResultSet rs = stmt.executeQuery(sql);
                List<String> mem_fname = new ArrayList<String>();
                List<String> mem_ign = new ArrayList<String>();
                List<String> mem_lname = new ArrayList<String>();
                List<String> mem_id = new ArrayList<String>();
                Statement stmt3 = conn.createStatement();
                String sql3 = "SELECT P_Username FROM db_accessadmin.Player_Join where Team_ID = " + id;
                ResultSet rs3 = stmt3.executeQuery(sql3);
                HttpSession session = request.getSession();
                Statement stmt4 = conn.createStatement();
                while (rs3.next()) {
                    String sql4 = "SELECT P_FName, P_Ign, P_LName, P_ID FROM db_accessadmin.Player where P_Username = '" + rs3.getString("P_Username")+"'";
                    ResultSet rs4 = stmt4.executeQuery(sql4);
                    while (rs4.next()) {
                        mem_fname.add(rs4.getString("P_FName"));
                        mem_ign.add(rs4.getString("P_Ign"));
                        mem_lname.add(rs4.getString("P_LName"));
                        mem_id.add(rs4.getString("P_ID"));
                    }
                }
                while (rs.next()) {
                    session.setAttribute("teamname", rs.getString("Team_Name"));
                    session.setAttribute("teamtag", rs.getString("Team_Tag"));
                    String gameid = rs.getString("Game_ID");
                    Statement stmt2 = conn.createStatement();
                    String sql2 = "SELECT Game_Name FROM db_accessadmin.Game where Game_ID = " + gameid;
                    ResultSet rs2 = stmt2.executeQuery(sql2);
                    rs2.next();
                    Statement stmt5 = conn.createStatement();
                    String sql5 = "SELECT P_Ign FROM db_accessadmin.Player where P_Username = '" + rs.getString("Team_Cap")+"'";
                    ResultSet rs5 = stmt5.executeQuery(sql5);
                    rs5.next();
                    session.setAttribute("gameid", rs2.getString("Game_Name"));
                    session.setAttribute("teamcap", rs5.getString("P_Ign"));
                    session.setAttribute("teamphone", rs.getString("Team_Phone"));
                    session.setAttribute("teammemnum", rs.getString("Team_mem_num"));
                    session.setAttribute("mem_fname", mem_fname);
                    session.setAttribute("mem_ign", mem_ign);
                    session.setAttribute("mem_lname", mem_lname);
                    session.setAttribute("mem_id", mem_id);
                    if (rs.getString("Team_Image").equals("") || rs.getString("Team_Image").equals("NoDisplay")) {
                        session.setAttribute("Team_Image", "http://i.imgur.com/rZjcXgi.jpg");
                    } else {
                        session.setAttribute("Team_Image", "assets\\img\\profile user\\" + rs.getString("Team_Image"));
                    }
                    session.setAttribute("Prouser", rs.getString("Team_name"));
                    /*out.println(session.getAttribute("mem_fname"));
                    out.println(session.getAttribute("mem_ign"));
                    out.println(session.getAttribute("mem_ign"));*/
                    response.sendRedirect("Team_info.jsp");
                }
            } catch (Exception e) {
                out.println(e);
                
                
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
