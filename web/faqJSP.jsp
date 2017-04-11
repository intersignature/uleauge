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
            <a href="player_001.html">
            <li id="namepro">
                <% session = request.getSession();
                    String username = (String) session.getAttribute("username"); 
                    String imgdir = "assets/img/"+username+".jpg";
                %>
                <img src= "<% out.println(imgdir); %>" id="imgpro">
                <div id = "namepro2">
                    <h4><b><% out.println(username); %></b></h4>
                </div>
               
            </li>
            </a>
     
            <form action="SignoutServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                <input type="hidden" name="from" value="faq.html" />
             <li >
             <button type="submit" class="btn btn-default btn-outline btn-circle collapsed"  id="signinbtn" >Sign Out</button>

            </li>
            </form>
          </ul>
       
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
    </header>
    <ul class="nav nav-pills categories">
      <li id="menu"><a href="newsJSP.jsp" id="fontmenu">NEWS </a></li>
        <li id="menu"><a href="TourJSP.jsp" id="fontmenu">TOURNAMENT </a></li>
        <li id="menu"><a href="replayJSP.jsp" id="fontmenu">REPLAY </a></li>
        <li id="menu"><a href="playerJSP.jsp" id="fontmenu">PLAYERS </a></li>
        <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
        <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
    </ul>
    <div class="container">
    <div class="faq">
        <h1>FAQ </h1>
        <p><strong>รูปแบบการแข่งขัน</strong>- แข่งขันในโหมด Competitive 5v5- Single Elimination- Best of 3<strong>กฏการแข่งขัน</strong>1. การเลือกฝั่ง และการเลือกแผนที่1.1 การเลือกแผนที่ในการแข่งขัน จะใช้ Knife Round เป็นการตัดสิน โดยที่ผู้ชนะจะเป็นฝ่ายเลือก
            "Ban" แมพออกไปก่อน สลับกับผู้แพ้ จนกระทั่งเหลือ 3 แมพสุดท้าย ผู้ชนะจะได้เลือกแมพที่จะใช้แข่งขันในเกมแรกก่อน ผู้แพ้จะได้เลือกแมพที่ใช้แข่งในเกมที่สองตัวอย่างการ Ban / Pick แมพA = ทีมที่ชนะใน knife round / B = ทีมที่แพ้ใน knife roundA เลือกแมพที่จะ
            BanB เลือกแมพที่จะ BanA เลือกแมพที่จะเล่นในเกมแรกB เลือกแมพที่จะเล่นในเกมสอง1.2 การเลือกฝั่ง CT และ T จะเลือกโดยการใช้ Knife Round ในการตัดสิน ใครที่เป็นฝ่ายชนะ Knife Round จะได้เลือกฝั่งที่จะเริ่มเล่น2. Round: 30 Rounds (Max Round 15 Format)
            โดยจะมีการสลับฝั่งเมื่อ Round รวมถึง 15 (โดยระบบตัวเกมจะเป็นตัวกำหนดให้เอง)3. เงื่อนไขการชนะ: ทีมใดที่ได้ Win Round รวมทั้งในครึ่งแรกและครึ่งหลังถึง 16 Round ก่อนชนะ (โดยระบบตัวเกมจะเป็นตัวกำหนดให้เอง)4. Round Time: 1.45 นาที5. Freeze Time
            : 15 วินาที6. ในกรณีที่มีการเสมอ 15:15 Round จะทำการแข่งขันใหม่ด้วยระบบ 6 Round มีเงินเริ่มต้น $10,000 โดยจะแบ่งเป็น Round รวม ครึ่งละ 3 นั่นเอง โดยใครที่ทำได้ 4 Round ก่อนจะได้รับชัยชนะไป หากยังเสมอกันต่อเนื่องก็จะแข่งในรูปแบบนี้จนกว่าจะมีผู้ชนะ7.
            แผนที่ที่ใช้ในการแข่งขัน• de_nuke• de_dust2• de_inferno• de_mirage• de_train8. การแข่งขันทุกแมตช์จะมีการบันทึก demo ไว้ตลอดเวลา&nbsp;<strong>กฎและข้อบังคับโดยทั่วไป</strong>1. ตัวเกมจะใช้เวอร์ชัน Steam ตัวล่าสุดของ Counter-Strike: Global Offensive2.
            แต่ละทีมสามารถมีตัวสำรองได้มากสุด 2 คนต่อทีม (รวมตัวจริงแล้วเท่ากับ 7 คน) และสามารถเปลี่ยนตัวผู้เล่นได้หลังจากจบเกมนั้นๆไปแล้วเท่านั้น ไม่อนุญาตให้เปลี่ยนตัวระหว่างแข่ง3. ผู้เล่น 1 คน สามารถเล่นให้ได้เพียง 1 ทีมเท่านั้น (หากมีการเล่นให้ทีมอื่นภายในทัวร์นาเม้นต์
            จะถูกปรับแพ้ทันที)4. แต่ละทีมต้องมีตัวแทน 1 คนในการติดต่อกับทีมงานและกรรมการ5. ผู้เล่นทุกคนในทีม ต้องใช้ Tag team แบบเดียวกันทุกคน (Clan Tag)6. ผู้เล่นทุกคนต้องรับรู้และเข้าใจกฏการแข่งขัน จะไม่มีการอ้างใดๆ เกิดขึ้นเมื่อการแข่งขันเริ่มไปแล้ว7.
            กฏและกติกา อาจจะมีการยืดหยุ่นตามเวอร์ชันของตัวเกม และระบบอื่นๆ ที่จะมีการอัพเดทตามมาจนกว่าจะถึงวันแข่งขัน8. กฏและกติกาการแข่งขันต่างๆ อาจจะมีการเปลี่ยนแปลงตามความเหมาะสมในสถานการณ์ต่างๆ ที่เกิดขึ้นเฉพาะหน้า เพื่อความราบรื่นในการแข่งขันให้เป็นไปตามความเหมาะสม*การแข่งขันทุกแมตช์
            จะมีการบันทึก demo ไว้ตลอดเวลา<strong>เวลาที่ทำการแข่งขัน</strong>- หากทีมที่ชนะการแข่งขัน ไม่ส่งหลักฐานการแข่งมาตามระยะเวลาที่ทีมงานกำหนดในแต่ละรอบ จะถูกตัดสิทธิ์จากการแข่งขัน ทั้ง 2 ทีม- หากมีทีมใดทีมหนึ่งไม่สามารถเข้าแข่งขันได้ตามวัน และเวลาที่กำหนด
            สามารถส่งผลชนะบายเพื่อใช้สิทธิ์เข้ารอบต่อไปทันที ( ต้องมีภาพหลักฐานที่ชัดเจน )- ทีมงานจะตรวจสอบ และบันทึกผลการแข่งขันในแต่ละรอบ และจะประกาศสายการแข่งเพื่อแข่งขันรอบต่อไปในวันรุ่งขึ้น- ในกรณีที่ทีมใดทีมหนึ่งไม่สามารถมาทันตามเวลาแข่งที่ทีมงานเซตไว้ให้
            จะต้องยอมแพ้บายในเกมแรก และมาให้ทันเวลา 20.00 น. เพื่อแข่งในเกมที่สอง ถ้าหาก 20.00 น. ทีมยังไม่พร้อมที่จะแข่ง จะถูกปรับแพ้บาย 2-0 เกมในทันที<strong>การประท้วงผลการแข่ง (ผู้แข่งส่งผลการแข่งไม่ตรงกับความเป็นจริง)</strong>- ผู้ประท้วงจะต้องโพสรูป
            + หลักฐานการประท้วง ( ต้องมีหลักฐานที่ชัดเจนให้มากที่สุด )- หากไม่มีหลักฐาน ทีมงานจะไม่รับเรื่องการประท้วงทุกกรณี- การตัดสินของทีมงานถือเป็นสิ้นสุด<strong>ตารางเวลาการแข่งขัน</strong>ผู้สมัครต้องตรวจสอบวัน และเวลาใช้ชัดเจนก่อนทำการแข่งขัน
            แล้วทำตามขั้นตอนขั้นต้นที่ได้ประกาศไปทางด้านบนแล้ว<strong>*** ข้อมูลที่ควรทราบ ***</strong>1. หากทีมงานพบว่า ในทีมมีสมาชิกใช้โปรแกรมช่วยเล่นในระหว่างการแข่งขัน ทีมงานจะปรับให้ทีมแพ้ในแมตช์นั้นทันที และตัดสิทธิ์ออกจากการแข่งขันทั้งปัจจุบัน
            และในอนาคต (แบนทั้งทีม)2. หากมีการกระทำผิดเกิดขึ้นในระหว่างการแข่งขัน จะต้องทำการประท้วง ด้วยภาพหลักฐาน ซึ่งผลการตัดสินจะอยู่ที่ดุลพินิจของทางทีมงานเป็นเด็ดขาดเท่านั้น (การประท้วงจะต้องอยู่ภายในวันที่แข่งขันเท่านั้น)&nbsp;3. หากมีการหลุดออกจากการแข่งขันของผู้เล่นบางท่าน
            ที่เกิดขึ้นจากกรณีเครื่องมีปัญหา ให้ผู้เล่นที่หลุดไป สามารถกลับเข้ามาแข่งขันต่อในรอบนั้นได้ทันที และจะต้องกลับเข้ามาภายใน 5 นาที มิฉะนั้นจะถือว่าจงใจหลีกเลี่ยงการแข่งขัน4. หากมีการฝ่าฝืนกฏ หรือไม่ปฏิบัติตามข้อตกลงต่างๆ กรรมการจะเป็นผู้ตัดสินเกี่ยวกับโทษที่สมควรจะได้รับ
            และอาจจะนำพาไปสู่การปรับแพ้ในที่สุด5. ไม่อนุญาตให้ใช้ Bug หรือข้อผิดพลาดต่างๆ ภายในเกม เพื่อสร้างความได้เปรียบกับคู่แข่ง หากฝ่ายตรงข้ามพบเจอสามารถแจ้งต่อกรรมการได้6. หากมีการจงใจทำให้ฮาร์ดแวร์ หรือ ซอฟต์แวร์มีปัญหาระหว่างแข่งขันจะทำให้ถูกตักเตือนหรืออาจจะถึงขั้นปรับแพ้,
            ปรับ Round Loss ตามความเหมาะสม7. หากมีการ Disconnect เกิดขึ้น เราจะไม่ทำการ pause เกมใดๆ ทั้งสิ้น จะปล่อยให้เกมดำเนินต่อไป จนกว่าคนที่หลุดจะเข้ามาใหม่ได้ แต่เงินของคนที่เข้ามาจะมีให้ตามความเหมาะสม เพราะฉะนั้นหากหลุดแล้วสมาชิกทีมของท่านต้องรับผิดชอบตัวเอง<strong>หมายเหตุ</strong>-
            การตัดสินของทีมงานถือเป็นที่สิ้นสุด- การแข่งขันทุกเกมจะอยู่ภายใต้การดูแลของ admin- ทีมงานขอสงวนสิทธิ์ในการเปลี่ยนแปลงเงื่อนไข และกฎต่าง ๆ โดยไม่จำเป็นต้องแจ้งให้ทราบล่วงหน้าjkojkljkl </p>
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