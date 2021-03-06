<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
        <title>Admin</title>
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
            <nav class="navbar navbar-default navbar-fixed-top" id="headnav">
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
                                    <li class="bgedit"><a href="MyTeam.jsp"><span class="icon-user"></span> My Team</a></li>
                                    <li class="bgedit"><a href="newsInvite.jsp"><span class="icon-envelope"></span> New invites</a></li>
                                    <li class="bgedit"><a href="uploadJSP.jsp"><span class="icon-upload"></span> Upload/Change Image</a></li>
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
        <ul class="nav nav-pills categories">
            <li id="menu"><a href="AdminUserServlet" id="fontmenu"><font color="red">USER </font></a></li>
            <li id="menu"><a href="AdminTeamServlet" id="fontmenu"><font color="red">TEAM </font></a></li>
            <li id="menu"><a href="AdminTournamentServlet" id="fontmenu"><font color="red">TOURNAMENT </font></a></li>
            <li id="menu"><a href="AdminOrganizerServlet" id="fontmenu"><font color="red">ORGANIZER </font></a></li>
            <li id="menu"><a href="AdminRequestServlet" id="fontmenu"><font color="red">REQUEST </font></a></li>
        </ul>
        <script language="JavaScript" src="https://code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="https://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="https://cdn.datatables.net/plug-ins/3cfcc339e89/integration/bootstrap/3/dataTables.bootstrap.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

        <link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/plug-ins/3cfcc339e89/integration/bootstrap/3/dataTables.bootstrap.css">
    <body>
        <% session = request.getSession();
            List<Integer> admin_Request_ID = (List) session.getAttribute("admin_Request_ID");
            List<String> admin_Request_Teamname = (List) session.getAttribute("admin_Request_Teamname");
            List<String> admin_Request_Address = (List) session.getAttribute("admin_Request_Address");
            List<String> admin_Request_Location = (List) session.getAttribute("admin_Request_Location");
            List<String> admin_Request_Exp = (List) session.getAttribute("admin_Request_Exp");
            List<String> admin_Request_Promote = (List) session.getAttribute("admin_Request_Promote");
            List<String> admin_Request_Email = (List) session.getAttribute("admin_Request_Email");
            List<String> admin_Request_Facebook = (List) session.getAttribute("admin_Request_Facebook");
            List<String> admin_Request_Cause = (List) session.getAttribute("admin_Request_Cause");
        %>
        <div class="container" style="width: 1400px; margin: 0 auto;">
            <div class="row" style="margin-top: 20px;">

                <div class="col-md-12">

                    <table id="datatable" class="table table-striped table-bordered" cellspacing="0" width="100%">

                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Teamname</th>
                                <th>Address</th>
                                <th>Location</th>
                                <th>Exp</th>
                                <th>Promote</th>
                                <th>Email</th>
                                <th>Facebook</th>
                                <th>Cause</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead>

                        <tfoot>
                            <tr>
                                <th>ID</th>
                                <th>Teamname</th>
                                <th>Address</th>
                                <th>Location</th>
                                <th>Exp</th>
                                <th>Promote</th>
                                <th>Email</th>
                                <th>Facebook</th>
                                <th>Cause</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </tfoot>

                        <tbody>
                            <%
                                for (int i = 1; i <= admin_Request_ID.size(); i++) {
                                    int index = admin_Request_ID.indexOf(i);
                                    out.println("<tr>");
                                    out.println("<td class=\"sorting_1\">" + Integer.toString(admin_Request_ID.get(index)) + "</td>");
                                    out.println("<td>" + admin_Request_Teamname.get(index) + "</td>");
                                    out.println("<td>" + admin_Request_Address.get(index) + "</td>");
                                    out.println("<td>" + admin_Request_Location.get(index) + "</td>");
                                    out.println("<td>" + admin_Request_Exp.get(index) + "</td>");;
                                    out.println("<td>" + admin_Request_Promote.get(index) + "</td>");
                                    out.println("<td>" + admin_Request_Email.get(index) + "</td>");
                                    out.println("<td>" + admin_Request_Facebook.get(index) + "</td>");
                                    out.println("<td>" + admin_Request_Cause.get(index) + "</td>");
                                    out.println("<td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><button class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\" data-target=\"#edit_" + i + "\"" + "><span class=\"glyphicon glyphicon-pencil\"></span></button></p></td><td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\"><button class=\"btn btn-danger btn-xs\" data-title=\"Delete\" data-toggle=\"modal\" data-target=\"#delete_" + i + "\"" + "><span class=\"glyphicon glyphicon-trash\"></span></button></p></td>");
                                    out.println("</tr>");
                                }
                                int last_id = admin_Request_ID.size()+1;
                            %>



                        </tbody>
                    </table>


                </div>
            </div><div>
                <p data-placement="top" data-toggle="tooltip" title="Add"><button class="btn btn-primary btn-xs" data-title="Add" data-toggle="modal" data-target="#add"><span class="glyphicon">CreateNewRequest</span></button></p>
            </div>

        </div>

        <%        for (int i = 1; i <= admin_Request_ID.size(); i++) {
                String temp = "edit_" + Integer.toString(i);
                int index = admin_Request_ID.indexOf(i);
        %>
        <div class="modal fade" id="<%=temp%>" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
                        <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4>
                    </div>
                    <div class="modal-body">
                        <form action="AdminCheckRequestServlet" method="POST">

                            <div class="form-group">
                                ID : <input name="admin_Request_ID" class="form-control " type="text" value=<%=admin_Request_ID.get(index)%> >
                            </div>

                            <div class="form-group">
                                Teamname : <input name="admin_Request_Teamname" class="form-control " type="text" value=<%=admin_Request_Teamname.get(index)%>>
                            </div>

                            <div class="form-group">
                                Address: <input name="admin_Request_Address" class="form-control " type="text" value=<%=admin_Request_Address.get(index)%>>
                            </div>

                            <div class="form-group">
                                Location : <input name="admin_Request_Location" class="form-control " type="text" value=<%=admin_Request_Location.get(index)%>>
                            </div>

                            <div class="form-group">
                                Exp : <input name="admin_Request_Exp" class="form-control " type="text" value=<%=admin_Request_Exp.get(index)%>>
                            </div>

                            <div class="form-group">
                                Promote : <input name="admin_Request_Promote" class="form-control " type="text" value=<%=admin_Request_Promote.get(index)%>>
                            </div>

                            <div class="form-group">
                                Email : <input name="admin_Request_Email" class="form-control " type="text" value=<%=admin_Request_Email.get(index)%>>
                            </div>

                            <div class="form-group">
                                Facebook : <input name="admin_Request_Facebook" class="form-control " type="text" value=<%=admin_Request_Facebook.get(index)%>>
                            </div>

                            <div class="form-group">
                                Cause : <input name="admin_Request_Cause" class="form-control " type="text" value=<%=admin_Request_Cause.get(index)%>>
                            </div>

                            <input name="admin_hide_Request_ID" type="hidden" class="form-control " type="text" value=<%=admin_Request_ID.get(index)%>>
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
                for (int i = 1; i <= admin_Request_ID.size(); i++) {
                    String temp = "delete_" + Integer.toString(i);
                    int index = admin_Request_ID.indexOf(i);
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
                            <form action="AdminDeleteRequestServlet" method="POST">
                                <input name="admin_hide_Request_ID" type="hidden" class="form-control " type="text" value=<%=admin_Request_ID.get(index)%>>
                                <button type="submit" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>�Yes</button>
                                <button type="submit" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span>�No</button>
                            </form>

                        </div>
                    </div>
                    <!-- /.modal-content --> 
                </div>
                <!-- /.modal-dialog --> 
            </div>
            <% }%>

            <div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
                            <h4 class="modal-title custom_align" id="Heading">Add New Request</h4>
                        </div>
                        <div class="modal-body">
                            <form action="AdminAddRequestServlet" method="POST">

                                <div class="form-group">
                                    ID : <input name="admin_Request_ID" class="form-control " type="text" value=<%=last_id%> >
                                </div>

                                <div class="form-group">
                                    Teamname : <input name="admin_Request_Teamname" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Address: <input name="admin_Request_Address" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Location : <input name="admin_Request_Location" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Exp : <input name="admin_Request_Exp" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Promote : <input name="admin_Request_Promote" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Email : <input name="admin_Request_Email" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Facebook : <input name="admin_Request_Facebook" class="form-control " type="text">
                                </div>

                                <div class="form-group">
                                    Cause : <input name="admin_Request_Cause" class="form-control " type="text">
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
        $(document).ready(function () {
            $('#datatable').dataTable();

            $("[data-toggle=tooltip]").tooltip();

        });

    </script>
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
</body>
</html>