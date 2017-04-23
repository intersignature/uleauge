<%-- 
    Document   : signupJSP
    Created on : Apr 10, 2017, 8:27:49 PM
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
    <% if (session.getAttribute("suc") == null) { %>
        <% int suc = 0;
            session.setAttribute("suc", suc);
            response.sendRedirect("indexJSP.jsp");
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
                                <input type="hidden" name="from" value="requestFailJSP.jsp" />
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
<li class="bgedit"><a href="TeamServlet"><span class="icon-user"></span> My Team</a></li>
<li class="bgedit"><a href="newsInvite.jsp"><span class="icon-envelope"></span> New invites</a></li>
</ul>
</div>
                </li>
                        <form action="SignoutServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                            <input type="hidden" name="from" value="indexJSP.jsp" />
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
            <li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>
    </ul>
    <% session = request.getSession();
       char is_teamname = (char) session.getAttribute("is_teamname");
       char is_address = (char) session.getAttribute("is_address");
       char is_location = (char) session.getAttribute("is_location");
       char is_exp = (char) session.getAttribute("is_exp");
       char is_promote = (char) session.getAttribute("is_promote");
       char is_email = (char) session.getAttribute("is_email");
       char is_fb = (char) session.getAttribute("is_fb");
       char is_cause = (char) session.getAttribute("is_cause");
       String teamname = (String) session.getAttribute("teamname");
       String address = (String) session.getAttribute("address");
       String location = (String) session.getAttribute("location");
       String exp = (String) session.getAttribute("exp");
       String promote = (String) session.getAttribute("promote");
       String email = (String) session.getAttribute("email");
       String fb = (String) session.getAttribute("fb");
       String cause = (String) session.getAttribute("cause");

       String roles = (String) session.getAttribute("roles");
                %>
    <div class="row register-form">
        <div class="col-md-8 col-md-offset-2">
            <form class="form-horizontal custom-form" action="TourRequestServlet" id="signup" name="signup" method="POST">
                <h1>U-LEAUGE Registration</h1>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">ชื่อทีมจัดการแข่งขัน </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="teamname" value=<%= teamname%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"><%if (is_teamname=='1'){out.println("คุณต้องกรอกชื่อทีม");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">ที่อยู่ทีมที่สามารถติดต่อได้ </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="address" value=<%= address%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"><%if (is_address=='1'){out.println("คุณต้องกรอกที่อยู่ที่ติดต่อได้");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">สถานที่จัดการแข่งขัน </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="location" value=<%= location%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"><%if (is_location=='1'){out.println("คุณต้องกรอกสถานที่จัดการแข่ง");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">ประสบการณ์การจัดการแข่งขัน </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="exp" value=<%= exp%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"><%if (is_exp=='1'){out.println("คุณต้องกรอกประสบการณ์การจัดการแข่งขัน");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">วิธีการโปรโมต </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="promote" value=<%= promote%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"><%if (is_promote=='1'){out.println("คุณต้องกรอกวิธีการโปรโมต");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="email-input-field">Email ที่ติดต่อได้</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="email" value=<%= email%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_email" style="color:blue;"><%if (is_email=='1'){out.println("Incorrect Email");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Facebook Link</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" inputmode="url" name="fb" value=<%= fb%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_fb" style="color:blue;"><%if (is_fb=='1'){out.println("Must have Facebook Link");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">เหตุผลที่อยากจัดการแข่งขัน</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="cause" value=<%= cause%>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"><%if (is_cause=='1'){out.println("คุณต้องกรอกเหตุผลการจัดการแข่งขัน");}%></p>
                </div>
                
                <button class="btn btn-default submit-button" id="buttonn" type="submit">Submit</button>
                <!--<script type='text/javascript' src='assets/js/signup_js.js'></script>-->
            </form>
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
</body>

</html>
