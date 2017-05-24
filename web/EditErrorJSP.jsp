<%-- 
    Document   : EditErrorJSP
    Created on : Apr 18, 2017, 7:58:20 PM
    Author     : intersignature
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Error</title>
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
        <% session = request.getSession();
            char is_password = (char) session.getAttribute("is_password");
            char is_rep_password = (char) session.getAttribute("is_rep-password");
            char is_fname = (char) session.getAttribute("is_fname");
            char is_lname = (char) session.getAttribute("is_lname");
            char is_email = (char) session.getAttribute("is_email");
            char is_fb = (char) session.getAttribute("is_fb");
            char is_university = (char) session.getAttribute("is_university");
            char is_faculty = (char) session.getAttribute("is_faculty");
            char is_phone = (char) session.getAttribute("is_phone");
            char is_ign = (char) session.getAttribute("is_ign");
            String username = (String) session.getAttribute("username");
            String new_password = (String) session.getAttribute("new_password");
            String new_fname = (String) session.getAttribute("new_fname");
            String new_lname = (String) session.getAttribute("new_lname");
            String new_email = (String) session.getAttribute("new_email");
            String new_fb = (String) session.getAttribute("new_fb");
            String new_university = (String) session.getAttribute("new_university");
            String new_faculty = (String) session.getAttribute("new_faculty");
            String new_phone = (String) session.getAttribute("new_phone");
            String new_ign = (String) session.getAttribute("new_ign");
            String image = (String) session.getAttribute("image");
            int id = (int) session.getAttribute("id");
            String roles = (String) session.getAttribute("roles");
        %>
        <% if (session.getAttribute("suc") == null || (int) session.getAttribute("suc") == 0) { %>
        <%
            int suc = 0;
            session.setAttribute("suc", suc);
            response.sendRedirect("indexJSP.jsp");
        %>

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

                            String imgdir = (String) session.getAttribute("useimage");;

                        %>
                        <li id = "searchnav2"> 
                            <a>
                                <form action="searchServlet" method="POST" >
                                    <select name="filter">
                                        <option>Username</option>
                                        <option>Team</option>
                                    </select>
                                    <input id = "searchbox" type="text" name="searchuser" placeholder="Search..">

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

        <div class="row register-form">
            <div class="col-md-8 col-md-offset-2">
                <form class="form-horizontal custom-form" action="CheckEditProfileServlet" id="signup" name="signup" method="POST">
                    <h1>U-LEAUGE Edit Profile</h1>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Username </label> 
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="username" value=<%= username%> disabled> <p>*Require</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="pawssword-input-field">Password </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="password" name="new_password"><p>*Require<br>
                                *Your password must have at least one upper case, one lower case, one numeric</p>
                        </div>
                        <p id="cau_password" style="color:blue;"><%if (is_password == '1') {
                                out.println("Incorrect Password");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="repeat-pawssword-input-field">Repeat Password </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="password" name="new_rep_password">
                            <p>*Require<br>*Must same above password</p>  
                        </div>
                        <p id="cau_rep_password" style="color:blue;"><%if (is_rep_password == '1') {
                                out.println("Incorrect Repeat Password");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Name </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="new_fname" value=<%= new_fname%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_name" style="color:blue;"><%if (is_fname == '1') {
                                out.println("Incorrect Name");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Lastname </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="new_lname" value=<%= new_lname%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_lname" style="color:blue;"><%if (is_lname == '1') {
                                out.println("Incorrect Lastname");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="email-input-field">Email </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="new_email" value=<%= new_email%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_email" style="color:blue;"><%if (is_email == '1') {
                                out.println("Incorrect Email");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Facebook Link</label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" inputmode="url" name="new_fb" value=<%= new_fb%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_fb" style="color:blue;"><%if (is_fb == '1') {
                                out.println("Must have Facebook Link");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">University </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="new_university" value=<%= new_university%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_university" style="color:blue;"><%if (is_university == '1') {
                                out.println("Must have university");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Faculty </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="new_faculty" value=<%= new_faculty%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_faculty" style="color:blue;"><%if (is_faculty == '1') {
                                out.println("Must have faculty");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Phone </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" maxlength="10" minlength="0" inputmode="numeric" name="new_phone" value=<%= new_phone%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_phone" style="color:blue;"><%if (is_phone == '1') {
                                out.println("Incorrect Phone Number");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">In game name</label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="new_ign" value=<%= new_ign%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_ign" style="color:blue;"><%if (is_ign == '1') {
                                out.println("Must have In-game name");
                            }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Image Link</label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="realimage" value=<%=image%>>
                            <p>upload file at <a href="http://imgur.com/gpHAQIO">imgur.com</a> and you will give link like "http://imgur.com/gpHAQIO" and you input "gpHAQIO" only</p>
                        </div>
                    </div>
                    <button class="btn btn-default submit-button" id="buttonn" type="submit">Edit</button>
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
