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
 * @author CPCust
 */
@WebServlet(urlPatterns = {"/regisTourServlet"})
public class regisTourServlet extends HttpServlet {

    @Resource(name = "dbesport")
    private DataSource dbesport;
        private Connection connection;
 public void init() {
        try {
            connection = dbesport.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SignupServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int tour_id = Integer.parseInt(request.getParameter("tour_id"));
            int team_id = 0;
            int ans_cap = 1;
            int ans_noregis = 1;
            int ans_game = 1;
            int game_team = 0;
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username"); 
            out.println(username+"user");
            try {
                Statement stmt = connection.createStatement();
                String sql = "SELECT Team_ID,Game_ID,Team_Cap FROM db_accessadmin.Team where Team_Cap = '"+username+"'";
                
                ResultSet rs = stmt.executeQuery(sql);
               
                 while (rs.next()) {
                     if(rs.getString("Team_Cap").equals(username)){
                         ans_cap = 1;
                         game_team = 1;
                         team_id = rs.getInt("Team_ID");
                        }
                     else{
                         ans_cap= 0;
                     }
                     }
                 
                 Statement stmt2 = connection.createStatement();
                String sql2 = "SELECT Tour_ID,Game_ID FROM db_accessadmin.Tournament where Tour_ID = " + tour_id;
                          ResultSet rs2 = stmt2.executeQuery(sql2);
                        while(rs2.next()){
                            out.println(rs2.getInt("Game_ID")+"Game_tour");
                          if(game_team == rs2.getInt("Game_ID")){
                              ans_game = 1;
                          }
                          else{
                              ans_game = 0;
                          }
                        }
                        stmt2.close();
                Statement stmt3 = connection.createStatement();
                 String sql3 = "SELECT Tour_ID,Team_ID FROM db_accessadmin.Generate";
                 ResultSet rs3 = stmt3.executeQuery(sql3);
                  while (rs3.next()) {
                      if(rs3.getInt("Team_ID")!= team_id && rs3.getInt("Tour_ID") != tour_id){
                          ans_noregis = 1;
                      }
                      else{
                        ans_noregis = 0;
                      }
                  }
                  stmt3.close();
                  stmt.close();
                }catch (Exception e) {
                     response.sendRedirect("/Project/ErrorJSP.jsp");
                out.println(e);
                
            }
    
                out.println(game_team+"gameteam");
                
                    out.println(ans_cap +"cap");
                  out.println(ans_game +"game");
                  out.println(ans_noregis +"noregis");
                  
            if(ans_cap+ans_game+ans_noregis == 3){
                       String sql4 = "INSERT INTO db_accessadmin.Generate (Tour_ID, Team_ID)"+ 
                    " VALUES (?, ?);";
                        PreparedStatement insert = connection.prepareStatement(sql4);   
                        insert.setInt(1, tour_id);
                        insert.setInt(2, team_id);
                        insert.execute();
                        insert.close();
                        response.sendRedirect("regisTourSuc.jsp");
                        
                  }
            else{
                 session.setAttribute("ans_cap", ans_cap);
              session.setAttribute("ans_noregis", ans_noregis);
                 session.setAttribute("ans_game", ans_game);
                response.sendRedirect("regisTourFail.jsp");
            }
            
        }
        
         catch (SQLException ex) {
              response.sendRedirect("/Project/ErrorJSP.jsp");
            Logger.getLogger(CreateTeamServlet.class.getName()).log(Level.SEVERE, null, ex);
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
