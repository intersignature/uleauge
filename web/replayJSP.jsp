<%-- 
    Document   : replayJSP
    Created on : 11 เม.ย. 2560, 17:39:27
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
                <input type="hidden" name="from" value="replay.html" />
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
<div>
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="tab-1"><img src="assets/img/maxresdefault.jpg" class="csgo" />
            <div class="container">
                <div class="panel panel-default">
                    <div class="panel-heading">CSGO Tournament</div>
                    <div class="panel-body">
                        <ul class="treeview">
                            <li><a href="#">IEM Katowice Tournament</a>
                                <br />
                                <ul>
                                    <li><a href="#">Round 16</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team B</a></li>
                                            <li><a href="#">Team C VS Team D</a></li>
                                            <li><a href="#">Team E VS Team F</a></li>
                                            <li><a href="#">Team G VS Team H</a></li>
                                            <li><a href="#">Team I VS Team J</a></li>
                                            <li><a href="#">Team K VS Team L</a></li>
                                            <li><a href="#">Team M VS Team N</a></li>
                                            <li><a href="#">Team O VS Team P</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Round 8</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team C</a></li>
                                            <li><a href="#">Team E VS Team G</a></li>
                                            <li><a href="#">Team I VS Team K</a></li>
                                            <li><a href="#">Team M VS Team O</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Semi Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team E</a></li>
                                            <li><a href="#">Team I VS Team M</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team I</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-2"><img src="assets/img/ow.jpg" class="csgo" />
            <div class="container">
                <div class="panel panel-default">
                    <div class="panel-heading">OVERWATCH Tournament</div>
                    <div class="panel-body">
                        <ul class="treeview">
                            <li><a href="#">Overwatch Pit Championship</a>
                                <ul>
                                    <li><a href="#">Round 16</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team B</a></li>
                                            <li><a href="#">Team C VS Team D</a></li>
                                            <li><a href="#">Team E VS Team F</a></li>
                                            <li><a href="#">Team G VS Team H</a></li>
                                            <li><a href="#">Team I VS Team J</a></li>
                                            <li><a href="#">Team K VS Team L</a></li>
                                            <li><a href="#">Team M VS Team N</a></li>
                                            <li><a href="#">Team O VS Team P</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Round 8</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team C</a></li>
                                            <li><a href="#">Team E VS Team G</a></li>
                                            <li><a href="#">Team I VS Team K</a></li>
                                            <li><a href="#">Team M VS Team O</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Semi Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team E</a></li>
                                            <li><a href="#">Team I VS Team M</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team I</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-3"><img src="assets/img/dota.png" class="csgo" />
            <div class="container">
                <div class="panel panel-default">
                    <div class="panel-heading">Dota2 Tournament</div>
                    <div class="panel-body">
                        <ul class="treeview">
                            <li><a href="#">Dota 2 International Tournament</a>
                                <ul>
                                    <li><a href="#">Round 16</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team B</a></li>
                                            <li><a href="#">Team C VS Team D</a></li>
                                            <li><a href="#">Team E VS Team F</a></li>
                                            <li><a href="#">Team G VS Team H</a></li>
                                            <li><a href="#">Team I VS Team J</a></li>
                                            <li><a href="#">Team K VS Team L</a></li>
                                            <li><a href="#">Team M VS Team N</a></li>
                                            <li><a href="#">Team O VS Team P</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Round 8</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team C</a></li>
                                            <li><a href="#">Team E VS Team G</a></li>
                                            <li><a href="#">Team I VS Team K</a></li>
                                            <li><a href="#">Team M VS Team O</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Semi Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team E</a></li>
                                            <li><a href="#">Team I VS Team M</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team I</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-4"><img src="assets/img/lol.jpg" class="csgo" />
            <div class="container">
                <div class="panel panel-default">
                    <div class="panel-heading">LOL Tournament</div>
                    <div class="panel-body">
                        <ul class="treeview">
                            <li><a href="#">LOL World Championship</a>
                                <ul>
                                    <li><a href="#">Round 16</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team B</a></li>
                                            <li><a href="#">Team C VS Team D</a></li>
                                            <li><a href="#">Team E VS Team F</a></li>
                                            <li><a href="#">Team G VS Team H</a></li>
                                            <li><a href="#">Team I VS Team J</a></li>
                                            <li><a href="#">Team K VS Team L</a></li>
                                            <li><a href="#">Team M VS Team N</a></li>
                                            <li><a href="#">Team O VS Team P</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Round 8</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team C</a></li>
                                            <li><a href="#">Team E VS Team G</a></li>
                                            <li><a href="#">Team I VS Team K</a></li>
                                            <li><a href="#">Team M VS Team O</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Semi Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team E</a></li>
                                            <li><a href="#">Team I VS Team M</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Final</a>
                                        <ul>
                                            <li><a href="#">Team A VS Team I</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
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