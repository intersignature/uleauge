package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Team_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>esport</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Cookie\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/Pretty-Footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/Google-Style-Login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tree.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nav-1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tab1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tour.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/tournament.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/info-tab_player001.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/player_001.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/player_tab.css\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
 if (session.getAttribute("suc") == null) { 
      out.write("\n");
      out.write("        ");
 int suc = 0;
            session.setAttribute("suc", suc);
            response.sendRedirect("player_info.jsp");
        
      out.write("\n");
      out.write("        ");
 } else if ((int) session.getAttribute("suc") == 0) {
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <!-- Second navbar for sign in -->\n");
      out.write("            <nav class=\"navbar navbar-default\" id=\"headnav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\" >\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-2\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"indexJSP.jsp\">\n");
      out.write("                            <img src=\"assets/img/logo.png\"  id = \"logo\">\n");
      out.write("                            <a class=\"navbar-brand\" href=\"indexJSP.jsp\">U-LEAGUE</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbar-collapse-2\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li id = \"searchnav\"> \n");
      out.write("                                <a>\n");
      out.write("                                    <form action=\"searchServlet\" method=\"POST\" >\n");
      out.write("                                        <input id = \"searchbox\" type=\"text\" name=\"searchuser\" placeholder=\"Username..\">\n");
      out.write("\n");
      out.write("                                        <input id = \"searchbtn\" type=\"submit\" value=\"Search\" />\n");
      out.write("                                    </form>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"signup.html\">Sign up</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"btn btn-default btn-outline btn-circle collapsed\"  data-toggle=\"collapse\" href=\"#nav-collapse2\" aria-expanded=\"false\" aria-controls=\"nav-collapse2\" id=\"signinbtn\">Sign in</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"collapse nav navbar-nav nav-collapse slide-down\" id=\"nav-collapse2\">\n");
      out.write("                            <form action=\"SigninServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\n");
      out.write("                                <input type=\"hidden\" name=\"from\" value=\"player_info.jsp\" />\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <label class=\"sr-only\" for=\"username\">Username</label>\n");
      out.write("                                    <input name=\"Username\" type=\"Username\" class=\"form-control\" id=\"Username\" placeholder=\"Username\" autofocus required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"password\">Password</label>\n");
      out.write("                                    <input name=\"Password\" type=\"Password\" class=\"form-control\" id=\"Password\" placeholder=\"Password\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" >Sign in</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container -->\n");
      out.write("            </nav><!-- /.navbar -->\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        ");
 } else if ((int) session.getAttribute("suc") == 1) {
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <!-- Second navbar for sign in -->\n");
      out.write("            <nav class=\"navbar navbar-default\" id=\"headnav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\" >\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-2\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"indexJSP.jsp\">\n");
      out.write("                            <img src=\"assets/img/logo.png\"  id = \"logo\">\n");
      out.write("                            <a class=\"navbar-brand\" href=\"indexJSP.jsp\">U-LEAGUE</a>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\" id=\"userbar\">\n");
      out.write("                        ");
 session = request.getSession();
                            String username = (String) session.getAttribute("username");
                            String useimage = (String) session.getAttribute("useimage");
                            int id = (int) session.getAttribute("P_ID");
                            String roles = (String) session.getAttribute("roles");
                        
      out.write("\n");
      out.write("                        <li id = \"searchnav2\"> \n");
      out.write("                            <a>\n");
      out.write("                                <form action=\"searchServlet\" method=\"POST\" >\n");
      out.write("                                    <input id = \"searchbox\" type=\"text\" name=\"searchuser\" placeholder=\"Username..\">\n");
      out.write("\n");
      out.write("                                    <input id = \"searchbtn\" type=\"submit\" value=\"Search\" />\n");
      out.write("                                </form>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <a href=\"Player_001Servlet?player=");
out.println(id);
      out.write("\"> \n");
      out.write("                            <li id=\"namepro\">\n");
      out.write("\n");
      out.write("                                <img src= \"");
 out.println(useimage); 
      out.write("\" id=\"imgpro\">\n");
      out.write("                                <div id = \"namepro2\">\n");
      out.write("                                    <h4><b>");
 out.println(username); 
      out.write("</b></h4>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <form action=\"SignoutServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\n");
      out.write("                            <input type=\"hidden\" name=\"from\" value=\"indexJSP.jsp\" />\n");
      out.write("                            <li >\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-default btn-outline btn-circle collapsed\"  id=\"signinbtn\" >Sign Out</button>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </form>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div><!-- /.container -->\n");
      out.write("            </nav><!-- /.navbar -->\n");
      out.write("        </header>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("        ");
 session = request.getSession();
            String teamname = (String) session.getAttribute("teamname");
            String teamtag = (String) session.getAttribute("teamtag");
            String gameid = (String) session.getAttribute("gameid");
            String teamcap = (String) session.getAttribute("teamcap");
            String teamphone = (String) session.getAttribute("teamphone");
            String teammemnum = (String) session.getAttribute("teammemnum");
            String Team_Image = (String) session.getAttribute("Team_Image");
            String prouser = (String) session.getAttribute("Prouser");
        
      out.write("\n");
      out.write("\n");
      out.write("        <ul class=\"nav nav-pills categories\">\n");
      out.write("            <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\n");
      out.write("            <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\n");
      out.write("            <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\n");
      out.write("            <li id=\"menu\"><a href=\"PlayerServlet\" id=\"fontmenu\">PLAYERS </a></li>\n");
      out.write("            <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\n");
      out.write("            <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\n");
      out.write("            <li id=\"menu\"><a href=\"tourRequestJSP.jsp\" id=\"fontmenu\">TOURNAMENT REQUEST </a></li>        </ul>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"news-body\">\n");
      out.write("                <ul class=\"list-group\">\n");
      out.write("                    <div style=\"text-align: center\"><h1 class=\"text\">TEAM PROFILE</h1>\n");
      out.write("\n");
      out.write("                        <div class=\"logo_teamtest\">\n");
      out.write("                            <img src=");
      out.print( Team_Image);
      out.write(" width=\"190\" height=\"190\" >\n");
      out.write("                        </div>\n");
      out.write("                        <h2 class=\"ign\">");
      out.print( teamtag);
      out.write("</h2>\n");
      out.write("                        <h4><strong>Team Name:</strong>");
      out.print( teamname);
      out.write("</h4>\n");
      out.write("                        <h4><strong>Game Played:</strong>");
      out.print( gameid);
      out.write("</h4>\n");
      out.write("                        <h4><strong>Captain Team:</strong>");
      out.print( teamcap);
      out.write("</h4>\n");
      out.write("                        <h4><strong>Number of member:</strong>");
      out.print( teammemnum);
      out.write("</h4>\n");
      out.write("                        <h4><strong>Phone:</strong>");
      out.print( teamphone);
      out.write("</h4>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer id=\"footer001\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6 footer-navigation\">\n");
      out.write("                    <h3><a href=\"#\">U-LEAGUE<span><img src=\"assets/img/logo.png\" id=\"footlogo\"> </span></a></h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 footer-contacts\">\n");
      out.write("                    <div><i class=\"fa fa-facebook footer-contacts-icon\" ></i>\n");
      out.write("                        <p class=\"footer-center-info email text-left\"> <a href=\"https://www.facebook.com/ULeagueTH/\">U LEAUGE</a></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div><i class=\"fa fa-envelope footer-contacts-icon\"></i>\n");
      out.write("                        <p> <a>lawslifeaways@gmail.com</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix visible-sm-block\"></div>\n");
      out.write("                <div class=\"col-md-4 footer-about\">\n");
      out.write("                    <h4>U LEAUGE</h4>\n");
      out.write("                    <p> A e-sport tournament of university.For relationship, good ethics, unity and increase performance of e-sport tournament.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/treejs.js\"></script>\n");
      out.write("        <script src=\"assets/js/popupjs.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("    </body>\n");
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
