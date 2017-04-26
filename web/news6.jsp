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
        <title>news</title>
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
            response.sendRedirect("news6.jsp");
        %>
        <% } else if ((int) session.getAttribute("suc") == 0) {%>
        <header>
            <!-- Second navbar for sign in -->
    <nav class="navbar navbar-default navbar-fixed-top" id="headnav">
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
                                <input type="hidden" name="from" value="news6.jsp" />
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
    <nav class="navbar navbar-default navbar-fixed-top" id="headnav">
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
<li >
                                        <div class="btn-group"id = "editbtn" > 
<a class="btn dropdown-toggle btn-info" data-toggle="dropdown" href="#" id = "probtn">
<span class="icon-cog"></span><span class="caret"></span>
</a>
<ul class="dropdown-menu">
    <li class="bgedit"><a href="EditProfileServlet"><span class="icon-wrench"></span> Edit Profile</a></li>
               <li class="bgedit"><a href="CreateTeam.jsp"><span class="icon-plus-sign"></span> Create Team</a></li>
<li class="bgedit"><a href="newsInvite.jsp"><span class="icon-envelope"></span> New invites</a></li>
</ul>
</div>
                </li>
                        <form action="SignoutServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                            <input type="hidden" name="from" value="news6.jsp" />
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
                    <h1>โฉมหน้าผู้ชนะ Lady Tournament จาก League of Champions 2017</h1>
                    <p style="text-align: center">
                        <img src="assets/img/news6.jpg">
                    </p>
                    <br>
                    <br>
                    

                    <p>
                        เก็บตกเล็กๆน้อยๆจากงาน League of Champions กับรายการย่อย Lady Tournament ที่มีแต่สาวๆเท่านั้นที่มีสิทธิ์ในการลงแข่ง การแข่งขันย่อยนี้เป็นการแข่งขันที่มันส์และดุเดือดมาก เห็นพวกเธอ น่ารัก สวยๆ กันแบบนี้ฝีมือไม่ธรรมดามากๆ Rank ระดับ Diamond, Challenger ก็มี นี่แหละพลังของเกมเมอร์สาว!!<br><br>
                        </p>
                        <p style="text-align: center"><strong>ชนะเลิศ ได้แก่สาวๆจาก ทีม Play for Aileen</strong><br>
                        <img src="assets/img/news6.1.jpg"><br>
                        <strong>ทีมชนะเลิศ รางวัลเงินสด 5,000 บาท พร้อมของรางวัล Merchandise Set</strong></p>
                        <p style="text-align: center"><strong>รองชนะเลิศอันดับหนึ่ง ได้แก่สาวๆจาก ทีม Sweet Cinnamon Roll</strong><br>
                        <img src="assets/img/news6.2.jpg"><br>
                        <strong>ทีมรองชนะเลิศอันดับหนึ่ง ของรางวัล Merchandise Set</strong></p>
                    
                   
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