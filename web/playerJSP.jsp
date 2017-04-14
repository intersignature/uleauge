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
    <% session = request.getSession();
    List<String> fname_list = (List) session.getAttribute("fname_list");
    List<String> lname_list = (List) session.getAttribute("lname_list");
    List<String> ign_list = (List) session.getAttribute("ign_list");
    List<String> email_list = (List) session.getAttribute("email_list");
    List<String> fb_list = (List) session.getAttribute("fb_list");
    List<String> faculty_list = (List) session.getAttribute("faculty_list");
    List<String> university_list = (List) session.getAttribute("university_list");
    int page_count = (int) session.getAttribute("page_count");
    
    for(int j=1; j<=page_count; j++){
        out.print("<div id=\"tab"+j+"\""+ " class=\"container list_player\">");
        int temp = (6*(j-1)) + (fname_list.size()-(6*(j-1)));
        int temp2 = 6*j;
        //min((6*j), (6*(j-1)) + (43-(6*(j-1))))
        for(int i=(6*(j-1))+1; i<=Math.min(temp, temp2); i++){
            if(j==1){
                out.println("<div class=\"divplayer filter "+j+"\">");
            }
            else{
                out.println("<div class=\"divplayer filter "+j+"\" style=\"display: none;\">");
            }
            
            out.println("<div class=\"player" + i +"\">");
            out.println("<div class=\"container contain\">");
            out.println("<div class=\"row contain\">");
            out.println("<div class=\"col-sm-4 col-md-4 user-details\">");
            out.println("<div class=\"user-image\">");
            out.println("<img src=\"assets/img/player1.jpg\" alt=\"\" title=\"\" class=\"img_size\">");
            out.println("</div>");
            out.println("<div class=\"user-info-block\">");
            out.println("<div class=\"user-heading\">");
            //out.println("<a href=Player_001Servlet>"+ign_list.get(i-1)+request.getParameter("hi")+"</a>"+"<input type=\"hidden\" value=\""+ign_list.get(i-1)+"\""+" name=\"hi\">");
            out.println("<a id=\"profileeiei\" href=Player_001Servlet?player="+i+"><input type=\"hidden\" value=1 name=1/><h3>" + ign_list.get(i-1) + "</h3></a>");
            //out.println("<a name=\""+i+"\" "+"id=\"profileeiei\" href=Player_001Servlet><input type=\"hidden\" value=1 name=1/><h3>" + ign_list.get(i-1) + "</h3></a>");
            //href=\"player_00"+i+".html\"
            out.println("<span class=\"help-block\">" + fname_list.get(i-1) +" "+ lname_list.get(i-1) + "</span>");
            out.println("</div>");
            out.println("<ul class=\"navigation\">");
            out.println("<li class=\"active\">");
            out.println("<a data-toggle=\"tab\" href=\"#information_"+i+"\">");
            out.println("<span class=\"glyphicon glyphicon-user\"></span>");
            out.println("</a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a data-toggle=\"tab\" href=\"#edu_"+i+"\">");
            out.println("<span class=\"glyphicon glyphicon-education\"></span>");
            out.println("</a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a data-toggle=\"tab\" href=\"#link_"+i+"\">");
            out.println("<span class=\"glyphicon glyphicon-link\"></span>");
            out.println("</a>");
            out.println("</li>");
            out.println("</ul>");
            out.println("<div class=\"user-body\">");
            out.println("<div class=\"tab-content\">");
            out.println("<div id=\"link_"+i+"\" class=\"tab-pane\">");
            String fb_link_1 = "https://www.facebook.com/" +  fb_list.get(i-1);
            out.println("<a href=" + fb_link_1 + ">");
            out.println("<img src=\"assets/img/fb-logo.png\" alt=\"Go to W3Schools!\" width=\"40\" height=\"30\" border=\"0\"></a>");
            out.println("</div>");
            out.println("<div id=\"edu_"+i+"\" class=\"tab-pane\">");
            out.println("<h4>" + faculty_list.get(i-1) +", "+ university_list.get(i-1) + "</h4>");
            out.println("</div>");
            out.println("<div id=\"information_"+i+"\" class=\"tab-pane active\">");
            out.println("<h4>Currently Team : Ok.Paidai</h4>");
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