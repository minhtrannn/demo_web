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
      out.write("        <link href=\"CSS/CSS_Home_Page/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/CSS_Home_Page/body-page.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/CSS_Home_Page/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
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
      out.write("        </div>\n");
      out.write("        <div class=\"body-page\">\n");
      out.write("            <div class=\"body-page-part1\">\n");
      out.write("                <div class=\"video-content\">\n");
      out.write("                    <video loop autoplay muted playsinline>\n");
      out.write("                        <source src=\"Videos/Video_page_1.mp4\" type=\"video/mp4\">\n");
      out.write("                        Your browser does not support the <code>video</code> tag.\n");
      out.write("                    </video>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"poster-content\">\n");
      out.write("                    <h1>BLACK FRIDAY - UP TO 50% OFF</h1>\n");
      out.write("                    <div class=\"poster-content-introduce\">Save big on gifts for everyone on your list. Ends 11/30.</div>\n");
      out.write("                    <div class=\"poster-content-signup\">\n");
      out.write("                        <a id=\"sign_up\" onclick=\"SignUp()\">\n");
      out.write("                            <span class=\"sign-up-now\">SIGN UP NOW</span>\n");
      out.write("                            <svg style=\"padding:12px;width:25px;height:25px\"xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"/></svg>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part2\">\n");
      out.write("                <div class=\"body-page-part2-contain\">\n");
      out.write("                    <div class=\"type-discount\">\n");
      out.write("                        <img src=\"Images/sneak_discount.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"type-discount-content\">\n");
      out.write("                            <span style=\"padding:2px\">SHOP NOW</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"type-discount\">\n");
      out.write("                        <img src=\"Images/gift_discount.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"type-discount-content\">\n");
      out.write("                            <span style=\"padding:2px\">SHOP NOW</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"type-discount\">\n");
      out.write("                        <img src=\"Images/gift_discount.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"type-discount-content\">\n");
      out.write("                            <span style=\"padding:2px\">SHOP NOW</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("\n");
      out.write("                    <div class=\"type-discount\">\n");
      out.write("                        <img src=\"Images/gift_discount.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"type-discount-content\">\n");
      out.write("                            <span style=\"padding:2px\">SHOP NOW</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part3\">\n");
      out.write("                <div class=\"body-page-part3-contain\">\n");
      out.write("                    <div class=\"body-page-part3-chapter\">\n");
      out.write("                        <img src=\"Images/deal_for_kids.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"chapter-content\">\n");
      out.write("                            <div class=\"chapter-content-start\">\n");
      out.write("                                <h2>DEALS FOR KIDS</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Up to 50% off</span>   \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shopping-now\">\n");
      out.write("                                <button title=\"shopping-now\" type=\"button\">\n");
      out.write("                                    <span class=\"click-shopping-now\">SHOP NOW</span>\n");
      out.write("                                    <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"body-page-part3-chapter\">\n");
      out.write("                        <img src=\"Images/gift_for_all.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"chapter-content\">\n");
      out.write("                            <div class=\"chapter-content-start\">\n");
      out.write("                                <h2>GIFTS FOR ALL</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Find the ideal gift in preparation for the upcoming gifting season.</span>   \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shopping-now\">\n");
      out.write("                                <button title=\"shopping-now\" type=\"button\">\n");
      out.write("                                    <span class=\"click-shopping-now\">SHOP NOW</span>\n");
      out.write("                                    <svg style=\"padding:12px;width:25px;height:25px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"long-arrow-alt-right\" class=\"svg-inline--fa fa-long-arrow-alt-right fa-w-14\" role=\"img\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z\"></path></svg>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part4\">\n");
      out.write("                <div class=\"body-page-part4-contain\">\n");
      out.write("                    <h4>WHAT'S TRENDING</h4>\n");
      out.write("                    <div class=\"shoe-trending-contain\">\n");
      out.write("                        <div class=\"shoe-trending\">\n");
      out.write("                            <div class=\"shoe-trending-exclusive\">Exclusive</div>\n");
      out.write("                            <div class=\"shoe-trending-like\">\n");
      out.write("                                <svg style=\"width: 18px;height: 20px;margin-right: 15px;margin-top: 10px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"far\" data-icon=\"heart\" class=\"svg-inline--fa fa-heart fa-w-16\" role=\"img\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z\"/></svg>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shoe-trending-image\">\n");
      out.write("                                <img src=\"Images/shoe-trending-1.jpg\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shoe-trending-content\">\n");
      out.write("                                <div class=\"typeof-shoe-trending\">Originals</div>\n");
      out.write("                                <div class=\"costof-shoe-trending\">\n");
      out.write("                                    <div>NMD_R1 SHOES</div>\n");
      out.write("                                    <div>$ 130</div>\n");
      out.write("                                </div>                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"shoe-trending\">\n");
      out.write("                            <div class=\"shoe-trending-image\">\n");
      out.write("                                <div class=\"shoe-trending-like\">\n");
      out.write("                                    <svg style=\"width: 18px;height: 20px;margin-right: 15px;margin-top: 10px\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"far\" data-icon=\"heart\" class=\"svg-inline--fa fa-heart fa-w-16\" role=\"img\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z\"/></svg>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"Images/shoe-trending-2.jpg\" alt=\"\"/>\n");
      out.write("                                 <div class=\"shoe-trending-content\">\n");
      out.write("                                    <div class=\"typeof-shoe-trending\">Originals</div>\n");
      out.write("                                    <div class=\"costof-shoe-trending\">\n");
      out.write("                                        <div>NMD_R1 SHOES</div>\n");
      out.write("                                        <div>$ 130</div>                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"shoe-trending\">\n");
      out.write("                            <div class=\"shoe-trending-exclusive\">Exclusive</div>\n");
      out.write("                            <div class=\"shoe-trending-like\">\n");
      out.write("                                <svg style=\"width: 18px;height: 20px;margin-right: 15px;margin-top: 10px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"far\" data-icon=\"heart\" class=\"svg-inline--fa fa-heart fa-w-16\" role=\"img\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z\"/></svg>\n");
      out.write("                            </div>                            \n");
      out.write("                            <div class=\"shoe-trending-image\">\n");
      out.write("                                <img src=\"Images/shoe-trending-3.jpg\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shoe-trending-content\">\n");
      out.write("                                <div class=\"typeof-shoe-trending\">Originals</div>   \n");
      out.write("                                <div class=\"costof-shoe-trending\">\n");
      out.write("                                    <div>NMD_R1 SHOES</div>\n");
      out.write("                                    <div>$ 130</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"shoe-trending\">\n");
      out.write("                            <div class=\"shoe-trending-like\">\n");
      out.write("                                <svg style=\"width: 18px;height: 20px;margin-right: 15px;margin-top: 10px;\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" focusable=\"false\" data-prefix=\"far\" data-icon=\"heart\" class=\"svg-inline--fa fa-heart fa-w-16\" role=\"img\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z\"/></svg>\n");
      out.write("                            </div>                             \n");
      out.write("                            <div class=\"shoe-trending-image\">\n");
      out.write("                                <img src=\"Images/shoe-trending-5.jpg\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shoe-trending-content\">\n");
      out.write("                                <div class=\"typeof-shoe-trending\">Originals</div>                                \n");
      out.write("                                <div class=\"costof-shoe-trending\">\n");
      out.write("                                    <div>NMD_R1 SHOES</div>\n");
      out.write("                                    <div>$ 130</div>\n");
      out.write("                                </div>                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pagination-contain\">\n");
      out.write("                        <div class=\"pagination-item-1\"></div>\n");
      out.write("                        <div class=\"pagination-item\"></div>\n");
      out.write("                        <div class=\"pagination-item\"></div>\n");
      out.write("                        <div class=\"pagination-item\"></div>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-page-part-5\">\n");
      out.write("                <div class=\"body-page-part-5-container\">\n");
      out.write("                    <article class=\"body-page-part-5-article1\">\n");
      out.write("                        <h2>STORIES, STYLE, AND SPORTING GOODS AT GLAZERR, SINCE 1949</h2>\n");
      out.write("                        <p>Through sports, we have the power to change lives. Sports keep us fit. They keep us mindful. They bring us together. Athletes inspire us. They help us to get up and get moving. And sporting goods featuring the latest technologies help us beat our personal best. Glazerr is home to the runner, the basketball player, the soccer kid, the fitness enthusiast, the yogi. And even the weekend hiker looking to escape the city. The 3-Stripes are everywhere and anywhere. In sports. In music. On life’s stages. Before the whistle blows, during the race, and at the finish line. We’re here to support creators. To improve their game. To live their lives. And to change the world.</p>\n");
      out.write("                    </article>\n");
      out.write("                    <article class=\"body-page-part-5-article2\">\n");
      out.write("                        <h2>WORKOUT CLOTHES, FOR ANY SPORT</h2>\n");
      out.write("                        <p>Glazerr designs for athletes of all kinds. Creators who love to change the game. People who challenge conventions, break the rules, and define new ones. Then break them all over again. We design sports apparel that gets you moving, winning, and living life to the fullest. We create bras and tights for female athletes who play just as hard as the men. We design, innovate and iterate. We test new technologies in action. On the field, the track, the court, and in the pool. We’re inspired by retro workout clothes, creating new streetwear essentials. From NMD to our Firebird tracksuits. From Stan Smith to Superstar. Classic sports models are brought back to life on the streets and the stages around the world.</p>\n");
      out.write("                    </article>\n");
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
      out.write("    <script src=\"Javascript/homepage.js\" type=\"text/javascript\"></script>\n");
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
