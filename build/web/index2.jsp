<%@page import="dao.AdminLoginDao"%>
<%@page  session="true"%>

<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <script language = "javascript">
          function validatelogin()
          {
            var user_name,user_password;
            user_name=document.getElementById("username").value;
            user_password=document.getElementById("password").value;
            
            if(user_name.length>20)
            {    
              alert("Username can not be more than 20 characters.");
              document.getElementById("username").focus();
              return false;
            }
            if(user_password.length>20)
            {    
              alert("Password can not be more than 20 characters.");
              document.getElementById("password").focus();
              return false;
            }
          }
          function validatesignup()
          {
            var user_name,user_password,user_cpassword,user_email;
            user_name=document.getElementById("usernamesignup").value;
            user_password=document.getElementById("passwordsignup").value;
            user_cpassword=document.getElementById("passwordsignup_confirm").value;
            user_email=document.getElementById("emailsignup").value;
            
            if(user_name.length>20)
            {    
              alert("Username can not be more than 20 characters.");
              document.getElementById("usernamesignup").focus();
              return false;
            }
            if(user_password.length>20)
            {    
              alert("Password can not be more than 20 characters.");
              document.getElementById("passwordsignup").focus();
              return false;
            }
            if(user_password!=user_cpassword)
            {    
              alert("Please enter same passwords in both fields.");
              document.getElementById("passwordsignup_confirm").focus();
              document.getElementById("passwordsignup_confirm").select();
              return false;
            }
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
                            <form  action="index2.jsp" method="post" autocomplete="off"> 
                                <h1>Admin Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u"> Admin Username </label>
                                    <input id="username" name="email" required="required" maxlength="30" type="text" placeholder="myusername"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Admin Password </label>
                                    <input id="password" name="password" required="required" maxlength="30" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" onclick="return validatelogin();"/> 
								</p>
                                
                            
                            
                            </form>
                            <% 
                            String email=null,password=null;
                            email=request.getParameter("email");
                            password=request.getParameter("password");
                            if(email!=null && password!=null)
                            {        
                            AdminLoginDao l =new AdminLoginDao();
                                if(l.checkAdminLogin(email, password))
                                    response.sendRedirect("admin.jsp");                         
                                else
                            out.println("<div align=center>Invalid user name or password</div>");  
                            }
                            %>

                        </div>

                         
						
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html><%-- 
    Document   : index1
    Created on : Feb 28, 2018, 12:17:06 PM
    Author     : Taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
