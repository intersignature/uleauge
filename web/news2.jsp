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
            response.sendRedirect("news2.jsp");
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
                                <input type="hidden" name="from" value="news2.jsp" />
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
                            <input type="hidden" name="from" value="news2.jsp" />
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
<li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>        </ul>
        <div class="container">
            <div class="news-body">
                <ul class="list-group">
                    <h1>Garena Premier League Spring Season 2017</h1>
                    <p style="text-align: center">
                        <img src="assets/img/news2.1.jpg">
                    </p>
                    <br>
                    <br>
                    <p><strong>สวัสดีเหล่าซัมมอนเนอร์</strong><br></p>
                    <p>
                        &nbsp;&nbsp;&nbsp;ใกล้เริ่มแล้ว!! การแข่งขันเกม League of Legends ที่ยิ่งใหญ่ที่สุดในทวีป Southeast Asia 
                        กับรายการ Garena Premier League Spring Season 2017 รับชมพร้อมกันทั่วประเทศในวันที่ 12 เมษายน นี้ ถ่ายทอดสดตรงจากกรุงกรุงมะนิลา 
                        ประเทศฟิลิปปินส์ ในการแข่งขันครั้งนี้แชมป์เปี้ยนจาก 6 ประเทศ ได้แก่ Thailand , Vietnam , Singapore , Malaysia , Philippines , Indonesia 
                        จะต้องต่อสู้เพื่อชิงตำแหน่งตำแหน่งสุดยอดแชมป์ โดยมีเงินรางวัลรวมมูลค่า 10,000 USD และสิทธิ์เป็นตัวแทนของทวีป Southeast Asia ไปแข่งขันต่อในรายการ 
                        Mid Season Invitational 2017 ณ ประเทศบราซิล
                    <p style="text-align: center" ><strong>รายชื่อทีมทั้ง 6 ประเทศ</strong><br>
                        <img src="assets/img/news2.2.jpg"><img src="assets/img/news2.3.jpg"><img src="assets/img/news2.4.jpg"><img src="assets/img/news2.5.jpg">
                        <img src="assets/img/news2.6.jpg"><img src="assets/img/news2.7.jpg"><img src="assets/img/news2.8.jpg"><br>
                        <strong>สายการแข่งขัน</strong><br><img src="assets/img/news2.9.jpg">
                    </p>
                    <p><strong>การแข่งขันแบ่งเป็น2ประเภท</strong></p>
                    <p>
                        Group Stage<br>
                        - การแข่งขันรอบ Group Stage ประเทศ Singapore , Malaysia , Philippines , Indonesia จะต้องทำการแข่งขันแบบ Round Robin เพื่อคัดหาสองทีมที่ดีที่สุดเข้าสู่รอบ Knockout Stage 
                    </p> 
                    <p>
                        Knockout Stage<br>
                        - ประเทศ Thailand และ Vietnam ทำผลงานในการแข่งขัน Garena Premier League ช่วงระยะเวลา 2 ปีที่ผ่านมาทำผลงานได้ยอดเยื่ยม โดยการคว้าตำแหน่ง แชมป์เปี้ยนและรองชนะเลิศอันดับหนึ่ง จึงได้สิทธิ์เป็นทีมว่างในรอบ Knockout Stage เพื่อรอพบกับสองทีมที่เข้ารอบจาก Group Stage
                    </p> 
                    <p><strong>วันที่ 12 เมษายน 2560</strong></p>
                    <p>
                        13:00 : Indonesia vs Malaysia<br>
                        14:00 : Philippines vs Singapore<br>
                        15:00 : Indonesia vs Philippines<br>
                        16:00 : Malaysia vs Singapore<br>
                        17:00 : Singapore vs Indonesia<br>
                        18:00 : Malaysia vs Philippines<br>
                    </p>

                    <p><strong>วันที่ 13 เมษายน 2560</strong></p>
                    <p>

                        13:00 : Philippines vs Malaysia<br>
                        14:00 : Indonesia vs Singapore<br>
                        15:00 : Singapore vs Malaysia<br>
                        16:00 : Philippines vs Indonesia<br>
                        17:00 : Singapore vs Indonesia<br>
                        18:00 : Malaysia vs Indonesia<br>
                    </p>

                    <p><strong>วันที่ 14 เมษายน 2560</strong></p>
                    <p>
                        13:00 : Thailand vs อันดับ 1 จาก Group Stage<br>
                        16:00 : Vietnam vs อันดับ 2 จาก Group Stage<br>
                    </p>

                    <p><strong>วันที่ 16 เมษายน 2560</strong></p>
                    <p>
                        15:00 :ผู้ชนะคู่ 1 รอบ Knockout Stage  vs ผู้ชนะคู่ 2 รอบ Knockout Stage<br>
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