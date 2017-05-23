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
@WebServlet(urlPatterns = {"/Player_001Servlet"})
public class Player_001Servlet extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("player"));
            List<String> team_id = new ArrayList<String>();
            List<String> team_name = new ArrayList<String>();
            try {   
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Player where P_ID = " + id;
                ResultSet rs = stmt.executeQuery(sql);
                HttpSession session = request.getSession();
                while(rs.next()){
                    session.setAttribute("fname", rs.getString("P_FName"));
                    session.setAttribute("lname", rs.getString("P_LName"));
                    session.setAttribute("email", rs.getString("P_Email"));
                    session.setAttribute("ign", rs.getString("P_Ign"));
                    session.setAttribute("fb", rs.getString("P_Facebook"));
                    session.setAttribute("faculty", rs.getString("P_Faculty"));
                    session.setAttribute("university", rs.getString("P_University"));
                    session.setAttribute("phone", rs.getString("P_Phone"));
                    if(rs.getString("P_Image").equals("") || rs.getString("P_Image").equals("NoDisplay")){
                        session.setAttribute("P_Image", "http://i.imgur.com/rZjcXgi.jpg");
                    }
                    else{
                        session.setAttribute("P_Image", "assets\\img\\profile user\\"+rs.getString("P_Image"));
                    }
                    session.setAttribute("Prouser", rs.getString("P_Username"));
                    
                }
                String user_link = "";
                Statement stmt0 = conn.createStatement();
                String sql0 = "select P_Username from db_accessadmin.Player where P_ID = " + id;
                ResultSet rs0 = stmt0.executeQuery(sql0);
                rs0.next();
                user_link = rs0.getString("P_Username");
                stmt0.close();
                Statement stmt1 = conn.createStatement();
                String sql1 = "select Team_ID from db_accessadmin.Player_Join where P_Username = '" + user_link + "'";
                ResultSet rs1 = stmt1.executeQuery(sql1);
                while(rs1.next()){
                    Statement stmt2 = conn.createStatement();
                    String sql2 = "SELECT Team_Name FROM db_accessadmin.Team where Team_ID = " + rs1.getInt("Team_ID");
                    ResultSet rs2 = stmt2.executeQuery(sql2);
                    rs2.next();
                    team_name.add(rs2.getString("Team_Name"));
                    team_id.add(rs1.getString("Team_ID"));
                    stmt2.close();
                }
                stmt.close();
                stmt1.close();
                session.setAttribute("team_name", team_name);
                session.setAttribute("team_id", team_id);
                out.println(team_name);
                out.println(team_id);
            } catch (Exception e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }
            response.sendRedirect("player_info.jsp");
            
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
