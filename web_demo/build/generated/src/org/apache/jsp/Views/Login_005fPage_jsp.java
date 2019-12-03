package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"CSS/CSS_Home_Page/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/CSS_Home_Page/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/CSS_Register_Page/header-promotion.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/CSS_Login_Page/body-login-page.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                    <svg id=\"icon_brand\" onclick=\"myFunction()\" style=\"cursor:pointer;bottom:20px;position: relative;color:white;height:40px;width:75px\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fab\" data-icon=\"atlassian\" class=\"svg-inline--fa fa-atlassian fa-w-16\" role=\"img\" xmlns=\"http://w...content-available-to-author-only...3.org/2000/svg\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M152.2 236.4c-7.7-8.2-19.7-7.7-24.8 2.8L1.6 490.2c-5 10 2.4 21.7 13.4 21.7h175c5.8.1 11-3.2 13.4-8.4 37.9-77.8 15.1-196.3-51.2-267.1zM244.4 8.1c-122.3 193.4-8.5 348.6 65 495.5 2.5 5.1 7.7 8.4 13.4 8.4H497c11.2 0 18.4-11.8 13.4-21.7 0 0-234.5-470.6-240.4-482.3-5.3-10.6-18.8-10.8-25.6.1z\"></path></svg>\n");
      out.write("                    <span class=\"brand-name\">GLAZERR</span>\n");
      out.write("                    <div class=\"header-bottom-inner-inside\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\">\n");
      out.write("                                <a>MEN</a>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-item-space\"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"menu-item\" >\n");
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
      out.write("                        <span class=\"cart-remain\">YOUR BAG IS EMPTY</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>    \n");
      out.write("        <div class=\"header-promotion\">\n");
      out.write("            <div class=\"header-promotion-contain\">\n");
      out.write("                <div class=\"header-promotion-item\">\n");
      out.write("                    30% OFF CYBER MONDAY - USE CODE: CYBER\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-promotion-item\">\n");
      out.write("                   <svg style=\"width: 15px;height: 15px;margin-right: 5px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"shipping-fast\" class=\"svg-inline--fa fa-shipping-fast fa-w-20\" role=\"img\" viewBox=\"0 0 640 512\"><path fill=\"currentColor\" d=\"M624 352h-16V243.9c0-12.7-5.1-24.9-14.1-33.9L494 110.1c-9-9-21.2-14.1-33.9-14.1H416V48c0-26.5-21.5-48-48-48H112C85.5 0 64 21.5 64 48v48H8c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8h272c4.4 0 8 3.6 8 8v16c0 4.4-3.6 8-8 8H40c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8h208c4.4 0 8 3.6 8 8v16c0 4.4-3.6 8-8 8H8c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8h208c4.4 0 8 3.6 8 8v16c0 4.4-3.6 8-8 8H64v128c0 53 43 96 96 96s96-43 96-96h128c0 53 43 96 96 96s96-43 96-96h48c8.8 0 16-7.2 16-16v-32c0-8.8-7.2-16-16-16zM160 464c-26.5 0-48-21.5-48-48s21.5-48 48-48 48 21.5 48 48-21.5 48-48 48zm320 0c-26.5 0-48-21.5-48-48s21.5-48 48-48 48 21.5 48 48-21.5 48-48 48zm80-208H416V144h44.1l99.9 99.9V256z\"/></svg> \n");
      out.write("                   <div>\n");
      out.write("                        FREE SHIPPING OVER $49 AND FREE RETURNS\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-promotion-item\">\n");
      out.write("                  <svg style=\"width: 15px;height: 15px;margin-right: 5px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"far\" data-icon=\"id-card\" class=\"svg-inline--fa fa-id-card fa-w-18\" role=\"img\" viewBox=\"0 0 576 512\"><path fill=\"currentColor\" d=\"M528 32H48C21.5 32 0 53.5 0 80v352c0 26.5 21.5 48 48 48h480c26.5 0 48-21.5 48-48V80c0-26.5-21.5-48-48-48zm0 400H303.2c.9-4.5.8 3.6.8-22.4 0-31.8-30.1-57.6-67.2-57.6-10.8 0-18.7 8-44.8 8-26.9 0-33.4-8-44.8-8-37.1 0-67.2 25.8-67.2 57.6 0 26-.2 17.9.8 22.4H48V144h480v288zm-168-80h112c4.4 0 8-3.6 8-8v-16c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8zm0-64h112c4.4 0 8-3.6 8-8v-16c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8zm0-64h112c4.4 0 8-3.6 8-8v-16c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8zm-168 96c35.3 0 64-28.7 64-64s-28.7-64-64-64-64 28.7-64 64 28.7 64 64 64z\"/></svg>  \n");
      out.write("                  <div>\n");
      out.write("                      JOIN THE ADIDAS CREATORS CLUB\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"body-login-page\">\n");
      out.write("            <div class=\"login-part-1\">\n");
      out.write("                <div class=\"login-part-1-contain\">\n");
      out.write("                    <div class=\"logo-login\">\n");
      out.write("                        <h2>LOGIN</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"form-login\">\n");
      out.write("                        <div class=\"forgot-password-login-contain\">\n");
      out.write("                            <a class=\"forgot-password-login\" target=\"_blank\">Forgot Your Password?</a>                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-login-input\">\n");
      out.write("                            <input placeholder=\"USERNAME\" name=\"username\" required type=\"text\"></input>       \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-login-input\">\n");
      out.write("                            <input placeholder=\"PASSWORD\" name=\"password\" required type=\"text\"></input>       \n");
      out.write("                        </div>   \n");
      out.write("                        <div class=\"term-condition-login\">\n");
      out.write("                            <span>\n");
      out.write("                                <span>By clicking 'Log In' you agree to our website</span>\n");
      out.write("                                <span>\n");
      out.write("                                    <a target=\"_blank\">Terms & Conditions</a>\n");
      out.write("                                </span>\n");
      out.write("                                <span>, </span>\n");
      out.write("                                <span>\n");
      out.write("                                    <a target=\"_blank\">Privacy Policy</a>                                \n");
      out.write("                                </span>\n");
      out.write("                                <span>. </span>\n");
      out.write("                                <span>and Creators Club </span>\n");
      out.write("                                <span>\n");
      out.write("                                    <a target=\"_blank\">Terms & Conditions</a>                                 \n");
      out.write("                                </span>\n");
      out.write("                            </span>               \n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"login-now\" type=\"submit\" aria-label=\"Login\">\n");
      out.write("                            <div>\n");
      out.write("                                <span>LOGIN</span>\n");
      out.write("                            </div>\n");
      out.write("                            <svg style=\"padding:12px;width:25px;height:25px;color:white;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                    <div>\n");
      out.write("                        <div>OR</div>\n");
      out.write("                        <div class=\"type-of-span\">\n");
      out.write("                            <button class=\"login-by-anotherapp\">\n");
      out.write("                                <span>FACEBOOK</span>\n");
      out.write("                                <svg style=\"width: 20px;height: 50px;margin-right: 20px;margin-top: -2px;margin-left: 20px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fab\" data-icon=\"facebook\" class=\"svg-inline--fa fa-facebook fa-w-16\" role=\"img\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M504 256C504 119 393 8 256 8S8 119 8 256c0 123.78 90.69 226.38 209.25 245V327.69h-63V256h63v-54.64c0-62.15 37-96.48 93.67-96.48 27.14 0 55.52 4.84 55.52 4.84v61h-31.28c-30.8 0-40.41 19.12-40.41 38.73V256h68.78l-11 71.69h-57.78V501C413.31 482.38 504 379.78 504 256z\"/></svg>\n");
      out.write("                            </button>\n");
      out.write("                            <button class=\"login-by-anotherapp\">\n");
      out.write("                                <span>GOOGLE</span>\n");
      out.write("                                <svg style=\"width: 20px;height: 50px;margin-right: 20px;margin-top: -2px;margin-left: 20px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fab\" data-icon=\"google\" class=\"svg-inline--fa fa-google fa-w-16\" role=\"img\" viewBox=\"0 0 488 512\"><path fill=\"currentColor\" d=\"M488 261.8C488 403.3 391.1 504 248 504 110.8 504 0 393.2 0 256S110.8 8 248 8c66.8 0 123 24.5 166.3 64.9l-67.5 64.9C258.5 52.6 94.3 116.6 94.3 256c0 86.5 69.1 156.6 153.7 156.6 98.2 0 135-70.4 140.8-106.9H248v-85.3h236.1c2.3 12.7 3.9 24.9 3.9 41.4z\"/></svg>\n");
      out.write("                            </button>   \n");
      out.write("                            <button class=\"login-by-anotherapp\">\n");
      out.write("                                <span>YAHOO</span>\n");
      out.write("                                <svg style=\"width: 20px;height: 50px;margin-right: 20px;margin-top: -2px;margin-left: 20px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fab\" data-icon=\"yahoo\" class=\"svg-inline--fa fa-yahoo fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M252 292l4 220c-12.7-2.2-23.5-3.9-32.3-3.9-8.4 0-19.2 1.7-32.3 3.9l4-220C140.4 197.2 85 95.2 21.4 0c11.9 3.1 23 3.9 33.2 3.9 9 0 20.4-.8 34.1-3.9 40.9 72.2 82.1 138.7 135 225.5C261 163.9 314.8 81.4 358.6 0c11.1 2.9 22 3.9 32.9 3.9 11.5 0 23.2-1 35-3.9C392.1 47.9 294.9 216.9 252 292z\"/></svg>\n");
      out.write("                            </button>                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"register-part-2\">\n");
      out.write("                <div class=\"register-part-2-contain\">\n");
      out.write("                    <div class=\"logo-login\">\n");
      out.write("                        <h2>REGISTER AND JOIN THE GLAZERR CREATORS CLUB</h2> \n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <p>Create an account with Glazerr :</p>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"benefit-register\">\n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>\n");
      out.write("                                Earn easy points for exclusive rewards\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\">\n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>                                \n");
      out.write("                                Access the best special offers and promotions\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\">\n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>\n");
      out.write("                                Receive invites to exclusive events\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\">\n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>\n");
      out.write("                                Get access to limited edition products\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\">  \n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>                                \n");
      out.write("                                Level up for a Runtastic Premium subscription\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\"> \n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>                                \n");
      out.write("                                Faster checkout with your saved address and payment details\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\">\n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>                                \n");
      out.write("                                Access your complete order history\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"benefit-register\">\n");
      out.write("                                <svg style=\"width: 20px;height: 20px;margin-right: 10px;\"xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path d=\"M0 0h24v24H0z\" fill=\"none\"/><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"/></svg>                                \n");
      out.write("                                Track your order delivery\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div>Want to learn more about the Creators Club? </div>\n");
      out.write("                        <a class=\"information-register\">Read more about free membership</a>\n");
      out.write("                        <div>\n");
      out.write("                            <button onclick=\"redirectRegisterPage()\" class=\"register-now-body\" type=\"button\">\n");
      out.write("                                    <div>\n");
      out.write("                                       <span class=\"click-register-now\">REGISTER NOW</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-page\">\n");
      out.write("            <div class=\"sign-up-footer\">\n");
      out.write("                <div class=\"sign-up-footer-contain\">\n");
      out.write("                    <div class=\"sign-up-footer-content\">\n");
      out.write("                        <span>JOIN CREATORS CLUB & GET 15% DISCOUNT</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sign-up-footer-button\">\n");
      out.write("                        <button title=\"signup-now\" type=\"button\">\n");
      out.write("                                    <span class=\"click-shopping-now\">SIGN UP</span>\n");
      out.write("                                    <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-content\">\n");
      out.write("                <ul class=\"footer-content-trending\" style=\"list-style: none;\">\n");
      out.write("                    <li>\n");
      out.write("                        <h3 style=\"margin-bottom:25px;font-size: 20px;color:black;\">TRENDING</h3>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Black Friday\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Cyber Monday\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Casual Shoes\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Slip On Shoes\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Camo Clothing\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Burgundy Shoes\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Leather Sneaker\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"footer-content-trending\" style=\"list-style: none;\">\n");
      out.write("                    <li>\n");
      out.write("                        <h3 style=\"margin-bottom:25px;font-size: 20px;color:black;\">CUSTOMER REPORT</h3>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Get Help\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Track Order\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Returns & Refunds\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Sizing\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Promotion\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        How to clean\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Store Locator\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Site Map\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"footer-content-trending\" style=\"list-style: none;\">\n");
      out.write("                    <li>\n");
      out.write("                        <h3 style=\"margin-bottom:25px;font-size: 20px;color:black;\">COMPANY INFO</h3>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        About Us\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Careers\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Press\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Affiliates\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Military Discount\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Student Discount\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Mobile Apps\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Creators Club\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Glazerr Stories\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"footer-content-trending\" style=\"list-style: none;\">\n");
      out.write("                    <li>\n");
      out.write("                        <h3 style=\"margin-bottom:25px;font-size: 20px;color:black;\">PARTNER SITES</h3>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Glazer Outdoor\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h3 style=\"margin-bottom:25px;font-size: 20px;color:black;\">PRIVACY & TERMS</h3>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Privacy & Security\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Glazer - Runtastic Privacy\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Statement\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Terms and condition\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Policy on Human Trafficking\n");
      out.write("                    </li>\n");
      out.write("                </ul>   \n");
      out.write("                <ul class=\"footer-content-trending\" style=\"list-style: none;\">\n");
      out.write("                    <li>\n");
      out.write("                        <h3 style=\"margin-bottom:25px;font-size: 20px;color:black;\">GIFT CARDS</h3>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Check Balance\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-information\">\n");
      out.write("                <div class=\"footer-information-contain\">\n");
      out.write("                    <div class=\"vietnam-flag\">\n");
      out.write("                        <img src=\"Images/2000px-Flag_of_Vietnam.svg.jpg\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"vietnam\">VietNam</div>\n");
      out.write("                    <div class=\"privacy-term\">\n");
      out.write("                        <div class=\"menu-space-footer\"></div>\n");
      out.write("                        <div class=\"privacy-policy\">\n");
      out.write("                            Privacy Policy\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-space-footer\"></div>\n");
      out.write("                        <div class=\"term-condition\">Terms and Conditions</div>\n");
      out.write("                        <div class=\"menu-space-footer\"></div>\n");
      out.write("                        <div>© 2019 Glazerr VietNam Inc.</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"Javascript/js_login_page/loginPage.js\" type=\"text/javascript\"></script>\n");
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
