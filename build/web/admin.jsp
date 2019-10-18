<%@page import="dao.DriverSmsDao"%>
<%@page import="dao.UserSmsDao"%>
<%@page import="dao.BusDistanceDynamic"%>
<%@page import="dao.BusDistanceDynamicDao"%>
<%@page import="dao.Route"%>
<%@page import="dao.RouteDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.Feedback"%>
<%@page import="dao.Allocate"%>
<%@page import="dao.AllocateDao"%>
<%@page import="dao.FeedbackDao"%>
<%@page import="dao.BusDao"%>
<%@page import="dao.Bus"%>
<%@page import="dao.DriverDao"%>
<%@page import="dao.Driver"%>
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
		function addRow(tableID) {

			var table = document.getElementById(tableID);

			var rowCount = table.rows.length;
			var row = table.insertRow(rowCount);
			var colCount = table.rows[0].cells.length;

			for(var i=0; i<colCount; i++) {

				var newcell	= row.insertCell(i);

				newcell.innerHTML = table.rows[1].cells[i].innerHTML;
				//alert(newcell.childNodes);
				switch(newcell.childNodes[0].type) {
					case "text":
							newcell.childNodes[0].value = "";
							break;
					case "checkbox":
							newcell.childNodes[0].checked = false;
							break;
					case "select-one":
							newcell.childNodes[0].selectedIndex = 0;
							break;
				}
			}
		}

		function deleteRow(tableID) {
                    
			try {
                            
			var table = document.getElementById(tableID);
			var rowCount = table.rows.length;

			for(var i=0; i<rowCount; i++) {
				var row = table.rows[i];
				var chkbox = row.cells[0].childNodes[0];
				if(null != chkbox && true == chkbox.checked) {
					if(rowCount <= 1) {
						alert("Cannot delete all the rows.");
						break;
					}
					table.deleteRow(i);
					rowCount--;
					i--;
				}


			}
			}catch(e) {
				alert(e);
			}
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
                                                
                                                <li><a href="#allocate">Allocate Bus</a></li>
                                                <li><a href="#driver">Driver Details</a></li>
                                                <li><a href="#udriver">Modify Driver</a></li>
						<li><a href="#ubus">Modify Bus</a></li>
                                                <li><a href="#feedback">Feedback</a></li>
                                                <li><a href="#cbd">Check Bus</a></li>
                                                <li><a href="index2.jsp">Logout!</a></li>
                                               
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
                <div class="overlay all_overlay">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 ">
                                
                                    <div class="single_home_slider">
                                        <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                            <h1 style="color: white; text-align: center">Welcome
                                                Admin</h1>
                                            
                                            
                                        </div>
                                    </div>
                                  
                                                                 
                            </div>
                        </div>
                    </div>
                </div>
            </section>
                            
            <section id="allocate" class="service"  style="background-color:#C70039; background-image: url(stop3.jpg);background-size: cover">
                		
                <div class="container" style="text-align:center; color:black">
                    <div class="row">
                                                <br>
						<br>
						<br>
						<br>
						<br>
						<label ><b><h2>Bus Allocation</h2></b></label>
						<div class="col-sm-10 col-sm-offset-1" style="margin-left:25%">
						<br>
			

						<form name="form1" method="get" action="admin.jsp" style="color:black"><b>
                                               
						<INPUT type="button" value="Add Row" onclick = "addRow('t1')" />
                                                  
                                                
	<INPUT type="button" value="Delete Row" onclick="deleteRow('t1')" />
        
         <label><b> Shift </b></label> <label><b> 1 </b></label> <input type="radio" name="shift" value="1" checked> 
         <label><b> 2 </b></label> <input type="radio" name="shift" value="2"> 
                                                <br>
	<TABLE id="t1" border="1" style="text-align:center; border-color:black; background-color: white;">
            
            <tr><td style="align:center">SELECT</td><td style="align:center">ROUTE NAME</td><td style="align:center">BUS NO.</td>
						<td style="align:center">DRIVER NAME</td></tr>
		<TR>
			<TD><INPUT type= "checkbox" name="chk"/></TD>
			
				
                        <%RouteDao ald=new RouteDao();
            List<Route> ylist=ald.searchRoute();
            %>
            <%BusDao bld=new BusDao();
            List<Bus> yylist=bld.searchBus();
            %>
            <%DriverDao dld=new DriverDao();
            List<Driver> yyylist=dld.searchDriver();
            %>
            <TD>
            <SELECT name="route">
            
            <%for (Route A : ylist) {
              %> 
                    <OPTION value="<%=A.getRoutename()%>"><%=A.getRoutename()  +  "    ("+ A.getCapacity()+")"%></OPTION>
                    
            <%}%>		
            </SELECT>
			</TD>
                       
            <TD>
            <SELECT name="busno">
            
            <%for (Bus B : yylist) {
              %> 
                    <OPTION value="<%=B.getBusno()%>"><%=B.getBusno() +  "    ("+ B.getCapacity()+")"%></OPTION>
                    
            <%}%>		
            </SELECT>
			</TD>
                        
            <TD>
            <SELECT name="driver">
            
            <%for (Driver D : yyylist) {
              %> 
                    <OPTION value="<%=D.getName()%>"><%=D.getName()%></OPTION>
                    
            <%}%>		
            </SELECT>
			</TD>
		</TR>
	</TABLE>
</b>
						
						
						<a href="#confirm"><button class="submit_btn">Preview</button></a>
                                                <button type="submit" class="submit_btn">Submit</button>
                                                </form> 
						<br>
						<br>
                      
                                
                          </div>
                    </div>
                </div>
            </section>
                                                  </frameset>

            <% 
       
//        route=request.getParameter("route"+i);
//                busnumber=request.getParameter("busno"+i);
//        driver=request.getParameter("driver"+i);
      String q;
      q=request.getParameter("shift");
      
     Allocate al=new Allocate();
         AllocateDao add=new AllocateDao();
         add.deleteAllocate();
      if((request.getParameter("route")!=null)&&(request.getParameter("busno")!=null)&&(request.getParameter("driver")!=null))
    {        

             String route[]=request.getParameterValues("route");
            String busnumber[]=request.getParameterValues("busno");
           String driver[]=request.getParameterValues("driver");
         
           for(int k=0;k<route.length;k++)
         {
         al.setRoute(route[k]);
         al.setBusnumber(busnumber[k]);
         al.setDriver(driver[k]);
         if(add.insertAllocate(al))
          out.println("Stored.");
         else
             out.println("Not stored");
         }
         
     } 
         UserSmsDao usd = new UserSmsDao();
                usd.checkUserData(q);
         DriverSmsDao dsd = new DriverSmsDao();
                dsd.checkDriverData();
                      
     %>
			            <section id="confirm" class="service"  style="background-color:#C70039;background-image: url(stop3.jpg);background-size: cover">
                <div class="container" style="text-align:center; color:black">
                    <div class="row">
                        
						<br>
						<br>
						<br>
						<br>
						<br>
						<br>
						<label ><b><h2>DISTANCE TRAVELED</h2></b></label>
						<div class="col-sm-10 col-sm-offset-1" style="margin-left:25%">
						<br>
						<br>
                                                <%BusDistanceDynamicDao Bd=new BusDistanceDynamicDao();
            List<BusDistanceDynamic> myylist=Bd.searchDistance();
            %>
            <table border="1" style="text-align:center; border-color:black;background-color: white; margin-left: 10rm"><tr><td style="align:center"><b>BUS NUMBER</b></td><td style="align:center"><b>DISTANCE TRAVELED</b></td></tr>
            <%for (BusDistanceDynamic Dd : myylist) {
              %>  <tr>
                    <td style="color: black; width: 200;"><%=Dd.getBusno()%></td>
                <td style="color: black; width: 200;"><%=Dd.getDistancetravelled()%></td>
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
            
			
            <section id="driver" class="service" style="background-image: url(driver.jpg);width: 100%;background-size: cover;background-position: center">
                <div class="container" style="text-align:center">
                    <div class="row">
                        
						<br>
						<br>
						<label ><b><h2 style="color:white;margin-left: 40rem">DRIVER DETAILS</h2></b></label>
						<div class="col-sm-10 col-sm-offset-1" style="color:black;">
						<br>
						<br>
						<%DriverDao Dd=new DriverDao();
            List<Driver> Mylist=Dd.searchAll();
            %>
            <table border="1" style="text-align:center;margin-left: 20rem;border-color: black;background-color: whitesmoke"><tr><td style="align:center"><b>DRIVER NAME</b></td><td style="align:center"><b>MOBILE NUMBER</b></td><td style="align:center"><b>ADDRESS</b></td><td style="align:center"><b>LICENSE NUMBER</b></td></tr>
            <%for (Driver D : Mylist) {
              %>  <tr>
                    <td style="color: black; width: 200;"><%=D.getName()%></td>
                <td style="color: black; width: 200;"><%=D.getMobile()%></td>
                <td style="color: black; width: 200;"><%=D.getAddress()%></td>
                <td style="color: black; width: 200;"><%=D.getDriverlicense()%></td>
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
			 

         <section id="udriver" class="footer_widget" style="background-color:#C70039">
			
                <div class="container">
				
                    <div class="row">
					
                        <div class="main_widget">
                            
                                <div class="single_widget wow fadeIn" data-wow-duration="0ms">
                                    
                                    <div class="footer_subcribs_area">
									<div class="text-center">
                                                                            <br>
                                       <label style="text-align:center"><b><h2 style="color:white">ADD DRIVER DETAILS</h2></b></label>
									</div>   
                                        
                                        <form action="admin.jsp" method="post" autocomplete="off" class="navbar-form navbar-left" role="search">
										
										<div class="col-sm-4 col-xs-12">
                                            <div  class="form-group" style="color:white">
                                               <label><b>NAME</b></label><br> <input name="name" style="width:300px; color:black" type="text" required="required" class="form-control" pattern="[a-zA-Z .]+" >
												<br>
												<br>
												<label><b>MOBILE NO.</b></label><br><input name="mobile" style="width:300px; color:black" type="text" maxlength="10" required="required" class="form-control" pattern="[0-9]+" >
												<br>
												<br>
												<label><b>DRIVER LICENSE NO</b></label><br><input name="driverlicense" style="width:300px; color:black" type="text" class="form-control" maxlength="16" required="required">
												<br>
												<br><label><b>ADDRESS</b></label><br><input name="address" style="width:300px; color:black" type="text" required="required" class="form-control">
												<br>
												<br>
                                                                                                <br><label><b>AADHAR NUMBER</b></label><br><input name="address" style="width:300px; color:black" type="text" required="required" class="form-control">
												<br>
												<br>
                                                <button type="submit" class="submit_btn">Submit</button>
												
                                            </div>

                                        </form>
                                    </div>
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
    String address=null;
    String driverlicense=null;
    String mobile= null;
        name=request.getParameter("name");
                address=request.getParameter("address");
        driverlicense=request.getParameter("driverlicense");
        mobile=request.getParameter("mobile");
        if((name!=null)&&(address!=null)&&(driverlicense!=null)&&(mobile!=null))
     {  
            
         Driver d=new Driver();
         DriverDao dd=new DriverDao();
         d.setName(name);
         d.setAddress(address);
         d.setDriverlicense(driverlicense);
         d.setMobile(mobile);
         if(dd.insertDriver(d))
          out.println("New driver added.");
         else
             out.println("driver not added");
     }   
%>
<section id="ubus" class="footer_widget" style="background-color:#DAF7A6">
			
                <div class="container">
				
                    <div class="row">
					
                        <div class="main_widget">
                            
                                <div class="single_widget wow fadeIn" data-wow-duration="0ms">
                                    
                                    <div class="footer_subcribs_area">
									<div class="text-center">
                                                                            <br>
                                       <label style="text-align:center"><b><h2 style="color:black">ADD BUS DETAILS</h2></b></label>
									</div>   

                                        <form action="admin.jsp" method="post" autocomplete="on" class="navbar-form navbar-left" role="search">
										
										<div class="col-sm-4 col-xs-12">
                                            <div  class="form-group" style="color:black">
                                               <label><b>BUS NO.</b></label><br> <input name="busno" style="width:300px; color:black" type="text" class="form-control">
						<br>
						<br>
                                                <label><b>REGISTRATION NO.</b></label><br><input name="registration" style="width:300px; color:black" type="text" class="form-control">
						<br>						
                                                <br>
						<label><b>PERMIT DATE</b></label><br><input name="permitdate" style="width:300px; color:black" type="date" class="form-control">
						<br>
						<br><label><b>INSURANCE DATE</b></label><br><input name="insurancedate" style="width:300px; color:black" type="date" class="form-control">
						<br>
                                                <br>
                                                <label><b>GPS PRESENT OR NOT?</b></label><br>  <input type="radio" name="gps" value="yes" checked> Yes<br>
                                                                                                <input type="radio" name="gps" value="no"> No<br>

						<br>
						<br>
                                                <label><b>CAMERA PRESENT OR NOT?</b></label><br><input type="radio" name="camera" value="yes" checked> Yes<br>
                                                                                                <input type="radio" name="camera" value="no"> No<br>
                                                
						<br>
						<br>
                                                <label><b>FIRST AID AVAILABLE OR NOT?</b></label><br> <input type="radio" name="firstaid" value="yes" checked> Yes<br>
                                                                                                <input type="radio" name="firstaid" value="no"> No<br>
                                                
						<br>
						<br>
                                                <label><b>TOOLKIT PRESENT OR NOT?</b></label><br> <input type="radio" name="toolkit" value="yes" checked> Yes<br>
                                                                                                <input type="radio" name="toolkit" value="no"> No<br>
                                                
						<br>
						<br>
                                                <label><b>SPEED GOVERNOR PRESENT OR NOT?</b></label><br> <input type="radio" name="speedgovernor" value="yes" checked> Yes<br>
                                                                                                <input type="radio" name="speedgovernor" value="no"> No<br>
                                        
						<br>
						<br>
                                                <label><b>CONDUCTOR APPOINTED OR NOT?</b></label><br><input type="radio" name="conductor" value="yes" checked> Yes<br>
                                                                                                <input type="radio" name="conductor" value="no"> No<br>
                                        
                                                
						<br>
						<br>
                                                <label><b>FITNESS TEST LAST TAKEN?</b></label><br> <input name="lastfitnesstestdate" style="width:300px; color:black" type="date" class="form-control">
						<br>
						<br>
                                                <label><b>FITNESS TEST DUE DATE?</b></label><br> <input name="fitnesstestduedate" style="width:300px; color:black" type="date" class="form-control">
						<br>
						<br>
                                                <label><b>CAPACITY</b></label><br> <input name="capacity" style="width:300px; color:black" type="text" class="form-control">
						<br>
						<br>
                                                <button type="submit" class="submit_btn">Submit</button>
												
                                            </div>

                                        </form>
                                    </div>
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
        String registration=null;
    String permitdate=null;
    String insurancedate=null;
    String gps=null;
    String camera=null;
    String firstaid=null;
    String toolkit=null;
    String speedgovernor=null;
    String conductor=null;
    String lastfitnesstestdate=null;
    String fitnesstestduedate=null;
    String busno=null;
    String capacity=null;
    
    
         registration=request.getParameter("registration");
     permitdate=request.getParameter("permitdate");
     insurancedate=request.getParameter("insurancedate");
     gps=request.getParameter("gps");
     camera=request.getParameter("camera");
     firstaid=request.getParameter("firstaid");
     toolkit=request.getParameter("toolkit");
     speedgovernor=request.getParameter("speedgovernor");
     conductor=request.getParameter("conductor");
     lastfitnesstestdate=request.getParameter("lastfitnesstestdate");
     fitnesstestduedate=request.getParameter("fitnesstestduedate");
     busno=request.getParameter("busno");
     capacity=request.getParameter("capacity");
        if((registration!=null)&&(permitdate!=null)&&(insurancedate!=null)&&(gps!=null)&&(camera!=null)&&(firstaid!=null)&&(toolkit!=null)&&(speedgovernor!=null)&&(conductor!=null)&&(lastfitnesstestdate!=null)&&(fitnesstestduedate!=null)&&(busno!=null))
     {  
            
         Bus bus=new Bus();
         BusDao busDao =new BusDao();
         bus.setBusno(busno);
         bus.setCamera(camera);
         bus.setConductor(conductor);
         bus.setFirstaid(firstaid);
         bus.setFitnesstestduedate(fitnesstestduedate);
         bus.setGps(gps);
         bus.setInsurancedate(insurancedate);
         bus.setLastfitnesstestdate(lastfitnesstestdate);
         bus.setPermitdate(permitdate);
         bus.setRegistration(registration);
         bus.setSpeedgovernor(speedgovernor);
         bus.setToolkit(toolkit);
         bus.setCapacity(capacity);
         if(busDao.insertBus(bus))
          out.println("New bus added.");
         else
             out.println("bus not added");
     }   
%>
<section id="feedback" class="service"  style="background-color:#DAF7A6; background-image: url(blue.png);background-size: cover">
                <div class="container" style="text-align:center; color:darkslateblue">
                    <div class="row">
                        
						<br>
                                                <br>
						<br>
                                                <br>
						<label ><b><h2>FEEDBACK DETAILS</h2></b></label>
						<div class="col-sm-10 col-sm-offset-1" style="margin-left:25%">
					
						
						
                                                    <%FeedbackDao Ed=new FeedbackDao();
            List<Feedback> mylist=Ed.searchAll();
            %>
            <table border="1" style="text-align:center; border-color:black;background-color: white;margin-left:6rem; "><tr><td style="align:center"><b>NAME</b></td><td style="align:center"><b>EMAIL-ID</b></td>
						<td style="align:center"><b>FEEDBACK</b></td></tr>
            <%for (Feedback E : mylist) {
              %>  <tr>
                    <td style="color: black; width: 200;"><%=E.getName()%></td>
                <td style="color: black; width: 200;"><%=E.getEmail()%></td>
                <td style="color: black; width: 200;"><%=E.getMessage()%></td>
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

			<section id="cbd" class="footer_widget" style="background-color:#C70039">
			
                <div class="container">
				
                    <div class="row">
					
                        <div class="main_widget">
                            
                                <div class="single_widget wow fadeIn" data-wow-duration="0ms">
                                    
                                    <div class="footer_subcribs_area">
									<div class="text-center">
                                       <label style="text-align:center"><b><h2>CHECK BUS DETAILS</h2></b></label>
									</div>   

                                        <form class="navbar-form navbar-left" role="search">
										
										<div class="col-sm-4 col-xs-12">
                                            <div  class="form-group">
                                               <label><b>BUS NO.</b></label><br> <input name= "bbb" style="width:300px; color:white" type="text" class="form-control" >
                                               
												<br>
												<br>
                                                <button type="submit" class="submit_btn">Show Details</button>
												
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
