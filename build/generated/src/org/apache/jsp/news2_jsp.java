package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class news2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
            response.sendRedirect("newsJSP.jsp");
        
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
      out.write("                                <input type=\"hidden\" name=\"from\" value=\"newsJSP.jsp\" />\r\n");
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
      out.write("                            <input type=\"hidden\" name=\"from\" value=\"newsJSP.jsp\" />\r\n");
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
      out.write("                    <h1>Garena Premier League Spring Season 2017</h1>\r\n");
      out.write("                    <p style=\"text-align: center\">\r\n");
      out.write("                        <img src=\"assets/img/news2.1.jpg\">\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <p><strong>สวัสดีเหล่าซัมมอนเนอร์</strong><br></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;ใกล้เริ่มแล้ว!! การแข่งขันเกม League of Legends ที่ยิ่งใหญ่ที่สุดในทวีป Southeast Asia \r\n");
      out.write("                        กับรายการ Garena Premier League Spring Season 2017 รับชมพร้อมกันทั่วประเทศในวันที่ 12 เมษายน นี้ ถ่ายทอดสดตรงจากกรุงกรุงมะนิลา \r\n");
      out.write("                        ประเทศฟิลิปปินส์ ในการแข่งขันครั้งนี้แชมป์เปี้ยนจาก 6 ประเทศ ได้แก่ Thailand , Vietnam , Singapore , Malaysia , Philippines , Indonesia \r\n");
      out.write("                        จะต้องต่อสู้เพื่อชิงตำแหน่งตำแหน่งสุดยอดแชมป์ โดยมีเงินรางวัลรวมมูลค่า 10,000 USD และสิทธิ์เป็นตัวแทนของทวีป Southeast Asia ไปแข่งขันต่อในรายการ \r\n");
      out.write("                        Mid Season Invitational 2017 ณ ประเทศบราซิล\r\n");
      out.write("                    <p style=\"text-align: center\" ><strong>รายชื่อทีมทั้ง 6 ประเทศ</strong><br>\r\n");
      out.write("                        <img src=\"assets/img/news2.2.jpg\"><img src=\"assets/img/news2.3.jpg\"><img src=\"assets/img/news2.4.jpg\"><img src=\"assets/img/news2.5.jpg\">\r\n");
      out.write("                        <img src=\"assets/img/news2.6.jpg\"><img src=\"assets/img/news2.7.jpg\"><img src=\"assets/img/news2.8.jpg\"><br>\r\n");
      out.write("                        <strong>สายการแข่งขัน</strong><br><img src=\"assets/img/news2.9.jpg\">\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p><strong>การแข่งขันแบ่งเป็น2ประเภท</strong></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Group Stage<br>\r\n");
      out.write("                        - การแข่งขันรอบ Group Stage ประเทศ Singapore , Malaysia , Philippines , Indonesia จะต้องทำการแข่งขันแบบ Round Robin เพื่อคัดหาสองทีมที่ดีที่สุดเข้าสู่รอบ Knockout Stage \r\n");
      out.write("                    </p> \r\n");
      out.write("                    <p>\r\n");
      out.write("                        Knockout Stage<br>\r\n");
      out.write("                        - ประเทศ Thailand และ Vietnam ทำผลงานในการแข่งขัน Garena Premier League ช่วงระยะเวลา 2 ปีที่ผ่านมาทำผลงานได้ยอดเยื่ยม โดยการคว้าตำแหน่ง แชมป์เปี้ยนและรองชนะเลิศอันดับหนึ่ง จึงได้สิทธิ์เป็นทีมว่างในรอบ Knockout Stage เพื่อรอพบกับสองทีมที่เข้ารอบจาก Group Stage\r\n");
      out.write("                    </p> \r\n");
      out.write("                    <p><strong>วันที่ 12 เมษายน 2560</strong></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        13:00 : Indonesia vs Malaysia<br>\r\n");
      out.write("                        14:00 : Philippines vs Singapore<br>\r\n");
      out.write("                        15:00 : Indonesia vs Philippines<br>\r\n");
      out.write("                        16:00 : Malaysia vs Singapore<br>\r\n");
      out.write("                        17:00 : Singapore vs Indonesia<br>\r\n");
      out.write("                        18:00 : Malaysia vs Philippines<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p><strong>วันที่ 13 เมษายน 2560</strong></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("\r\n");
      out.write("                        13:00 : Philippines vs Malaysia<br>\r\n");
      out.write("                        14:00 : Indonesia vs Singapore<br>\r\n");
      out.write("                        15:00 : Singapore vs Malaysia<br>\r\n");
      out.write("                        16:00 : Philippines vs Indonesia<br>\r\n");
      out.write("                        17:00 : Singapore vs Indonesia<br>\r\n");
      out.write("                        18:00 : Malaysia vs Indonesia<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p><strong>วันที่ 14 เมษายน 2560</strong></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        13:00 : Thailand vs อันดับ 1 จาก Group Stage<br>\r\n");
      out.write("                        16:00 : Vietnam vs อันดับ 2 จาก Group Stage<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p><strong>วันที่ 16 เมษายน 2560</strong></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        15:00 :ผู้ชนะคู่ 1 รอบ Knockout Stage  vs ผู้ชนะคู่ 2 รอบ Knockout Stage<br>\r\n");
      out.write("                    </p>\r\n");
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
      out.write("        </footer>");
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
