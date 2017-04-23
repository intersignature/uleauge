<%-- 
    Document   : news1
    Created on : 18 เม.ย. 2560, 20:30:27
    Author     : Mild
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
            response.sendRedirect("news3.jsp");
        %>
        <% } else if ((int) session.getAttribute("suc") == 0) {%>
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
                                <input type="hidden" name="from" value="news3.jsp" />
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
        <% } else if ((int) session.getAttribute("suc") == 1) {%>
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
                            String imgdir = (String) session.getAttribute("useimage"); 
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
                            <input type="hidden" name="from" value="news3.jsp" />
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
<li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>        </ul>
        <div class="container">
            <div class="news-body">
                <ul class="list-group">
                    <h1>บทสัมภาษณ์ ทีม Strike eSport</h1>
                    <h2>ทีมชนะเลิศการแข่งขัน OVERWATCH KMITL SUMMER TOURNAMENT</h2>
                    <p style="text-align: center">
                        <img src="assets/img/news3.1.jpg" width="1120" height="700" >
                    </p>
                    <br>
                    <br>
                    <p style="text-align: center">
                        <img src="assets/img/news3.2.jpg">
                    </p>
                    <p><strong>สมาชิกทีม</strong><br></p>
                    <p>
                        นางสาวปีย์วรา พิทักษ์ธานิน คณะศิลปศาสตร์ สาขาภาษาอังกฤษ ปี 2 ชื่อในเกมคือ shivs ค่ะ ในเกมเล่นตำแหน่งซัพพอตรอง และเป็น shot caller ให้ทีมด้วยค่ะ <br><br>
                        นาย รัตชาพงษ์ ประจำวงษ์ ชื่อเล่น เซม ชื่อในเกม Sana คณะวิศวกรรมสารสนเทศ ปี 3 ตำแหน่ง Off tank <br><br>
                        นาย สิรภพ ตรัยชิรอาภรณ์ ชื่อเล่น ไอซ์ ชื่อในเกม Icarest คณะวิศวกรรมพลังงานไฟฟ้า ปี 3 ตำแหน่ง Main Support <br><br>
                        นาย ภูดิศ ประเสริฐ ชื่อเล่น เซฟ ชื่อในเกม Safefyz คณะวิศวกรรมสารสนเทศ ศิษย์เก่า รหัส 51 ตำแหน่ง DPS <br><br>
                        นาย ชวิศ ธุระมะฉายา ชื่อเล่น ไอซ์ ชื่อในเกม llamaa คณะ วิศวกรรมเคมี ปี3 ตำแหน่ง Flex<br><br>
                        นาย กันตินันท์ สังขจันทร์ ชื่อเล่น ปั้น ชื่อในเกม LastLight คณะ วิศวกรรมคอมพิวเตอร์ ปี 4 ตำแหน่ง Main tank<br></p>
                    <p style="text-align: center">
                        <img src="assets/img/news3.3.jpg">
                    </p>
                    <p><strong>ที่มาของชื่อทีมและการรวมตัว</strong><br></p>
                    <p>
                        ชื่อทีม Strike eSport ที่มาของชื่อทีมคือ ชอบเล่นแบบดุดัน แบบ Stirke เข้าไปเลย เนื่องจากตัวเองเป็น shot caller เวลาเราเห็นโอกาสบุก เราก็มักจะสั่งให้ทีมบวกเลย ทุกคนต้องพร้อมเสมอ  <br><br>
                        ตอนแรกมีเพื่อนที่เล่นด้วยกันอยู่แล้ว 2 คน รวมเป็น 3 อีก 3 คนที่เหลือก็ประกาศรับสมัครเอาค่ะ เน้น role ที่ตัวเองถนัดหรือเล่นมาก่อนแล้ว ใครผ่านการเทสก็ได้เข้าร่วมทีม <br><br>
                    </p>
                    <p style="text-align: center">
                        <img src="assets/img/news3.4.jpg">
                    </p>
                    <p><strong>ชอบอะไรในเกมOverwatchและมีการวางแผนในเกมอย่างไร</strong><br></p>
                    <p>
                        ชอบความเป็นทีมเวิร์คค่ะ และชอบตัวอันนามากค่ะ แต่ไม่ได้เล่น (ฮา) <br><br>
                        การวางแผนการแข่ง เราตั้งเป้าไว้ก่อนว่าทุกคนในทีมไม่ถนัดด่านรูปแบบไหน จากนั้นก็คิดถึงฮีโร่พิคของฝั่งตรงข้าม แต่ส่วนใหญ่จะใช้คอมพ์ 3 แท็งมากกว่า เพราะครอบคลุมที่สุด ระหว่างเล่นถ้าตัวไหนของฝั่งตรงข้ามทำให้เราเล่นยาก ก็อาจจะต้องปรับแผนและฮีโร่นิดหน่อยค่ะ ต้องคิดถึงเรื่องการแก้เกมตลอดเวลา เช่นถ้าเซ็นยัตต้าดิสคอร์ดใส่แท็งเราแล้วเขาเล่นยาก เขาก็จะบอกว่ามีปัญหากับเซ็นยัตต้า ก็จะเปลี่ยนเทรเซอร์มาไล่ค่ะ<br><br>
                    </p>
                    <p style="text-align: center">
                        <img src="assets/img/news3.5.jpg">
                    </p>
                    <p><strong>แบ่งเวลาอย่างไรและได้อะไรจากการแข่งขัน</strong><br></p>
                    <p>
                        ซ้อมวันละ 1 ชั่วโมงค่ะ นัดสคริมกับทีมอื่นๆ เวลาซ้อมจะเป็นเวลาที่ทุกคนว่างหลังจากเลิกเรียนหรือทำงานแล้วค่ะ  <br><br>
                        ได้รับมิตรภาพกับเพื่อนร่วมทีมค่ะ ส่วนตัวเป็นคนที่ไม่ค่อยมีเพื่อนต่างคณะสักเท่าไร การได้มาแข่งขันในทัวร์นี้ทำให้รู้จักคนมากขึ้นค่ะ <br><br>
                    </p>
                </ul>
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
   <link rel="stylesheet" href="assets/css/main.css">
</body>

</html>