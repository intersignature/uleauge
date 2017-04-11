package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tourwayJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>esport</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Cookie\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Pretty-Footer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Google-Style-Login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tree.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nav-1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tab1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tour.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tournament.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/info-tab_player001.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/player_001.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/player_tab.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <header>\n");
      out.write("         <!-- Second navbar for sign in -->\n");
      out.write("    <nav class=\"navbar navbar-default\" id=\"headnav\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\" >\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-2\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("            <a href=\"indexJSP.jsp\">\n");
      out.write("            <img src=\"assets/img/logo.png\"  id = \"logo\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"indexJSP.jsp\">U-LEAGUE</a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" id=\"userbar\">\n");
      out.write("            <a href=\"player_001.html\">\n");
      out.write("            <li id=\"namepro\">\n");
      out.write("                ");
 session = request.getSession();
                    String username = (String) session.getAttribute("username"); 
                    String imgdir = "assets/img/"+username+".jpg";
                
      out.write("\n");
      out.write("                <img src= \"");
 out.println(imgdir); 
      out.write("\" id=\"imgpro\">\n");
      out.write("                <div id = \"namepro2\">\n");
      out.write("                    <h4><b>");
 out.println(username); 
      out.write("</b></h4>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </li>\n");
      out.write("            </a>\n");
      out.write("     \n");
      out.write("            <form action=\"SignoutServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\n");
      out.write("                <input type=\"hidden\" name=\"from\" value=\"tourway.html\" />\n");
      out.write("             <li >\n");
      out.write("             <button type=\"submit\" class=\"btn btn-default btn-outline btn-circle collapsed\"  id=\"signinbtn\" >Sign Out</button>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("            </form>\n");
      out.write("          </ul>\n");
      out.write("       \n");
      out.write("      </div><!-- /.container -->\n");
      out.write("    </nav><!-- /.navbar -->\n");
      out.write("    </header>\n");
      out.write("    <ul class=\"nav nav-pills categories\">\n");
      out.write("    <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"playerJSP.jsp\" id=\"fontmenu\">PLAYERS </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\n");
      out.write("    </ul>\n");
      out.write("    <div class=\"container\" id=\"way\">\n");
      out.write("        <h1>สายการแข่งขัน Dota2 International</h1>\n");
      out.write("        <article id=\"container\">\n");
      out.write("    \n");
      out.write("<section>\n");
      out.write("    <div>Team A</div>\n");
      out.write("    <div>Team B</div>\n");
      out.write("    <div>Team C</div>\n");
      out.write("    <div>Team D</div>\n");
      out.write("    <div>Team E</div>\n");
      out.write("    <div>Team F</div>\n");
      out.write("    <div>Team G</div>\n");
      out.write("    <div>Team H</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"connecter\">\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"line\">\n");
      out.write("    <div>\n");
      out.write("    </div><div>\n");
      out.write("    </div><div>\n");
      out.write("    </div><div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section id=\"quarterFinals\">\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"connecter\" id=\"conn2\">\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"line\" id=\"line2\">\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section id=\"semiFinals\">\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"connecter\" id=\"conn3\">\n");
      out.write("    <div></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"line\" id=\"line3\">\n");
      out.write("    <div></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section id=\"final\">\n");
      out.write("<div></div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-navigation\">\n");
      out.write("                <h3><a href=\"#\">E-LEAGUE<span><img src=\"assets/img/logo.png\" id=\"footlogo\"> </span></a></h3>\n");
      out.write("                <p class=\"links\"><a href=\"#\">Home</a><strong> · </strong><a href=\"#\">Blog</a><strong> · </strong><a href=\"#\">Pricing</a><strong> · </strong><a href=\"#\">About</a><strong> · </strong><a href=\"#\">Faq</a><strong> · </strong><a href=\"#\">Contact</a></p>\n");
      out.write("                <p class=\"company-name\">E-league © 2017 </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-contacts\">\n");
      out.write("                <div><span class=\"fa fa-map-marker footer-contacts-icon\"> </span>\n");
      out.write("                    <p><span class=\"new-line-span\">21 Revolution Street</span> Paris, France</p>\n");
      out.write("                </div>\n");
      out.write("                <div><i class=\"fa fa-phone footer-contacts-icon\"></i>\n");
      out.write("                    <p class=\"footer-center-info email text-left\"> +1 555 123456</p>\n");
      out.write("                </div>\n");
      out.write("                <div><i class=\"fa fa-envelope footer-contacts-icon\"></i>\n");
      out.write("                    <p> <a href=\"#\" target=\"_blank\">support@company.com</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix visible-sm-block\"></div>\n");
      out.write("            <div class=\"col-md-4 footer-about\">\n");
      out.write("                <h4>About the company</h4>\n");
      out.write("                <p> Lorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.\n");
      out.write("                </p>\n");
      out.write("                <div class=\"social-links social-icons\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a><a href=\"#\"><i class=\"fa fa-github\"></i></a></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/treejs.js\"></script>\n");
      out.write("    <script src=\"assets/js/popupjs.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
