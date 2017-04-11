package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signupSuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>finish</title>\n");
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
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-2\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("                    <a href=\"/index.html\"><img src=\"logo.png\" id=\"logo\" /></a><a class=\"navbar-brand\" href=\"/index.html\">U-LEAGUE</a></div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-collapse-2\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"/signup.html\">Sign up</a></li>\n");
      out.write("                        <li><a class=\"btn btn-default btn-outline btn-circle collapsed\" data-toggle=\"collapse\" href=\"#nav-collapse2\">Sign in</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"collapse nav navbar-nav nav-collapse slide-down\" id=\"nav-collapse2\">\n");
      out.write("                        <form class=\"navbar-form navbar-right form-inline\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"Email\">Username</label>\n");
      out.write("                                <input type=\"username\" class=\"form-control\" id=\"Username\" placeholder=\"Username\" autofocus required />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"sr-only\" for=\"Password\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"Password\" placeholder=\"Password\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <ul class=\"nav nav-pills categories\">\n");
      out.write("        <li id=\"menu\"><a href=\"news.html\" id=\"fontmenu\">NEWS </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"tournament.html\" id=\"fontmenu\">TOURNAMENT </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"replay.html\" id=\"fontmenu\">REPLAY </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"player.html\" id=\"fontmenu\">PLAYERS </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"/rules.html\" id=\"fontmenu\">RULES </a></li>\n");
      out.write("        <li id=\"menu\"><a href=\"faq.html\" id=\"fontmenu\">FAQ </a></li>\n");
      out.write("    </ul>\n");
      out.write("    <div class=\"row register-form\">\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("            <form class=\"form-horizontal custom-form\">\n");
      out.write("                <h1>U-LEAUGE Registration</h1>\n");
      out.write("                <p>Your registration is successfully.</p>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 col-sm-6 footer-navigation\">\n");
      out.write("                <h3><a href=\"#\">E-LEAGUE<span><img src=\"logo.png\" id=\"footlogo\" /> </span></a></h3>\n");
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
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
