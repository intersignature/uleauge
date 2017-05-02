/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/PlayerServlet"})
public class PlayerServlet extends HttpServlet {

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
            int index = 0; //จำนวนcolของdb
            int page_run = 1; //รันในdbบอกว่าอยู่หน้าไหน
            int page_count = 0; // จำนวนหน้าที่ต้องใช้
            List<String> fname = new ArrayList<String>();
            List<String> lname = new ArrayList<String>();
            List<String> ign = new ArrayList<String>();
            List<String> email = new ArrayList<String>();
            List<String> fb = new ArrayList<String>();
            List<String> faculty = new ArrayList<String>();
            List<String> university = new ArrayList<String>();
            List<String> id = new ArrayList<String>();
            List<String> img = new ArrayList<String>();
            List<String> team_Name = new ArrayList<String>();
            List<String> team_User = new ArrayList<String>();
            List<Integer> team_User_ID = new ArrayList<Integer>();
            try {
                Statement user = connection.createStatement();
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                String sql = "SELECT P_Username FROM db_accessadmin.Player";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    index+=1;
                }
                index -= 1;
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
                Statement data = connection.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Player where P_ID >=1";
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                ResultSet rs = data.executeQuery(sql);
                while(rs.next()){
                    fname.add(rs.getString("P_FName"));
                    lname.add(rs.getString("P_LName"));
                    ign.add(rs.getString("P_Ign"));
                    email.add(rs.getString("P_Email"));
                    fb.add(rs.getString("P_Facebook"));
                    faculty.add(rs.getString("P_Faculty"));
                    university.add(rs.getString("P_University"));
                    id.add(rs.getString("P_ID"));
                    if(rs.getString("P_Image").equals("") || rs.getString("P_Image").equals("NoDisplay")){
                        img.add("http://i.imgur.com/rZjcXgi.jpg");
                    }
                    else{
                        img.add("http://i.imgur.com/"+rs.getString("P_Image")+".jpg");
                    }
                }
                data.close();
            } catch (SQLException ex) { 
                out.println(ex);
                response.sendRedirect("/Project/ErrorJSP.jsp");
                
            }
            try{
                Statement data1 = connection.createStatement();
                String sql = "SELECT * FROM db_accessadmin.Player_Join where P_Username != 'admin'";
                ResultSet rs1 = data1.executeQuery(sql);
                while(rs1.next()){
                    team_User.add(rs1.getString("P_Username"));
                    Statement data12 = connection.createStatement();
                    String sql2 = "SELECT Team_Name FROM db_accessadmin.Team where Team_ID =" + rs1.getInt("Team_ID");
                    ResultSet rs2 = data12.executeQuery(sql2);
                    rs2.next();
                    team_Name.add(rs2.getString("Team_Name"));
                    data12.close();
                }
                //out.println(team_User + "<br>");
                //out.println(team_Name);
                data1.close();
            } catch (SQLException ex) {
                Logger.getLogger(PlayerServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<team_User.size();i++){
                Statement data13 = connection.createStatement();
                String sql3 = "SELECT P_ID FROM db_accessadmin.Player where P_Username = '" + team_User.get(i) + "'";
                
                ResultSet rs3 = data13.executeQuery(sql3);
                rs3.next();
                //out.println(rs3.getString("P_ID")+"<br>");
                team_User_ID.add(rs3.getInt("P_ID"));
                out.println(team_User + "<br>");
                out.println(team_Name + "<br>");
                out.println(team_User_ID + "<br>");
            }
                
            //out.print(index +""+ page_run+""+ page_count);
            //response.sendRedirect("playerJSP.jsp");
            /*for (int i=0;i < fname.size();i++)
            {
                out.println(fname.get(i));
                out.println(lname.get(i));
                out.println(ign.get(i));
                out.println(email.get(i));
                out.println(fb.get(i));
                out.println(faculty.get(i));
                out.println(university.get(i) + "<br>");
            }*/
            HttpSession session = request.getSession();
            session.setAttribute("fname_list", fname);
            session.setAttribute("lname_list", lname);
            session.setAttribute("ign_list", ign);
            session.setAttribute("email_list", email);
            session.setAttribute("fb_list", fb);
            session.setAttribute("faculty_list", faculty);
            session.setAttribute("university_list", university);
            session.setAttribute("page_count", page_count);
            session.setAttribute("id_list", id);
            session.setAttribute("img_list", img);
            session.setAttribute("team_User", team_User);
            session.setAttribute("team_Name", team_Name);
            session.setAttribute("team_User_ID", team_User_ID);
            if(request.getParameter("suc") != null){
            int suc = Integer.parseInt(request.getParameter("suc"));
            session.setAttribute("suc", suc);
            }
             //int suc = (int) session.getAttribute("suc");
             //out.println(suc);
             //if(suc == 1){
              //   out.println(suc);
              response.sendRedirect("playerJSP.jsp");
            // }
            // else{
             //   out.println(suc); 
              //response.sendRedirect("playerJSP-unlogin.jsp");   
            // }
        } catch (SQLException ex) {
            out.println(ex);
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
