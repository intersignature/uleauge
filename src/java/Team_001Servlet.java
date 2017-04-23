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
            int id = Integer.parseInt(request.getParameter("team_id"));
            List<String> data = new ArrayList<String>();
            try {   
                Statement stmt = connection.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Team where Team_ID = " + id;
                ResultSet rs = stmt.executeQuery(sql);
                HttpSession session = request.getSession();
                while(rs.next()){
                    session.setAttribute("teamname", rs.getString("Team_Name"));
                    session.setAttribute("teamtag", rs.getString("Team_Tag"));
                    String gameid = rs.getString("Game_ID");
                    Statement stmt2 = connection.createStatement();
                    String sql2 = "SELECT Game_Name FROM db_accessadmin.Game where Game_ID = " + gameid;
                    ResultSet rs2 = stmt2.executeQuery(sql2);
                    rs2.next();
                    session.setAttribute("gameid", rs2.getString("Game_Name"));
                    session.setAttribute("teamcap", rs.getString("Team_Cap"));
                    session.setAttribute("teamphone", rs.getString("Team_Phone"));
                    session.setAttribute("teammemnum", rs.getString("Team_mem_num"));

                    if(rs.getString("Team_Image").equals("") || rs.getString("Team_Image").equals("NoDisplay")){
                        session.setAttribute("Team_Image", "http://i.imgur.com/rZjcXgi.jpg");
                    }
                    else{
                        session.setAttribute("Team_Image", "http://i.imgur.com/"+rs.getString("Team_Image")+".jpg");
                    }
                    session.setAttribute("Prouser", rs.getString("Team_name"));
                    
                }
            } catch (Exception e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }
            response.sendRedirect("Team_info.jsp");
            
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
