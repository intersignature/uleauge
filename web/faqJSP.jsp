<%-- 
    Document   : faqJSP
    Created on : 11 เม.ย. 2560, 18:07:07
    Author     : Barjord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>esport</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <link rel="stylesheet" href="assets/css/Pretty-Footer.css">
    <link rel="stylesheet" href="assets/css/Google-Style-Login.css">
    <link rel="stylesheet" href="assets/css/Pretty-Registration-Form.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.css">
    <link rel="stylesheet" href="assets/css/tree.css">
    <link rel="stylesheet" href="assets/css/nav-1.css">
    <link rel="stylesheet" href="assets/css/tab1.css">
    <link rel="stylesheet" href="assets/css/tour.css">
    <link rel="stylesheet" href="assets/css/tournament.css">
    <link rel="stylesheet" href="assets/css/info-tab_player001.css">
    <link rel="stylesheet" href="assets/css/player_001.css">
    <link rel="stylesheet" href="assets/css/player_tab.css">
</head>

<body>
  <% if (session.getAttribute("suc") == null) { %>
    <% int suc = 0;
        session.setAttribute("suc", suc);
        response.sendRedirect("faqJSP.jsp");
    %>
<% } else if ((int)session.getAttribute("suc") == 0) {%>
    <header>
         <!-- Second navbar for sign in -->
    <nav class="navbar navbar-default" id="headnav">
      <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header" >
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-2">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a href="indexJSP.jsp">
            <img src="assets/img/logo.png"  id = "logo">
          <a class="navbar-brand" href="indexJSP.jsp">U-LEAGUE</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbar-collapse-2">
          <ul class="nav navbar-nav navbar-right">
               <li id = "searchnav"> 
                  <a>
                      <form action="searchServlet" method="POST" >
                      <input id = "searchbox" type="text" name="searchuser" placeholder="Username..">
                    
                      <input id = "searchbtn" type="submit" value="Search" />
                       </form>
                  </a>
              </li>
            <li><a href="signup.html">Sign up</a></li>
            <li>
              <a class="btn btn-default btn-outline btn-circle collapsed"  data-toggle="collapse" href="#nav-collapse2" aria-expanded="false" aria-controls="nav-collapse2" id="signinbtn">Sign in</a>
            </li>
          </ul>
          <div class="collapse nav navbar-nav nav-collapse slide-down" id="nav-collapse2">
            <form action="SigninServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                 <input type="hidden" name="from" value="faqJSP.jsp" />
              <div class="form-group">
                 
                <label class="sr-only" for="username">Username</label>
                <input name="Username" type="Username" class="form-control" id="Username" placeholder="Username" autofocus required />
              </div>
              <div class="form-group">
                <label class="sr-only" for="password">Password</label>
                <input name="Password" type="Password" class="form-control" id="Password" placeholder="Password" required />
              </div>
              <button type="submit" class="btn btn-success" >Sign in</button>
            </form>
          </div>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->

    </header>
<% }  else if ((int)session.getAttribute("suc") == 1){%>
    <header>
         <!-- Second navbar for sign in -->
    <nav class="navbar navbar-default" id="headnav">
      <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header" >
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-2">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a href="indexJSP.jsp">
            <img src="assets/img/logo.png"  id = "logo">
          <a class="navbar-brand" href="indexJSP.jsp">U-LEAGUE</a>
        </div>
        <ul class="nav navbar-nav navbar-right" id="userbar">
             <% session = request.getSession();
                    String username = (String) session.getAttribute("username");
                    String roles = (String) session.getAttribute("roles");
                    String imgdir = (String) session.getAttribute("useimage"); 
                    int id = (int) session.getAttribute("P_ID");
                %> <li id = "searchnav2"> 
                  <a>
                      <form action="searchServlet" method="POST" >
                      <input id = "searchbox" type="text" name="searchuser" placeholder="Username..">
                    
                      <input id = "searchbtn" type="submit" value="Search" />
                       </form>
                  </a>
              </li>
                <a href="Player_001Servlet?player=<%out.println(id);%>"> 
            <li id="namepro">
               
                <img src= "<% out.println(imgdir); %>" id="imgpro">
                <div id = "namepro2">
                    <h4><b><% out.println(username); %></b></h4>
                </div>
               
            </li>
            </a>
     
            <form action="SignoutServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                <input type="hidden" name="from" value="faqJSP.jsp" />
             <li >
             <button type="submit" class="btn btn-default btn-outline btn-circle collapsed"  id="signinbtn" >Sign Out</button>

            </li>
            </form>
          </ul>
       
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
    </header>
<% }%>
    <ul class="nav nav-pills categories">
      <li id="menu"><a href="newsJSP.jsp" id="fontmenu">NEWS </a></li>
        <li id="menu"><a href="TourJSP.jsp" id="fontmenu">TOURNAMENT </a></li>
        <li id="menu"><a href="TeamServlet" id="fontmenu">TEAM </a></li>
        <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
        <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
        <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
<li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>    </ul>
    <div class="container">
    <div class="faq">
        <h1>FAQ </h1>
        <p>
                        <strong>รูปแบบการแข่งขัน</strong><br>
                        - แข่งขันในโหมด Competitive 5v5<br>
                        - Single Elimination<br>
                        - Best of 3<br>
                    <p><strong>กฏการแข่งขัน</strong><br></p>
                    <p>
                        1. การเลือกฝั่ง และการเลือกแผนที่<br>
                        &nbsp;&nbsp;&nbsp;1.1 การเลือกแผนที่ในการแข่งขัน จะใช้ Knife Round เป็นการตัดสิน โดยที่ผู้ชนะจะเป็นฝ่ายเลือก&quot;Ban&quot; แมพออกไปก่อน สลับกับผู้แพ้ จนกระทั่งเหลือ 3 แมพสุดท้าย ผู้ชนะจะได้เลือกแมพที่จะใช้แข่งขันในเกมแรกก่อน ผู้แพ้จะได้เลือกแมพที่ใช้แข่งในเกมที่สองตัวอย่างการ Ban / Pick แมพA = ทีมที่ชนะใน knife round / B = ทีมที่แพ้ใน knife
                        roundA เลือกแมพที่จะ BanB เลือกแมพที่จะ BanA เลือกแมพที่จะเล่นในเกมแรกB เลือกแมพที่จะเล่นในเกมสอง<br>
                        &nbsp;&nbsp;&nbsp;1.2 การเลือกฝั่ง CT และ T จะเลือกโดยการใช้ Knife Round ในการตัดสิน ใครที่เป็นฝ่ายชนะ Knife Round จะได้เลือกฝั่งที่จะเริ่มเล่น<br>
                        2. Round: 30 Rounds (Max Round 15 Format) โดยจะมีการสลับฝั่งเมื่อ Round รวมถึง 15 (โดยระบบตัวเกมจะเป็นตัวกำหนดให้เอง)<br>
                        3. เงื่อนไขการชนะ: ทีมใดที่ได้ Win Round รวมทั้งในครึ่งแรกและครึ่งหลังถึง 16 Round ก่อนชนะ (โดยระบบตัวเกมจะเป็นตัวกำหนดให้เอง)<br>
                        4. RoundTime: 1.45 นาที<br>
                        5. Freeze Time : 15 วินาที<br>
                        6. ในกรณีที่มีการเสมอ 15:15 Round จะทำการแข่งขันใหม่ด้วยระบบ 6 Round มีเงินเริ่มต้น $10,000 โดยจะแบ่งเป็น Round รวม ครึ่งละ 3 นั่นเอง โดยใครที่ทำได้ 4 Round ก่อนจะได้รับชัยชนะไป หากยังเสมอกันต่อเนื่องก็จะแข่งในรูปแบบนี้จนกว่าจะมีผู้ชนะ<br>7.
                        แผนที่ที่ใช้ในการแข่งขัน• de_nuke• de_dust2• de_inferno• de_mirage• de_train8. การแข่งขันทุกแมตช์จะมีการบันทึก demo ไว้ตลอดเวลา</p> 
                    <p>
                        <strong>กฎและข้อบังคับโดยทั่วไป</strong><br>
                    </p>
                    <p>
                        1. ตัวเกมจะใช้เวอร์ชัน Steam ตัวล่าสุดของ Counter-Strike: Global Offensive<br>
                        2.  แต่ละทีมสามารถมีตัวสำรองได้มากสุด 2 คนต่อทีม (รวมตัวจริงแล้วเท่ากับ 7 คน) และสามารถเปลี่ยนตัวผู้เล่นได้หลังจากจบเกมนั้นๆไปแล้วเท่านั้น ไม่อนุญาตให้เปลี่ยนตัวระหว่างแข่ง<br>
                        3. ผู้เล่น 1 คน สามารถเล่นให้ได้เพียง 1 ทีมเท่านั้น (หากมีการเล่นให้ทีมอื่นภายในทัวร์นาเม้นต์จะถูกปรับแพ้ทันที)<br>
                        4. แต่ละทีมต้องมีตัวแทน 1 คนในการติดต่อกับทีมงานและกรรมการ<br>
                        5. ผู้เล่นทุกคนในทีม ต้องใช้ Tag team แบบเดียวกันทุกคน (Clan Tag)<br>
                        6. ผู้เล่นทุกคนต้องรับรู้และเข้าใจกฏการแข่งขัน จะไม่มีการอ้างใดๆ เกิดขึ้นเมื่อการแข่งขันเริ่มไปแล้ว<br>
                        7. กฏและกติกา อาจจะมีการยืดหยุ่นตามเวอร์ชันของตัวเกม และระบบอื่นๆ ที่จะมีการอัพเดทตามมาจนกว่าจะถึงวันแข่งขัน<br>
                        8. กฏและกติกาการแข่งขันต่างๆ อาจจะมีการเปลี่ยนแปลงตามความเหมาะสมในสถานการณ์ต่างๆ ที่เกิดขึ้นเฉพาะหน้า เพื่อความราบรื่นในการแข่งขันให้เป็นไปตามความเหมาะสม*การแข่งขันทุกแมตช์จะมีการบันทึก demo ไว้ตลอดเวลา<br>

                    </p> 
                    <p>
                        <strong>เวลาที่ทำการแข่งขัน</strong><br>
                    </p>
                    <p>
                        -หากทีมที่ชนะการแข่งขัน ไม่ส่งหลักฐานการแข่งมาตามระยะเวลาที่ทีมงานกำหนดในแต่ละรอบ จะถูกตัดสิทธิ์จากการแข่งขัน ทั้ง 2 ทีม<br>
                        - หากมีทีมใดทีมหนึ่งไม่สามารถเข้าแข่งขันได้ตามวันและเวลาที่กำหนด สามารถส่งผลชนะบายเพื่อใช้สิทธิ์เข้ารอบต่อไปทันที ( ต้องมีภาพหลักฐานที่ชัดเจน )<br>
                        - ทีมงานจะตรวจสอบ และบันทึกผลการแข่งขันในแต่ละรอบ และจะประกาศสายการแข่งเพื่อแข่งขันรอบต่อไปในวันรุ่งขึ้น<br>
                        - ในกรณีที่ทีมใดทีมหนึ่งไม่สามารถมาทันตามเวลาแข่งที่ทีมงานเซตไว้ให้จะต้องยอมแพ้บายในเกมแรก และมาให้ทันเวลา 20.00 น. เพื่อแข่งในเกมที่สอง ถ้าหาก 20.00 น. ทีมยังไม่พร้อมที่จะแข่ง จะถูกปรับแพ้บาย 2-0 เกมในทันที<br>
                    </p>
                    <p>
                        <strong>การประท้วงผลการแข่ง (ผู้แข่งส่งผลการแข่งไม่ตรงกับความเป็นจริง)</strong><br>
                    </p>
                    <p>
                        - ผู้ประท้วงจะต้องโพสรูปและหลักฐานการประท้วง ( ต้องมีหลักฐานที่ชัดเจนให้มากที่สุด )<br>
                        - หากไม่มีหลักฐาน ทีมงานจะไม่รับเรื่องการประท้วงทุกกรณี<br>
                        - การตัดสินของทีมงานถือเป็นสิ้นสุด<br>
                    </p>
                    <p>
                        <strong>ตารางเวลาการแข่งขัน</strong><br>
                    </p>
                    <p>
                        ผู้สมัครต้องตรวจสอบวัน และเวลาใช้ชัดเจนก่อนทำการแข่งขันแล้วทำตามขั้นตอนขั้นต้นที่ได้ประกาศไปทางด้านบนแล้ว<br>
                    </p>
                    <p>
                        <strong>*** ข้อมูลที่ควรทราบ ***</strong><br>
                    </p>
                    <p>
                        1. หากทีมงานพบว่า ในทีมมีสมาชิกใช้โปรแกรมช่วยเล่นในระหว่างการแข่งขัน ทีมงานจะปรับให้ทีมแพ้ในแมตช์นั้นทันที และตัดสิทธิ์ออกจากการแข่งขันทั้งปัจจุบันและในอนาคต (แบนทั้งทีม)<br>
                        2. หากมีการกระทำผิดเกิดขึ้นในระหว่างการแข่งขัน จะต้องทำการประท้วง ด้วยภาพหลักฐาน ซึ่งผลการตัดสินจะอยู่ที่ดุลพินิจของทางทีมงานเป็นเด็ดขาดเท่านั้น (การประท้วงจะต้องอยู่ภายในวันที่แข่งขันเท่านั้น) <br>
                        3. หากมีการหลุดออกจากการแข่งขันของผู้เล่นบางท่านที่เกิดขึ้นจากกรณีเครื่องมีปัญหา ให้ผู้เล่นที่หลุดไป สามารถกลับเข้ามาแข่งขันต่อในรอบนั้นได้ทันที และจะต้องกลับเข้ามาภายใน 5 นาที มิฉะนั้นจะถือว่าจงใจหลีกเลี่ยงการแข่งขัน<br>
                        4. หากมีการฝ่าฝืนกฏ หรือไม่ปฏิบัติตามข้อตกลงต่างๆ กรรมการจะเป็นผู้ตัดสินเกี่ยวกับโทษที่สมควรจะได้รับและอาจจะนำพาไปสู่การปรับแพ้ในที่สุด<br>
                        5. ไม่อนุญาตให้ใช้ Bug หรือข้อผิดพลาดต่างๆ ภายในเกม เพื่อสร้างความได้เปรียบกับคู่แข่ง หากฝ่ายตรงข้ามพบเจอสามารถแจ้งต่อกรรมการได้<br>
                        6. หากมีการจงใจทำให้ฮาร์ดแวร์ หรือ ซอฟต์แวร์มีปัญหาระหว่างแข่งขันจะทำให้ถูกตักเตือนหรืออาจจะถึงขั้นปรับแพ้,ปรับ Round Loss ตามความเหมาะสม<br>
                        7. หากมีการ Disconnect เกิดขึ้น เราจะไม่ทำการ pause เกมใดๆ ทั้งสิ้น จะปล่อยให้เกมดำเนินต่อไป จนกว่าคนที่หลุดจะเข้ามาใหม่ได้ แต่เงินของคนที่เข้ามาจะมีให้ตามความเหมาะสม เพราะฉะนั้นหากหลุดแล้วสมาชิกทีมของท่านต้องรับผิดชอบตัวเอง<br>
                    </p>
                    <p>
                        <strong>หมายเหตุ</strong><br>
                    </p>
                    <p>
                        - การตัดสินของทีมงานถือเป็นที่สิ้นสุด<br>
                        - การแข่งขันทุกเกมจะอยู่ภายใต้การดูแลของ admin<br>
                        - ทีมงานขอสงวนสิทธิ์ในการเปลี่ยนแปลงเงื่อนไข และกฎต่าง ๆ โดยไม่จำเป็นต้องแจ้งให้ทราบล่วงหน้า<br>  </p>
    </div>
    </div>
    <footer id="footer001">
        <div class="row">
            <div class="col-md-4 col-sm-6 footer-navigation">
                <h3><a href="#">U-LEAGUE<span><img src="assets/img/logo.png" id="footlogo"> </span></a></h3>
            </div>
            <div class="col-md-4 col-sm-6 footer-contacts">
                <div><i class="fa fa-facebook footer-contacts-icon" ></i>
                    <p class="footer-center-info email text-left"> <a href="https://www.facebook.com/ULeagueTH/">U LEAUGE</a></p>
                </div>

                <div><i class="fa fa-envelope footer-contacts-icon"></i>
                    <p> <a>lawslifeaways@gmail.com</a></p>
                </div>
            </div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-md-4 footer-about">
                <h4>U LEAUGE</h4>
                <p> A e-sport tournament of university.For relationship, good ethics, unity and increase performance of e-sport tournament.
                </p>
            </div>
        </div>
    </footer>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-treeview/1.2.0/bootstrap-treeview.min.js"></script>
    <script src="assets/js/treejs.js"></script>
    <script src="assets/js/popupjs.js"></script>
</body>

</html>