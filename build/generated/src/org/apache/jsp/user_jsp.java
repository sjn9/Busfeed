package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.FeedbackDao;
import dao.Feedback;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>BusFeed</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Google fonts link-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--For Plugins external css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins.css\" />\n");
      out.write("\n");
      out.write("        <!--Theme custom css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!--Theme Responsive css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar-collapse\">\n");
      out.write("        <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("        <div class='preloader'><div class='loaded'>&nbsp;</div></div>\n");
      out.write("        <div class=\"culmn\">\n");
      out.write("            <header id=\"main_menu\" class=\"header navbar-fixed-top\">            \n");
      out.write("                <div class=\"main_menu_bg\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"nave_menu\">\n");
      out.write("                                <nav class=\"navbar navbar-default\">\n");
      out.write("                                    <div class=\"container-fluid\">\n");
      out.write("                                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                                        <div class=\"navbar-header\">\n");
      out.write("                                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                                <span class=\"icon-bar\"></span>\n");
      out.write("                                                <span class=\"icon-bar\"></span>\n");
      out.write("                                                <span class=\"icon-bar\"></span>\n");
      out.write("                                            </button>\n");
      out.write("                                            <a class=\"navbar-brand\" href=\"#home\">\n");
      out.write("                                                <h2 style=\"color:white\">BusFeed</h2>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("                                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                                <li><a href=\"#home\">Home</a></li>\n");
      out.write("                                                <li><a href=\"#about\"> About us</a></li>\n");
      out.write("                                                <li><a href=\"#feedback\">Feedback</a></li>\n");
      out.write("                                                <li><a href=\"#busenquiry\">Bus Enquiry</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#driver\">Driver Details</a></li>\n");
      out.write("                                                <li><a href=\"#contact\">Contact us</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                               \n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </header> <!--End of header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section id=\"home\" class=\"home\">\n");
      out.write("                <div class=\"overlay all_overlay\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12 \">\n");
      out.write("                                <div class=\"main_home_slider text-center\">\n");
      out.write("                                    <div class=\"single_home_slider\">\n");
      out.write("                                        <div class=\"main_home wow fadeInUp\" data-wow-duration=\"700ms\">\n");
      out.write("                                            <h1>Welcome\n");
      out.write("                                                to BusFeed</h1>\n");
      out.write("                                            <div class=\"whiteseparator\"></div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"single_home_slider\">\n");
      out.write("                                        <div class=\"main_home wow fadeInUp\" data-wow-duration=\"700ms\">\n");
      out.write("                                            <h1>Check Bus \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tRoute here</h1>\n");
      out.write("                                            <div class=\"whiteseparator\"></div>\n");
      out.write("\n");
      out.write("                                            \n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section id=\"busenquiry\" class=\"service\"  style=\"background-color:#C70039\">\n");
      out.write("                <div class=\"container\" style=\"text-align:center; color:white\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<label ><b><h2>BUS ENQUIRY</h2></b></label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\" style=\"margin-left:25%\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<table border=\"1\" style=\"text-align:center; border-color:white; width=:1000px; height:560px;\"><tr><td style=\"align:center\">BUS NO.</td><td style=\"align:center\">ROUTE NAME</td>\n");
      out.write("\t\t\t\t\t\t<td style=\"align:center\">DRIVER NAME</td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td width=200></td><td width=200></td><td width=200></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("                          </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("<section id=\"driver\" class=\"service\" style=\"background-color:#DAF7A6\">\n");
      out.write("                <div class=\"container\" style=\"text-align:center\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<label ><b><h2>Driver Details</h2></b></label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<table border=\"1\" style=\"text-align:center; width=:1000px; height:560px;\"><tr><td style=\"align:center\">DRIVER NAME</td><td style=\"align:center\">MOBILE NUMBER</td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td width=200></td><td width=200></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t<tr><td></td><td></td></tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("                          </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\t\t\t \n");
      out.write("\n");
      out.write("\n");
      out.write("            <section id=\"about\" class=\"team\" style=\"background-color:#C70039\">\n");
      out.write("                <div class=\"container\" style=\"color:white\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"main_team sections\">\n");
      out.write("                            <div class=\"head_title text-center\" style=\"color:white\">\n");
      out.write("                                <h4 class=\"subtitle\">Who we are</h4>\n");
      out.write("                                <h2 style=\"color:white\">Meet our team</h2>\n");
      out.write("\n");
      out.write("                            <div class=\"main_team_content text-center\" style=\"color:white\">\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"single_team\">\n");
      out.write("                                        <div class=\"single_team_img\" style=\"color:white\">\n");
      out.write("                                            <img src=\"assets/images/team1.jpg\" alt=\"\" />\n");
      out.write("                                            <div class=\"single_team_overlay all_overlay\">\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_team_content\" style=\"color:white\">\n");
      out.write("                                            <h5 style=\"color:white\">Suhani Jain</h5>\n");
      out.write("                                            <p class=\"robotolight\" style=\"color:white\">Devloper</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"single_team\">\n");
      out.write("                                        <div class=\"single_team_img\">\n");
      out.write("                                            <img src=\"assets/images/team2.jpg\" alt=\"\" />\n");
      out.write("                                            <div class=\"single_team_overlay all_overlay\">\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_team_content\">\n");
      out.write("                                            <h5 style=\"color:white\">Shreya Gupta</h5>\n");
      out.write("                                            <p class=\"robotolight\" style=\"color:white\">Devloper</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"single_team\">\n");
      out.write("                                        <div class=\"single_team_img\">\n");
      out.write("                                            <img src=\"assets/images/team3.jpg\" alt=\"\" />\n");
      out.write("                                            <div class=\"single_team_overlay all_overlay\">\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_team_content\">\n");
      out.write("                                            <h5 style=\"color:white\">Taher Barwaniwala</h5>\n");
      out.write("                                            <p class=\"robotolight\" style=\"color:white\">Developer</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"single_team\">\n");
      out.write("                                        <div class=\"single_team_img\">\n");
      out.write("                                            <img src=\"assets/images/team3.jpg\" alt=\"\" />\n");
      out.write("                                            <div class=\"single_team_overlay all_overlay\">\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                                                <a href=\"\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single_team_content\">\n");
      out.write("                                            <h5 style=\"color:white\">Pranjal Dubey</h5>\n");
      out.write("                                            <p class=\"robotolight\" style=\"color:white\">Devloper</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<section id=\"feedback\" class=\"footer_widget\" style=\"background-color:#DAF7A6\">\n");
      out.write("\t\t\t\n");
      out.write("                <div class=\"container\">\n");
      out.write("\t\t\t\t\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("                        <div class=\"main_widget\">\n");
      out.write("                            \n");
      out.write("                                <div class=\"single_widget wow fadeIn\" data-wow-duration=\"0ms\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"footer_subcribs_area\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("                                                                            \n");
      out.write("                                       <label style=\"text-align:center\"><b><h2>FEEDBACK</h2></b></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>   \n");
      out.write("\n");
      out.write("                                        <form action=\"user.jsp\" method=\"get\" autocomplete=\"off\" class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("                                            <div  class=\"form-group\">\n");
      out.write("                                                <label><b>NAME</b></label><br> <input name=\"name\" style=\"width:300px; color:black\" type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label><b>EMAIL-ID</b></label><br><input name=\"email\" style=\"width:300px; color:black\" type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label><b>FEEDBACK</b></label><br><textarea name=\"message\" style=\"width:300px; height:160px; color:black\" class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("                                                <button type=\"submit\" class=\"submit_btn\">Submit</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-7  col-xs-12\">\n");
      out.write("                                       \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-5 col-xs-12\">\n");
      out.write("                                        \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
 
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
     
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section id=\"contact\" class=\"footer_widget\" style=\"background-color:#C70039\">\n");
      out.write("                <div class=\"container\" style=\"color:white\">\n");
      out.write("                    <div class=\"row\" style=\"color:white\">\n");
      out.write("                        <div class=\"main_widget\" style=\"color:white\">\n");
      out.write("                            <div >\n");
      out.write("                                <div class=\"main_home wow fadeInUp\" data-wow-duration=\"0ms\">\n");
      out.write("                                    <div class=\"footer_logo\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <label><h2>CONTACT US</h2></label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p style=\"text-align:left;\"><h5 style=\"color:white\"> College contact Number:         </h5></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t      \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p style=\"text-align:left;\"><h5 style=\"color:white\">  Bus Manager Contact Number:     </h5></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <p style=\"text-align:left;\"><h5 style=\"color:white\">  College Address:     </h5></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <p style=\"text-align:left;\"><h5 style=\"color:white\">  Website:     </h5></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t \n");
      out.write("\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-7  col-xs-12\">\n");
      out.write("                                        <div class=\"single_widget wow fadeIn\" data-wow-duration=\"800ms\">\n");
      out.write("                                            \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-5 col-xs-12\">\n");
      out.write("                                        <div class=\"single_widget wow fadeIn\" data-wow-duration=\"800ms\">\n");
      out.write("                                            <span class=\"separator4\"></span>\n");
      out.write("\n");
      out.write("                                            <div class=\"footer_gellary\">\n");
      out.write("                                                 \n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <footer id=\"footer\" class=\"footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"main_footer text-center\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12 col-xs-12\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- START SCROLL TO TOP  -->\n");
      out.write("\n");
      out.write("        <div class=\"scrollup\">\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/jquery-1.11.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.mixitup.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.masonry.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.fancybox.pack.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
