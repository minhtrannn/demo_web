<%-- 
    Document   : Home_Page
    Created on : Nov 17, 2019, 4:15:25 PM
    Author     : minhm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../CSS/CSS_Home_Page/body-page.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/CSS_Home_Page/footer.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/CSS_Home_Page/header.css" rel="stylesheet" type="text/css"/>
        
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
        <div class="body-page">
            <div class="body-page-part1">
                <div class="video-content">
                    <video loop autoplay muted playsinline>
                        <source src="../Videos/Video_page_1.mp4" type="video/mp4">
                        Your browser does not support the <code>video</code> tag.
                    </video>
                </div>
                <div class="poster-content">
                    <h1>BLACK FRIDAY - UP TO 50% OFF</h1>
                    <div class="poster-content-introduce">Save big on gifts for everyone on your list. Ends 11/30.</div>
                    <div class="poster-content-signup">
                        <a id="sign_up" onclick="SignUp()">
                            <span class="sign-up-now">SIGN UP NOW</span>
                            <svg style="padding:12px;width:25px;height:25px"xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"/></svg>
                        </a>
                    </div>
                </div>
            </div>
            <div class="body-page-part2">
                <div class="body-page-part2-contain">
                    <div class="type-discount">
                        <img src="../Images/sneak_discount.jpg" alt=""/>
                        <div class="type-discount-content">
                            <span style="padding:2px">SHOP NOW</span>
                        </div>
                    </div>
                    
                    <div class="type-discount">
                        <img src="../Images/gift_discount.jpg" alt=""/>
                        <div class="type-discount-content">
                            <span style="padding:2px">SHOP NOW</span>
                        </div>
                    </div>
                    
                    <div class="type-discount">
                        <img src="../Images/gift_discount.jpg" alt=""/>
                        <div class="type-discount-content">
                            <span style="padding:2px">SHOP NOW</span>
                        </div>
                    </div>    

                    <div class="type-discount">
                        <img src="../Images/gift_discount.jpg" alt=""/>
                        <div class="type-discount-content">
                            <span style="padding:2px">SHOP NOW</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="body-page-part3">
                <div class="body-page-part3-contain">
                    <div class="body-page-part3-chapter">
                        <img src="../Images/deal_for_kids.jpg" alt=""/>
                        <div class="chapter-content">
                            <div class="chapter-content-start">
                                <h2>DEALS FOR KIDS</h2>
                            </div>
                            <div>
                                <span>Up to 50% off</span>   
                            </div>
                            <div class="shopping-now">
                                <button title="shopping-now" type="button">
                                    <span class="click-shopping-now">SHOP NOW</span>
                                    <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="body-page-part3-chapter">
                        <img src="../Images/gift_for_all.jpg" alt=""/>
                        <div class="chapter-content">
                            <div class="chapter-content-start">
                                <h2>GIFTS FOR ALL</h2>
                            </div>
                            <div>
                                <span>Find the ideal gift in preparation for the upcoming gifting season.</span>   
                            </div>
                            <div class="shopping-now">
                                <button title="shopping-now" type="button">
                                    <span class="click-shopping-now">SHOP NOW</span>
                                    <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="body-page-part4">
                <div class="body-page-part4-contain">
                    <h4>WHAT'S TRENDING</h4>
                    <div class="shoe-trending-contain">
                        <div class="shoe-trending">
                            <div class="shoe-trending-exclusive">Exclusive</div>
                            <div class="shoe-trending-like">
                                <svg style="width: 18px;height: 20px;margin-right: 15px;margin-top: 10px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="far" data-icon="heart" class="svg-inline--fa fa-heart fa-w-16" role="img" viewBox="0 0 512 512"><path fill="currentColor" d="M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z"/></svg>
                            </div>
                            <div class="shoe-trending-image">
                                <img src="../Images/shoe-trending-1.jpg" alt=""/>
                            </div>
                            <div class="shoe-trending-content">
                                <div class="typeof-shoe-trending">Originals</div>
                                <div class="costof-shoe-trending">
                                    <div>NMD_R1 SHOES</div>
                                    <div>$ 130</div>
                                </div>                               
                            </div>
                        </div>
                        <div class="shoe-trending">
                            <div class="shoe-trending-image">
                                <div class="shoe-trending-like">
                                    <svg style="width: 18px;height: 20px;margin-right: 15px;margin-top: 10px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="far" data-icon="heart" class="svg-inline--fa fa-heart fa-w-16" role="img" viewBox="0 0 512 512"><path fill="currentColor" d="M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z"/></svg>
                                </div>
                                <img src="../Images/shoe-trending-2.jpg" alt=""/>
                                 <div class="shoe-trending-content">
                                    <div class="typeof-shoe-trending">Originals</div>
                                    <div class="costof-shoe-trending">
                                        <div>NMD_R1 SHOES</div>
                                        <div>$ 130</div>                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="shoe-trending">
                            <div class="shoe-trending-exclusive">Exclusive</div>
                            <div class="shoe-trending-like">
                                <svg style="width: 18px;height: 20px;margin-right: 15px;margin-top: 10px;" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="far" data-icon="heart" class="svg-inline--fa fa-heart fa-w-16" role="img" viewBox="0 0 512 512"><path fill="currentColor" d="M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z"/></svg>
                            </div>                            
                            <div class="shoe-trending-image">
                                <img src="../Images/shoe-trending-3.jpg" alt=""/>
                            </div>
                            <div class="shoe-trending-content">
                                <div class="typeof-shoe-trending">Originals</div>   
                                <div class="costof-shoe-trending">
                                    <div>NMD_R1 SHOES</div>
                                    <div>$ 130</div>
                                </div>
                            </div>
                        </div>
                        <div class="shoe-trending">
                            <div class="shoe-trending-like">
                                <svg style="width: 18px;height: 20px;margin-right: 15px;margin-top: 10px;" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="far" data-icon="heart" class="svg-inline--fa fa-heart fa-w-16" role="img" viewBox="0 0 512 512"><path fill="currentColor" d="M458.4 64.3C400.6 15.7 311.3 23 256 79.3 200.7 23 111.4 15.6 53.6 64.3-21.6 127.6-10.6 230.8 43 285.5l175.4 178.7c10 10.2 23.4 15.9 37.6 15.9 14.3 0 27.6-5.6 37.6-15.8L469 285.6c53.5-54.7 64.7-157.9-10.6-221.3zm-23.6 187.5L259.4 430.5c-2.4 2.4-4.4 2.4-6.8 0L77.2 251.8c-36.5-37.2-43.9-107.6 7.3-150.7 38.9-32.7 98.9-27.8 136.5 10.5l35 35.7 35-35.7c37.8-38.5 97.8-43.2 136.5-10.6 51.1 43.1 43.5 113.9 7.3 150.8z"/></svg>
                            </div>                             
                            <div class="shoe-trending-image">
                                <img src="../Images/shoe-trending-5.jpg" alt=""/>
                            </div>
                            <div class="shoe-trending-content">
                                <div class="typeof-shoe-trending">Originals</div>                                
                                <div class="costof-shoe-trending">
                                    <div>NMD_R1 SHOES</div>
                                    <div>$ 130</div>
                                </div>                            
                            </div>
                        </div>
                    </div>
                    <div class="pagination-contain">
                        <div class="pagination-item-1"></div>
                        <div class="pagination-item"></div>
                        <div class="pagination-item"></div>
                        <div class="pagination-item"></div>                        
                    </div>
                </div>
            </div>
            <div class="body-page-part-5">
                <div class="body-page-part-5-container">
                    <article class="body-page-part-5-article1">
                        <h2>STORIES, STYLE, AND SPORTING GOODS AT GLAZERR, SINCE 1949</h2>
                        <p>Through sports, we have the power to change lives. Sports keep us fit. They keep us mindful. They bring us together. Athletes inspire us. They help us to get up and get moving. And sporting goods featuring the latest technologies help us beat our personal best. Glazerr is home to the runner, the basketball player, the soccer kid, the fitness enthusiast, the yogi. And even the weekend hiker looking to escape the city. The 3-Stripes are everywhere and anywhere. In sports. In music. On life’s stages. Before the whistle blows, during the race, and at the finish line. We’re here to support creators. To improve their game. To live their lives. And to change the world.</p>
                    </article>
                    <article class="body-page-part-5-article2">
                        <h2>WORKOUT CLOTHES, FOR ANY SPORT</h2>
                        <p>Glazerr designs for athletes of all kinds. Creators who love to change the game. People who challenge conventions, break the rules, and define new ones. Then break them all over again. We design sports apparel that gets you moving, winning, and living life to the fullest. We create bras and tights for female athletes who play just as hard as the men. We design, innovate and iterate. We test new technologies in action. On the field, the track, the court, and in the pool. We’re inspired by retro workout clothes, creating new streetwear essentials. From NMD to our Firebird tracksuits. From Stan Smith to Superstar. Classic sports models are brought back to life on the streets and the stages around the world.</p>
                    </article>
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
    <script src="../Javascript/js_home_page/homePage.js" type="text/javascript"></script>
</html>
