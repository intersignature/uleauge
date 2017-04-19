package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faqJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  ");
 if (session.getAttribute("suc") == null) { 
      out.write("\r\n");
      out.write("    ");
 int suc = 0;
        session.setAttribute("suc", suc);
        response.sendRedirect("faqJSP.jsp");
    
      out.write('\r');
      out.write('\n');
 } else if ((int)session.getAttribute("suc") == 0) {
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
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbar-collapse-2\">\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("            <li><a href=\"signup.html\">Sign up</a></li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"btn btn-default btn-outline btn-circle collapsed\"  data-toggle=\"collapse\" href=\"#nav-collapse2\" aria-expanded=\"false\" aria-controls=\"nav-collapse2\" id=\"signinbtn\">Sign in</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <div class=\"collapse nav navbar-nav nav-collapse slide-down\" id=\"nav-collapse2\">\r\n");
      out.write("            <form action=\"SigninServlet\" method=\"POST\" class=\"navbar-form navbar-right form-inline\" role=\"form\">\r\n");
      out.write("                 <input type=\"hidden\" name=\"from\" value=\"faqJSP.jsp\" />\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                 \r\n");
      out.write("                <label class=\"sr-only\" for=\"username\">Username</label>\r\n");
      out.write("                <input name=\"Username\" type=\"Username\" class=\"form-control\" id=\"Username\" placeholder=\"Username\" autofocus required />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label class=\"sr-only\" for=\"password\">Password</label>\r\n");
      out.write("                <input name=\"Password\" type=\"Password\" class=\"form-control\" id=\"Password\" placeholder=\"Password\" required />\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success\" >Sign in</button>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div><!-- /.navbar-collapse -->\r\n");
      out.write("      </div><!-- /.container -->\r\n");
      out.write("    </nav><!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
 }  else if ((int)session.getAttribute("suc") == 1){
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
      out.write("                <input type=\"hidden\" name=\"from\" value=\"faqJSP.jsp\" />\r\n");
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
 }
      out.write("\r\n");
      out.write("    <ul class=\"nav nav-pills categories\">\r\n");
      out.write("      <li id=\"menu\"><a href=\"newsJSP.jsp\" id=\"fontmenu\">NEWS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"TourJSP.jsp\" id=\"fontmenu\">TOURNAMENT </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"replayJSP.jsp\" id=\"fontmenu\">REPLAY </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"PlayerServlet\" id=\"fontmenu\">PLAYERS </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"rulesJSP.jsp\" id=\"fontmenu\">RULES </a></li>\r\n");
      out.write("        <li id=\"menu\"><a href=\"faqJSP.jsp\" id=\"fontmenu\">FAQ </a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <div class=\"faq\">\r\n");
      out.write("        <h1>FAQ </h1>\r\n");
      out.write("        <p>\r\n");
      out.write("                        <strong>รูปแบบการแข่งขัน</strong><br>\r\n");
      out.write("                        - แข่งขันในโหมด Competitive 5v5<br>\r\n");
      out.write("                        - Single Elimination<br>\r\n");
      out.write("                        - Best of 3<br>\r\n");
      out.write("                    <p><strong>กฏการแข่งขัน</strong><br></p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        1. การเลือกฝั่ง และการเลือกแผนที่<br>\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;1.1 การเลือกแผนที่ในการแข่งขัน จะใช้ Knife Round เป็นการตัดสิน โดยที่ผู้ชนะจะเป็นฝ่ายเลือก&quot;Ban&quot; แมพออกไปก่อน สลับกับผู้แพ้ จนกระทั่งเหลือ 3 แมพสุดท้าย ผู้ชนะจะได้เลือกแมพที่จะใช้แข่งขันในเกมแรกก่อน ผู้แพ้จะได้เลือกแมพที่ใช้แข่งในเกมที่สองตัวอย่างการ Ban / Pick แมพA = ทีมที่ชนะใน knife round / B = ทีมที่แพ้ใน knife\r\n");
      out.write("                        roundA เลือกแมพที่จะ BanB เลือกแมพที่จะ BanA เลือกแมพที่จะเล่นในเกมแรกB เลือกแมพที่จะเล่นในเกมสอง<br>\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;1.2 การเลือกฝั่ง CT และ T จะเลือกโดยการใช้ Knife Round ในการตัดสิน ใครที่เป็นฝ่ายชนะ Knife Round จะได้เลือกฝั่งที่จะเริ่มเล่น<br>\r\n");
      out.write("                        2. Round: 30 Rounds (Max Round 15 Format) โดยจะมีการสลับฝั่งเมื่อ Round รวมถึง 15 (โดยระบบตัวเกมจะเป็นตัวกำหนดให้เอง)<br>\r\n");
      out.write("                        3. เงื่อนไขการชนะ: ทีมใดที่ได้ Win Round รวมทั้งในครึ่งแรกและครึ่งหลังถึง 16 Round ก่อนชนะ (โดยระบบตัวเกมจะเป็นตัวกำหนดให้เอง)<br>\r\n");
      out.write("                        4. RoundTime: 1.45 นาที<br>\r\n");
      out.write("                        5. Freeze Time : 15 วินาที<br>\r\n");
      out.write("                        6. ในกรณีที่มีการเสมอ 15:15 Round จะทำการแข่งขันใหม่ด้วยระบบ 6 Round มีเงินเริ่มต้น $10,000 โดยจะแบ่งเป็น Round รวม ครึ่งละ 3 นั่นเอง โดยใครที่ทำได้ 4 Round ก่อนจะได้รับชัยชนะไป หากยังเสมอกันต่อเนื่องก็จะแข่งในรูปแบบนี้จนกว่าจะมีผู้ชนะ<br>7.\r\n");
      out.write("                        แผนที่ที่ใช้ในการแข่งขัน• de_nuke• de_dust2• de_inferno• de_mirage• de_train8. การแข่งขันทุกแมตช์จะมีการบันทึก demo ไว้ตลอดเวลา</p> \r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>กฎและข้อบังคับโดยทั่วไป</strong><br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        1. ตัวเกมจะใช้เวอร์ชัน Steam ตัวล่าสุดของ Counter-Strike: Global Offensive<br>\r\n");
      out.write("                        2.  แต่ละทีมสามารถมีตัวสำรองได้มากสุด 2 คนต่อทีม (รวมตัวจริงแล้วเท่ากับ 7 คน) และสามารถเปลี่ยนตัวผู้เล่นได้หลังจากจบเกมนั้นๆไปแล้วเท่านั้น ไม่อนุญาตให้เปลี่ยนตัวระหว่างแข่ง<br>\r\n");
      out.write("                        3. ผู้เล่น 1 คน สามารถเล่นให้ได้เพียง 1 ทีมเท่านั้น (หากมีการเล่นให้ทีมอื่นภายในทัวร์นาเม้นต์จะถูกปรับแพ้ทันที)<br>\r\n");
      out.write("                        4. แต่ละทีมต้องมีตัวแทน 1 คนในการติดต่อกับทีมงานและกรรมการ<br>\r\n");
      out.write("                        5. ผู้เล่นทุกคนในทีม ต้องใช้ Tag team แบบเดียวกันทุกคน (Clan Tag)<br>\r\n");
      out.write("                        6. ผู้เล่นทุกคนต้องรับรู้และเข้าใจกฏการแข่งขัน จะไม่มีการอ้างใดๆ เกิดขึ้นเมื่อการแข่งขันเริ่มไปแล้ว<br>\r\n");
      out.write("                        7. กฏและกติกา อาจจะมีการยืดหยุ่นตามเวอร์ชันของตัวเกม และระบบอื่นๆ ที่จะมีการอัพเดทตามมาจนกว่าจะถึงวันแข่งขัน<br>\r\n");
      out.write("                        8. กฏและกติกาการแข่งขันต่างๆ อาจจะมีการเปลี่ยนแปลงตามความเหมาะสมในสถานการณ์ต่างๆ ที่เกิดขึ้นเฉพาะหน้า เพื่อความราบรื่นในการแข่งขันให้เป็นไปตามความเหมาะสม*การแข่งขันทุกแมตช์จะมีการบันทึก demo ไว้ตลอดเวลา<br>\r\n");
      out.write("\r\n");
      out.write("                    </p> \r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>เวลาที่ทำการแข่งขัน</strong><br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        -หากทีมที่ชนะการแข่งขัน ไม่ส่งหลักฐานการแข่งมาตามระยะเวลาที่ทีมงานกำหนดในแต่ละรอบ จะถูกตัดสิทธิ์จากการแข่งขัน ทั้ง 2 ทีม<br>\r\n");
      out.write("                        - หากมีทีมใดทีมหนึ่งไม่สามารถเข้าแข่งขันได้ตามวันและเวลาที่กำหนด สามารถส่งผลชนะบายเพื่อใช้สิทธิ์เข้ารอบต่อไปทันที ( ต้องมีภาพหลักฐานที่ชัดเจน )<br>\r\n");
      out.write("                        - ทีมงานจะตรวจสอบ และบันทึกผลการแข่งขันในแต่ละรอบ และจะประกาศสายการแข่งเพื่อแข่งขันรอบต่อไปในวันรุ่งขึ้น<br>\r\n");
      out.write("                        - ในกรณีที่ทีมใดทีมหนึ่งไม่สามารถมาทันตามเวลาแข่งที่ทีมงานเซตไว้ให้จะต้องยอมแพ้บายในเกมแรก และมาให้ทันเวลา 20.00 น. เพื่อแข่งในเกมที่สอง ถ้าหาก 20.00 น. ทีมยังไม่พร้อมที่จะแข่ง จะถูกปรับแพ้บาย 2-0 เกมในทันที<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>การประท้วงผลการแข่ง (ผู้แข่งส่งผลการแข่งไม่ตรงกับความเป็นจริง)</strong><br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        - ผู้ประท้วงจะต้องโพสรูปและหลักฐานการประท้วง ( ต้องมีหลักฐานที่ชัดเจนให้มากที่สุด )<br>\r\n");
      out.write("                        - หากไม่มีหลักฐาน ทีมงานจะไม่รับเรื่องการประท้วงทุกกรณี<br>\r\n");
      out.write("                        - การตัดสินของทีมงานถือเป็นสิ้นสุด<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>ตารางเวลาการแข่งขัน</strong><br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        ผู้สมัครต้องตรวจสอบวัน และเวลาใช้ชัดเจนก่อนทำการแข่งขันแล้วทำตามขั้นตอนขั้นต้นที่ได้ประกาศไปทางด้านบนแล้ว<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>*** ข้อมูลที่ควรทราบ ***</strong><br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        1. หากทีมงานพบว่า ในทีมมีสมาชิกใช้โปรแกรมช่วยเล่นในระหว่างการแข่งขัน ทีมงานจะปรับให้ทีมแพ้ในแมตช์นั้นทันที และตัดสิทธิ์ออกจากการแข่งขันทั้งปัจจุบันและในอนาคต (แบนทั้งทีม)<br>\r\n");
      out.write("                        2. หากมีการกระทำผิดเกิดขึ้นในระหว่างการแข่งขัน จะต้องทำการประท้วง ด้วยภาพหลักฐาน ซึ่งผลการตัดสินจะอยู่ที่ดุลพินิจของทางทีมงานเป็นเด็ดขาดเท่านั้น (การประท้วงจะต้องอยู่ภายในวันที่แข่งขันเท่านั้น) <br>\r\n");
      out.write("                        3. หากมีการหลุดออกจากการแข่งขันของผู้เล่นบางท่านที่เกิดขึ้นจากกรณีเครื่องมีปัญหา ให้ผู้เล่นที่หลุดไป สามารถกลับเข้ามาแข่งขันต่อในรอบนั้นได้ทันที และจะต้องกลับเข้ามาภายใน 5 นาที มิฉะนั้นจะถือว่าจงใจหลีกเลี่ยงการแข่งขัน<br>\r\n");
      out.write("                        4. หากมีการฝ่าฝืนกฏ หรือไม่ปฏิบัติตามข้อตกลงต่างๆ กรรมการจะเป็นผู้ตัดสินเกี่ยวกับโทษที่สมควรจะได้รับและอาจจะนำพาไปสู่การปรับแพ้ในที่สุด<br>\r\n");
      out.write("                        5. ไม่อนุญาตให้ใช้ Bug หรือข้อผิดพลาดต่างๆ ภายในเกม เพื่อสร้างความได้เปรียบกับคู่แข่ง หากฝ่ายตรงข้ามพบเจอสามารถแจ้งต่อกรรมการได้<br>\r\n");
      out.write("                        6. หากมีการจงใจทำให้ฮาร์ดแวร์ หรือ ซอฟต์แวร์มีปัญหาระหว่างแข่งขันจะทำให้ถูกตักเตือนหรืออาจจะถึงขั้นปรับแพ้,ปรับ Round Loss ตามความเหมาะสม<br>\r\n");
      out.write("                        7. หากมีการ Disconnect เกิดขึ้น เราจะไม่ทำการ pause เกมใดๆ ทั้งสิ้น จะปล่อยให้เกมดำเนินต่อไป จนกว่าคนที่หลุดจะเข้ามาใหม่ได้ แต่เงินของคนที่เข้ามาจะมีให้ตามความเหมาะสม เพราะฉะนั้นหากหลุดแล้วสมาชิกทีมของท่านต้องรับผิดชอบตัวเอง<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <strong>หมายเหตุ</strong><br>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        - การตัดสินของทีมงานถือเป็นที่สิ้นสุด<br>\r\n");
      out.write("                        - การแข่งขันทุกเกมจะอยู่ภายใต้การดูแลของ admin<br>\r\n");
      out.write("                        - ทีมงานขอสงวนสิทธิ์ในการเปลี่ยนแปลงเงื่อนไข และกฎต่าง ๆ โดยไม่จำเป็นต้องแจ้งให้ทราบล่วงหน้า<br>  </p>\r\n");
      out.write("    </div>\r\n");
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
