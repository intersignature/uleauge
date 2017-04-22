<%-- 
    Document   : EditProfileJSP
    Created on : Apr 18, 2017, 9:43:35 AM
    Author     : LAB203_42
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
    <%
        session = request.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password"); 
        String fname = (String) session.getAttribute("fname"); 
        String lname = (String) session.getAttribute("lname"); 
        String email = (String) session.getAttribute("email"); 
        String fb = (String) session.getAttribute("fb"); 
        String university = (String) session.getAttribute("university"); 
        String faculty = (String) session.getAttribute("faculty"); 
        String phone = (String) session.getAttribute("phone"); 
        String ign = (String) session.getAttribute("ign"); 
        String image = (String) session.getAttribute("image"); 
        int id = (int) session.getAttribute("P_ID"); 
        String roles = (String) session.getAttribute("roles");
        String useimage = (String) session.getAttribute("useimage");
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
   
                    String imgdir = useimage;
 
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
        <li id="menu"><a href="replayJSP.jsp" id="fontmenu">REPLAY </a></li>
        <li id="menu"><a href="PlayerServlet" id="fontmenu">PLAYERS </a></li>
        <li id="menu"><a href="rulesJSP.jsp" id="fontmenu">RULES </a></li>
        <li id="menu"><a href="faqJSP.jsp" id="fontmenu">FAQ </a></li>
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
                        <input class="form-control" type="text" name="username" value=<%= username %> disabled> <p>*Require</p>
                    </div>
                    </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="pawssword-input-field">Password </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="password" name="new_password" ><p>*Require<br>
                        *Your password must have at least one upper case, one lower case, one numeric</p>
                    </div>
                    <p id="cau_password" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="repeat-pawssword-input-field">Repeat Password </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="password" name="new_rep_password">
                        <p>*Require<br>*Must same above password</p>  
                    </div>
                    <p id="cau_rep_password" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field" >Name </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_fname" value=<%= fname %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_name" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Lastname </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_lname" value=<%= lname %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_lname" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="email-input-field">Email </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_email" value=<%= email %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_email" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Facebook Link</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_fb" value=<%= fb %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_fb" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">University </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_university" value=<%= university %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_university" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Faculty </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_faculty" value=<%= faculty %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_faculty" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Phone </label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" maxlength="10" minlength="0" inputmode="numeric" name="new_phone" value=<%= phone %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_phone" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">In game name</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="new_ign" value=<%= ign %>>
                        <p>*Require</p>
                    </div>
                    <p id="cau_ign" style="color:blue;"></p>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 label-column">
                        <label class="control-label" for="name-input-field">Image</label>
                    </div>
                    <div class="col-sm-6 input-column">
                        <input class="form-control" type="text" name="realimage" value=<%=image%>>
                        <p>*Optional<br></p>
                        <p>You must upload file to <a href="http://imgur.com/">imgur.com</a> copylink and paste it<br>
                        For Example : full link is "http://imgur.com/vfz3U5C" You paste only "vfz3U5C"</p>
                    </div>
                </div>       
                <button class="btn btn-default submit-button" id="buttonn" type="submit">Edit</button>
                <!--<script type='text/javascript' src='assets/js/signup_js.js'></script>-->
            </form>
        </div>  
    </div>
    <footer>
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