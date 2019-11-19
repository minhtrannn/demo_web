package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"CSS/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\" >\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"header-top-inner\">\n");
      out.write("                    <a>HELP</a>\n");
      out.write("                    <div class=\"menu-space\"></div>\n");
      out.write("                    <a>ORDERS TRACKER OR RETURNS</a>\n");
      out.write("                    <div class=\"menu-space\"></div>\n");
      out.write("                    <a>JOIN CREATORS CLUB</a>\n");
      out.write("                    <div class=\"menu-space\"></div>\n");
      out.write("                    <a>LOGIN</a>\n");
      out.write("                    <div class=\"menu-space\"></div>\n");
      out.write("                    <svg style=\"cursor:pointer;padding-left:10px;padding-top:5px;width: 20px;height:20px;color:white;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"user\" class=\"svg-inline--fa fa-user fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M224 256c70.7 0 128-57.3 128-128S294.7 0 224 0 96 57.3 96 128s57.3 128 128 128zm89.6 32h-16.7c-22.2 10.2-46.9 16-72.9 16s-50.6-5.8-72.9-16h-16.7C60.2 288 0 348.2 0 422.4V464c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48v-41.6c0-74.2-60.2-134.4-134.4-134.4z\"/></svg>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-bottom\">\n");
      out.write("                <div class=\"header-bottom-inner\">\n");
      out.write("                    <svg style=\"cursor:pointer;bottom:20px;position: relative;color:white;height:40px;width:75px\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fab\" data-icon=\"atlassian\" class=\"svg-inline--fa fa-atlassian fa-w-16\" role=\"img\" xmlns=\"http://w...content-available-to-author-only...3.org/2000/svg\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M152.2 236.4c-7.7-8.2-19.7-7.7-24.8 2.8L1.6 490.2c-5 10 2.4 21.7 13.4 21.7h175c5.8.1 11-3.2 13.4-8.4 37.9-77.8 15.1-196.3-51.2-267.1zM244.4 8.1c-122.3 193.4-8.5 348.6 65 495.5 2.5 5.1 7.7 8.4 13.4 8.4H497c11.2 0 18.4-11.8 13.4-21.7 0 0-234.5-470.6-240.4-482.3-5.3-10.6-18.8-10.8-25.6.1z\"></path></svg>\n");
      out.write("                    <span class=\"brand-name\">GLAZERR</span>\n");
      out.write("                    <div class=\"header-bottom-inner-inside\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\">\n");
      out.write("                                <a>MEN</a>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-item-space\"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\">\n");
      out.write("                                <a>WOMEN</a>    \n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-item-space\"></div>    \n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\">\n");
      out.write("                               <a>KIDS</a>\n");
      out.write("                            </div>                           \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-item-space\"></div>      \n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\">\n");
      out.write("                               <a>SPORT</a>   \n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-item-space\"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\">\n");
      out.write("                               <a>BRAND</a>\n");
      out.write("                            </div>                             \n");
      out.write("                        </div>               \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-bottom-inner-search\">\n");
      out.write("                        <div class=\"search-icon\">\n");
      out.write("                           <svg style=\"cursor:pointer;width:15px;height:15px;color:black;\"xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"search\" class=\"svg-inline--fa fa-search fa-w-16\" role=\"img\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z\"/></svg>                            \n");
      out.write("                        </div>\n");
      out.write("                        <form class=\"search-input\" method=\"POST\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Search\" aria-label=\"search\"></input>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cart-icon\">\n");
      out.write("                        <svg style=\"height: 25px;width:25px;\"xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"shopping-cart\" class=\"svg-inline--fa fa-shopping-cart fa-w-18\" role=\"img\" viewBox=\"0 0 576 512\"><path fill=\"currentColor\" d=\"M528.12 301.319l47.273-208C578.806 78.301 567.391 64 551.99 64H159.208l-9.166-44.81C147.758 8.021 137.93 0 126.529 0H24C10.745 0 0 10.745 0 24v16c0 13.255 10.745 24 24 24h69.883l70.248 343.435C147.325 417.1 136 435.222 136 456c0 30.928 25.072 56 56 56s56-25.072 56-56c0-15.674-6.447-29.835-16.824-40h209.647C430.447 426.165 424 440.326 424 456c0 30.928 25.072 56 56 56s56-25.072 56-56c0-22.172-12.888-41.332-31.579-50.405l5.517-24.276c3.413-15.018-8.002-29.319-23.403-29.319H218.117l-6.545-32h293.145c11.206 0 20.92-7.754 23.403-18.681z\"/></svg>\n");
      out.write("                        <div class=\"cart-remain\">\n");
      out.write("                            <span class=\"cart-remain-text\">YOUR BAG IS EMPTY</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
