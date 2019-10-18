package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </header> <!--End of header -->\n");
      out.write("            <section id=\"home\" class=\"home\">\n");
      out.write("                <div class=\"overlay all_overlay\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12 \">\n");
      out.write("                                <div class=\"main_home_slider text-center\">\n");
      out.write("                                    <div class=\"single_home_slider\">\n");
      out.write("                                        <div class=\"main_home wow fadeInUp\" data-wow-duration=\"700ms\">\n");
      out.write("                                            <h4>Welcome\n");
      out.write("                                                to BusFeed</h4>\n");
      out.write("                                            <br><br><br><h2 style=\"font-family:times new roman;text-transform:inherit\"><i>\n");
      out.write("                                            This website allows the students and staff of SVVV to check their bus details for specific shift.\n");
      out.write("                                            They can contact the drivers in case of any problem. They can submit their suggestions and feedback\n");
      out.write("                                            in the feedback secion provided on website.\n");
      out.write("                                            \n");
      out.write("                                            We also have a seperate admin login. Here the admin can assign the buses to specific routes and drivers to specific buses.\n");
      out.write("                                            He can also add/update driver and bus details.</i></h2>\n");
      out.write("                                            <div class=\"whiteseparator\"></div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"single_home_slider\">\n");
      out.write("                                        <div class=\"main_home wow fadeInUp\" data-wow-duration=\"700ms\">\n");
      out.write("                                            <h1>Check Bus \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tRoute here</h1>\n");
      out.write("                                            <div class=\"whiteseparator\"></div>\n");
      out.write("                                            <div class=\"whiteseparator\"></div>\n");
      out.write("                                            <div class=\"home_btn\">\n");
      out.write("                                                <a href=\"index.jsp\" class=\"btn btn-primary\">LOGIN TO CONTINUE</a>\n");
      out.write("                                            </div>\n");
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
      out.write("\n");
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
