<%@page import="dao.Allocate"%>
<%@page import="dao.AllocateDao"%>
<%@page import="java.util.List"%>
<%@page import="dao.Driver"%>
<%@page import="dao.DriverDao"%>
<%@page import="dao.FeedbackDao"%>
<%@page import="dao.Feedback"%>
<%@page  session="true"%>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>BusFeed</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <!-- Google fonts link-->
        <link href="https://fonts.googleapis.com/css?family=Kaushan+Script&amp;subset=latin-ext" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">

        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">


        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/plugins.css" />

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
        <script language="javascript">
            window.history.forward();
        function noBack() {
                    window.history.forward();
                }
        </script>
    </head>
    <body onload = "noBack();" onpageshow="if (event.persisted) noBack();" onunload="" data-spy="scroll" data-target=".navbar-collapse">
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        <div class='preloader'><div class='loaded'>&nbsp;</div></div>
        <div class="culmn">
            <header id="main_menu" class="header navbar-fixed-top">            
                <div class="main_menu_bg">
                    <div class="container">
                        <div class="row">
                            <div class="nave_menu">
                                <nav class="navbar navbar-default">
                                    <div class="container-fluid">
                                        <!-- Brand and toggle get grouped for better mobile display -->
                                        <div class="navbar-header">
                                             <a  href="#home">
                                                <img src="logo.jpg" height="60" width="60" style="margin-top: 0rem;margin-bottom: 2rem; "> 
                                              
                                            </a>
                                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                                <span class="sr-only">Toggle navigation</span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                            </button>
                                           
                                        </div>
                                        <div class="navbar-header">
                                             <a href="#home">
                                               
                                                <h2 style="color:white; margin-left: 1rem"> SVVV BusFeed</h2>
                                            </a>
                                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                                <span class="sr-only">Toggle navigation</span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                            </button>
                                           
                                        </div>

                                        <!-- Collect the nav links, forms, and other content for toggling -->



                                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                                            <ul class="nav navbar-nav navbar-right">
                                                <li><a href="#home">Home</a></li>
                                                <li><a href="#busenquiry">Bus Enquiry</a></li>
                                                <li><a href="#driver">Driver Details</a></li>
                                                <li><a href="#feedback">Feedback</a></li>						
                                                <li><a href="#contact">Contact us</a></li>
                                                <li><a href="#about"> About us</a></li>
                                                <li><a href="index1.jsp">Logout!</a></li>

                                               
                                            </ul>


                                        </div>

                                    </div>
                                </nav>
                            </div>	
                        </div>

                    </div>

                </div>
            </header> <!--End of header -->





            <section id="home" class="home">
                <div style="background-image: url(bus_dribbble.gif);background-size: cover">
                    
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 ">
                                <div class="main_home_slider text-center">
                                    <div class="single_home_slider">
                                        <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                            <h1>Welcome
                                                to BusFeed</h1>
                                            <div class="whiteseparator"></div>
                                            
                                        </div>
                                    </div>
                                    <div class="single_home_slider">
                                        <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                            <h1>Check Bus 
											Route here</h1>
                                            <div class="whiteseparator"></div>

                                            

                                        </div>
                                    </div>
                                                                   </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>




            <section id="busenquiry" class="service"  style="background-color:#C70039; background-image: url(stop3.jpg);background-size: cover">
                <div class="container" style="text-align:center; color:black">
                    <div class="row">
                        
						<br>
                                                <br><br>
                                                <br>
						<label ><b><h2>BUS ENQUIRY</h2></b></label>
						<div class="col-sm-10 col-sm-offset-1" style="margin-left:25%">
						
                                                
                                                        <%AllocateDao Ad=new AllocateDao();
            List<Allocate> Alist=Ad.searchAllocate();
            %>
            <table border="1" style="text-align:center;width:500px;border-color: black;background-color: whitesmoke"><tr><td style="align:center"><b>ROUTE NAME</b></td><td style="align:center"><b>BUS NO</b></td><td style="align:center"><b>DRIVER NAME</b></td></tr>
            <%for (Allocate A : Alist) {
              %>  <tr>
                    <td style="color: black; width: 200;"><%=A.getRoute()%></td>
                <td style="color: black; width: 200;"><%=A.getBusnumber()%></td>
                <td style="color: black; width: 200;"><%=A.getDriver()%></td>
               </tr>
            <%}
            %>
						</table>
						<br>
                                                <br>
                          </div>
                    </div>
                </div>
            </section>
<section id="driver" class="service" style="background-image: url(driver.jpg);background-size: cover;background-position: center">
                <div class="container" style="text-align:center;color: black">
                    <div class="row">
                        
                        <br>
                            <br><br>
						<label ><b><h2 style="margin-left: 43rem">Driver Details</h2></b></label>
						<div class="col-sm-10 col-sm-offset-1">
						
						<%DriverDao Dd=new DriverDao();
            List<Driver> Mylist=Dd.searchAll();
            %>
            <table border="1" style="text-align:center;margin-left: 20rem;width: 500px;border-color: black;background-color: whitesmoke"><tr><td style="align:center"><b>DRIVER NAME</b></td><td style="align:center"><b>MOBILE NUMBER</b></td></tr>
            <%for (Driver D : Mylist) {
              %>  <tr>
                    <td style="color: black; width: 200;"><%=D.getName()%></td>
                <td style="color: black; width: 200;"><%=D.getMobile()%></td>
               </tr>
            <%}
            %>
						</table>
						<br>
                                                </b>
						<br>
                          </div>
                    </div>
                </div>
            </section>			 


            
			
			<section id="feedback" class="footer_widget" style="background-color:#DAF7A6;background-image: url(blue.png)">
			
                <div class="container">
				
                    <div class="row">
					
                        <div class="main_widget">
                            
                                <div class="single_widget wow fadeIn" data-wow-duration="0ms">
                                    
                                    <div class="footer_subcribs_area">
									<div class="text-center">
                                       <label style="text-align:center"><b><h2>FEEDBACK</h2></b></label>
									</div>   

                                        <form action="user.jsp" method="post" autocomplete="off" class="navbar-form navbar-left" role="search">
										
										<div class="col-sm-4 col-xs-12">
                                            <div  class="form-group">
                                                <label><b>NAME</b></label><br> <input name="name" style="width:300px; color:black" type="text" class="form-control">
												<br>
												<br>
												<label><b>EMAIL-ID</b></label><br><input name="email" style="width:300px; color:black" type="text" class="form-control">
												<br>
												<br>
												<label><b>FEEDBACK</b></label><br><textarea name="message" style="width:300px; height:160px; color:black" class="form-control"></textarea>
												<br>
												<br>
                                                <button type="submit" class="submit_btn">Submit</button>
												
                                            </div>

                                        
                                    </div>
                                        </form>
                                    </div>
                            </div>

                            <div class="col-sm-8">
                                <div class="row">
                                    <div class="col-sm-7  col-xs-12">
                                       
                                            
                                        </div>
                                    </div>

                                    <div class="col-sm-5 col-xs-12">
                                        
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
<% 
        String name=null; 
       String email=null;
                     String message=null;
        name=request.getParameter("name");
                email=request.getParameter("email");
        message=request.getParameter("message");
      if((email!=null)&&(message!=null)&&(name!=null))
     {  
            
         Feedback f=new Feedback();
         FeedbackDao fd=new FeedbackDao();
         f.setName(name);
         f.setEmail(email);
         f.setMessage(message);
         if(fd.insertFeedback(f))
          out.println("Feedback Stored.");
         else
             out.println("feedback not stored");
     }   
     %>
			


            <section id="contact" class="footer_widget" style="background-color:#C70039;background-image: url(svvv1.jpg);background-size: cover;opacity: 0.5; ">
                <div class="container" style="color:black">
                    <div class="row" style="color:black">
                        <div class="main_widget" style="color:black">
                            <div >
                                <div class="main_home wow fadeInUp" data-wow-duration="0ms">
                                    <div class="footer_logo">
                                        <br><br><br><br>
										 <label><h2><b>CONTACT US</b></h2></label>
                                    </div>
                                    <p style="text-align:left;"><h5 style="color:black">  <b>College contact Number: 9826050178   </b>    </h5></p>
									      
                                <p style="text-align:left;"><h5 style="color:black">  <b>Bus Manager Contact Number: 9926665884   </b>   </h5></p>
										  
<p style="text-align:left;"><h5 style="color:black"> <b>  College Address: SVVV,Gram Baroli Sanwer, Indore(M.P)  </b>  </h5></p>
										  
<p style="text-align:left;"><h5 style="color:black">  <b> Website: svvv.edu.in  </b>    </h5></p>
										  
									 


                                    
                                                                                  </div>
                            </div>

                            <div class="col-sm-8">
                                <div class="row">
                                    <div class="col-sm-7  col-xs-12">
                                        <div class="single_widget wow fadeIn" data-wow-duration="800ms">
                                            
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-5 col-xs-12">
                                        <div class="single_widget wow fadeIn" data-wow-duration="800ms">
                                            <span class="separator4"></span>

                                            <div class="footer_gellary">
                                                 


                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

<section id="about" class="team" style="background-color:#C70039">
                <div class="container" style="color:white">
                    <div class="row">
                        <div class="main_team sections">
                            <div class="head_title text-center" style="color:white">
                                <h4 class="subtitle">Who we are</h4>
                                <h2 style="color:white">Meet our team</h2>

                            <div class="main_team_content text-center" style="color:white">
                                <div class="col-sm-4">
                                    <div class="single_team">
                                        <div class="single_team_img" style="color:white">
                                            <img src="assets/images/team1.jpg" alt="" />
                                            <div class="single_team_overlay all_overlay">
                                                <a href=""><i class="fa fa-facebook"></i></a>
                                                <a href=""><i class="fa fa-twitter"></i></a>
                                                <a href=""><i class="fa fa-pinterest-p"></i></a>
                                                <a href=""><i class="fa fa-instagram"></i></a>
                                            </div>
                                        </div>
                                        <div class="single_team_content" style="color:white">
                                            <h5 style="color:white">Suhani Jain</h5>
                                            <p class="robotolight" style="color:white">Developer</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="single_team">
                                        <div class="single_team_img">
                                            <img src="assets/images/team2.jpg" alt="" />
                                            <div class="single_team_overlay all_overlay">
                                                <a href=""><i class="fa fa-facebook"></i></a>
                                                <a href=""><i class="fa fa-twitter"></i></a>
                                                <a href=""><i class="fa fa-pinterest-p"></i></a>
                                                <a href=""><i class="fa fa-instagram"></i></a>
                                            </div>
                                        </div>
                                        <div class="single_team_content">
                                            <h5 style="color:white">Shreya Gupta</h5>
                                            <p class="robotolight" style="color:white">Developer</p>
                                        </div>

                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="single_team">
                                        <div class="single_team_img">
                                            <img src="assets/images/team3.jpg" alt="" />
                                            <div class="single_team_overlay all_overlay">
                                                <a href=""><i class="fa fa-facebook"></i></a>
                                                <a href=""><i class="fa fa-twitter"></i></a>
                                                <a href=""><i class="fa fa-pinterest-p"></i></a>
                                                <a href=""><i class="fa fa-instagram"></i></a>
                                            </div>
                                        </div>
                                        <div class="single_team_content">
                                            <h5 style="color:white">Taher Barwaniwala</h5>
                                            <p class="robotolight" style="color:white">Developer</p>
                                        </div>

                                    </div>
                                </div>
								
								<div class="col-sm-4">
                                    <div class="single_team">
                                        <div class="single_team_img">
                                            <img src="assets/images/team3.jpg" alt="" />
                                            <div class="single_team_overlay all_overlay">
                                                <a href=""><i class="fa fa-facebook"></i></a>
                                                <a href=""><i class="fa fa-twitter"></i></a>
                                                <a href=""><i class="fa fa-pinterest-p"></i></a>
                                                <a href=""><i class="fa fa-instagram"></i></a>
                                            </div>
                                        </div>
                                        <div class="single_team_content">
                                            <h5 style="color:white">Pranjal Dubey</h5>
                                            <p class="robotolight" style="color:white">Developer</p>
                                        </div>

                                    </div>
                                </div>

								
                            </div>
                        </div>
                    </div>
                </div>
            </section>



            <footer id="footer" class="footer">
                <div class="container">
                    <div class="main_footer text-center">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12">
                                
                            </div>
                        </div>
                    </div>
                </div>
            </footer>

        </div>

        <!-- START SCROLL TO TOP  -->

        <div class="scrollup">
            <a href="#"><i class="fa fa-chevron-up"></i></a>
        </div>

        <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="assets/js/vendor/bootstrap.min.js"></script>
        

        <script src="assets/js/jquery.mixitup.min.js"></script>
        <script src="assets/js/jquery.easing.1.3.js"></script>
        <script src="assets/js/jquery.masonry.min.js"></script>
        <script src="assets/js/jquery.fancybox.pack.js"></script>
        

        <script src="assets/js/plugins.js"></script>
        <script src="assets/js/main.js"></script>

    </body>
</html>
