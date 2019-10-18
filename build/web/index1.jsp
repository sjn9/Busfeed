

<%@page import="dao.NewUserDao"%>
<%@page import="dao.NewUser"%>
<%@page import="dao.LoginDao"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <script language = "javascript">
     
          
          function validatesignup()
          {  
            var user_name,user_password,user_cpassword,user_email;
            user_name=document.getElementById("name").value;
            user_password=document.getElementById("password1").value;
            user_cpassword=document.getElementById("passwordsignup_confirm").value;
            user_email=document.getElementById("email").value;
            
            
            
            if(user_password!=user_cpassword)
            {    
              
               document.getElementById("e2").innerHTML = "Password not matching";

              document.getElementById("passwordsignup_confirm").focus();
              document.getElementById("passwordsignup_confirm").select();
              return false;
            }
            return true;
          }
        </script>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Busfeed</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="">
                </a>
                <span class="right">
                    <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/">
                    </a>
                </span>
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
                <h1><span></span></h1>
				<br>
                <h1><span></span></h1>
				<br>
				<h1><span></span></h1>
				<nav class="codrops-demos">	
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="index1.jsp" method="post" autocomplete="off"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u"> E-Mail Id </label>
                                    <input id="username" name="email" required="required"  type="text" placeholder="abcxxx@xyz.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Password </label>
                                    <input id="password" name="password" required="required" maxlength="30" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" onclick="return validatelogin();"/> 
								</p> 
                            </form>
                            <form action="index2.jsp">
                            <p class="login button"> 
                                    <input type="submit" value=" Admin Login"/> 
								</p> 
                            </form>
                            <form action="ForgotPassword.jsp">
                            <p class="login button"> 
                                    <input type="submit" value=" Forgot Password"/> 
								</p> 
                            </form>
                            <form action="index1.jsp#toregister">
                            <p class="login button"> 
                                    <input type="submit" value=" Join Us"/> 
								</p> 
                            </form>
                            <% 
                            String email=null,password=null;
                            email=request.getParameter("email");
                            password=request.getParameter("password");
                            if(email!=null && password!=null)
                            {        
                            LoginDao l =new LoginDao();
                                if(l.checkLogin(email, password))
                                    response.sendRedirect("user.jsp");                         
                                else
                            out.println("<div align=center>Invalid user name or password</div>");  
                            }
                            %>
                            
                      		                            
 

                        </div>

                         <div id="register" class="animate form">
                             <form  action="index1.jsp" autocomplete="on" onsubmit="return validatesignup();"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="name" class="uname" data-icon="u">Name</label>
                                    <input id="name" name="name" required="required" maxlength="30" type="text" placeholder="e.g. Suhana Khan" pattern="[a-zA-Z .]+" />
                                </p>
                                <p> 
                                    <label for="email" class="youmail" data-icon="e" >Email</label>
                                    <input id="email" name="email1" required="required" maxlength="30" type="email" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p">Password </label>  <label id="e1" style="color: red"> </label>
                                    <input id="password1" name="password1" required="required" maxlength="20" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Confirm Your Password </label><label id="e2" style="color: red"> </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" maxlength="20" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
								
								<p> 
                                    <label for="mobileno" class="youpasswd" data-icon="u">Mobile No. </label> 
                                    <input id="mobileno" name="mobileno" required="required" maxlength="10" type="text" placeholder="eg. 9826xxxxx"    pattern="[0-9]+" />
                                </p>
								<p> 
                                    <label for="enrollmentid" class="youpasswd" data-icon="u">Enrollment ID </label>
                                    <input id="enrollmentid" name="enrollmentid" required="required" maxlength="15" type="text" placeholder="eg. 0802itxxxx"/>
                                </p>
								<p> 
                                    <label for="branch" class="youpasswd" data-icon="u">Branch </label>
                                    <input id="branch" name="branch" required="required" maxlength="5" type="text" placeholder="eg. CS/IT/EC etc." pattern="[a-zA-Z .]+"/>
                                </p>
								<p> 
                                    <label for="year" class="youpasswd" data-icon="u">Year </label>
                                    <input id="year" name="year" required="required" maxlength="1" type="text" placeholder="eg. 1/2/3/4/5" pattern="[0-9]+" />
                                </p>
								<p> 
                                    <label for="semester" class="youpasswd" data-icon="u">Semester </label>
                                    <input id="semester" name="semester" required="required" maxlength="2" type="text" placeholder="eg. 1/2/3 etc." pattern="[0-9]+"/>
                                </p>
								<p> 
                                    <label for="shift" class="youpasswd" data-icon="u">Shift </label>
                                    <input id="shift" name="shift" required="required" maxlength="1" type="text" placeholder="eg. 1/2" pattern="[0-9]+"/>
                                </p>
								<p> 
                                    <label for="address" class="youpasswd" data-icon="u">Address </label>
                                    <input id="address" name="address" required="required" maxlength="100" type="text"/>
                                </p>
								<p> 
                                    <label for="bloodgroup" class="youpasswd" data-icon="u">Blood Group </label>
                                    <input id="bloodgroup" name="bloodgroup" required="required" maxlength="3" type="text" placeholder="eg. A+/AB- etc."/>
                                </p>
								<p> 
                                    <label for="stopname" class="youpasswd" data-icon="u">Stop Name </label>
                                    <input id="stopname" name="stopname" required="required" maxlength="25" type="text" placeholder="eg. kalani nagar/LIG etc."/>
                                </p>
								<p> 
                                    <label for="routeno" class="youpasswd" data-icon="u">Route No. </label>
                                    <input disabled="true" id="routeno" name="routeno"  maxlength="3" type="text"/>
                                </p>
								
								
                                <p class="signin button"> 
									<input type="submit" value="Sign up" onclick="return validatesignup();"/> 
								</p>
                                
                                                                
                                                                
                            </form>
                             <form action="index1.jsp#tologin">
                            <p class="login button"> 
                                    <input type="submit" value=" Log In"/> 
								</p> 
                            </form>
                             <% 
        String name=null;
    String email1=null;
    String password1=null;
    String mobileno=null;
    String enrollmentid=null;
    String branch=null;
    String year=null;
    String semester=null;
    String shift=null;
    String address=null;
    String bloodgroup=null;
    String stopname=null;
    
    
         name=request.getParameter("name");
     email1=request.getParameter("email1");
     password1=request.getParameter("password1");
     mobileno=request.getParameter("mobileno");
     enrollmentid=request.getParameter("enrollmentid");
     branch=request.getParameter("branch");
     year=request.getParameter("year");
     semester=request.getParameter("semester");
     shift=request.getParameter("shift");
     address=request.getParameter("address");
     bloodgroup=request.getParameter("bloodgroup");
     stopname=request.getParameter("stopname");
        if((name!=null)&&(email1!=null)&&(password1!=null)&&(mobileno!=null)&&(enrollmentid!=null)&&(branch!=null)&&(year!=null)&&(semester!=null)&&(shift!=null)&&(address!=null)&&(bloodgroup!=null)&&(stopname!=null))
     {  
            
         NewUser u=new NewUser();
         NewUserDao ud =new NewUserDao();
         u.setAddress(address);
         u.setBloodgroup(bloodgroup);
         u.setBranch(branch);
         u.setEmail(email1);
         u.setEnrollmentid(enrollmentid);
         u.setMobile(mobileno);
         u.setName(name);
         u.setPassword(password1);
         u.setSemester(semester);
         u.setShift(shift);
         u.setStopname(stopname);
         u.setYear(year);
         if(ud.insertNewUser(u))
          out.println("New user added.");
         else
             out.println("User not added");
     }   
%>
                        </div>			
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>