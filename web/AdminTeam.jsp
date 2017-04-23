<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>Admin-Seller - Com-Pare</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
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
    <style type="text/css">
        .pagination>li {
display: inline;
padding:0px !important;
margin:0px !important;
border:none !important;
}
.modal-backdrop {
  z-index: -1 !important;
}
/*
Fix to show in full screen demo
*/
iframe
{
    height:700px !important;
}

.btn {
display: inline-block;
padding: 6px 12px !important;
margin-bottom: 0;
font-size: 14px;
font-weight: 400;
line-height: 1.42857143;
text-align: center;
white-space: nowrap;
vertical-align: middle;
-ms-touch-action: manipulation;
touch-action: manipulation;
cursor: pointer;
-webkit-user-select: none;
-moz-user-select: none;
-ms-user-select: none;
user-select: none;
background-image: none;
border: 1px solid transparent;
border-radius: 4px;
}

.btn-primary {
color: #fff !important;
background: #428bca !important;
border-color: #357ebd !important;
box-shadow:none !important;
}
.btn-danger {
color: #fff !important;
background: #d9534f !important;
border-color: #d9534f !important;
box-shadow:none !important;
}
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
    <header>
         <!-- Second navbar for sign in -->
    <nav class="navbar navbar-default" id="headnav">
      <div class="container" >
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header" >
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-2">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a href="indexJSP.jsp"> </a>
            <img src="assets/img/logo.png"  id = "logo">
          <a class="navbar-brand" href="indexJSP.jsp">U-LEAGUE</a>
        </div>
        <ul class="nav navbar-nav navbar-right" id="userbar">
             <% session = request.getSession();
                    String useimage = (String) session.getAttribute("useimage");
                    String username = (String) session.getAttribute("username"); 
                    String imgdir = useimage;
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
                <input type="hidden" name="from" value="TourJSP.jsp" />
             <li >
             <button type="submit" class="btn btn-default btn-outline btn-circle collapsed"  id="signinbtn" >Sign Out</button>

            </li>
            </form>
          </ul>
       
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
    </header>
                <ul class="nav nav-pills categories">
        <li id="menu"><a href="AdminUserServlet" id="fontmenu"><font color="red">USER </font></a></li>
        <li id="menu"><a href="AdminTeamServlet" id="fontmenu"><font color="red">TEAM </font></a></li>
        <li id="menu"><a href="AdminTournamentServlet" id="fontmenu"><font color="red">TOURNAMENT </font></a></li>
        <li id="menu"><a href="AdminOrganizerServlet" id="fontmenu"><font color="red">ORGANIZER </font></a></li>
        <li id="menu"><a href="AdminRequestServlet" id="fontmenu"><font color="red">REQUEST </font></a></li>
        <li id="menu"><a href="AdminSponserServlet" id="fontmenu"><font color="red">SPONSER </font></a></li>
    </ul>
<script language="JavaScript" src="https://code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
<script language="JavaScript" src="https://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script language="JavaScript" src="https://cdn.datatables.net/plug-ins/3cfcc339e89/integration/bootstrap/3/dataTables.bootstrap.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/plug-ins/3cfcc339e89/integration/bootstrap/3/dataTables.bootstrap.css">
<body>
    <% session = request.getSession();
    List<Integer> admin_Team_ID = (List) session.getAttribute("admin_Team_ID");
    List<String> admin_Team_Name = (List) session.getAttribute("admin_Team_Name");
    List<String> admin_Team_Tag = (List) session.getAttribute("admin_Team_Tag");
    List<Integer> admin_Game_ID = (List) session.getAttribute("admin_Game_ID");
    List<String> admin_Team_Cap = (List) session.getAttribute("admin_Team_Cap");
    List<String> admin_Team_Phone = (List) session.getAttribute("admin_Team_Phone");
    %>
<div class="container" style="margin-left: 0cm;">
        <div class="row">
           
            <div class="col-md-12">
                
                <table id="datatable" class="table table-striped table-bordered" cellspacing="0" width="100%">
                   
    				<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Tag</th>
							<th>GameID</th>
							<th>Captain</th>
							<th>Phone</th>
                                <th>Edit</th>
                                 <th>Delete</th>
						</tr>
					</thead>

					<tfoot>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Tag</th>
							<th>GameID</th>
							<th>Captain</th>
							<th>Phone</th>
                             <th>Edit</th>
                                 <th>Delete</th>
						</tr>
					</tfoot>

					<tbody>
                                            <%
                                        for(int i=1;i<=admin_Team_ID.size();i++){
                                            int index = admin_Team_ID.indexOf(i);
                                            out.println("<tr>");
                                            out.println("<td class=\"sorting_1\">"+Integer.toString(admin_Team_ID.get(index))+"</td>");
                                            out.println("<td>"+admin_Team_Name.get(index)+"</td>");
                                            out.println("<td>"+admin_Team_Tag.get(index)+"</td>");
                                            out.println("<td>"+Integer.toString(admin_Game_ID.get(index))+"</td>");
                                            out.println("<td>"+admin_Team_Cap.get(index)+"</td>");;
                                            out.println("<td>"+admin_Team_Phone.get(index)+"</td>");
                                            out.println("<td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><button class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\" data-target=\"#edit_"+i+"\""+"><span class=\"glyphicon glyphicon-pencil\"></span></button></p></td><td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\"><button class=\"btn btn-danger btn-xs\" data-title=\"Delete\" data-toggle=\"modal\" data-target=\"#delete_"+i+"\""+"><span class=\"glyphicon glyphicon-trash\"></span></button></p></td>");
                                            out.println("</tr>");
                                        }
                                        
                                        %>
						
                                                

					</tbody>
				</table>

	
	</div>
	</div><div>
        <p data-placement="top" data-toggle="tooltip" title="Add"><button class="btn btn-primary btn-xs" data-title="Add" data-toggle="modal" data-target="#add"><span class="glyphicon">CreateNewTeam</span></button></p>
                  </div>
            
</div>
                                                
    <%
        for(int i=1; i<=admin_Team_ID.size();i++){
            String temp = "edit_" + Integer.toString(i);
            int index = admin_Team_ID.indexOf(i);
        %>
<div class="modal fade" id="<%=temp%>" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
        <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4>
      </div>
          <div class="modal-body">
              <form action="AdminCheckTeamServlet" method="POST">

              <div class="form-group">
            ID : <input name="admin_Team_ID" class="form-control " type="text" value=<%=admin_Team_ID.get(index)%>>
          </div>
              
          <div class="form-group">
           Name : <input name="admin_Team_Name" class="form-control " type="text" value=<%=admin_Team_Name.get(index)%>>
          </div>
              
        <div class="form-group">
        Tag <input name="admin_Team_Tag" class="form-control " type="text" value=<%=admin_Team_Tag.get(index)%>>
        </div>
              
        <div class="form-group">
       GameID : <input name="admin_Game_ID" class="form-control " type="text" value=<%=admin_Game_ID.get(index)%>>
        </div>
              
      <div class="form-group">
      Captain : <input name="admin_Team_Cap" class="form-control " type="text" value=<%=admin_Team_Cap.get(index)%>>
        </div>
              
              <div class="form-group">
      Phone : <input name="admin_Team_Phone" class="form-control " type="text" value=<%=admin_Team_Phone.get(index)%>>
        </div>
              
              <input name="admin_hide_Team_ID" type="hidden" class="form-control " type="text" value=<%=admin_Team_ID.get(index)%>>
      </div>
          <div class="modal-footer ">
        <button type="submit" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span>�Update</button>
      </div>
            </form>
        </div>
  </div>
    </div>
    <% } %>
    
    
    <%
        for(int i=1; i<=admin_Team_ID.size();i++){
            String temp = "delete_" + Integer.toString(i);
            int index = admin_Team_ID.indexOf(i);
        %>
    <div class="modal fade" id=<%=temp%> tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
        <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
      </div>
          <div class="modal-body">
       
       <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div>
       
      </div>
        <div class="modal-footer ">
            <form action="AdminDeleteTeamServlet" method="POST">
                <input name="admin_hide_Team_ID" type="hidden" class="form-control " type="text" value=<%=admin_Team_ID.get(index)%>>
                <button type="submit" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>�Yes</button>
                 <button type="submit" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span>�No</button>
            </form>
       
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
    <% } %>
    
    <div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
        <h4 class="modal-title custom_align" id="Heading">Add New Team</h4>
      </div>
          <div class="modal-body">
              <form action="AdminAddTeamServlet" method="POST">
              
              <div class="form-group">
            ID : <input name="admin_Team_ID" class="form-control " type="text">
          </div>
              
          <div class="form-group">
           Name : <input name="admin_Team_Name" class="form-control " type="text" >
          </div>
              
        <div class="form-group">
        Tag <input name="admin_Team_Tag" class="form-control " type="text">
        </div>
              
        <div class="form-group">
       GameID : <input name="admin_Game_ID" class="form-control " type="text">
        </div>
              
      <div class="form-group">
      Captain : <input name="admin_Team_Cap" class="form-control " type="text" >
        </div>
              
              <div class="form-group">
      Phone : <input name="admin_Team_Phone" class="form-control " type="text" >
        </div>
              

      </div>
          <div class="modal-footer ">
        <button type="submit" class="btn btn-success btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-plus"></span>�Add</button>
      </div>
            </form>
        </div>
  </div>
    </div>
    </body>
<script type="text/javascript">
$(document).ready(function() {
    $('#datatable').dataTable();
    
     $("[data-toggle=tooltip]").tooltip();
    
} );

</script>
<footer>
        <div class="row">
            <div class="col-md-4 col-sm-6 footer-navigation">
                <h3><a href="#">E-LEAGUE<span><img src="assets/img/logo.png" id="footlogo"> </span></a></h3>
                <p class="links"><a href="#">Home</a><strong> � </strong><a href="#">Blog</a><strong> � </strong><a href="#">Pricing</a><strong> � </strong><a href="#">About</a><strong> � </strong><a href="#">Faq</a><strong> � </strong><a href="#">Contact</a></p>
                <p class="company-name">E-league � 2017 </p>
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
</body>
</html>