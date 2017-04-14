package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class playerJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
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
      out.write("        <header>\r\n");
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
      out.write("            <a href=\"player_001.html\">\r\n");
      out.write("            <li id=\"namepro\">\r\n");
      out.write("                ");
 session = request.getSession();
                    String username = (String) session.getAttribute("username"); 
                    String imgdir = "assets/img/"+username+".jpg";
                
      out.write("\r\n");
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
      out.write("                <input type=\"hidden\" name=\"from\" value=\"player.html\" />\r\n");
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
      out.write("    <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"playerJSP.jsp\" id=\"fontmenu\">PLAYERS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    ");
 session = request.getSession();
    List<String> fname_list = (List) session.getAttribute("fname_list");
    List<String> lname_list = (List) session.getAttribute("lname_list");
    List<String> ign_list = (List) session.getAttribute("ign_list");
    List<String> email_list = (List) session.getAttribute("email_list");
    List<String> fb_list = (List) session.getAttribute("fb_list");
    List<String> faculty_list = (List) session.getAttribute("faculty_list");
    List<String> university_list = (List) session.getAttribute("university_list");
    int page_count = (int) session.getAttribute("page_count");
    
    for(int j=1; j<=page_count; j++){
        out.print("<div id=\"tab"+j+"\""+ " class=\"container list_player\">");
        int temp = (6*(j-1)) + (fname_list.size()-(6*(j-1)));
        int temp2 = 6*j;
        //min((6*j), (6*(j-1)) + (43-(6*(j-1))))
        for(int i=(6*(j-1))+1; i<=Math.min(temp, temp2); i++){
            out.println("<div class=\"divplayer filter "+j+"\">");
            out.println("<div class=\"player" + i +"\">");
            out.println("<div class=\"container contain\">");
            out.println("<div class=\"row contain\">");
            out.println("<div class=\"col-sm-4 col-md-4 user-details\">");
            out.println("<div class=\"user-image\">");
            out.println("<img src=\"assets/img/player1.jpg\" alt=\"\" title=\"\" class=\"img_size\">");
            out.println("</div>");
            out.println("<div class=\"user-info-block\">");
            out.println("<div class=\"user-heading\">");
            out.println("<a  id=\"profileeiei\" href=\"player_001.html\"><h3>" + ign_list.get(i-1) + "</h3></a>");
            out.println("<span class=\"help-block\">" + fname_list.get(i-1) +" "+ lname_list.get(i-1) + "</span>");
            out.println("</div>");
            out.println("<ul class=\"navigation\">");
            out.println("<li class=\"active\">");
            out.println("<a data-toggle=\"tab\" href=\"#information_"+i+"\">");
            out.println("<span class=\"glyphicon glyphicon-user\"></span>");
            out.println("</a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a data-toggle=\"tab\" href=\"#edu_"+i+"\">");
            out.println("<span class=\"glyphicon glyphicon-education\"></span>");
            out.println("</a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a data-toggle=\"tab\" href=\"#link_"+i+"\">");
            out.println("<span class=\"glyphicon glyphicon-link\"></span>");
            out.println("</a>");
            out.println("</li>");
            out.println("</ul>");
            out.println("<div class=\"user-body\">");
            out.println("<div class=\"tab-content\">");
            out.println("<div id=\"link_"+i+"\" class=\"tab-pane\">");
            String fb_link_1 = "https://www.facebook.com/" +  fb_list.get(i-1);
            out.println("<a href=" + fb_link_1 + ">");
            out.println("<img src=\"assets/img/fb-logo.png\" alt=\"Go to W3Schools!\" width=\"40\" height=\"30\" border=\"0\"></a>");
            out.println("</div>");
            out.println("<div id=\"edu_"+i+"\" class=\"tab-pane\">");
            out.println("<h4>" + faculty_list.get(i-1) +", "+ university_list.get(i-1) + "</h4>");
            out.println("</div>");
            out.println("<div id=\"information_"+i+"\" class=\"tab-pane active\">");
            out.println("<h4>Currently Team : Ok.Paidai</h4>");
            out.println("</div></div></div></div></div></div></div></div></div>");
        }

        out.println("</div>");
    }
    
    
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

        /*out.print("<p style=\"text-align:center; font-size:130%;\">");
        for (int i=1; i <= page_count; i++){
            out.print("|" + i);
        }
        out.println("|" + "</p>");*/
        out.println("<div align=\"center\">");
        for (int i=1; i <= page_count; i++){
            if (i==1){
                out.println("<button data-filter=\""+ i + "\""+ " class=\"btn btn-default filter-button active\" onclick=\"aaa()\">"+i+"</button>");
            }
            else{
                out.println("<button data-filter=\""+ i + "\""+ " class=\"btn btn-default filter-button\" onclick=\"aaa()\">"+i+"</button>");
            }
        }
        out.println("<script src=\"assets/js/player.js\"></script>");
        out.println("</div>");
    
      out.write(" <!-- use list -->\r\n");
      out.write("    <!--<p style=\"text-align:center; font-size:130%;\">Paragraph</p> -->\r\n");
      out.write("    <footer id=\"footer001\">\r\n");
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
