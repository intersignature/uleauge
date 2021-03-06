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
        <title>Fail</title>
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
                                        <select name="filter">
                                            <option>Username</option>
                                            <option>Team</option>
                                        </select>
                                        <input id = "searchbox" type="text" name="searchuser" placeholder="Search..">

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
                                <input type="hidden" name="from" value="indexJSP.jsp" />
                                <div class="form-group">
                                    <label class="sr-only" for="username">Username</label>
                                    <input name="Username" type="Username" class="form-control" id="Username" placeholder="Username" autofocus required />
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="password">Password</label>
                                    <input name="Password" type="Password" class="form-control" id="Password" placeholder="Password" required />
                                </div>
                                <button type="submit" class="btn btn-success">Sign in</button>
                            </form>
                        </div>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container -->
            </nav><!-- /.navbar -->

        </header>
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
            char is_user = (char) session.getAttribute("is_user");
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
            String password = (String) session.getAttribute("password");
            String rep_password = (String) session.getAttribute("rep_password");
            String fname = (String) session.getAttribute("fname");
            String lname = (String) session.getAttribute("lname");
            String email = (String) session.getAttribute("email");
            String fb = (String) session.getAttribute("fb");
            String university = (String) session.getAttribute("university");
            String faculty = (String) session.getAttribute("faculty");
            String phone = (String) session.getAttribute("phone");
            String ign = (String) session.getAttribute("ign");
            char con = (char) session.getAttribute("condition");
            String roles = (String) session.getAttribute("roles");
            String realimage = (String) session.getAttribute("image");
        %>
        <div class="row register-form">
            <div class="col-md-8 col-md-offset-2">
                <form class="form-horizontal custom-form" action="SignupServlet" id="signup" name="signup" method="POST">
                    <h1>U-LEAUGE Registration</h1>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Username </label> 
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="username" value=<%= username%>> <p>*Require</p>
                        </div>
                        <p id="cau_password" style="color:blue;"><%if (is_user == '1') {
                            out.println("Incorrect username or username have already exist");
                        }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="pawssword-input-field">Password </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="password" name="password"><p>*Require<br>
                                *Your password must have at least one upper case, one lower case, one numeric and password lenght must more than 8 characters</p>
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
                            <input class="form-control" type="password" name="rep_password">
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
                            <input class="form-control" type="text" name="fname" value=<%= fname%>>
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
                            <input class="form-control" type="text" name="lname" value=<%= lname%>>
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
                            <input class="form-control" type="text" name="email" value=<%= email%>>
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
                            <input class="form-control" type="text" inputmode="url" name="fb" value=<%= fb%>>
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
                            <input class="form-control" type="text" name="university" value=<%= university%>>
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
                            <input class="form-control" type="text" name="faculty" value=<%= faculty%>>
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
                            <input class="form-control" type="text" maxlength="10" minlength="0" inputmode="numeric" name="phone" value=<%= phone%>>
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
                            <input class="form-control" type="text" name="ign" value=<%= ign%>>
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
                            <input class="form-control" type="text" name="realimage" value=<%=realimage%>>
                            <p>upload file at <a href="http://imgur.com/gpHAQIO">imgur.com</a> and you will give link like "http://imgur.com/gpHAQIO" and you input "gpHAQIO" only</p>
                        </div>
                    </div>
                    <!--<div class="checkbox">
                        
                           //if (con=='1'){out.println("<label><input type=\"checkbox\" name=\"condition\" value=\"con\">I\'ve read and accept the terms and conditions</label> <p id=\"cau_ign\" style=\"color:blue;\">Must accept the terms and conditions</p>");}
                    //else {out.println("<label><input type=\"checkbox\" name=\"condition\" value=\"con\" checked>I\'ve read and accept the terms and conditions</label>");}
                    </div> !-->
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
