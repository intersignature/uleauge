<%-- 
    Document   : CreateTeamFail
    Created on : 21 เม.ย. 2560, 16:08:05
    Author     : Barjord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <% if (session.getAttribute("suc") == null || (int) session.getAttribute("suc") == 0) { %>
        <%
            int suc = 0;
            session.setAttribute("suc", suc);
            response.sendRedirect("indexJSP.jsp");
        %>

        <% } else if ((int) session.getAttribute("suc") == 1) {%>
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
                            String imgdir = "assets/img/" + username + ".jpg";
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
            <li id="menu"><a href="replayJSP.jsp" id="fontmenu">REPLAY </a></li>
            <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
            <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
            <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
        </ul>
        <%  session = request.getSession();
        int ans_teamname = (int)session.getAttribute("ans_teamname");
        int ans_teamtag =(int)session.getAttribute("ans_teamtag");
        int ans_teamphone =(int)session.getAttribute("ans_teamphone");
        int ans_con = (int)session.getAttribute("ans_con");
        int ans_teamnunjoin = (int)session.getAttribute("ans_teamunjoin");
       String teamname = (String)session.getAttribute("teamname");
        String teamtag =(String)session.getAttribute("teamtag");
        int gameteam = (int)session.getAttribute("gameteam");
        String team_cap = (String)session.getAttribute("team_cap");
        String teamphone =(String) session.getAttribute("teamphone");
          %>
    <div class="container">
<div class="row register-form">
        <div class="col-md-8 col-md-offset-2">
            <form class="form-horizontal custom-form" action="CreateTeamServlet" id="signup" name="signup" method="POST">
                <h1>Team Create</h1>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field" >Team name </label> 
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="Teamname"  maxlength="20" value=<%= teamname%> > <p>*Require</p>
                    </div>
                    <p id="cau_password" style="color:blue;"><%if (ans_teamname==0){out.println("Incorrect Team name or Team name have already exist");}%></p>
                    </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Team tag </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="Teamtag"  maxlength="20" value=<%= teamtag%> > <p>*Require</p>
                    </div>
                     <p id="cau_password" style="color:blue;"><%if (ans_teamtag==0){out.println("Incorrect Team Tag or Team Tag have already exist");}%></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Game team </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <select name="gameteam" class="form-control">
                            <sql:setDataSource var="dbsource" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://esportproject.database.windows.net:1433;databaseName=Esport-DB"
                           user="adminesport@esportproject"  password="Esport2017"/>

                            <sql:query dataSource="${dbsource}" var="result">
                                SELECT Game_ID,Game_Name from db_accessadmin.Game;
                            </sql:query>
                            <c:forEach var="row" items="${result.rows}">
                                 <c:set var="game" scope="session" value="<%= gameteam %>"/>
                                <c:choose>
                                    <c:when test="${row.Game_ID == game}">
                                        <option  value="${row.Game_ID} " selected>${row.Game_Name}</option>
                                    </c:when>    
                                    <c:otherwise>
                                         <option  value="${row.Game_ID}">${row.Game_Name}</option>
                                    </c:otherwise>
                                </c:choose>
                                        
                            </c:forEach>
                        </select>
                    </div>
                    <p id="cau_password" style="color:blue;"><%if (ans_teamnunjoin==0){out.println("You already exist team in this game");}%>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field"> Team Phone </label>
                    </div>
                    <div class="col-sm-6 input-column">
                   
                        <input class="form-control" type="text"maxlength="10"   maxlength="0" inputmode="numeric" name="teamphone" value=<%= teamphone%> > <p>*Require</p>
                    </div>
                    <p id="cau_phone" style="color:blue;"><%if (ans_teamphone==0){out.println("Incorrect Phone Number");}%></p>
                </div>
                <div class="checkbox">
                     <%if (ans_con==0){out.println("<label><input type=\"checkbox\" name=\"condition\" value=\"con\">I\'ve read and accept the terms and conditions</label> <p id=\"cau_ign\" style=\"color:blue;\">Must accept the terms and conditions</p>");}
                else {out.println("<label><input type=\"checkbox\" name=\"condition\" value=\"con\" checked>I\'ve read and accept the terms and conditions</label>");}%>
                </div>
                <button class="btn btn-default submit-button" id="buttonn" type="submit">Submit</button>
                <!--<script type='text/javascript' src='assets/js/signup_js.js'></script>-->
            </form>
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
