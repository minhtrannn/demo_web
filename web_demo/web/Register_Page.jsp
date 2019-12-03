<%-- 
    Document   : Register_Page
    Created on : Dec 1, 2019, 10:50:59 PM
    Author     : minhm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/CSS_Home_Page/header.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/CSS_Register_Page/header-promotion.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/CSS_Home_Page/footer.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/CSS_Register_Page/body-register-page.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header" >
            <div class="header-top">
                <div class="header-top-inner">
                    <a>HELP</a>
                    <div class="menu-space"></div>
                    <a>ORDERS TRACKER OR RETURNS</a>
                    <div class="menu-space"></div>
                    <a>JOIN CREATORS CLUB</a>
                    <div class="menu-space"></div>
                    <a>LOGIN</a>
                    <div class="menu-space"></div>
                    <svg style="cursor:pointer;padding-left:10px;padding-top:5px;width: 20px;height:20px;color:white;" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="user" class="svg-inline--fa fa-user fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M224 256c70.7 0 128-57.3 128-128S294.7 0 224 0 96 57.3 96 128s57.3 128 128 128zm89.6 32h-16.7c-22.2 10.2-46.9 16-72.9 16s-50.6-5.8-72.9-16h-16.7C60.2 288 0 348.2 0 422.4V464c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48v-41.6c0-74.2-60.2-134.4-134.4-134.4z"/></svg>
                </div>
            </div>
            <div class="header-bottom">
                <div class="header-bottom-inner">
                    <svg id="icon_brand" onclick="myFunction()" style="cursor:pointer;bottom:20px;position: relative;color:white;height:40px;width:75px" aria-hidden="true" focusable="false" data-prefix="fab" data-icon="atlassian" class="svg-inline--fa fa-atlassian fa-w-16" role="img" xmlns="http://w...content-available-to-author-only...3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M152.2 236.4c-7.7-8.2-19.7-7.7-24.8 2.8L1.6 490.2c-5 10 2.4 21.7 13.4 21.7h175c5.8.1 11-3.2 13.4-8.4 37.9-77.8 15.1-196.3-51.2-267.1zM244.4 8.1c-122.3 193.4-8.5 348.6 65 495.5 2.5 5.1 7.7 8.4 13.4 8.4H497c11.2 0 18.4-11.8 13.4-21.7 0 0-234.5-470.6-240.4-482.3-5.3-10.6-18.8-10.8-25.6.1z"></path></svg>
                    <span class="brand-name">GLAZERR</span>
                    <div class="header-bottom-inner-inside">
                        <div>
                            <div class="menu-item">
                                <a>MEN</a>
                            </div> 
                        </div>
                        <div class="menu-item-space"></div>
                        <div>
                            <div class="menu-item" >
                                <a>WOMEN</a>    
                            </div>                            
                        </div>
                        <div class="menu-item-space"></div>    
                        <div>
                            <div class="menu-item">
                               <a>KIDS</a>
                            </div>                           
                        </div>
                        <div class="menu-item-space"></div>      
                        <div>
                            <div class="menu-item">
                               <a>SPORT</a>   
                            </div>                            
                        </div>
                        <div class="menu-item-space"></div>
                        <div>
                            <div class="menu-item">
                               <a>BRAND</a>
                            </div>                             
                        </div>               
                    </div>
                    <div class="header-bottom-inner-search">
                        <div class="search-icon">
                           <svg style="cursor:pointer;width:15px;height:15px;color:black;"xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="search" class="svg-inline--fa fa-search fa-w-16" role="img" viewBox="0 0 512 512"><path fill="currentColor" d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"/></svg>                            
                        </div>
                        <form class="search-input" method="POST">
                            <input type="text" placeholder="Search" aria-label="search"></input>
                        </form>
                    </div>
                    <div class="cart-icon">
                        <svg style="height: 25px;width:25px;"xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="shopping-cart" class="svg-inline--fa fa-shopping-cart fa-w-18" role="img" viewBox="0 0 576 512"><path fill="currentColor" d="M528.12 301.319l47.273-208C578.806 78.301 567.391 64 551.99 64H159.208l-9.166-44.81C147.758 8.021 137.93 0 126.529 0H24C10.745 0 0 10.745 0 24v16c0 13.255 10.745 24 24 24h69.883l70.248 343.435C147.325 417.1 136 435.222 136 456c0 30.928 25.072 56 56 56s56-25.072 56-56c0-15.674-6.447-29.835-16.824-40h209.647C430.447 426.165 424 440.326 424 456c0 30.928 25.072 56 56 56s56-25.072 56-56c0-22.172-12.888-41.332-31.579-50.405l5.517-24.276c3.413-15.018-8.002-29.319-23.403-29.319H218.117l-6.545-32h293.145c11.206 0 20.92-7.754 23.403-18.681z"/></svg>
                        <span class="cart-remain">YOUR BAG IS EMPTY</span>
                    </div>
                </div>
            </div>
            
        </div>    
        <div class="header-promotion">
            <div class="header-promotion-contain">
                <div class="header-promotion-item">
                    30% OFF CYBER MONDAY - USE CODE: CYBER
                </div>
                <div class="header-promotion-item">
                   <svg style="width: 15px;height: 15px;margin-right: 5px;" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="shipping-fast" class="svg-inline--fa fa-shipping-fast fa-w-20" role="img" viewBox="0 0 640 512"><path fill="currentColor" d="M624 352h-16V243.9c0-12.7-5.1-24.9-14.1-33.9L494 110.1c-9-9-21.2-14.1-33.9-14.1H416V48c0-26.5-21.5-48-48-48H112C85.5 0 64 21.5 64 48v48H8c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8h272c4.4 0 8 3.6 8 8v16c0 4.4-3.6 8-8 8H40c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8h208c4.4 0 8 3.6 8 8v16c0 4.4-3.6 8-8 8H8c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8h208c4.4 0 8 3.6 8 8v16c0 4.4-3.6 8-8 8H64v128c0 53 43 96 96 96s96-43 96-96h128c0 53 43 96 96 96s96-43 96-96h48c8.8 0 16-7.2 16-16v-32c0-8.8-7.2-16-16-16zM160 464c-26.5 0-48-21.5-48-48s21.5-48 48-48 48 21.5 48 48-21.5 48-48 48zm320 0c-26.5 0-48-21.5-48-48s21.5-48 48-48 48 21.5 48 48-21.5 48-48 48zm80-208H416V144h44.1l99.9 99.9V256z"/></svg> 
                   <div>
                        FREE SHIPPING OVER $49 AND FREE RETURNS
                    </div>
                </div>
                <div class="header-promotion-item">
                  <svg style="width: 15px;height: 15px;margin-right: 5px;" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="far" data-icon="id-card" class="svg-inline--fa fa-id-card fa-w-18" role="img" viewBox="0 0 576 512"><path fill="currentColor" d="M528 32H48C21.5 32 0 53.5 0 80v352c0 26.5 21.5 48 48 48h480c26.5 0 48-21.5 48-48V80c0-26.5-21.5-48-48-48zm0 400H303.2c.9-4.5.8 3.6.8-22.4 0-31.8-30.1-57.6-67.2-57.6-10.8 0-18.7 8-44.8 8-26.9 0-33.4-8-44.8-8-37.1 0-67.2 25.8-67.2 57.6 0 26-.2 17.9.8 22.4H48V144h480v288zm-168-80h112c4.4 0 8-3.6 8-8v-16c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8zm0-64h112c4.4 0 8-3.6 8-8v-16c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8zm0-64h112c4.4 0 8-3.6 8-8v-16c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v16c0 4.4 3.6 8 8 8zm-168 96c35.3 0 64-28.7 64-64s-28.7-64-64-64-64 28.7-64 64 28.7 64 64 64z"/></svg>  
                  <div>
                      JOIN THE ADIDAS CREATORS CLUB
                  </div>
                </div>
            </div>
        </div>
        <div class="body-register-page">
            <div class="register-part-1">
                <div class="register-part-1-contain">
                    <div class="logo-register">
                        <h2>REGISTER</h2>
                    </div>
                    <form class="form-register">
                        <h5>YOUR NAME</h5>
                        <div class="form-register-input">
                            <input placeholder="NAME" name="firstName" required type="text"></input>       
                        </div>
                        <div class="form-register-input">
                            <input placeholder="LAST NAME" name="lastName" required type="text"></input>       
                        </div>
                        <h5>EMAIL</h5>
                        <div class="form-register-input">
                            <input placeholder="EMAIL" name="email" required type="text"></input>       
                        </div>
                        <h5>LOGIN DETAIL</h5>
                        <div class="form-register-input">
                            <input placeholder="USERNAME" name="username" required type="text"></input>       
                        </div>
                        <div class="form-register-input">
                            <input placeholder="PASSWORD" name="password" required type="text"></input>       
                        </div>        
                        <button class="register-now" type="submit" aria-label="Register">
                            <div>
                                <span>REGISTER</span>
                            </div>
                            <svg style="padding:12px;width:25px;height:25px;color:white;" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                        </button>
                    </form>
                </div>
            </div>
            <div class="register-part-2">
                <div class="register-part-2-contain">
                    <div class="logo-register">
                        <h2>REGISTER AND JOIN THE GLAZERR CREATORS CLUB</h2> 
                    </div>
                    <div>
                        <p>Create an account with Glazerr :</p>
                        <ul>
                            <li class="benefit-register">
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>
                                Earn easy points for exclusive rewards
                            </li>
                            <li class="benefit-register">
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>                                
                                Access the best special offers and promotions
                            </li>
                            <li class="benefit-register">
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>
                                Receive invites to exclusive events
                            </li>
                            <li class="benefit-register">
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>
                                Get access to limited edition products
                            </li>
                            <li class="benefit-register">  
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>                                
                                Level up for a Runtastic Premium subscription
                            </li>
                            <li class="benefit-register"> 
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>                                
                                Faster checkout with your saved address and payment details
                            </li>
                            <li class="benefit-register">
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>                                
                                Access your complete order history
                            </li>
                            <li class="benefit-register">
                                <svg style="width: 20px;height: 20px;margin-right: 10px;"xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M0 0h24v24H0z" fill="none"/><path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/></svg>                                
                                Track your order delivery
                            </li>
                        </ul>
                        <div>Want to learn more about the Creators Club? </div>
                        <a class="information-register">Read more about free membership</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-page">
            <div class="sign-up-footer">
                <div class="sign-up-footer-contain">
                    <div class="sign-up-footer-content">
                        <span>JOIN CREATORS CLUB & GET 15% DISCOUNT</span>
                    </div>
                    <div class="sign-up-footer-button">
                        <button title="signup-now" type="button">
                                    <span class="click-shopping-now">SIGN UP</span>
                                    <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                        </button>
                    </div>
                </div>
            </div>
            <div class="footer-content">
                <ul class="footer-content-trending" style="list-style: none;">
                    <li>
                        <h3 style="margin-bottom:25px;font-size: 20px;color:black;">TRENDING</h3>
                    </li>
                    <li>
                        Black Friday
                    </li>
                    <li>
                        Cyber Monday
                    </li>
                    <li>
                        Casual Shoes
                    </li>
                    <li>
                        Slip On Shoes
                    </li>
                    <li>
                        Camo Clothing
                    </li>
                    <li>
                        Burgundy Shoes
                    </li>
                    <li>
                        Leather Sneaker
                    </li>
                    
                </ul>
                <ul class="footer-content-trending" style="list-style: none;">
                    <li>
                        <h3 style="margin-bottom:25px;font-size: 20px;color:black;">CUSTOMER REPORT</h3>
                    </li>
                    <li>
                        Get Help
                    </li>
                    <li>
                        Track Order
                    </li>
                    <li>
                        Returns & Refunds
                    </li>
                    <li>
                        Sizing
                    </li>
                    <li>
                        Promotion
                    </li>
                    <li>
                        How to clean
                    </li>
                    <li>
                        Store Locator
                    </li>
                    <li>
                        Site Map
                    </li>
                </ul>
                <ul class="footer-content-trending" style="list-style: none;">
                    <li>
                        <h3 style="margin-bottom:25px;font-size: 20px;color:black;">COMPANY INFO</h3>
                    </li>
                    <li>
                        About Us
                    </li>
                    <li>
                        Careers
                    </li>
                    <li>
                        Press
                    </li>
                    <li>
                        Affiliates
                    </li>
                    <li>
                        Military Discount
                    </li>
                    <li>
                        Student Discount
                    </li>
                    <li>
                        Mobile Apps
                    </li>
                    <li>
                        Creators Club
                    </li>
                    <li>
                        Glazerr Stories
                    </li>
                </ul>
                <ul class="footer-content-trending" style="list-style: none;">
                    <li>
                        <h3 style="margin-bottom:25px;font-size: 20px;color:black;">PARTNER SITES</h3>
                    </li>
                    <li>
                        Glazer Outdoor
                    </li>
                    <li>
                        <h3 style="margin-bottom:25px;font-size: 20px;color:black;">PRIVACY & TERMS</h3>
                    </li>
                    <li>
                        Privacy & Security
                    </li>
                    <li>
                        Glazer - Runtastic Privacy
                    </li>
                    <li>
                        Statement
                    </li>
                    <li>
                        Terms and condition
                    </li>
                    <li>
                        Policy on Human Trafficking
                    </li>
                </ul>   
                <ul class="footer-content-trending" style="list-style: none;">
                    <li>
                        <h3 style="margin-bottom:25px;font-size: 20px;color:black;">GIFT CARDS</h3>
                    </li>
                    <li>
                        Check Balance
                    </li>
                </ul>
            </div>
            <div class="footer-information">
                <div class="footer-information-contain">
                    <div class="vietnam-flag">
                        <img src="Images/2000px-Flag_of_Vietnam.svg.jpg" alt=""/>
                    </div>
                    <div class="vietnam">VietNam</div>
                    <div class="privacy-term">
                        <div class="menu-space-footer"></div>
                        <div class="privacy-policy">
                            Privacy Policy
                        </div>
                        <div class="menu-space-footer"></div>
                        <div class="term-condition">Terms and Conditions</div>
                        <div class="menu-space-footer"></div>
                        <div>© 2019 Glazerr VietNam Inc.</div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
