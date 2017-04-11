function signup_case(){
	/*var username = document.getElementsByName("username")[0].value;
	var password = document.getElementsByName("password")[0].value;
	var rep_password = document.getElementsByName("rep_password")[0].value;
	var fname = document.getElementsByName("fname")[0].value;
	var lname = document.getElementsByName("lname")[0].value;
	var email = document.getElementsByName("email")[0].value;
	var fb = document.getElementsByName("fb")[0].value;
	var university = document.getElementsByName("university")[0].value;
	var faculty = document.getElementsByName("faculty")[0].value;
	var phone = document.getElementsByName("phone")[0].value;
	var ign = document.getElementsByName("ign")[0].value;
	var password_isnum = 0;
	var password_isUpper = 0;
	var password_isLower = 0;
        var all_check = 0;*/
	/*var connection = new ActiveXObject("ADODB.Connection");
	var connectionstring="jdbc:sqlserver://esportproject.database.windows.net:1433;database=Esport;User ID=adminesport@esportproject;Password=Esport2017;Provider=SQLOLEDB";
	connection.Open(connectionstring);
	rs.Open("SELECT TOP 100 * FROM db_accessadmin.Player", connection);
	rs.MoveFirst
	while(!rs.eof)
	{
   		document.write(rs.fields(1));
   		rs.movenext;
	}
	var rs = new ActiveXObject("ADODB.Recordset");*/
    
	//เช็คpassword
	/*for (i=0, len=password.length; i<len; i++){
		var password_char = password.charAt(i);
		if (!isNaN(password_char * 1)){
			password_isnum = 1;
		}
		if (password_char == password_char.toUpperCase()){
			password_isUpper = 1;
		}
		if (password_char == password_char.toLowerCase()){
			password_isLower = 1;
		}
		
	}
	if (password_isnum != 1 || password_isUpper != 1 || password_isLower != 1){
		document.getElementById("cau_password").innerHTML = "Incorrect Password";
		//alert("Your password is not incorrect");
		//location.href = "/signup.html";
	}
	else{ document.getElementById("cau_password").innerHTML = ""; all_check++}
        
        //เช็ค rep-password
        if(rep_password !== password || rep_password === "" || password_isnum != 1 || password_isUpper != 1 || password_isLower != 1){
            document.getElementById("cau_rep_password").innerHTML = "Incorrect Repeat Password";
        }
        else{ document.getElementById("cau_rep_password").innerHTML = ""; all_check++}
        
        //เช็ค name
        var specialChars = " <>@!#$%^&*()_+[]{}?:;|'\"\\,./~`-=";
        var checkname = function(string){
        for(i = 0; i < specialChars.length;i++){
            if(string.indexOf(specialChars[i]) > -1){
                return true;
                }
            }
        return false;
        };

        if(checkname(fname) || fname===""){
            document.getElementById("cau_name").innerHTML = "Incorrect Name";
           } else {
        document.getElementById("cau_name").innerHTML = "" 
        all_check++;
        }
        
        //เช็ค Lname
        if(checkname(lname) || lname===""){
            document.getElementById("cau_lname").innerHTML = "Incorrect Lastname";
           } else {
        document.getElementById("cau_lname").innerHTML = "" 
        all_check++;
        }
	
        //เช็คEmail
        if(email.indexOf("@") > -1){
                document.getElementById("cau_email").innerHTML = "" 
                all_check++;
        } else{
            document.getElementById("cau_email").innerHTML = "Incorrect E-mail";
        }
        
        //เช็คfblink
        if(fb === ""){
            document.getElementById("cau_fb").innerHTML = "Must have Facebook Link";
        }
        else{ document.getElementById("cau_fb").innerHTML = ""; all_check++}
        
        //เช็คUniversity
        if(university === ""){
            document.getElementById("cau_university").innerHTML = "Must have university";
        }
        else{ document.getElementById("cau_university").innerHTML = ""; all_check++}
        
        //เช็คFaculty
        if(faculty === ""){
            document.getElementById("cau_faculty").innerHTML = "Must have faculty";
        }
        else{ document.getElementById("cau_faculty").innerHTML = ""; all_check++}
        
        //เช็คphone
        if(/^\d+$/.test(phone) && phone.length === 10){
            document.getElementById("cau_phone").innerHTML = "";
            all_check++
        }
        else{ document.getElementById("cau_phone").innerHTML = "Incorrect Phone Number";}

        //เช็คign
        if(ign === ""){
            document.getElementById("cau_ign").innerHTML = "Must have In-game name";
        }
        else{ document.getElementById("cau_ign").innerHTML = ""; all_check++}
        
        //เช็คว่าจะเข้าsevletหรือไม่*/
        /*if (all_check===10){*/
            document.getElementById('signup').action = "SignupServlet";
            document.getElementById('buttonn').type = "submit"; 
        /*}  */  
}