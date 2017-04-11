<%-- 
    Document   : playerJSP
    Created on : 11 เม.ย. 2560, 17:46:35
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
                <input type="hidden" name="from" value="player.html" />
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
        <div class="divplayer">
            <div class="player1">
                <div class="container contain">
	<div class="row contain">
		<div class="col-sm-4 col-md-4 user-details">
            <div class="user-image">
                <img src="assets/img/player1.jpg" alt="Karan Singh Sisodia" title="Karan Singh Sisodia" class="img_size">
            </div>
            <div class="user-info-block">
                <div class="user-heading">
                    <a  id="profileeiei" href="player_001.html"><h3>Player1</h3></a>
                    <span class="help-block">Surasee Eiei</span>
                </div>
                <ul class="navigation">
                    <li class="active">
                        <a data-toggle="tab" href="#information">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#edu">
                            <span class="glyphicon glyphicon-education"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#link">
                            <span class="glyphicon glyphicon-link"></span>
                        </a>
                    </li>

                </ul>
                <div class="user-body">
                    <div class="tab-content">
                        <div id="link" class="tab-pane">
                            <a href="https://www.w3schools.com">
                            <img src="assets/img/fb-logo.png" alt="Go to W3Schools!" width="40" height="30" border="0"></a>
                           
                        </div>
                        <div id="edu" class="tab-pane">
                            <h4>IT, KMITL</h4>
                        </div>
                        <div id="information" class="tab-pane active">
                            <h4>Currently Team : Ok.Paidai</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	</div>
</div>
            </div>
        </div>
        <div class="divplayer">
            <div class="player2">
                <div class="container contain">
	<div class="row contain">
		<div class="col-sm-4 col-md-4 user-details">
            <div class="user-image">
                <img src="assets/img/player1.jpg" alt="Karan Singh Sisodia" title="Karan Singh Sisodia" class="img_size">
            </div>
            <div class="user-info-block">
                <div class="user-heading">
                    <h3>Player1</h3>
                    <span class="help-block">Surasee Eiei</span>
                </div>
                <ul class="navigation">
                    <li class="active">
                        <a data-toggle="tab" href="#information_2">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#edu_2">
                            <span class="glyphicon glyphicon-education"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#link_2">
                            <span class="glyphicon glyphicon-link"></span>
                        </a>
                    </li>

                </ul>
                <div class="user-body">
                    <div class="tab-content">
                        <div id="link_2" class="tab-pane">
                            <a href="https://www.w3schools.com">
                            <img src="assets/img/fb-logo.png" alt="Go to W3Schools!" width="40" height="30" border="0"></a>
                           
                        </div>
                        <div id="edu_2" class="tab-pane">
                            <h4>IT, KMITL</h4>
                        </div>
                        <div id="information_2" class="tab-pane active">
                            <h4>Currently Team : Ok.Paidai</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	</div>
</div>
            </div>
        </div>
        <div class="divplayer">
            <div class="player3">
                <div class="container contain">
	<div class="row contain">
		<div class="col-sm-4 col-md-4 user-details">
            <div class="user-image">
                <img src="assets/img/player1.jpg" alt="Karan Singh Sisodia" title="Karan Singh Sisodia" class="img_size">
            </div>
            <div class="user-info-block">
                <div class="user-heading">
                    <h3>Player1</h3>
                    <span class="help-block">Surasee Eiei</span>
                </div>
                <ul class="navigation">
                    <li class="active">
                        <a data-toggle="tab" href="#information_3">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#edu_3">
                            <span class="glyphicon glyphicon-education"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#link_3">
                            <span class="glyphicon glyphicon-link"></span>
                        </a>
                    </li>

                </ul>
                <div class="user-body">
                    <div class="tab-content">
                        <div id="link_3" class="tab-pane">
                            <a href="https://www.w3schools.com">
                            <img src="assets/img/fb-logo.png" alt="Go to W3Schools!" width="40" height="30" border="0"></a>
                           
                        </div>
                        <div id="edu_3" class="tab-pane">
                            <h4>IT, KMITL</h4>
                        </div>
                        <div id="information_3" class="tab-pane active">
                            <h4>Currently Team : Ok.Paidai</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	</div>
</div>
            </div>
        </div>
        <div class="divplayer">
            <div class="player1 player4">
                <div class="container contain">
	<div class="row contain">
		<div class="col-sm-4 col-md-4 user-details">
            <div class="user-image">
                <img src="assets/img/player1.jpg" alt="Karan Singh Sisodia" title="Karan Singh Sisodia" class="img_size">
            </div>
            <div class="user-info-block">
                <div class="user-heading">
                    <h3>Player1</h3>
                    <span class="help-block">Surasee Eiei</span>
                </div>
                <ul class="navigation">
                    <li class="active">
                        <a data-toggle="tab" href="#information_4">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#edu_4">
                            <span class="glyphicon glyphicon-education"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#link_4">
                            <span class="glyphicon glyphicon-link"></span>
                        </a>
                    </li>

                </ul>
                <div class="user-body">
                    <div class="tab-content">
                        <div id="link_4" class="tab-pane">
                            <a href="https://www.w3schools.com">
                            <img src="assets/img/fb-logo.png" alt="Go to W3Schools!" width="40" height="30" border="0"></a>
                           
                        </div>
                        <div id="edu_4" class="tab-pane">
                            <h4>IT, KMITL</h4>
                        </div>
                        <div id="information_4" class="tab-pane active">
                            <h4>Currently Team : Ok.Paidai</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	</div>
</div>
            </div>
        </div>
        <div class="divplayer">
            <div class="player2 player5">
                <div class="container contain">
	<div class="row contain">
		<div class="col-sm-4 col-md-4 user-details">
            <div class="user-image">
                <img src="assets/img/player1.jpg" alt="Karan Singh Sisodia" title="Karan Singh Sisodia" class="img_size">
            </div>
            <div class="user-info-block">
                <div class="user-heading">
                    <h3>Player1</h3>
                    <span class="help-block">Surasee Eiei</span>
                </div>
                <ul class="navigation">
                    <li class="active">
                        <a data-toggle="tab" href="#information_5">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#edu_5">
                            <span class="glyphicon glyphicon-education"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#link_5">
                            <span class="glyphicon glyphicon-link"></span>
                        </a>
                    </li>

                </ul>
                <div class="user-body">
                    <div class="tab-content">
                        <div id="link_5" class="tab-pane">
                            <a href="https://www.w3schools.com">
                            <img src="assets/img/fb-logo.png" alt="Go to W3Schools!" width="40" height="30" border="0"></a>
                           
                        </div>
                        <div id="edu_5" class="tab-pane">
                            <h4>IT, KMITL</h4>
                        </div>
                        <div id="information_5" class="tab-pane active">
                            <h4>Currently Team : Ok.Paidai</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	</div>
</div>
            </div>
        </div>
        <div class="divplayer">
            <div class="player3">
                <div class="container contain">
	<div class="row contain">
		<div class="col-sm-4 col-md-4 user-details">
            <div class="user-image">
                <img src="assets/img/player1.jpg" alt="Karan Singh Sisodia" title="Karan Singh Sisodia" class="img_size">
            </div>
            <div class="user-info-block">
                <div class="user-heading">
                    <h3>Player1</h3>
                    <span class="help-block">Surasee Eiei</span>
                </div>
                <ul class="navigation">
                    <li class="active">
                        <a data-toggle="tab" href="#information_6">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#edu_6">
                            <span class="glyphicon glyphicon-education"></span>
                        </a>
                    </li>
                    <li>
                        <a data-toggle="tab" href="#link_6">
                            <span class="glyphicon glyphicon-link"></span>
                        </a>
                    </li>

                </ul>
                <div class="user-body">
                    <div class="tab-content">
                        <div id="link_6" class="tab-pane">
                            <a href="https://www.w3schools.com">
                            <img src="assets/img/fb-logo.png" alt="Go to W3Schools!" width="40" height="30" border="0"></a>
                           
                        </div>
                        <div id="edu_6" class="tab-pane">
                            <h4>IT, KMITL</h4>
                        </div>
                        <div id="information_6" class="tab-pane active">
                            <h4>Currently Team : Ok.Paidai</h4>
                        </div>
                    </div>
                </div>
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