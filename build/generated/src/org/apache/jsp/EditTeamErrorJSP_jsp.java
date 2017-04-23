package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditTeamErrorJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>esport</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Cookie\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/Pretty-Footer.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/Google-Style-Login.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tree.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nav-1.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tab1.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tour.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tournament.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/info-tab_player001.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/player_001.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/player_tab.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 session = request.getSession();
            char is_Team_Name = (char) session.getAttribute("is_Team_Name");
            char is_Team_Tag = (char) session.getAttribute("is_Team_Tag");
            char is_Team_Phone = (char) session.getAttribute("is_Team_Phone");
            char is_Team_Cap = (char) session.getAttribute("is_Team_Cap");
            String Team_Name = (String) session.getAttribute("Team_Name");
            String Team_Tag = (String) session.getAttribute("Team_Tag");
            String Team_Phone = (String) session.getAttribute("Team_Phone");
            String Team_Image = (String) session.getAttribute("Team_Image");
            String Team_Cap = (String) session.getAttribute("Team_Cap");
            String Team_ID = (String) session.getAttribute("Team_ID");
            char is_ans_hasid = (char) session.getAttribute("is_ans_hasid");
            int Game_ID = (int) session.getAttribute("Game_ID");
            String roles = (String) session.getAttribute("roles");
        
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <!-- Second navbar for sign in -->\r\n");
      out.write("            <nav class=\"navbar navbar-default\" id=\"headnav\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                    <div class=\"navbar-header\" >\r\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-2\">\r\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <a href=\"indexJSP.jsp\">\r\n");
      out.write("                            <img src=\"assets/img/logo.png\"  id = \"logo\">\r\n");
      out.write("                            <a class=\"navbar-brand\" href=\"indexJSP.jsp\">U-LEAGUE</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\" id=\"userbar\">\r\n");
      out.write("                        ");
 session = request.getSession();
                            int id = (int) session.getAttribute("P_ID");
                            String imgdir = (String) session.getAttribute("useimage");
                            String username = (String) session.getAttribute("username"); 
                        
      out.write("\r\n");
      out.write("                        <a href=\"Player_001Servlet?player=");
out.println(id);
      out.write("\"> \r\n");
      out.write("                            <li id=\"namepro\">\r\n");
      out.write("\r\n");
      out.write("                                <img src= \"");
 out.println(imgdir); 
      out.write("\" id=\"imgpro\">\r\n");
      out.write("                                <div id = \"namepro2\">\r\n");
      out.write("                                    <h4><b>");
 out.println(username);
      out.write("</b></h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                        <form action=\"SignoutServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"from\" value=\"indexJSP.jsp\" />\r\n");
      out.write("                            <li >\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-default btn-outline btn-circle collapsed\"  id=\"signinbtn\" >Sign Out</button>\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div><!-- /.container -->\r\n");
      out.write("            </nav><!-- /.navbar -->\r\n");
      out.write("        </header>\r\n");
      out.write("        <ul class=\"nav nav-pills categories\">\r\n");
      out.write("            <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"TeamServlet\" id=\"fontmenu\">TEAM </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"PlayerServlet\" id=\"fontmenu\">PLAYERS </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"tourRequest.html\" id=\"fontmenu\">TOURNAMENT REQUEST </a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row register-form\">\r\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("                <form class=\"form-horizontal custom-form\" action=\"CheckEditTeamServlet\" id=\"signup\" name=\"signup\" method=\"POST\">\r\n");
      out.write("                    <h1>U-LEAUGE Edit Team</h1>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                            <label class=\"control-label\" for=\"name-input-field\">Team name </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"Team_Name\" value=");
      out.print( Team_Name);
      out.write(">\r\n");
      out.write("                            <p>*Require</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p id=\"cau_name\" style=\"color:blue;\">");
if (is_Team_Name == '0') {
                            out.println("Incorrect team name");
                        }
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                            <label class=\"control-label\" for=\"name-input-field\">Team tag </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"Team_Tag\" value=");
      out.print( Team_Tag);
      out.write(">\r\n");
      out.write("                            <p>*Require</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p id=\"cau_name\" style=\"color:blue;\">");
if (is_Team_Tag == '0') {
                            out.println("Incorrect team tag");
                        }
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                            <label class=\"control-label\" for=\"name-input-field\">Team Phone </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" maxlength=\"10\" minlength=\"0\" inputmode=\"numeric\" name=\"Team_Phone\" value=");
      out.print( Team_Phone);
      out.write(">\r\n");
      out.write("                            <p>*Require</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p id=\"cau_phone\" style=\"color:blue;\">");
if (is_Team_Phone == '0') {
                            out.println("Incorrect phone Number");
                        }
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                            <label class=\"control-label\" for=\"name-input-field\">Captain Team</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"Team_Cap\" value=");
      out.print( Team_Cap);
      out.write(">\r\n");
      out.write("                            <p>*Require</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p id=\"cau_ign\" style=\"color:blue;\">");
if (is_Team_Cap== '0') {
                            out.println("Incorrect captain team");
                        }
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Image Link</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"Team_Image\" value=");
      out.print(Team_Image );
      out.write(">\r\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" type=\"text\" name=\"Team_ID\" value=");
      out.print(Team_ID );
      out.write(">\r\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" type=\"text\" name=\"Game_ID\" value=");
      out.print(Game_ID );
      out.write(">\r\n");
      out.write("                        <p>upload file at <a href=\"http://imgur.com/gpHAQIO\">imgur.com</a> and you will give link like \"http://imgur.com/gpHAQIO\" and you input \"gpHAQIO\" only</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <button class=\"btn btn-default submit-button\" id=\"buttonn\" type=\"submit\">Edit</button>\r\n");
      out.write("                    <!--<script type='text/javascript' src='assets/js/signup_js.js'></script>-->\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </div>\r\n");
      out.write("        <footer id=\"footer001\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-navigation\">\r\n");
      out.write("                <h3><a href=\"#\">U-LEAGUE<span><img src=\"assets/img/logo.png\" id=\"footlogo\"> </span></a></h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-contacts\">\r\n");
      out.write("                <div><i class=\"fa fa-facebook footer-contacts-icon\" ></i>\r\n");
      out.write("                    <p class=\"footer-center-info email text-left\"> <a href=\"https://www.facebook.com/ULeagueTH/\">U LEAUGE</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div><i class=\"fa fa-envelope footer-contacts-icon\"></i>\r\n");
      out.write("                    <p> <a>lawslifeaways@gmail.com</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix visible-sm-block\"></div>\r\n");
      out.write("            <div class=\"col-md-4 footer-about\">\r\n");
      out.write("                <h4>U LEAUGE</h4>\r\n");
      out.write("                <p> A e-sport tournament of university.For relationship, good ethics, unity and increase performance of e-sport tournament.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/treejs.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/popupjs.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
