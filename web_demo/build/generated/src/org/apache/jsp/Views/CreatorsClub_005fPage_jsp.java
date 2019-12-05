package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreatorsClub_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../CSS/CSS_Home_Page/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/CSS_Home_Page/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/CSS_CreatorsClub_Page/body_CreatorsClub_page.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        <div class=\"body-page\">\n");
      out.write("            <div class=\"body-page-part-1\">\n");
      out.write("                <div class=\"body-page-part-1-container\">\n");
      out.write("                    <div class=\"body-page-part-1-1\">\n");
      out.write("                        <div class=\"body-page-part-1-1-container\">\n");
      out.write("                            <h1>CREATORS GET REWARDED</h1>\n");
      out.write("                            <p>The adidas Creators Club, a membership program for true creators united as one. Join now to get inside and unlock the best of adidas. It's easy. It's free. It's time to create.</p>\n");
      out.write("                            <div>\n");
      out.write("                                <button type=\"button\" class=\"join-the-club\">\n");
      out.write("                                        <div class=\"join-the-club-text\">\n");
      out.write("                                            <span>JOIN THE CLUB</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"button\" class=\"existing-user-login\">\n");
      out.write("                                        <div class=\"existing-user-login-text\">\n");
      out.write("                                            <span>EXISTING USER LOGIN</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"body-page-part-1-2\">\n");
      out.write("                        <div class=\"body-page-part-1-2-container\">\n");
      out.write("                            <img src=\"../Images/creators-get-reward.jpg\" alt=\"\"/>                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part-2\">\n");
      out.write("                <div>INSIDE THIS CLUB, KICK OFF MEMBERSHIP AS A CHALLENGER. RISE THROUGH THE RANKS TO PLAYMAKER, GAME CHANGER & ICON. UNLOCK NEW REWARDS AT EACH STAGE. SOUNDS GOOD? IT GETS BETTER.</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part-3\">\n");
      out.write("                <div class=\"body-page-part-3-side\">\n");
      out.write("                    <div class=\"body-page-part-3-side-container\">\n");
      out.write("                        <h3>THE REWARD</h4>\n");
      out.write("                        <img src=\"../Images/level_1.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"hype-access\">\n");
      out.write("                            <h4>HYPE ACCESS</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"your-task\">LEVEL 1 / CHALLENGER: Access to limited edition adidas shoes and apparel</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"body-page-part-3-side\">\n");
      out.write("                    <div class=\"body-page-part-3-side-container\">\n");
      out.write("                        <img src=\"../Images/level_2.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"hype-access\">\n");
      out.write("                            <h4>CREATORS CLUB EXCLUSIVES</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"your-task\">LEVEL 2 / PLAYMAKER: Member only access to special products created with or for you.</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"body-page-part-3-side\">\n");
      out.write("                    <div class=\"body-page-part-3-side-container\">\n");
      out.write("                        <img src=\"../Images/level_3.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"hype-access\">\n");
      out.write("                            <h4>EARLY ACCESS</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"your-task\">LEVEL 3 / GAMECHANGER: Access to sneaker and apparel drops before everyone else</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"body-page-part-3-side\">\n");
      out.write("                    <div class=\"body-page-part-3-side-container\">\n");
      out.write("                        <img src=\"../Images/level_4.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"hype-access\">\n");
      out.write("                            <h4>RUNTASTIC PREMIUM</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"your-task\">LEVEL 4 / ICON: Personalized training apps and nutrition plans</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"body-page-part-3-side\">\n");
      out.write("                    <div class=\"body-page-part-3-side-container\">\n");
      out.write("                        <img src=\"../Images/level_5.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"hype-access\">\n");
      out.write("                            <h4>SPECIAL EVENTS</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"your-task\">LEVEL 5 / ICON: Invitations to our most exclusive parties and events</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part-4\">\n");
      out.write("                <div class=\"body-page-part-4-container\">\n");
      out.write("                    <div class=\"body-page-part-4-1\">\n");
      out.write("                        <div>\n");
      out.write("                            <img src=\"../Images/level_creators.jpg\" alt=\"\"/>                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"body-page-part-4-2\">\n");
      out.write("                        <div class=\"body-page-part-4-2-container\">\n");
      out.write("                            <h1>THE LEVELS</h1>\n");
      out.write("                            <p>Ready to create at a higher level? Earn points. Level up. Unlock bigger and better rewards.</p>\n");
      out.write("                            <div class=\"level-of-club\">\n");
      out.write("                                <button type=\"button\" class=\"learn-more\">\n");
      out.write("                                        <div class=\"learn-more-text\">\n");
      out.write("                                            <span>LEARN MORE</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"button\" class=\"join-the-club\">\n");
      out.write("                                        <div class=\"learn-more-text\">\n");
      out.write("                                            <span>JOIN THE CLUB</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                        \n");
      out.write("                    </div>                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part-5\">\n");
      out.write("                <div class=\"body-page-part-5-container\">\n");
      out.write("                    <div class=\"body-page-part-5-2\">\n");
      out.write("                        <div>\n");
      out.write("                            <img src=\"../Images/download_app.jpg\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
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
      out.write("        </div>        \n");
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
