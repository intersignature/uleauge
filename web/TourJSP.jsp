<%-- 
    Document   : TourJSP
    Created on : 10 เม.ย. 2560, 22:25:24
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
            <div class="col-md-offset-0">
                <div class="container">
	<div class="row">
		<div id="cssmenu">
            <ul>
             <li class="active"><a href="#tab-1" role="tab" data-toggle="tab">Tournmentที่กำลังจะเข้ามาและเปิดรับสมัคร</a></li>
             <li><a href="#tab-2"role="tab" data-toggle="tab">Tournament ที่กำลังแข่งขัน</a></li>
             <li><a href="#tab-3"role="tab" data-toggle="tab">Tournament ที่สิ้นสุดการแข่งขันแล้ว</a></li>
       
            </ul>
        </div>
	</div>
</div>
<div>
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="tab-1">
            <div class="col-md-12 col-md-offset-0" id="board">
    <h4>IEM KATOWICE 2017</h4>
    <div class="tourboard">
        <div class="pictour"><img src="assets/img/IEM.jpg" id="logotour" /></div>
        <div class="calendar">
            <div><b>เปิดรับสมัคร :<span style="color:#009fdb;">31/03/2017 - 17/03/2017</span></b>
                <br />
                <br />
            </div>
            <div><b>จับสายการแข่งขัน :<span style="color:#009fdb;">20/03/2017</span></b>
                <br />
                <br />
            </div>
            <div><b>ทำการแข่งขัน :<span style="color:#009fdb;">23/03/2017</span></b>
                <br />
                <br />
            </div>
        </div>
        <div class="allbtn">
             <a  style="display:block" href="iemdes.html">
            <div class="destour">
                <h3 class="des">รายละเอียดเพิ่มเติม </h3></div>
                </a>
            <a  data-toggle="modal" href="#shortModal" >
            <div  class="destour">
                <h3 class="des">สมัครแข่งขัน</h3></div>
            </a>
        </div>
    </div>
</div>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-2">
            <div class="col-md-12 col-md-offset-0" id="board">
    <h4>IEM KATOWICE 2017</h4>
    <div class="tourboard">
        <div class="pictour"><img src="assets/img/dotatour.jpg" id="logotour" /></div>
        <div class="calendar">
            <div><b>เปิดรับสมัคร :<span style="color:#009fdb;">31/03/2017 - 17/03/2017</span></b>
                <br />
                <br />
            </div>
            <div><b>จับสายการแข่งขัน :<span style="color:#009fdb;">20/03/2017</span></b>
                <br />
                <br />
            </div>
            <div><b>ทำการแข่งขัน :<span style="color:#009fdb;">23/03/2017</span></b>
                <br />
                <br />
            </div>
        </div>
        <div class="allbtn">
             <a  style="display:block" href="rules.html">
            <div class="destour">
                <h3 class="des">กฏกติกา</h3></div>
            </a>
            <a  style="display:block" href="tourway.html">
            <div class="destour">
                <h3 class="des">ดูสายการแข่งขัน</h3></div>
                </a>
        </div>
    </div>
</div>
        </div>
        <div role="tabpanel" class="tab-pane" id="tab-3">
            <div class="col-md-12 col-md-offset-0" id="board">
    <h4>IEM KATOWICE 2017</h4>
    <div class="tourboard">
        <div class="pictour"><img src="assets/img/loltour.jpg" id="logotour" /></div>
        <div class="calendar">
            <div><b>เปิดรับสมัคร :<span style="color:#009fdb;">31/03/2017 - 17/03/2017</span></b>
                <br />
                <br />
            </div>
            <div><b>จับสายการแข่งขัน :<span style="color:#009fdb;">20/03/2017</span></b>
                <br />
                <br />
            </div>
            <div><b>ทำการแข่งขัน :<span style="color:#009fdb;">23/03/2017</span></b>
                <br />
                <br />
            </div>
        </div>
        <div class="allbtn">
            <div class="destour">
                <h3 class="des">ดูผลการแข่งขัน</h3></div>
            <a style="display:block" href="replay.html">
            <div class="destour">
                <h3 class="des">ดูการแข่งขันย้อนหลัง</h3></div>
                            </a>

        </div>
             
    </div>
</div>
            </div>
        </div>
<div id="shortModal" class="modal modal-wide fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title">การยืนยัน</h4>
      </div>
      <div class="modal-body">
        <p>คุณยืนยันที่จะสมัครหรือไม่?</p>
        <div class="row">
            <div class="col-12-xs text-center">
                <button class="btn btn-success btn-md"  data-dismiss="modal" data-toggle="modal" href="#shortModal-1" >ยืนยัน</button>
                <button type="button" data-dismiss="modal" aria-hidden="true" class=" btn btn-danger btn-md">ไม่</button>
            </div>
        </div>
      </div>
   
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<div id="shortModal-1" class="modal modal-wide fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-body">
        <p>ยืนยันการสมัครเรียบร้อย...</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
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