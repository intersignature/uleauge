<%-- 
    Document   : newsInvite
    Created on : 23 เม.ย. 2560, 21:24:20
    Author     : Barjord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>lastest</title>
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
        <link rel="stylesheet" href="assets/css/search.css">
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
                            String imgdir = (String) session.getAttribute("useimage"); ;
                            int id = (int) session.getAttribute("P_ID");
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
                            <input type="hidden" name="from" value="newInvite.jsp" />
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
            <li id="menu"><a href="TeamServlet" id="fontmenu">REPLAY </a></li>
            <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
            <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
            <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
            <li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>
        </ul>

        <sql:setDataSource var="dbsource" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://esportproject.database.windows.net:1433;databaseName=Esport-DB"
                           user="adminesport@esportproject"  password="Esport2017"/>
        <%String username = (String) session.getAttribute("username");%>
        <sql:query dataSource="${dbsource}" var="result">
            SELECT  T.Team_ID, T.Team_Name,T.Team_Image,T.Game_ID, I.P_Username from db_accessadmin.Invite I
                        join db_accessadmin.Team T
                        on T.Team_ID = I.Team_ID
                        where I.P_Username = '<%= username %>';
        </sql:query>
                        
        <div class="container" id="boardinvite">
             <c:forEach var="row" items="${result.rows}">
            <div id = "bgall">
                <a href="Team_001Servlet?team_id=${row.Team_ID}">
                <div id="bgname">
                    <img src= "http://i.imgur.com/${row.Team_Image}.jpg" id="imgteam">
                <h3 id = "nameinvite">${row.Team_Name}</h3>
                </div>
                </a>
                <div id="invitebtn">
                    <a  href="acInviteServlet?team_id=${row.Team_ID}" class="inbtn">Accept</a>&nbsp;&nbsp;
                    <a  href="igInviteServlet?team_id=${row.Team_ID}" class="inbtn">Ignore</a>&nbsp;&nbsp;
		</div>
                
            </div>
            </c:forEach>
          
            
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