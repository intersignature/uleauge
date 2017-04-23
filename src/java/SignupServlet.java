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
@WebServlet(urlPatterns = {"/SignupServlet"})
public class SignupServlet extends HttpServlet {

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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String rep_password = request.getParameter("rep_password");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String fb = request.getParameter("fb");
            String university = request.getParameter("university");
            String faculty = request.getParameter("faculty");
            String phone = request.getParameter("phone");
            String ign = request.getParameter("ign");
            String RealImage = request.getParameter("realimage");
            int index = 0;
            //String[] condition = request.getParameterValues("condition");
            int ans_user = 0;
            int password_isnum = 0;
            int password_isUpper = 0;
            int password_isLower = 0;
            int ans_overall = 0;
            //เช็คusername
            try {
                Statement user = connection.createStatement();
                String sql = "SELECT P_Username FROM db_accessadmin.Player";
                ResultSet rs = user.executeQuery(sql);
                while (rs.next()) {
                    if (rs.getString("P_Username").equals(username)) { //ถ้าซ้ำ
                        ans_user = 1;
                    } 
                    index += 1;
                }
            } catch (SQLException e) {
                out.println(e);
            }
            if(ans_user == 1 || "".equals(username)){
                HttpSession session = request.getSession();
                session.setAttribute("is_user", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_user", '0');
                ans_overall += 1;
            }
            
            //เช็คpassword
            for (int i=0, len=password.length(); i<len; i++){
                    char password_char = password.charAt(i);
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
            if (password_isnum != 1 || password_isUpper != 1 || password_isLower != 1 || password.length()<8){
                    HttpSession session = request.getSession();
                    session.setAttribute("is_password", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_password", '0');
                ans_overall += 1;
            }
            
            //เช็ค rep-password
            if(rep_password.equals(password) && !"".equals(rep_password) && password_isnum == 1 && password_isUpper == 1 && password_isLower == 1){
                HttpSession session = request.getSession();
                session.setAttribute("is_rep-password", '0');
                ans_overall += 1;
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_rep-password", '1');
            }
            
            //เช็ค fname
            Pattern pf = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher mf = pf.matcher(fname);
            boolean bf = mf.find();
            if (bf || "".equals(fname)){
                HttpSession session = request.getSession();
                session.setAttribute("is_fname", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_fname", '0');
                ans_overall += 1;
            }
            
            //เช็ค lname
            Pattern pl = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher ml = pl.matcher(lname);
            boolean bl = ml.find();
            if (bl || "".equals(lname)){
                HttpSession session = request.getSession();
                session.setAttribute("is_lname", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_lname", '0');
                ans_overall += 1;
            }
            
            //เช็คEmail
            if(email.contains("@")){
                HttpSession session = request.getSession();
                session.setAttribute("is_email", '0');
                ans_overall += 1;
            } else{
                HttpSession session = request.getSession();
                session.setAttribute("is_email", '1');
            }
            
            //เช็คfblink
            if("".equals(fb)){
                HttpSession session = request.getSession();
                session.setAttribute("is_fb", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_fb", '0');
                ans_overall += 1;
            }
            
            //เช็คuniversity
            if("".equals(university)){
                HttpSession session = request.getSession();
                session.setAttribute("is_university", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_university", '0');
                ans_overall += 1;
            }
            
            //เช็คfaculty
            if("".equals(faculty)){
                HttpSession session = request.getSession();
                session.setAttribute("is_faculty", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_faculty", '0');
                ans_overall += 1;
            }
            
            //เช็คphone
            if(phone.contains("[a-zA-Z]+") == false && phone.length() == 10){
                HttpSession session = request.getSession();
                session.setAttribute("is_phone", '0');
                ans_overall += 1;
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_phone", '1');
            }
            
            //เช็คign
            if("".equals(ign)){
                HttpSession session = request.getSession();
                session.setAttribute("is_ign", '1');
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("is_ign", '0');
                ans_overall += 1;
            }
            
            //เช็คcondition
           // if(request.getParameter("condition") == null){
            //checkbox not checked
           // HttpSession session = request.getSession();
            //session.setAttribute("condition", '1');
           // }else{
            //checkbox checked
            HttpSession session = request.getSession();
            session.setAttribute("condition", '0');
            //}
            //HttpSession session = request.getSession();
            //out.print((char) session.getAttribute("condition"));
            
            if(ans_overall == 11 && (char)session.getAttribute("condition")=='0'){
            //แอดข้อมูล
            String sql = "INSERT INTO db_accessadmin.Player (P_Username, P_Password, P_FName, P_LName, P_Ign, P_Email, P_Facebook, P_Faculty, P_University, P_Phone, P_ID, P_Image)"+ 
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insert = connection.prepareStatement(sql);   
            insert.setString(1, username);
            insert.setString(2, password);
            insert.setString(3, fname);
            insert.setString(4, lname);
            insert.setString(6, email);
            insert.setString(7, fb);
            insert.setString(8, university);
            insert.setString(9, faculty);
            insert.setString(10, phone);
            insert.setString(5, ign);
            insert.setInt(11, index);
            insert.setString(12, RealImage);
            insert.execute();
            response.sendRedirect("/Project/signupSuccess.jsp");
            }
            else{
                //response.sendRedirect("/Project/signup.html");
                //HttpSession session = request.getSession();
                session.setAttribute("username", username);
                session.setAttribute("fname", fname);
                session.setAttribute("lname", lname);
                session.setAttribute("email", email);
                session.setAttribute("fb", fb);
                session.setAttribute("university", university);
                session.setAttribute("faculty", faculty);
                session.setAttribute("phone", phone);
                session.setAttribute("ign", ign);
                session.setAttribute("index", index);
                session.setAttribute("image", RealImage);
                response.sendRedirect("/Project/signupFailJSP.jsp");
                
            }
            /*response.sendRedirect("/index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("</script>");*/
        } catch (SQLException ex) {
            Logger.getLogger(SignupServlet.class.getName()).log(Level.SEVERE, null, ex);
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
