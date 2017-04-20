package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditErrorJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>esport</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Cookie\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Pretty-Footer.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Google-Style-Login.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tree.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nav-1.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tab1.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tour.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tournament.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/info-tab_player001.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/player_001.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/player_tab.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("     ");
 session = request.getSession();
       char is_password = (char) session.getAttribute("is_password");
       char is_rep_password = (char) session.getAttribute("is_rep-password");
       char is_fname = (char) session.getAttribute("is_fname");
       char is_lname = (char) session.getAttribute("is_lname");
       char is_email = (char) session.getAttribute("is_email");
       char is_fb = (char) session.getAttribute("is_fb");
       char is_university = (char) session.getAttribute("is_university");
       char is_faculty = (char) session.getAttribute("is_faculty");
       char is_phone = (char) session.getAttribute("is_phone");
       char is_ign = (char) session.getAttribute("is_ign");
       String username = (String) session.getAttribute("username");
       String new_password = (String) session.getAttribute("new_password");
       String new_fname = (String) session.getAttribute("new_fname");
       String new_lname = (String) session.getAttribute("new_lname");
       String new_email = (String) session.getAttribute("new_email");
       String new_fb = (String) session.getAttribute("new_fb");
       String new_university = (String) session.getAttribute("new_university");
       String new_faculty = (String) session.getAttribute("new_faculty");
       String new_phone = (String) session.getAttribute("new_phone");
       String new_ign = (String) session.getAttribute("new_ign");
       String image = (String) session.getAttribute("image"); 
       int id = (int) session.getAttribute("id");
       String roles = (String) session.getAttribute("roles");
       String useimage = (String) session.getAttribute("useimage");
                
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("         <!-- Second navbar for sign in -->\r\n");
      out.write("    <nav class=\"navbar navbar-default\" id=\"headnav\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("        <div class=\"navbar-header\" >\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-2\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("            <a href=\"indexJSP.jsp\">\r\n");
      out.write("            <img src=\"assets/img/logo.png\"  id = \"logo\">\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"indexJSP.jsp\">U-LEAGUE</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" id=\"userbar\">\r\n");
      out.write("             ");
 session = request.getSession();
              
                    String imgdir = useimage;
              
                
      out.write("\r\n");
      out.write("                <a href=\"Player_001Servlet?player=");
out.println(id);
      out.write("\"> \r\n");
      out.write("            <li id=\"namepro\">\r\n");
      out.write("               \r\n");
      out.write("                <img src= \"");
 out.println(imgdir); 
      out.write("\" id=\"imgpro\">\r\n");
      out.write("                <div id = \"namepro2\">\r\n");
      out.write("                    <h4><b>");
 out.println(username); 
      out.write("</b></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </li>\r\n");
      out.write("            </a>\r\n");
      out.write("     \r\n");
      out.write("            <form action=\"SignoutServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\r\n");
      out.write("                <input type=\"hidden\" name=\"from\" value=\"indexJSP.jsp\" />\r\n");
      out.write("             <li >\r\n");
      out.write("             <button type=\"submit\" class=\"btn btn-default btn-outline btn-circle collapsed\"  id=\"signinbtn\" >Sign Out</button>\r\n");
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("            </form>\r\n");
      out.write("          </ul>\r\n");
      out.write("       \r\n");
      out.write("      </div><!-- /.container -->\r\n");
      out.write("    </nav><!-- /.navbar -->\r\n");
      out.write("    </header>\r\n");
      out.write("    <ul class=\"nav nav-pills categories\">\r\n");
      out.write("        <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"PlayerServlet\" id=\"fontmenu\">PLAYERS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"row register-form\">\r\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("            <form class=\"form-horizontal custom-form\" action=\"CheckEditProfileServlet\" id=\"signup\" name=\"signup\" method=\"POST\">\r\n");
      out.write("                <h1>U-LEAUGE Edit Profile</h1>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Username </label> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"username\" value=");
      out.print( username);
      out.write(" disabled> <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"pawssword-input-field\">Password </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"new_password\"><p>*Require<br>\r\n");
      out.write("                        *Your password must have at least one upper case, one lower case, one numeric</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_password\" style=\"color:blue;\">");
if (is_password=='1'){out.println("Incorrect Password");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"repeat-pawssword-input-field\">Repeat Password </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"new_rep_password\">\r\n");
      out.write("                        <p>*Require<br>*Must same above password</p>  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_rep_password\" style=\"color:blue;\">");
if (is_rep_password=='1'){out.println("Incorrect Repeat Password");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Name </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"new_fname\" value=");
      out.print( new_fname);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_name\" style=\"color:blue;\">");
if (is_fname=='1'){out.println("Incorrect Name");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Lastname </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"new_lname\" value=");
      out.print( new_lname);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_lname\" style=\"color:blue;\">");
if (is_lname=='1'){out.println("Incorrect Lastname");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"email-input-field\">Email </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"new_email\" value=");
      out.print( new_email);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_email\" style=\"color:blue;\">");
if (is_email=='1'){out.println("Incorrect Email");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Facebook Link</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" inputmode=\"url\" name=\"new_fb\" value=");
      out.print( new_fb);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_fb\" style=\"color:blue;\">");
if (is_fb=='1'){out.println("Must have Facebook Link");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">University </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"new_university\" value=");
      out.print( new_university);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_university\" style=\"color:blue;\">");
if (is_university=='1'){out.println("Must have university");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Faculty </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"new_faculty\" value=");
      out.print( new_faculty);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_faculty\" style=\"color:blue;\">");
if (is_faculty=='1'){out.println("Must have faculty");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Phone </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" maxlength=\"10\" minlength=\"0\" inputmode=\"numeric\" name=\"new_phone\" value=");
      out.print( new_phone);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_phone\" style=\"color:blue;\">");
if (is_phone=='1'){out.println("Incorrect Phone Number");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">In game name</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"new_ign\" value=");
      out.print( new_ign);
      out.write(">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"cau_ign\" style=\"color:blue;\">");
if (is_ign=='1'){out.println("Must have In-game name");}
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Image</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"realimage\" value=");
      out.print(image);
      out.write(">\r\n");
      out.write("                        <p>*Optional<br></p>\r\n");
      out.write("                        <p>You must upload file to <a href=\"http://imgur.com/\">imgur.com</a> copylink and paste it<br>\r\n");
      out.write("                        For Example : full link is \"http://imgur.com/vfz3U5C\" You paste only \"vfz3U5C\"</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>    \r\n");
      out.write("                <button class=\"btn btn-default submit-button\" id=\"buttonn\" type=\"submit\">Edit</button>\r\n");
      out.write("                <!--<script type='text/javascript' src='assets/js/signup_js.js'></script>-->\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>  \r\n");
      out.write("    </div>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-navigation\">\r\n");
      out.write("                <h3><a href=\"#\">E-LEAGUE<span><img src=\"assets/img/logo.png\" id=\"footlogo\"> </span></a></h3>\r\n");
      out.write("                <p class=\"links\"><a href=\"#\">Home</a><strong> · </strong><a href=\"#\">Blog</a><strong> · </strong><a href=\"#\">Pricing</a><strong> · </strong><a href=\"#\">About</a><strong> · </strong><a href=\"#\">Faq</a><strong> · </strong><a href=\"#\">Contact</a></p>\r\n");
      out.write("                <p class=\"company-name\">E-league © 2017 </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-contacts\">\r\n");
      out.write("                <div><span class=\"fa fa-map-marker footer-contacts-icon\"> </span>\r\n");
      out.write("                    <p><span class=\"new-line-span\">21 Revolution Street</span> Paris, France</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div><i class=\"fa fa-phone footer-contacts-icon\"></i>\r\n");
      out.write("                    <p class=\"footer-center-info email text-left\"> +1 555 123456</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div><i class=\"fa fa-envelope footer-contacts-icon\"></i>\r\n");
      out.write("                    <p> <a href=\"#\" target=\"_blank\">support@company.com</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix visible-sm-block\"></div>\r\n");
      out.write("            <div class=\"col-md-4 footer-about\">\r\n");
      out.write("                <h4>About the company</h4>\r\n");
      out.write("                <p> Lorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.\r\n");
      out.write("                </p>\r\n");
      out.write("                <div class=\"social-links social-icons\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a><a href=\"#\"><i class=\"fa fa-github\"></i></a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/treejs.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/popupjs.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
