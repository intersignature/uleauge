<%-- 
    Document   : indexJSP
    Created on : Apr 6, 2017, 7:48:49 PM
    Author     : CPCust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <a href="index.html">
            <img src="assets/img/logo.png"  id = "logo">
          <a class="navbar-brand" href="index.html">U-LEAGUE</a>
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
             <li >
             <button type="submit" class="btn btn-default btn-outline btn-circle collapsed"  id="signinbtn" >Sign Out</button>

            </li>
            </form>
          </ul>
       
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
    </header>
    <ul class="nav nav-pills categories">
        <li id="menu"><a href="news.html" id="fontmenu">NEWS </a></li>
        <li id="menu"><a href="tournament.html" id="fontmenu">TOURNAMENT </a></li>
        <li id="menu"><a href="replay.html" id="fontmenu">REPLAY </a></li>
        <li id="menu"><a href="player.html" id="fontmenu">PLAYERS </a></li>
        <li id="menu"><a href="rules.html" id="fontmenu">RULES </a></li>
        <li id="menu"><a href="faq.html" id="fontmenu">FAQ </a></li>
    </ul>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div id="divnew">
                    <div class="row" id="row">
                        <div class="col-md-12" id="news">
                            <h1>NEWS</h1></div>
                        <div class="col-md-12">
                            <h1>Ok.Paidai ตบ Na'vi ยับ</h1>
                            <div><img src="assets/img/ss.jpg">
                                <div>
                                    <h4>เมื่อวันที่31กุมภาพันธ์ ทีมยักษ์ใหญ่Na'vi โดนOk.Paidai ตบยับ 16-0 เป็นเรื่องน่าเสียดายที่ Na'vi อดได้แชมป์&nbsp; </h4></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div id="divlive">
                    <div class="row">
                        <div class="col-md-12 col-md-offset-0" id="live">
                            <h1>LIVE! </h1></div>
                        <div class="col-md-12 col-md-offset-0">
                            <h1>Na'Vi VS HR</h1>
                            <a href="https://www.youtube.com/watch?v=wZyPCsfZeh0" target="_blank">
<div id="imglink"></div>
</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer id="footer001">
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