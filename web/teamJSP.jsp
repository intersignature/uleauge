<%-- 
    Document   : playerJSP
    Created on : 11 เม.ย. 2560, 17:46:35
    Author     : Barjord
--%>

<%@page import="java.util.List"%>
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
        response.sendRedirect("playerJSP.jsp");
    %>
<% } else if ((int)session.getAttribute("suc") == 0) {%>
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
                 <input type="hidden" name="from" value="PlayerServlet" />
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
<% }  else if ((int)session.getAttribute("suc") == 1){%>
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
     
            <form action="SignoutServlet" method="POST" class="navbar-form navbar-right form-inline" role="form">
                <input type="hidden" name="from" value="PlayerServlet" />
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
<li id="menu"><a href="tourRequestJSP.jsp" id="fontmenu">TOURNAMENT REQUEST </a></li>    </ul>

    <% session = request.getSession();
    List<String> Team_ID = (List) session.getAttribute("Team_ID");
    List<String> Team_Name = (List) session.getAttribute("Team_Name");
    List<String> Team_Tag = (List) session.getAttribute("Team_Tag");
    List<String> Game_ID = (List) session.getAttribute("Game_ID");
    List<String> Team_Cap = (List) session.getAttribute("Team_Cap");
    List<String> Team_Phone = (List) session.getAttribute("Team_Phone");
    List<String> Team_Image = (List) session.getAttribute("Team_Image");
    List<String> Team_mem_num = (List) session.getAttribute("Team_mem_num");
    int page_count = (int) session.getAttribute("page_count");
    for(int j=1; j<=page_count; j++){
        out.print("<div id=\"tab"+j+"\""+ " class=\"container list_player\">");
        int temp = (6*(j-1)) + (Team_Name.size()-(6*(j-1)));
        int temp2 = 6*j;
        //min((6*j), (6*(j-1)) + (43-(6*(j-1))))
        for(int i=(6*(j-1))+1; i<=Math.min(temp, temp2); i++){
            int index = Team_ID.indexOf(Integer.toString(i));
            if(j==1){
                out.println("<div class=\"divplayer filter "+j+"\">");
            }
            else{
                out.println("<div class=\"divplayer filter "+j+"\" style=\"display: none;\">");
            }
            
            out.println("<div class=\"player" + index+1 +"\">");
            out.println("<div class=\"container contain\">");
            out.println("<div class=\"row contain\">");
            out.println("<div class=\"col-sm-4 col-md-4 user-details\">");
            out.println("<div class=\"user-image\">");
            out.println("<img src=" +Team_Image.get(index)+ " alt=\"\" title=\"\" class=\"img_size\">");
            out.println("</div>");
            out.println("<div class=\"user-info-block\">");
            out.println("<div class=\"user-heading\">");
            //out.println("<a href=Player_001Servlet>"+ign_list.get(i-1)+request.getParameter("hi")+"</a>"+"<input type=\"hidden\" value=\""+ign_list.get(i-1)+"\""+" name=\"hi\">");
            out.println("<a id=\"profileeiei\" href=Team_001Servlet?team_id="+(index)+"><input type=\"hidden\" value=1 name=1/><h3>" + Team_Name.get(index) + "</h3></a>");
            //out.println("<a name=\""+i+"\" "+"id=\"profileeiei\" href=Player_001Servlet><input type=\"hidden\" value=1 name=1/><h3>" + ign_list.get(i-1) + "</h3></a>");
            //href=\"player_00"+i+".html\"
            out.println("<span class=\"help-block\"> Tag : " + Team_Tag.get(index) + "</span>");
            out.println("</div>");
            out.println("<ul class=\"navigation\">");
            out.println("<li class=\"active\">");
            out.println("<a data-toggle=\"tab\" href=\"#Cap_"+(index)+"\">");
            out.println("<span class=\"glyphicon \">Captain</span>");
            out.println("</a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a data-toggle=\"tab\" href=\"#cnt_player_"+(index)+"\">");
            out.println("<span class=\"glyphicon glyphicon-user\"></span>");
            out.println("</a>");
            out.println("</li>");
            
            if((int)session.getAttribute("suc") == 1){
                String username = (String) session.getAttribute("username"); 
                if(username.equals(Team_Cap.get(index))){
                    out.println("<li>");
                    out.println("<a data-toggle=\"tab\" href=\"#edit_"+(index)+"\">");
                    out.println("<span class=\"glyphicon glyphicon-link\"></span>");
                    out.println("</a>");
                    out.println("</li>");
                }
            }
            out.println("</ul>");
            out.println("<div class=\"user-body\">");
            out.println("<div class=\"tab-content\">");
            out.println("<div id=\"edit_"+(index)+"\" class=\"tab-pane\">");
            out.println("<a href=EditTeamServlet?Team_ID="+Team_ID.get(index)+"><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><button class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\"><span class=\"glyphicon glyphicon-pencil\"></span></button></p></a>");
            out.println("</div>");
            out.println("<div id=\"cnt_player_"+(index)+"\" class=\"tab-pane\">");
            out.println("<h4> Player in team : " + Team_mem_num.get(index) + "Player(s)" + "</h4>");
            out.println("</div>");
            out.println("<div id=\"Cap_"+index+"\" class=\"tab-pane active\">");
            out.println("<h4>Captain : " + Team_Cap.get(index) + "</h4>");
            out.println("</div></div></div></div></div></div></div></div></div>");
        }

        out.println("</div>");
    }
    
    
    %>

    <%
        /*out.print("<p style=\"text-align:center; font-size:130%;\">");
        for (int i=1; i <= page_count; i++){
            out.print("|" + i);
        }
        out.println("|" + "</p>");*/
        out.println("<script src=\"assets/js/player.js\"></script>");
        
        out.println("<div align=\"center\">");
        
        for (int i=1; i <= page_count; i++){
            if (i==1){
                out.println("<a id=\""+i+"\""+ " data-filter=\""+ i + "\""+ " class=\"filter-button active\" onclick=\"aaa()\">"+i+"</a>");
            }
            else{
                out.println("<a id=\""+i+"\""+ " data-filter=\""+ i + "\""+ " class=\"filter-button\"  onclick=\"aaa()\">"+i+"</a>");
            }
            out.println("|");
        }

        out.println("</div>");
    %> <!-- use list -->
    <!--<p style="text-align:center; font-size:130%;">Paragraph</p> -->


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