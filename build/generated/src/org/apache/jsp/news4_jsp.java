package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class news4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
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
      out.write("    <body>\r\n");
      out.write("        ");
 if (session.getAttribute("suc") == null) { 
      out.write("\r\n");
      out.write("        ");
 int suc = 0;
            session.setAttribute("suc", suc);
            response.sendRedirect("news4.jsp");
        
      out.write("\r\n");
      out.write("        ");
 } else if ((int) session.getAttribute("suc") == 0) {
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
      out.write("                            <a class=\"navbar-brand\" href=\"indexJSP.JSP\">U-LEAGUE</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbar-collapse-2\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                            <li><a href=\"signup.html\">Sign up</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"btn btn-default btn-outline btn-circle collapsed\"  data-toggle=\"collapse\" href=\"#nav-collapse2\" aria-expanded=\"false\" aria-controls=\"nav-collapse2\" id=\"signinbtn\">Sign in</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"collapse nav navbar-nav nav-collapse slide-down\" id=\"nav-collapse2\">\r\n");
      out.write("                            <form action=\"SigninServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"from\" value=\"news4.jsp\" />\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                    <label class=\"sr-only\" for=\"username\">Username</label>\r\n");
      out.write("                                    <input name=\"Username\" type=\"Username\" class=\"form-control\" id=\"Username\" placeholder=\"Username\" autofocus required />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"sr-only\" for=\"password\">Password</label>\r\n");
      out.write("                                    <input name=\"Password\" type=\"Password\" class=\"form-control\" id=\"Password\" placeholder=\"Password\" required />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" >Sign in</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- /.navbar-collapse -->\r\n");
      out.write("                </div><!-- /.container -->\r\n");
      out.write("            </nav><!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        ");
 } else if ((int) session.getAttribute("suc") == 1) {
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
                            String username = (String) session.getAttribute("username");
                            String imgdir = "assets/img/" + username + ".jpg";
                            int id = (int) session.getAttribute("P_ID");
                            String roles = (String) session.getAttribute("roles");
                            String useimage = (String) session.getAttribute("useimage");
                        
      out.write("\r\n");
      out.write("                        <a href=\"Player_001Servlet?player=");
out.println(id);
      out.write("\"> \r\n");
      out.write("                            <li id=\"namepro\">\r\n");
      out.write("\r\n");
      out.write("                                <img src= \"");
 out.println(useimage); 
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
      out.write("                            <input type=\"hidden\" name=\"from\" value=\"news4.jsp\" />\r\n");
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
      out.write("        ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"nav nav-pills categories\">\r\n");
      out.write("            <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"PlayerServlet\" id=\"fontmenu\">PLAYERS </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\r\n");
      out.write("            <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"news-body\">\r\n");
      out.write("                <ul class=\"list-group\">\r\n");
      out.write("                    <h1>My Arena!! \"DOTA2 The Open Tournament Season 1\"</h1>\r\n");
      out.write("                    <p style=\"text-align: center\">\r\n");
      out.write("                        <img src=\"assets/img/news4.jpg\" width=\"1120\" height=\"700\" >\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    \r\n");
      out.write("                    <p><strong>ประกาศข่าวงานแข่งขัน!!</strong><br></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        เปิดรับสมัครแล้ววันนี้ !! ทัวร์นาเมนต์ DOTA2 เงินรางวัลรวม 50,000 บาท <br><br>\r\n");
      out.write("                        ระยะเวลารับสมัครตั้งแต่ 31 มีนาคม – 20 เมษายน 2560 (สมัครฟรีครับไม่มีค่าใช้จ่าย) <br><br>\r\n");
      out.write("                        เป็นทัวร์นาเมนต์แรกของปีนี้ กับทาง My Arena!! \"DOTA2 The Open Tournament Season 1\" สนับสนุนโดย True money Wallet <br><br>\r\n");
      out.write("                        นี่เป็นลิงค์สมัครต่างๆนะครับ<br><br>\r\n");
      out.write("</p>\r\n");
      out.write("                    <a href=\"http://goo.gl/adEVZU\"><h4>สมัครไอดี</h4></a>\r\n");
      out.write("                    <a href=\"https://goo.gl/ve0Jus\"><h4>สร้างทีม</h4></a>\r\n");
      out.write("                    <a href=\"https://goo.gl/KtKVQ5\"><h4>สมัครแข่ง</h4></a>\r\n");
      out.write("                    <a href=\"https://goo.gl/HmzdZQ\"><h4>กลุ่มนัดแข่ง</h4></a>\r\n");
      out.write("                   \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-sm-6 footer-navigation\">\r\n");
      out.write("                    <h3><a href=\"#\">E-LEAGUE<span><img src=\"assets/img/logo.png\" id=\"footlogo\"> </span></a></h3>\r\n");
      out.write("                    <p class=\"links\"><a href=\"#\">Home</a><strong> · </strong><a href=\"#\">Blog</a><strong> · </strong><a href=\"#\">Pricing</a><strong> · </strong><a href=\"#\">About</a><strong> · </strong><a href=\"#\">Faq</a><strong> · </strong><a href=\"#\">Contact</a></p>\r\n");
      out.write("                    <p class=\"company-name\">E-league © 2017 </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 col-sm-6 footer-contacts\">\r\n");
      out.write("                    <div><span class=\"fa fa-map-marker footer-contacts-icon\"> </span>\r\n");
      out.write("                        <p><span class=\"new-line-span\">21 Revolution Street</span> Paris, France</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><i class=\"fa fa-phone footer-contacts-icon\"></i>\r\n");
      out.write("                        <p class=\"footer-center-info email text-left\"> +1 555 123456</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><i class=\"fa fa-envelope footer-contacts-icon\"></i>\r\n");
      out.write("                        <p> <a href=\"#\" target=\"_blank\">support@company.com</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix visible-sm-block\"></div>\r\n");
      out.write("                <div class=\"col-md-4 footer-about\">\r\n");
      out.write("                    <h4>About the company</h4>\r\n");
      out.write("                    <p> Lorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <div class=\"social-links social-icons\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a><a href=\"#\"><i class=\"fa fa-github\"></i></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("            <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/treejs.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/popupjs.js\"></script>\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"assets/css/main.css\">\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
