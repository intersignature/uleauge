<%-- 
    Document   : player_info
    Created on : Apr 15, 2017, 1:06:58 AM
    Author     : intersignature
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
             <% session = request.getSession();
                    String username = (String) session.getAttribute("username"); 
                    String imgdir = "assets/img/"+username+".jpg";
                    int id = (int) session.getAttribute("P_ID");
                %>
                <a href="Player_001Servlet?player=<%out.println(id);%>"> 
            <li id="namepro">
               
                <img src= "<% out.println(imgdir); %>" id="imgpro">
                <div id = "namepro2">
                    <h4><b><% out.println(username); %></b></h4>
                </div>
               
            </li>
            </a>
     
            <form action="SignoutServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                <input type="hidden" name="from" value="index.html" />
             <li >
             <button type="submit" class="btn btn-default btn-outline btn-circle collapsed"  id="signinbtn" >Sign Out</button>

            </li>
            </form>
          </ul>
       
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
   
            <% session = request.getSession();
            String fname = (String) session.getAttribute("fname");
            String lname = (String) session.getAttribute("lname");
            String email = (String) session.getAttribute("email");
            String ign = (String) session.getAttribute("ign");
            String fb = (String) session.getAttribute("fb");
            String faculty = (String) session.getAttribute("faculty");
            String university = (String) session.getAttribute("university");
            String phone = (String) session.getAttribute("phone");            
            %>
    </header>
    <ul class="nav nav-pills categories">
        <li id="menu"><a href="news.html" id="fontmenu">NEWS </a></li>
        <li id="menu"><a href="tournament.html" id="fontmenu">TOURNAMENT </a></li>
        <li id="menu"><a href="replay.html" id="fontmenu">REPLAY </a></li>
        <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
        <li id="menu"><a href="rules.html" id="fontmenu">RULES </a></li>
        <li id="menu"><a href="faq.html" id="fontmenu">FAQ </a></li>
    </ul>
    <div class="logo_profile"><img src="assets/img/player1.jpg" />
        <h1><%= ign%></h1></div>
    <div class="info-tab">
        <div>
            <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
            
            <div>
                <div>
                    <div class="col-md-4">
                        <div class="panel-group" id="accordion">
                            <div class="panel panel-default"><span class="side-tab" data-target="#tab1" data-toggle="tab"><div class="panel-heading" id="headingOne" data-toggle="collapse" data-parent="#accordion" href="#collapseOne"><h4 class="panel-title">Full name</h4></div></span>
                                <div
                                id="collapseOne" class="panel-collapse collapse in">
                                    <div class="panel-body"><%= fname%></div>
                            </div>
                        </div>
                        <div class="panel panel-default"><span class="side-tab" data-target="#tab2" data-toggle="tab"><div class="panel-heading" id="headingTwo" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><h4 class="panel-title collapsed">Last name</h4></div></span>
                            <div
                            id="collapseTwo" class="panel-collapse collapse">
                                <div class="panel-body"><%= lname%></div>
                        </div>
                    </div>
                    <div class="panel panel-default"><span class="side-tab" data-target="#tab3" data-toggle="tab"><div class="panel-heading" id="headingThree" data-toggle="collapse" data-parent="#accordion" href="#collapseThree"><h4 class="panel-title">Email</h4></div></span>
                        <div id="collapseThree"
                        class="panel-collapse collapse">
                            <div class="panel-body"><%= email%></div>
                        </div>
                    </div>
                    <div class="panel panel-default"><span class="side-tab" data-target="#tab4" data-toggle="tab"><div class="panel-heading" id="headingFour" data-toggle="collapse" data-parent="#accordion" href="#collapseFour"><h4 class="panel-title collapsed">In game name</h4></div></span>
                        <div
                        id="collapseFour" class="panel-collapse collapse">
                            <div class="panel-body"><%= ign%></div>
                    </div>
                </div>
                <div class="panel panel-default"><span class="side-tab" data-target="#tab5" data-toggle="tab"><div class="panel-heading" id="headingFive" data-toggle="collapse" data-parent="#accordion" href="#collapseFive"><h4 class="panel-title collapsed">Facebook</h4></div></span>
                    <div
                    id="collapseFive" class="panel-collapse collapse">
                        <% String fb_temp = "https://www.facebook.com/" + fb;%>
                        <div class="panel-body"><a href=<%=fb_temp%>><%= fb%></a></div>
                </div>
            </div>
            <div class="panel panel-default"><span class="side-tab" data-target="#tab6" data-toggle="tab"><div class="panel-heading" id="headingSix" data-toggle="collapse" data-parent="#accordion" href="#collapseSix"><h4 class="panel-title collapsed">Faculty</h4></div></span>
                <div id="collapseSix"
                class="panel-collapse collapse">
                    <div class="panel-body"><%= faculty%></div>
                </div>
            </div>
            <div class="panel panel-default"><span class="side-tab" data-target="#tab7" data-toggle="tab"><div class="panel-heading" id="headingSeven" data-toggle="collapse" data-parent="#accordion" href="#collapseSeven"><h4 class="panel-title collapsed">University</h4></div></span>
                <div
                id="collapseSeven" class="panel-collapse collapse">
                    <div class="panel-body"><%= university%></div>
            </div>
        </div>
        <div class="panel panel-default"><span class="side-tab" data-target="#tab8" data-toggle="tab"><div class="panel-heading" id="headingEight" data-toggle="collapse" data-parent="#accordion" href="#collapseEight"><h4 class="panel-title collapsed">Phone number</h4></div></span>
            <div
            id="collapseEight" class="panel-collapse collapse">
                <div class="panel-body"><%= phone%></div>
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
