 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
 * @author LAB203_42
 */
@WebServlet(urlPatterns = {"/CheckEditProfileServlet"})

//send all vaule in edit jsp and sendredir CheckEditProfileServlet and check it if true modify it
public class CheckEditProfileServlet extends HttpServlet {

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
            
            String new_password = request.getParameter("new_password");
            String new_rep_password = request.getParameter("new_rep_password");
            String new_fname = request.getParameter("new_fname");
            String new_lname = request.getParameter("new_lname");
            String new_email = request.getParameter("new_email");
            String new_fb = request.getParameter("new_fb");
            String new_university = request.getParameter("new_university");
            String new_faculty = request.getParameter("new_faculty");
            String new_phone = request.getParameter("new_phone");
            String new_ign = request.getParameter("new_ign");
            String image = request.getParameter("realimage");
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            int id = (int) session.getAttribute("P_ID");
            int password_isnum = 0;
            int password_isUpper = 0;
            int password_isLower = 0;
            int ans_overall = 0;
            //เช็คpassword
            for (int i=0, len=new_password.length(); i<len; i++){
                    char password_char = new_password.charAt(i);
                    if (password_char >= '0' && password_char <= '9'){
                            password_isnum = 1;
                    }
                    if (Character.isUpperCase(password_char)){
                            password_isUpper = 1;
                    }
                    if (Character.isLowerCase(password_char)){
                            password_isLower = 1;
                    }
            }
            if (password_isnum != 1 || password_isUpper != 1 || password_isLower != 1 || new_password.length()<8){
                    session.setAttribute("is_password", '1');
            }
            else{
                session.setAttribute("is_password", '0');
                ans_overall += 1;
            }
            
            //เช็ค rep-password
            if(new_rep_password.equals(new_password) && !"".equals(new_rep_password) && password_isnum == 1 && password_isUpper == 1 && password_isLower == 1){
                session.setAttribute("is_rep-password", '0');
                ans_overall += 1;
            }
            else{
                session.setAttribute("is_rep-password", '1');
            }
            
            //เช็ค fname
            Pattern pf = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher mf = pf.matcher(new_fname);
            boolean bf = mf.find();
            if (bf || "".equals(new_fname)){
                session.setAttribute("is_fname", '1');
            }
            else{
                session.setAttribute("is_fname", '0');
                ans_overall += 1;
            }
            
            //เช็ค lname
            Pattern pl = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher ml = pl.matcher(new_lname);
            boolean bl = ml.find();
            if (bl || "".equals(new_lname)){
                session.setAttribute("is_lname", '1');
            }
            else{
                session.setAttribute("is_lname", '0');
                ans_overall += 1;
            }
            
            //เช็คEmail
            if(new_email.contains("@")){
                session.setAttribute("is_email", '0');
                ans_overall += 1;
            } else{
                session.setAttribute("is_email", '1');
            }
            
            //เช็คfblink
            if("".equals(new_fb)){
                session.setAttribute("is_fb", '1');
            }
            else{
                session.setAttribute("is_fb", '0');
                ans_overall += 1;
            }
            
            //เช็คuniversity
            if("".equals(new_university)){
                session.setAttribute("is_university", '1');
            }
            else{
                session.setAttribute("is_university", '0');
                ans_overall += 1;
            }
            
            //เช็คfaculty
            if("".equals(new_faculty)){
                session.setAttribute("is_faculty", '1');
            }
            else{
                session.setAttribute("is_faculty", '0');
                ans_overall += 1;
            }
            
            //เช็คphone
            if(new_phone.contains("[a-zA-Z]+") == false && new_phone.length() == 10){
                session.setAttribute("is_phone", '0');
                ans_overall += 1;
            }
            else{
                session.setAttribute("is_phone", '1');
            }
            
            //เช็คign
            if("".equals(new_ign)){
                session.setAttribute("is_ign", '1');
            }
            else{
                session.setAttribute("is_ign", '0');
                ans_overall += 1;
            }
            
            if(ans_overall == 10){
            //แอดข้อมูล
            /*String sql = "INSERT INTO db_accessadmin.Player (P_Username, P_Password, P_FName, P_LName, P_Ign, P_Email, P_Facebook, P_Faculty, P_University, P_Phone, P_ID)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";*/
            String sql = "UPDATE db_accessadmin.Player SET P_Password=?, P_FName=?,P_LName=?,P_Ign=?,P_Email=?,P_Facebook=?,"
                    + "P_Faculty=?,P_University=?,P_Phone=?, P_Image=? where P_ID=?";
            PreparedStatement update = connection.prepareStatement(sql);   
            update.setString(1, new_password);
            update.setString(2, new_fname);
            update.setString(3, new_lname);
            update.setString(5, new_email);
            update.setString(6, new_fb);
            update.setString(8, new_university);
            update.setString(7, new_faculty);
            update.setString(9, new_phone);
            update.setString(4, new_ign);
            update.setInt(11, id);
            update.setString(10, image);
            update.execute();
            response.sendRedirect("/Project/signupSuccess.jsp");
            }
            else{
                //response.sendRedirect("/Project/signup.html");
                //HttpSession session = request.getSession();
                session.setAttribute("new_password", new_password);
                session.setAttribute("new_fname", new_fname);
                session.setAttribute("new_lname", new_lname);
                session.setAttribute("new_email", new_email);
                session.setAttribute("new_fb", new_fb);
                session.setAttribute("new_university", new_university);
                session.setAttribute("new_faculty", new_faculty);
                session.setAttribute("new_phone", new_phone);
                session.setAttribute("new_ign", new_ign);
                session.setAttribute("id", id);
                session.setAttribute("username", username);
                session.setAttribute("image", image);
                response.sendRedirect("/Project/EditErrorJSP.jsp");
                
            }
        
        } catch (SQLException ex) {
            response.sendRedirect("/Project/ErrorJSP.jsp");
            Logger.getLogger(CheckEditProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
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
