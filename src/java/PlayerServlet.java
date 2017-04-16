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
            try {
                Statement user = connection.createStatement();
                //String sql = "SELECT * FROM db_accessadmin.Player where P_ID >= "+ (1+6*page_run) + "and P_ID <= " + (6*(page_run+1)) ;
                String sql = "SELECT P_Username FROM db_accessadmin.Player";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    index+=1;
                }
                index -= 1;
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
                }
            } catch(SQLException e){out.println(e);}
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
