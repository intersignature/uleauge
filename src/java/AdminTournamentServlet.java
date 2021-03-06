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
@WebServlet(urlPatterns = {"/AdminTournamentServlet"})
public class AdminTournamentServlet extends HttpServlet {

    Connection conn;

    @Override
    public void init() throws ServletException {
        conn = (Connection) getServletContext().getAttribute("conn");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            if(!session.getAttribute("roles").equals("admin")){
                response.sendRedirect("indexJSP.jsp");
            }
            else{
            List<Integer> admin_Tour_ID = new ArrayList<Integer>();
            List<Integer> admin_Tour_Maxteam = new ArrayList<Integer>();
            List<String> admin_Tour_Location = new ArrayList<String>();
            List<String> admin_Tour_Reward = new ArrayList<String>();
            List<String> admin_Tour_Name = new ArrayList<String>();
            List<String> admin_Tour_StartDate = new ArrayList<String>();
            List<Integer> admin_Tour_view_count = new ArrayList<Integer>();
            List<String> admin_Tour_EndDate = new ArrayList<String>();
            List<Integer> admin_Organize_ID = new ArrayList<Integer>();
            List<Integer> admin_Game_ID = new ArrayList<Integer>();
            List<String> admin_Tour_Table_Link = new ArrayList<String>();
            try {
                Statement user = conn.createStatement();
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                String sql = "SELECT * FROM db_accessadmin.Tournament";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    admin_Tour_ID.add(rs.getInt("Tour_ID"));
                    admin_Tour_Maxteam.add(rs.getInt("Tour_Maxteam"));
                    admin_Tour_Location.add(rs.getString("Tour_Location"));
                    admin_Tour_Reward.add(rs.getString("Tour_Reward"));
                    admin_Tour_Name.add(rs.getString("Tour_Name"));
                    admin_Tour_StartDate.add(rs.getString("Tour_StartDate"));
                    admin_Tour_view_count.add(rs.getInt("Tour_view_count"));
                    admin_Tour_EndDate.add(rs.getString("Tour_EndDate"));
                    admin_Organize_ID.add(rs.getInt("Organize_ID"));
                    admin_Game_ID.add(rs.getInt("Game_ID"));
                    admin_Tour_Table_Link.add(rs.getString("Tour_Table_Link"));
                }
                user.close();
            } catch (SQLException e) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
            }
            session.setAttribute("admin_Tour_ID", admin_Tour_ID);
            session.setAttribute("admin_Tour_Maxteam", admin_Tour_Maxteam);
            session.setAttribute("admin_Tour_Location", admin_Tour_Location);
            session.setAttribute("admin_Tour_Reward", admin_Tour_Reward);
            session.setAttribute("admin_Tour_Name", admin_Tour_Name);
            session.setAttribute("admin_Tour_StartDate", admin_Tour_StartDate);
            session.setAttribute("admin_Tour_view_count", admin_Tour_view_count);
            session.setAttribute("admin_Tour_EndDate", admin_Tour_EndDate);
            session.setAttribute("admin_Organize_ID", admin_Organize_ID);
            session.setAttribute("admin_Game_ID", admin_Game_ID);
            session.setAttribute("admin_Tour_Table_Link", admin_Tour_Table_Link);
            response.sendRedirect("AdminTournament.jsp");}
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
