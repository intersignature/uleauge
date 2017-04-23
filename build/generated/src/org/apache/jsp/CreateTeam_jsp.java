package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateTeam_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("    ");
 if (session.getAttribute("suc") == null || (int)session.getAttribute("suc") == 0 ) { 
      out.write("\r\n");
      out.write("        ");
 
        int suc = 0;
        session.setAttribute("suc", suc);
        response.sendRedirect("indexJSP.jsp"); 
        
      out.write("\r\n");
      out.write("        \r\n");
 } else if ((int)session.getAttribute("suc") == 1) {
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
      out.write("             <li id = \"searchnav2\"> \r\n");
      out.write("                  <a>\r\n");
      out.write("                      <form action=\"searchServlet\" method=\"POST\" >\r\n");
      out.write("                      <input id = \"searchbox\" type=\"text\" name=\"searchuser\" placeholder=\"Username..\">\r\n");
      out.write("                    \r\n");
      out.write("                      <input id = \"searchbtn\" type=\"submit\" value=\"Search\" />\r\n");
      out.write("                       </form>\r\n");
      out.write("                  </a>\r\n");
      out.write("              </li>\r\n");
      out.write("             ");
 session = request.getSession();
                    String username = (String) session.getAttribute("username"); 
                    String imgdir = "assets/img/"+username+".jpg";
                    int id = (int) session.getAttribute("P_ID");
                
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
      out.write("     ");
 }
      out.write("\r\n");
      out.write("    <ul class=\"nav nav-pills categories\">\r\n");
      out.write("        <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"PlayerServlet\" id=\"fontmenu\">PLAYERS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"tourRequestJSP.jsp\" id=\"fontmenu\">TOURNAMENT REQUEST </a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("<div class=\"row register-form\">\r\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("            <form class=\"form-horizontal custom-form\" action=\"CreateTeamServlet\" id=\"signup\" name=\"signup\" method=\"POST\">\r\n");
      out.write("                <h1>Team Create</h1>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\" >Team name </label> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"Teamname\"  maxlength=\"20\"> <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Team tag </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"Teamtag\"  maxlength=\"5\"><p>*Require<br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Game team </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <select name=\"gameteam\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                        </select>\r\n");
      out.write("                       <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\"> Team Phone </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" maxlength=\"10\" minlength=\"0\" inputmode=\"numeric\" name=\"teamphone\">\r\n");
      out.write("                        <p>*Require</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\r\n");
      out.write("                        <label class=\"control-label\" for=\"name-input-field\">Image Link</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"realimage\">\r\n");
      out.write("                        <p>upload file at <a href=\"http://imgur.com/gpHAQIO\">imgur.com</a> and you will give link like \"http://imgur.com/gpHAQIO\" and you input \"gpHAQIO\" only</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"checkbox\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"condition\" value=\"con\">I've read and accept the terms and conditions</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn-default submit-button\" id=\"buttonn\" type=\"submit\">Submit</button>\r\n");
      out.write("                <!--<script type='text/javascript' src='assets/js/signup_js.js'></script>-->\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>  \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<footer id=\"footer001\">\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("dbsource");
    _jspx_th_sql_setDataSource_0.setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:sqlserver://esportproject.database.windows.net:1433;databaseName=Esport-DB");
    _jspx_th_sql_setDataSource_0.setUser("adminesport@esportproject");
    _jspx_th_sql_setDataSource_0.setPassword("Esport2017");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbsource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("result");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                                SELECT Game_ID,Game_Name from db_accessadmin.Game;\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <option  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.Game_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.Game_Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
