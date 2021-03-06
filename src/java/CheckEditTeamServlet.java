/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/CheckEditTeamServlet"})
public class CheckEditTeamServlet extends HttpServlet {

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
            String Team_Name = request.getParameter("Team_Name");
            String Team_Tag = request.getParameter("Team_Tag");
            String Team_Phone = request.getParameter("Team_Phone");
            String Team_Image = request.getParameter("Team_Image");
            String Team_ID = request.getParameter("Team_ID");
            HttpSession session = request.getSession();
            session = request.getSession();
            int Game_ID = Integer.parseInt(request.getParameter("Game_ID"));
            int index = 0;
            char ans_teamname = '1';
            char ans_teamtag = '1';
            char ans_teamphone = '1';
            char ans_teamunjoin = '1';
            try {
                Statement user = conn.createStatement();
                String sql = "SELECT Team_Name,Game_ID,Team_Tag FROM db_accessadmin.Team where Team_ID != " + Team_ID;
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("Team_Name").toLowerCase().equals(Team_Name.toLowerCase())) { //ถ้าซ้ำ
                        ans_teamname = '0';
                    } 
                    if(rs.getString("Team_Tag").toLowerCase().equals(Team_Tag.toLowerCase())){
                        ans_teamtag = '0';
                    }
                    index += 1;
                    
                }
                
            } catch (SQLException ex) {
                response.sendRedirect("/Project/ErrorJSP.jsp");
            }
            //ถ้าเป็นcapเก่า
               
            
            
            Pattern pf = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher mn = pf.matcher(Team_Name);
            boolean bn = mn.find();
            if("".equals(Team_Name)|| bn || "".equals(Team_Name)){
                ans_teamname = '0';
            }
            
            Matcher mt = pf.matcher(Team_Tag);
            boolean bt = mt.find();
            if("".equals(Team_Tag)|| bt){
                ans_teamtag = '0';
            }
            
            if(Team_Phone.contains("[a-zA-Z]+") == true || Team_Phone.length() != 10 || "".equals(Team_Phone)){
                ans_teamphone = '0';

            }
            if(ans_teamname=='1' &&ans_teamtag=='1' &&ans_teamphone=='1' &&ans_teamunjoin=='1'){
                String sql = "UPDATE db_accessadmin.Team SET Team_Name=?, Team_Tag=?,Team_Phone=? where Team_ID=?";
                PreparedStatement update = conn.prepareStatement(sql);
                update.setString(1, Team_Name);
                update.setString(2, Team_Tag);
                update.setString(3, Team_Phone);
                //update.setString(5, Team_Image);
                update.setInt(4, Integer.parseInt(Team_ID));
                update.execute();
                update.close();
                /*out.println(ans_teamname);
                out.println(ans_teamtag);
                out.println(ans_teamphone);
                out.println(ans_teamunjoin);
                out.println( (String) session.getAttribute("username"));*/
                response.sendRedirect("/Project/editTeamSuccess.jsp");
            }
            else{
                session.setAttribute("Team_Name", Team_Name);
                session.setAttribute("Team_Tag", Team_Tag);
                session.setAttribute("Team_Phone", Team_Phone);
                session.setAttribute("Team_Image", Team_Image);

                session.setAttribute("Team_ID", Team_ID);
                session.setAttribute("Game_ID", Game_ID);
                session.setAttribute("is_Team_Name", ans_teamname);
                session.setAttribute("is_Team_Tag", ans_teamtag);
                session.setAttribute("is_Team_Phone", ans_teamphone);

                /*out.println(ans_teamname);
                out.println(ans_teamtag);
                out.println(ans_teamphone);
                out.println(ans_teamunjoin);
                out.println( (String) session.getAttribute("username"));*/
                response.sendRedirect("/Project/EditTeamErrorJSP.jsp");
            }
        } catch (SQLException ex) {
            response.sendRedirect("/Project/ErrorJSP.jsp");
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
