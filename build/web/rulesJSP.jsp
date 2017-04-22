<%-- 
    Document   : rulesJSP
    Created on : 11 เม.ย. 2560, 17:53:59
    Author     : Barjord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        response.sendRedirect("rulesJSP.jsp");
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
                 <input type="hidden" name="from" value="rulesJSP.jsp" />
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
                    String imgdir = "assets/img/"+username+".jpg";
                    int id = (int) session.getAttribute("P_ID");
                    String roles = (String) session.getAttribute("roles");
                %>
                 <li id = "searchnav2"> 
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
                <input type="hidden" name="from" value="rulesJSP.jsp" />
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
        <li id="menu"><a href="replayJSP.jsp" id="fontmenu">REPLAY </a></li>
        <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
        <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
        <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
            <li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>
    </ul>
    <div class="container">
        <h1>RULES </h1>
        <div class="container">
	<div class="row">
		<div id="cssmenu">
            <ul>
             <li class="active"><a href="#tab-1" role="tab" data-toggle="tab">CS:GO</a></li>
             <li><a href="#tab-2"role="tab" data-toggle="tab">OverWatch</a></li>
             <li><a href="#tab-3"role="tab" data-toggle="tab">Dota2</a></li>
             <li><a href="#tab-4"role="tab" data-toggle="tab">LOL</a></li>
       
            </ul>
        </div>
	</div>
</div>
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane" id="tab-1">
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
        <div role="tabpanel" class="tab-pane active" id="tab-3">
            <p><strong>กฎการเข้าแข่งขันเบื้องต้น</strong><br>
                    </p>
                    <p>
                        1. สามารถนัดเวลาการแข่งขันได้ที่กลุ่ม dafaEsports DotA2 Tournament<br>
                        2. เริ่มการแข่งขันเวลา 20.00 น. สายได้ไม่เกิน 30 นาที และต้องรายงานผลภายใน 24.00 น. ของวันที่ทำการแข่งขัน<br>
                        3. การเลื่อนการแข่งขัน ต้องแข่งให้เสร็จก่อนเวลา 18.00น ของวันรุ่งขึ้น โดยมีรายละเอียดดังนี้<br>
                        &nbsp;&nbsp;&nbsp;- หัวหน้าทีมทั้ง 2 ทีม ต้องยินยอมรับทราบร่วมกันที่จะให้มีเลื่อนการแข่งขันเกิดขึ้น และรายงานข้อคกลงก่อนเวลา 24.00น.<br>
                        &nbsp;&nbsp;&nbsp;- กรณีตกลงเลื่อนการแข่งขัน แต่ไม่มีการแจ้งข้อตกลงให้แอดมินทราบภายในเวลา 24.00น. ของวันแข่ง ทั้งสองทีมจะถูกปรับแพ้บายทันที<br>
                        &nbsp;&nbsp;&nbsp;- ในกรณีที่ ฝ่ายใดฝ่ายหนึ่งไม่ยินยอมหรือไม่สามารถเลื่อนการแข่งขันได้ ทีมที่มีความพร้อมแข่งขันภายในเวลา 20.30 มีสิทธิ์ขอชนะบายได้ทันที, หากไม่พร้อมทั้งสองทีมจะถูกปรับแพ้บายทั้งสองทีม<br>
                        4. ทั้ง 2ทีมสามารถเป็นฝ่าย Create Game ได้อิสระโดยมีการนัดหมายก่อน, ทีมที่ได้รับการถ่ายทอดสดในวันนั้นๆ จะถูกกำหนดเวลาโดย Admin หรือ Moderator ของ FPS Thaiiland โดยจะมีทีมงานเป็นผู้ติดต่อเพื่อบอกพาสเวิร์ดห้องเอง<br>
                        5. สามารถมีผู้เล่น Stand-in ได้ไม่เกิน 2 คน โดยคนที่เหลืออีก 3 คนต้องใช้ ID ที่ลงทะเบียนไว้มาแข่งขัน (อ้างอิงตาม Steam Link ของผู้สมัคร) ยกเว้นได้มีการเริ่มเกมเกิดขึ้นแล้ว ถือว่าอีกทีมยอมรับให้มีการเปลี่ยนแปลง<br>
                    </p>
                    <p>
                        <strong>กติกาในการแข่งขันการตั้งค่าห้องแข่งขันการเซทค่า Lobby</strong><br>
                    </p>
                    <p>
                        • GAME MODE – Captains Mode<br>
                        • First Draft : Random<br>
                        • SERVER LOCATION – South East Asia<br>
                        • Enable cheats – ไม่ให้มีการโกง<br>
                        • VERSION – Tournament, ยกเว้นที่ระบุไว้เป็นอย่างอื่นโดยกฎการแข่งขัน<br>
                        • DOTA TV DELAY – ดีเลได้ 2 นาที หรือตามที่กรรมการตัดสินได้ประกาศไว้<br>
                    </p>
                    <p>
                        <strong>อื่นๆ </strong><br>
                    </p>
                    <p>
                        1.สามารถทำการ Share Unit ได้ตลอดระยะเวลาการแข่งขัน<br>
                        2. ห้ามใช้ข้อผิดพลาดต่างๆในตัวเกม (Bug): ปรับแพ้ทันที<br>
                    </p>
                    <p>
                        <strong>Re game &amp; Load Game</strong><br>
                    </p>
                    <p>
                        หากมีผู้เล่นหลุดออกจากเกมในช่วง 10 นาทีแรก และไม่สามารถกลับเข้าสู่เกมได้<br>
                        &nbsp;&nbsp;&nbsp; - ในกรณีที่ยังไม่มีการ Kill หรือ ป้อมโจมตีถูกทำลาย ให้ทำการออกเกมแล้วเริ่มเกมใหม่ โดยใช้ Mode -ap และต้องเลือก Hero เหมือนเดิมทั้ง 2 ทีม<br>
                        &nbsp;&nbsp;&nbsp;- หากมีการ Kill หรือป้อมถูกทำลายแล้ว สามารถดำเนินการแข่งขันต่อไปได้ ไม่ว่าฝ่ายตรงข้ามจะกลับเข้ามาหรือไม่ก็ตาม<br>
                        &nbsp;&nbsp;&nbsp;- หากเกิน 10 นาทีของเกมส์ไปแล้วและมีการหลุดออกจากเกมส์โดยไม่สามารถกลับเข้ามาได้และมีการขอ Load Game จะต้องได้รับการยินยอมจากหัวหน้าทีมทั้ง 2 ฝ่ายโดย Dota2 จะมีระบบ Auto Save game ทุกๆ 10 นาที, หากไม่มีการยินยอมจากทั้ง 2 ทีมจะต้องทำการแข่งขันต่อไปจนจบเท่านั้น<br>
                    </p>
                    <p>
                        <strong>Pause Game</strong><br>
                    </p>
                    <p>
                        1.หากผู้เข้าแข่งขันเกิดปัญหาทางเทคนิคหรือเหตุจำเป็นที่จะต้องหยุดเกม (Pause) ผู้เข้าแข่งขันสามารถขอหยุดเกมได้ทีมละไม่เกิน 5 ครั้ง ครั้งละ 5 นาที หากเกิน 5 นาทีแล้วยังไม่กลับเข้ามา อีกทีมสามารถขอเริ่มเกมต่อได้เลย<br>
                        2. หากผู้เข้าแข่งขันเกิดหลุดออกจากเกมให้หยุดเกม (Pause) ได้ทันที<br>
                        3. ผู้เข้าแข่งขันจะกดเริ่มเกม (Unpause) ได้ต่อเมื่อทั้งสองทีมส่งสัญญาณว่าพร้อมแล้ว<br>
                        4. หากหยุดเกมนอกเหนือจากการเกิดปัญหา หรือหยุดเกมในเหตุการณ์ที่ไม่สมควร จะถูกเตือนก่อน 1 ครั้ง ถ้าถูกเตืนถึง 3 ครั้ง ในเกมนั้นจะถูกปรับแพ้ทันที<br>
                    </p>
                    <p>
                        <strong>กติกาการรายงานผลการแข่งขัน</strong><br>
                    </p>
                    <p>
                        1.ปิดรับการรายงานผลเวลา 24.00 น.<br>
                        2. Screen Shot ที่ใช้รายงานผลจะต้องเป็น Screen Shot ของเกมส์ที่แข่งขันเท่านั้น<br>
                        3. ทีมที่รายงานผลการแข่งขันไม่ถูกต้อง หลังจากปิดรับการรายงานผลการแข่งขัน 24.00น. ปรับแพ้ทันที<br>
                    </p>
                    <p>
                        <strong>การโพสรายงานผลการแข่งขัน</strong><br>
                    </p>
                    <p>
                        ส่วนที่ 1 ทีม A vs ทีม B ทีม A ชนะ<br>
                        ส่วนที่ 2 Screen Shot ภาพจบเกมส์สำหรับ Match ที่แข่งขัน การแก้ไข ปรับแต่ง Screen Shot ถือเป็นโทษร้านแรง : หากตรวจพบจะถูกปรับแพ้ทัน พร้อมแบนทีมผู้กระทำผิดจาก dafaEsports DotA2 Tournament เป็นเวลา 1 เดือน<br>
                    </p>
                    <p>
                        <strong>มารยาทในการแข่งขัน Tournament</strong><br>
                    </p>
                    <p>
                        1. การแสดงที่บ่งบอกความไม่มีน้ำใจนักกีฬา ปรับแพ้ทันที<br>
                        2. การตั้งชื่อไม่สุภาพ ไม่สามารถลงแข่ง Tournament ได้<br>
                        3. การเยาะเย้ย ถากถาง ไม่สุภาพ ทั้งวาจาและการกระทำต่อทีมเข้าแข่งขัน ปรับแพ้ทันที<br>
                    </p>
                    <p>
                        <strong>หมายเหตุ</strong><br>
                    </p>
                    <p>
                        1. กฏกติกาอาจจะมีการเปลี่ยนแปลงไปตามความเหมาะสมของสถานการณ์ในระหว่างการแข่งขัน โดยที่อาจจะไม่ได้แจ้งให้ทราบล่วงหน้า<br>
                        2. ทีมที่เข้าร่วมแข่งขันต้องเข้าใจถึงกฏ กติกาอย่างชัดเจน ถ้าเกิดมีการทำผิดกฏกรรมการสามารถตัดสิทธิ์ทีมนั้นๆ ได้ทันที<br>
                        3. คำตัดสินของกรรมการผู้ทควบคุมการแข่งขันถือเป็นที่สิ้นสุด <br></p>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-4">
            <p><strong>รูปแบบการแข่งขัน</strong><br>
                    </p>
                    <p>
                        รูปแบบการแข่งขัน : Single Elimination : Best of 1 (นัดเดียวรู้ผล)<br>
                        •ระบบการแข่งขัน : 5 vs 5<br>
                        •แผนที่ที่ใช้ : Summoner’s Rift<br>
                        •ประเภทเกม: ทัวร์นาเม้นต์ โหมด(Tournament Draft mode) <br>
                        •แชมเปี้ยนที่แบนต่อทีม : 3 ตัวละคร<br>
                        •เริ่มแข่งขัน: 20.00 น. ของทุกวัน (ยกเว้นคู่ที่ทำการถ่ายทอดสด)<br>
                        •ผู้ชนะ : ทีมที่สามารถทำลาย Nexus ฝ่ายตรงข้ามได้ก่อนหรือบังคับให้ฝ่ายตรงข้ามกดยอมแพ้ (Surrender)ได้<br>
                        •การเลือก Champion : Draft mode ผู้เล่นสามารถเลือกได้เฉพาะแชมป์เปี้ยนที่ปลดล็อกแล้วเท่านั้น(โดยระบบจะทำการสุ่มสีของฝั่งให้)<br>
                        </p>
                        <p>
                        <strong>*ข้อจำกัด : ห้ามใช้แชมเปี้ยนที่มีรายชื่อดังนี้ตลอดการแข่งขัน- ไม่มี <span style="text-decoration: underline;">การกระทำที่ถือว่าผิดกฏ และ ข้อยกเว้น ในการแข่ง</span></strong><br>
                        </p>
                        <p>
                        - ไม่อนุญาตให้ใช้โปรแกรมช่วยหรือmap hack ในการช่วยเล่นทุกระเภท<br>
                        - ห้ามจงใจหลุดจากการแข่งขันโดยไม่มีเหตุผลที่เหมาะสมรองรับ<br>
                        - การปรับค่าที่เกินจากมาตรฐานที่ได้รับการอนุญาติ<br>
                        - ทำให้ฝั่งตรงข้ามชนะอย่างชัดเจน (ล้มมวย)<br>
                        - ห้ามใช้กริยา, ท่าทาง หรือ คำพูดที่ไม่เหมาะสมตลอดทั้งการแข่งขัน<br>
                        - มีการใช้บัคในเกม ซึ่งกรรมการการแข่งขันเห็นว่าไม่ยุติธรรม<br>
                        </p>
                        <p>
                        <strong><span style="text-decoration: underline;">สามารถเปลี่ยนข้อมูลการแข่งขันได้ก่อนวันที่ 10 มิ.ย. 56 เวลา 12.00 น. </span></strong><br>
                        </p>
                        <p>
                        <a href="http://forum.playlol.in.th/showthread.php?30950-%E0%B9%81%E0%B8%88%E0%B9%89%E0%B8%87%E0%B9%80%E0%B8%9B%E0%B8%A5%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%99%E0%B8%82%E0%B9%89%E0%B8%AD%E0%B8%A1%E0%B8%B9%E0%B8%A5%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%81%E0%B8%82%E0%B9%88%E0%B8%87%E0%B8%82%E0%B8%B1%E0%B8%99-%E0%B9%80%E0%B8%8A%E0%B9%88%E0%B8%99-%E0%B8%A3%E0%B8%B2%E0%B8%A2%E0%B8%8A%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%9C%E0%B8%B9%E0%B9%89%E0%B9%80%E0%B8%A5%E0%B9%88%E0%B8%99-%E0%B9%80%E0%B8%9E%E0%B8%B4%E0%B9%88%E0%B8%A1%E0%B8%95%E0%B8%B1%E0%B8%A7%E0%B8%AA%E0%B8%B3%E0%B8%A3%E0%B8%AD%E0%B8%87-%E0%B8%8A%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%97%E0%B8%B5%E0%B8%A1-%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%99%E0%B8%B5%E0%B9%88"><strong><span style="text-decoration: underline;">&lt;&lt;&lt;คลิ๊ก&gt;&gt;&gt;</span></strong></a>
                        
                            </p>
                            <p>
                            <strong>
                            
                            * กฏอาจจะมีการเปลี่ยนแปลงไปตามความเหมาะสมของสถานการณ์ในระหว่างการแข่งขัน โดยที่อาจจะไม่ได้แจ้งให้ทางผู้เล่นทราบล่วงหน้า <br>
                            * การตัดสินใจของกรรมการคือคำสิ้นสุด และจะไม่มีข้อยกเว้นใดๆทั้งสิ้น <br>
                            * ทีมที่เข้าร่วมแข่งขันต้องเข้าใจถึงกฏ กติกาอย่างชัดเจน ถ้าเกิดมีการทำผิดกฏ กรรมการสามารถตัดสิทธิ์ทีมนั้นๆได้ทันที<br>
                            * หากปล่อยแพทช์/รุ่นที่แตกต่างกันออกมา จำเป็นต้องเปลี่ยนกฎระเบียบที่มีความจะเป็นเพื่อให้แน่ใจว่าเป็นการเล่นที่ยุติธรรม<br>
                            
                            * หากมีการพบบัคขณะทำการแข่งขันถ้าที่ประสบปัญหาสามารถหยุดเล่นเกมส์และทักท้วง และถ่ายรูป หรือใช้ LOLreplay มาให้กรรมการตัดสินได้* หากผู้เล่นต้องสงสัยหรือได้รับการพิสูจน์แล้วว่ามีส่วนร่วมในการเล่นที่ไม่เป็นธรรมหรือสมรู้ร่วมคิดในการกำหนดผลการเล่นกรรมการจะทำการลงโทษตามความเหมาะสมและดุลยพินิจของกรรมการ<br>
                            </p></strong>
                                
                            <p>
                                <strong>
                            <span style="text-decoration: underline;">การหลุดออกจากเกม (Disconnect)</span></strong><br>
                            </p>
                            <p>
                        1.มีผู้เล่นหลุดระหว่างเลือกตัวละครให้กลับมาเลือกเและแบน Champion ตัวเดิมทุกทีมเท่านั้น !!!<br>
                        2.มีผู้เล่นหลุดออกจากเกมในช่วง 10 นาทีแรก และไม่สามารถกลับเข้าสู่เกมได้<br>
                            &nbsp;&nbsp;&nbsp;- ในกรณีที่ยังไม่มี First Blood ให้ทำการ Re-Game แต่ต้องทำการเลือกและแบน Champion ตัวเดิมทุกทีมเท่านั้น !!!<br>
                            &nbsp;&nbsp;&nbsp;- หากมีการ First Blood แล้ว ให้ดำเนินการแข่งขันต่อจนจบ3.มีผู้เล่นหลุดออกจากเกมหลังจาก 10 นาที และไม่สามารถกลับเข้าสู่เกมได้<br>
                            &nbsp;&nbsp;&nbsp;- หากมีผู้เล่นหลุด 1 คน ให้ดำเนินการแข่งขันต่อจนจบ-หากมีผู้เล่นหลุดมากกว่า 1 คน เนื่องจากระบบขัดข้อง ให้ทำการ Re-Game-หากมีผู้เล่นหลุดมากกว่า1 คน ด้วยเหตุผลอื่นๆ ให้ขึ้นอยู่กับดุลยพินิจของกรรมการ<br>
                            </p>
                            <p>
                                <strong><span style="text-decoration: underline;">กติกาการแพ้บาย </span></strong><br></p>
                            <p>
                            - ทีมที่มาไม่ครบภายในเวลา 10 นาทีหลังจากเวลาที่นัดแล้วจะถูกปรับแพ้บายทันที (หากผู้เล่นทั้ง 2 ฝ่าย ตกลงยินยอมขอเลื่อนการแข่งขัน ก็จะได้รับสิทธิยกเว้น)<br>
                            - สำหรับคู่ที่ได้รับการเชิญให้ถ่ายทอดสดออก LOLTV จะให้เลทได้แค่ 5 นาทีเท่านั้น*** ไม่มีข้อยกเว้นใดๆทั้งสิ้น ซึ่งพอ 20.05 จะเป็นการเตือนก่อนและให้เวลาอีก 5 นาที ถ้ายังไม่ครบอีกจะถูกตัดสิทธิ์ตามที่ได้แจ้งไว้ (ซึ่งทีมงานจะโทรไปบอกรายละเอียดในการถ่ายโทรสดผ่าน LOLTV กรุณาฟังให้ละเอียด หากสงสัยอะไรสามารถถามทีมงานได้นะครับ)<br>
                            - ผู้เล่นที่สามารถลงเล่นได้นั้น จะต้องเป็นผู้เล่นที่มีชื่อในแบบฟอร์มสมัครแข่ง เท่านั้น<br>
                            - ทีมที่ไม่ยอมเชื่อฟังกฏกติกา หรือโวยวาย อาจจะได้รับการแบนในทัวร์นาเม้นครั้งต่อไป<br>
                            </p>
                            <p>
                            <strong><span style="text-decoration: underline;">วิธีการโพสหลักฐานการแพ้บาย</span></strong>  <br>
                            </p>     
                            <p>
                            <a href="http://forum.playlol.in.th/showthread.php?30950-%E0%B9%81%E0%B8%88%E0%B9%89%E0%B8%87%E0%B9%80%E0%B8%9B%E0%B8%A5%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%99%E0%B8%82%E0%B9%89%E0%B8%AD%E0%B8%A1%E0%B8%B9%E0%B8%A5%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%81%E0%B8%82%E0%B9%88%E0%B8%87%E0%B8%82%E0%B8%B1%E0%B8%99-%E0%B9%80%E0%B8%8A%E0%B9%88%E0%B8%99-%E0%B8%A3%E0%B8%B2%E0%B8%A2%E0%B8%8A%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%9C%E0%B8%B9%E0%B9%89%E0%B9%80%E0%B8%A5%E0%B9%88%E0%B8%99-%E0%B9%80%E0%B8%9E%E0%B8%B4%E0%B9%88%E0%B8%A1%E0%B8%95%E0%B8%B1%E0%B8%A7%E0%B8%AA%E0%B8%B3%E0%B8%A3%E0%B8%AD%E0%B8%87-%E0%B8%8A%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%97%E0%B8%B5%E0%B8%A1-%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%99%E0%B8%B5%E0%B9%88"><strong>&gt;&gt;&gt;คลิ๊กที่นี้&lt;&lt;&lt;</strong></a> <br>
                            1.หัวหน้าทีมของทั้งฝั่งต้องนัดเวลาการแข่งขันเองด้วยบอร์ดในหมวดของของTournament<a href="http://forum.playlol.in.th/showthread.php?30952-%E0%B8%A7%E0%B8%B4%E0%B8%98%E0%B8%B5%E0%B8%99%E0%B8%B1%E0%B8%94%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%81%E0%B8%82%E0%B9%88%E0%B8%87%E0%B8%82%E0%B8%B1%E0%B8%99%E0%B8%94%E0%B9%89%E0%B8%A7%E0%B8%A2-Webboard"><strong>&gt;&gt;&gt;คลิ๊ก&lt;&lt;&lt;</strong></a> <br>
                            2.หากทั่งสองทีมไม่ได้ตอบตกลงหรือฝ่ายใดฝ่ายหนึ่งไม่ได้ตกลงในเวลาการแข่งขันที่ได้นัดใหม่ทางทีมงานจะใช้เวลา 20.00 น.เป็นเวลามาตรฐาน และหากฝ่ายใดฝ่ายหนึ่งสายเกิน 10 นาทีจากเวลานัดนั้นๆ จะถูกปรับแพ้บายในทัน <br>
                            </p>  
                            <p>
                                <strong>*การตัดสินของกรรมการถือเป็นที่สิ้นสุด*กรรมการจะยึดนาฬิกาจากการโพสต์ของบอร์ด </strong><br></p>  
                            <p>
                                <a href="http://forumlol.th.garena.com/"><strong>http://forumlol.th.garena.com</strong></a><br>
                            </p>
                            <p>
                                <strong>เป็นหลักเท่านั้น<span style="text-decoration: underline;">การก่อกวนฝ่ายตรงข้าม</span></strong><br>
                            </p>
                            <p>
                            - การใช้คำหยาบคายหรือการก่อกวนฝ่ายตรงข้ามไม่ว่าจะด้วยวิธีใดๆ จะมีผลทำให้โดนปรับแพ้ทันที<br>
                            - การรบกวนต้องขึ้นอยู่กับการตัดสินของกรรมการด้วยว่าสิ่งที่ผู้เล่นทำนั้นเป็นการก่อกวนหรือก่อกวนจริงๆ หรือไม่ และ ร้ายแรงพอที่จะมีผลบังคับใช้หรือไม่<br>
                            - ผู้ที่จะฟ้องร้องเรื่องการถูกรบกวน ต้องแจ้งถึงกรรมการด้วยวิธีข้างล่างนี้ <br>
                                &nbsp;&nbsp;&nbsp;1.ถ่ายรูปภาพกด Print screen รูปบทสนทนาดังกล่าว <br>
                                &nbsp;&nbsp;&nbsp;2.เซฟไฟล์ภาพด้วยโปรแกรมรูปต่างๆเช่นPaint หรือ Photoshop เป็นต้น <br>
                                &nbsp;&nbsp;&nbsp;3.แล้วนำมาแปะในบอร์ดในหมวดของ Tournament ในกระทู้คู่การการแข่งขันของคุณ<br>
                                </p>
                                <p>
                                <strong>* การตัดสินใจของกรรมการคือที่สิ้นสุด<span style="text-decoration: underline;">การโกง และ การ Hack</span></strong><br>
                                </p>
                                <p>
                            - การโกงหรือการใช้ข้อผิดพลาดของเกมและ โปรแกรมช่วยเล่นจะมีผลทำให้ทีมที่ใช้ นั้นถูกแบนออกจากการแข่งขันในปัจจุบัน และในอนาคตอย่างถาวรสิ่งที่ต้องรู้<br>
                            - กรรมการหรือผู้คุมการแข่งขันจะไม่มีส่วนเกี่ยวข้องใดๆทั้งสิ้นกับเหตุการณ์ที่อาจจะทำให้เกิดความสูญเสียระหว่างการแข่งขันในครั้งนี้<br>
                            - ผู้เล่นทุกคนต้องปฏิบัติตามกติกาอย่างเคร่งครัด<br>
                            </p>
                            <p>
                            <strong><span style="text-decoration: underline;">**** การถ่ายทอดสดและการร่วมดูการแข่งขัน ***</span><br>
                                
                            - ไม่อนุญาติให้มีการเป็น OB ,Spectatre หรือถายทอดสดการแข่งขันใดๆ ทั้งสิ้น  ยกเว้น คู่ที่ทีมงานได้เลือกทำการถ่ายทอดสดที่มีสิทธิขาดแต่เพียงผู้เดียว ผู้ใดฝ่าฝืนอาจถูกดำเนินการตามกฏหมายลิขสิทธิ์รายชื่อทีมงานที่ดูแลการแข่งขันให้แอด GarenaPlus เพื่อติดต่อหรือเข้าห้องแชททัวร์นาเม้นเพื่อทำการสอบถาม </strong><br>
                        <a href="http://forum.playlol.in.th/showthread.php?24116"></p><strong> &gt;&gt;&gt;คลิกที่นี่&lt;&lt;&lt;</strong></a><br>
                        <strong>1. Baggings [Head-Judge] Nickname [GMTH]Baggings2. Nerfgi [Judge]Nickname [GMTH] Nerfgi 3. Mamushi [Judge]Nickname [GMTH] Mamushi** หากไม่พอใจการตัดสินสามารถยื่นอุทธรณ์ได้ที่[Head-Judge]** การตัดสินของ[HeadJudge]ถือเป็นคำสิ้นสุด และจะไม่มีข้อยกเว้นใดๆทั้งสิ้น</strong>                    </p>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-2">
            <p>
                        [TEMPLE OF ANUBIS, HANAMURA, VOLSKAYA INDUSTRIES] <br>
                        รอบแรกฝ่าย Attack จะต้องยึดจุดให้ได้ 2 จุดและทำให้ได้เวลาเร็วที่สุด ฝ่าย Defense จะต้องป้องกันไม่ให้ยึดจุดแรกให้ได้ หากพลาดจุดแรกจุดที่ 2 จะต้องยื้อเวลาไว้ให้นานที่สุดหรือห้ามให้ยึดเด็ดขาด<br>
                        </p>
                        <p>
                        <em>ผลรอบแรกและเปลี่ยนฝั่ง</em><br>
                        กรณีที่ 1: ฝ่าย ATTACK ยึดจุดแรกไม่ได้เมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องยึดจุดแรกให้ได้ <br>
                           &nbsp;&nbsp;&nbsp; 1. หากยึดจุดแรกได้จะเป็นการสิ้นสุดเกมทันที ไม่ต้องยึดจุดที่สอง<br>
                           &nbsp;&nbsp;&nbsp; 2. หากยึดจุดแรกไม่ได้จะต้องไปสู้กันในรอบ Sudden Death<br>
                        กรณีที่ 2: ฝ่าย ATTACK ยึดจุดแรกได้เมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องยึดจุดแรกแล้วต้องไปจุดที่สองให้ได้ <br>
                           &nbsp;&nbsp;&nbsp; 1. หากยึดจุดที่ 2 ได้สำเร็จจะเป็นการสิ้นสุดเกมทันที<br>
                           &nbsp;&nbsp;&nbsp; 2. หากยึดจุดแรกแต่ไปจุดที่สองไม่ได้จะวัดกันด้วยเวลาที่เหลือของทั้งคู่ว่าใครเหลือมากที่สุด และฝั่งไหนเวลาเหลือมากที่สุดจะเป็นฝ่ายที่ต้อง Attack ในรอบ Sudden Death <br>
                        กรณีที่ 3: ฝ่าย ATTACK ยึดทั้งสองจุดได้เมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องไปจุดที่สองให้ได้เท่านั้นหากยึดจุดที่ 2 ได้สำเร็จจะเป็นการเข้าสู่รอบ Sudden Death ฝั่งไหนเวลาเหลือมากที่สุดจะเป็นเวลาที่นำไปสะสมในรอบ Sudden Death และจะต้องยึดจุดแรกให้ได้ <br>
                        </p>
                        <p><strong><em>ESCORT (Payload)</em></strong><br></p>
                        <p>
                        [*WATCHPOINT: GIBRALTAR*, DORADO,ROUTE 66]<br>
                        *แผนที่นี้มี 4 Checkpoint รอบแรกฝ่าย Attack ดัน Payload ให้ได้ไกลที่สุด ถึงจุดเส้นชัยจะเป็นการดี ฝ่าย Defense จะต้องป้องกันไม่ให้ดันได้ไกล เพื่อที่จะสลับฝั่งแล้วจะได้ดันถึงจุดที่ค้างไว้โดยที่ไม่ต้องไปถึงจุดเส้นชัย<br>
                        </p>
                        <p>
                        <em>ผลรอบแรกและเปลี่ยนฝั่ง</em><br>
                        กรณีที่ 1: ฝ่าย ATTACK สามารถดันได้ครบทุกจุดเมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องดันให้ได้ครบทุกจุดเพื่อที่จะไปลุยในรอบ Sudden Death(Sudden Death สำหรับแผนที่ Watchpoint: Gibraltar จะต้องดันไปให้ถึงจุดที่ 2 ระบบจะตัดจุดแรกออกไป)<br>
                        กรณีที่ 2: ฝ่าย ATTACK สามารถดันได้ถึงแค่กลางทางเมื่อสลับฝั่งแล้วระบบจะเปลี่ยนจากจุดเส้นชัยเดิมเป็นจุดใหม่ที่ฝ่าย ATTACK รอบแรกทำถึง (เช่น รอบแรกทำได้ 2 Checkpoint - 30m ระบบก็จะเปลี่ยนเป็น Checkpoint ที่ 2 ระยะที่ 30m) ฝ่าย ATTACK จะต้องดันให้ได้เท่าของเดิมที่ฝั่งตรงข้ามทำได้ในรอบแรกหากดันไม่ถึงจะเป็นการพ่ายแพ้<br>
                        </p>
                        <p><strong><em>CONTROL (King of the Hill)</em></strong><br></p>
                        <p>
                        [LIJIANG TOWER , ILIOS , NEPAL] <br>
                        ปกติในการเล่นโหมดนี้จะเป็นการเล่นแบบ 2 ใน 3 (BO3) แต่สำหรับ Competitive Mode แล้วจะเป็นการเล่นแบบ 3 ใน 5 (BO5) ใครทำได้ 3 คะแนนก่อนชนะไปเลย<br>
                        </p>
                        <p>
                            <strong><em>ASSAULT&amp;ESCORT (Hybrid)</em></strong><br></p>
                        <p>
                        [KING&#39;S ROW, NUMBANI, HOLLYWOOD] <br>
                        รอบแรกฝ่าย Attack จะต้องยึดและดัน Payload ให้ได้ไกลที่สุด ถึงจุดเส้นชัยจะเป็นการดี ฝ่าย Defense จะต้องป้องกันไม่ให้พลาดจุดแรกจะดีที่สุด ถ้าพลาดต้องไม่ให้ดันได้ไกล<br>
                        </p>
                        <p>
                        <em>ผลรอบแรกและเปลี่ยนฝั่ง</em><br>
                        กรณีที่ 1: ฝ่าย ATTACK ยึดจุดแรกไม่ได้ เมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องยึดจุดแรกให้ได้<br>
                            &nbsp;&nbsp;&nbsp;1. หากยึดจุดแรกได้จะเป็นการสิ้นสุดเกมทันที ไม่ต้องดันเพย์โหลด<br>
                            &nbsp;&nbsp;&nbsp;2. หากยึดจุดแรกไม่ได้จะต้องไปสู้กันในรอบ Sudden Death <br>
                        กรณีที่ 2: ฝ่าย ATTACK ยึดได้แต่ล่มกลางทาง เมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องยึดจุดแรกและต้องดันเพย์โหลดให้ถึงจุดหมายที่อีกฝั่งล่มกลางทาง หากทำถึงก็จะชนะ หากทำไม่ถึงก็พ่ายแพ้<br>
                        กรณีที่ 3: ฝ่าย ATTACK ทำได้ครบทุกจุด เมื่อสลับฝั่งแล้วฝ่าย ATTACK จะต้องทำให้ได้ครบทุกจุด จึงจะได้โอกาส Sudden Death<br>
                        </p>
                         <p><strong><em>บทลงโทษของการออกจากเกม</em></strong><br></p>    
                          <p>
                        ในการออกจากเกมนั้นมีบทลงโทษที่ทุกคนรู้จักคือการถูกหัก EXP ในการเล่นเกมทุกโหมด -75% (เหลือ 25%) วิธีแก้คือต้องเล่นอย่างต่อเนื่องจนกว่าจะหายไป ซึ่งปกติแล้วการเล่นโหมดทั่วไปจะต้องออกหลายรอบถึงจะมีผล แต่สำหรับ Competitive Mode นั้นจะเป็นการลงโทษทันทีส่วนเพื่อนในทีมที่เหลือจะมีโอกาสให้ออกจากห้องภายในเวลา 1 นาที สามารถออกได้โดยไม่ถูกลงโทษ -75% เมื่อหมดเวลาแล้วจะถือว่ายืนยันที่จะเล่นต่อไป แต่ไม่ต้องเป็นห่วงไปสำหรับการหลุดออกไปโดยงง ๆ เพราะเขามีระบบ Rejoin Match เพื่อกลับเข้าไปเล่นใหม่ได้(ต้องเข้าไปให้ทันภายใน 1 นาที) แต่ถ้าหากออกบ่อยเกินเหตุจะถูกตัดสิทธิ์(แบน)ไม่ให้เล่นแข่งขันทั้งซีซั่นที่กำลังเปิดอยู่<br>
                        </p>   
                         <p><strong><em>รูปแบบการ Leaver</em></strong><br></p>   
                         <p>
                        1. ถ้ามีคนออก 2 นาทีแรกแมทช์จะนับถอยหลังยกเลิก (คนที่ออกไปก่อนจะถูกนับเป็น leaver และหากใครพยายามออกตามจะนับเป็น leaver เช่นกัน ให้รอนับถอยหลัง 1 นาทีจะยกเลิกเอง)<br>
                        2. มีคนออกระหว่างเกมส์- คนที่ออกไปคนแรก ไม่ว่ากรณีใดๆ มีเวลาให้ต่อกลับมา 1 นาที ถ้าไม่เข้าภายใน 1 นาที จะถูกนับเป็น leaver และปรับแพ้ทันที- เมื่อคนออกไปแล้ว 1 คน คนที่เหลือในทีมจะขึ้นข้อความด้านบน สามารถออกได้โดยไม่ติดโทษนับเป็น leaver นับถอยหลังภายใน 1 นาที หากออกตอนนับถอยหลังจบไปแล้ว จะนับเป็น leaver และปรับแพ้<br>
                            - หากเกินเวลานับถอยหลังไปแล้ว ทุกคนสามารถออกได้ ไม่นับเป็น leaver แต่ปรับแพ้อยู่ดี<br>
                            - สรุปคือถ้าเกมเริ่มไปสักพัก การออกไม่ว่ากรณีใดๆ คือ &quot;แพ้อยู่ดี&quot; แต่จะนับเป็น leaver หรือไม่อันนั้นอีกเรื่อง<br>
                            - บทลงโทษ leaver หากทำหลาย ๆ ครั้ง มีการเตือนในเกม และยังฝืนทำก็จะถูกแบนทั้งซีซัน </p>
        </div>
    </div>
    </div>
    <footer>
        <div class="row">
            <div class="col-md-4 col-sm-6 footer-navigation">
                <h3><a href="#">E-LEAGUE<span><img src="assets/img/logo.png" id="footlogo"> </span></a></h3>
                <p class="links"><a href="#">Home</a><strong> · </strong><a href="#">Blog</a><strong> · </strong><a href="#">Pricing</a><strong> · </strong><a href="#">About</a><strong> · </strong><a href="#">Faq</a><strong> · </strong><a href="#">Contact</a></p>
                <p class="company-name">E-league © 2017 </p>
            </div>
            <div class="col-md-4 col-sm-6 footer-contacts">
                <div><span class="fa fa-map-marker footer-contacts-icon"> </span>
                    <p><span class="new-line-span">21 Revolution Street</span> Paris, France</p>
                </div>
                <div><i class="fa fa-phone footer-contacts-icon"></i>
                    <p class="footer-center-info email text-left"> +1 555 123456</p>
                </div>
                <div><i class="fa fa-envelope footer-contacts-icon"></i>
                    <p> <a href="#" target="_blank">support@company.com</a></p>
                </div>
            </div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-md-4 footer-about">
                <h4>About the company</h4>
                <p> Lorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.
                </p>
                <div class="social-links social-icons"><a href="#"><i class="fa fa-facebook"></i></a><a href="#"><i class="fa fa-twitter"></i></a><a href="#"><i class="fa fa-linkedin"></i></a><a href="#"><i class="fa fa-github"></i></a></div>
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