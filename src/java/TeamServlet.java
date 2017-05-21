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
@WebServlet(urlPatterns = {"/TeamServlet"})
public class TeamServlet extends HttpServlet {

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
            int index = 0; //จำนวนcolของdb
            int page_run = 1; //รันในdbบอกว่าอยู่หน้าไหน
            int page_count = 0; // จำนวนหน้าที่ต้องใช้
            List<String> Team_ID = new ArrayList<String>();
            List<String> Team_Name = new ArrayList<String>();
            List<String> Team_Tag = new ArrayList<String>();
            List<String> Game_ID = new ArrayList<String>();
            List<String> Team_Cap = new ArrayList<String>();
            List<String> Team_Phone = new ArrayList<String>();
            List<String> Team_Image = new ArrayList<String>();
            List<String> Team_mem_num = new ArrayList<String>();
            try {
                Statement user = conn.createStatement();
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                String sql = "SELECT Team_ID FROM db_accessadmin.Team";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    index+=1;
                }
                //index -= 1;
                user.close();
            } catch (SQLException e) {
                out.println(e);
            }
            page_count = index/6;
            if(index % 6 > 0){
                page_count += 1;
            }
            //ดึงข้อมูลที่ต้องใช้
            try{
                Statement data = conn.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Team where Team_ID >=1";
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                ResultSet rs = data.executeQuery(sql);
                while(rs.next()){
                    Team_ID.add(rs.getString("Team_ID"));
                    Team_Name.add(rs.getString("Team_Name"));
                    Team_Tag.add(rs.getString("Team_Tag"));
                    Game_ID.add(rs.getString("Game_ID"));
                    //Team_Cap.add(rs.getString("Team_Cap"));
                    Statement stmt5 = conn.createStatement();
                    String sql5 = "SELECT P_Ign FROM db_accessadmin.Player where P_Username = '" + rs.getString("Team_Cap")+"'";
                    ResultSet rs5 = stmt5.executeQuery(sql5);
                    rs5.next();
                    Team_Cap.add(rs5.getString("P_Ign"));
                    Team_Phone.add(rs.getString("Team_Phone"));
                    Team_mem_num.add(rs.getString("Team_mem_num"));
                    if(rs.getString("Team_Image").equals("") || rs.getString("Team_Image").equals("NoDisplay")){
                        Team_Image.add("http://i.imgur.com/rZjcXgi.jpg");
                    }
                    else{
                        Team_Image.add("http://i.imgur.com/"+rs.getString("Team_Image")+".jpg");
                    }
                    stmt5.close();
                }
                data.close();
            } catch(SQLException e){out.println(e);}
            //out.print(index +""+ page_run+""+ page_count);
            //response.sendRedirect("playerJSP.jsp");
            //out.println(page_count);
            /*for (int i=0;i < Team_ID.size();i++)
            {
                out.println(Team_ID.get(i));
                out.println(Team_Name.get(i));
                out.println(Team_Tag.get(i));
                out.println(Game_ID.get(i));
                out.println(Team_Cap.get(i));
                out.println(Team_Phone.get(i));
                out.println(Team_mem_num.get(i) + "<br>");
            }*/
            HttpSession session = request.getSession();
            session.setAttribute("Team_ID", Team_ID);
            session.setAttribute("Team_Name", Team_Name);
            session.setAttribute("Team_Tag", Team_Tag);
            session.setAttribute("Game_ID", Game_ID);
            session.setAttribute("Team_Cap", Team_Cap);
            session.setAttribute("Team_Phone", Team_Phone);
            session.setAttribute("Team_Image", Team_Image);
            session.setAttribute("page_count", page_count);
            session.setAttribute("Team_mem_num", Team_mem_num);
            if(request.getParameter("suc") != null){
            int suc = Integer.parseInt(request.getParameter("suc"));
            session.setAttribute("suc", suc);
            }
             //int suc = (int) session.getAttribute("suc");
             //out.println(suc);
             //if(suc == 1){
              //   out.println(suc);
              response.sendRedirect("teamJSP.jsp");
            // }
            // else{
             //   out.println(suc); 
              //response.sendRedirect("playerJSP-unlogin.jsp");   
            // }
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
