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
        <% session = request.getSession();
            char is_Team_Name = (char) session.getAttribute("is_Team_Name");
            char is_Team_Tag = (char) session.getAttribute("is_Team_Tag");
            char is_Team_Phone = (char) session.getAttribute("is_Team_Phone");
            char is_Team_Cap = (char) session.getAttribute("is_Team_Cap");
            String Team_Name = (String) session.getAttribute("Team_Name");
            String Team_Tag = (String) session.getAttribute("Team_Tag");
            String Team_Phone = (String) session.getAttribute("Team_Phone");
            String Team_Image = (String) session.getAttribute("Team_Image");
            String Team_Cap = (String) session.getAttribute("Team_Cap");
            String Team_ID = (String) session.getAttribute("Team_ID");
            char is_ans_hasid = (char) session.getAttribute("is_ans_hasid");
            int Game_ID = (int) session.getAttribute("Game_ID");
            String roles = (String) session.getAttribute("roles");
        %>
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
                            int id = (int) session.getAttribute("P_ID");
                            String imgdir = (String) session.getAttribute("useimage");
                            String username = (String) session.getAttribute("username"); 
                        %>
                        <a href="Player_001Servlet?player=<%out.println(id);%>"> 
                            <li id="namepro">

                                <img src= "<% out.println(imgdir); %>" id="imgpro">
                                <div id = "namepro2">
                                    <h4><b><% out.println(username);%></b></h4>
                                </div>

                            </li>
                        </a>

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
        <ul class="nav nav-pills categories">
            <li id="menu"><a href="newsJSP.jsp" id="fontmenu">NEWS </a></li>
            <li id="menu"><a href="TourJSP.jsp" id="fontmenu">TOURNAMENT </a></li>
            <li id="menu"><a href="TeamServlet" id="fontmenu">TEAM </a></li>
            <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
            <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
            <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
            <li id="menu"><a href="tourRequest.html" id="fontmenu">TOURNAMENT REQUEST </a></li>
        </ul>

        <div class="row register-form">
            <div class="col-md-8 col-md-offset-2">
                <form class="form-horizontal custom-form" action="CheckEditTeamServlet" id="signup" name="signup" method="POST">
                    <h1>U-LEAUGE Edit Team</h1>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Team name </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="Team_Name" value=<%= Team_Name%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_name" style="color:blue;"><%if (is_Team_Name == '0') {
                            out.println("Incorrect team name");
                        }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Team tag </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="Team_Tag" value=<%= Team_Tag%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_name" style="color:blue;"><%if (is_Team_Tag == '0') {
                            out.println("Incorrect team tag");
                        }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Team Phone </label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" maxlength="10" minlength="0" inputmode="numeric" name="Team_Phone" value=<%= Team_Phone%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_phone" style="color:blue;"><%if (is_Team_Phone == '0') {
                            out.println("Incorrect phone Number");
                        }%></p>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-4 label-column">
                            <label class="control-label" for="name-input-field">Captain Team</label>
                        </div>
                        <div class="col-sm-6 input-column">
                            <input class="form-control" type="text" name="Team_Cap" value=<%= Team_Cap%>>
                            <p>*Require</p>
                        </div>
                        <p id="cau_ign" style="color:blue;"><%if (is_Team_Cap== '0') {
                            out.println("Incorrect captain team");
                        }%></p>
                    </div>
                    <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Image Link</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="Team_Image" value=<%=Team_Image %>>
                        <input type="hidden" class="form-control" type="text" name="Team_ID" value=<%=Team_ID %>>
                        <input type="hidden" class="form-control" type="text" name="Game_ID" value=<%=Game_ID %>>
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
