<%-- 
    Document   : CreatorsClub_Page
    Created on : Dec 4, 2019, 2:57:20 PM
    Author     : minhm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../CSS/CSS_Home_Page/header.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/CSS_Home_Page/footer.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/CSS_CreatorsClub_Page/body_CreatorsClub_page.css" rel="stylesheet" type="text/css"/>
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
            <div class="body-page-part-1">
                <div class="body-page-part-1-container">
                    <div class="body-page-part-1-1">
                        <div class="body-page-part-1-1-container">
                            <h1>CREATORS GET REWARDED</h1>
                            <p>The glazerr Creators Club, a membership program for true creators united as one. Join now to get inside and unlock the best of adidas. It's easy. It's free. It's time to create.</p>
                            <div>
                                <button type="button" class="join-the-club">
                                        <div class="join-the-club-text">
                                            <span>JOIN THE CLUB</span>
                                        </div>
                                        <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                                </button>
                                <button type="button" class="existing-user-login">
                                        <div class="existing-user-login-text">
                                            <span>EXISTING USER LOGIN</span>
                                        </div>
                                        <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="body-page-part-1-2">
                        <div class="body-page-part-1-2-container">
                            <img src="../Images/creators-get-reward.jpg" alt=""/>                            
                        </div>
                    </div>
                </div>
            </div>
            <div class="body-page-part-2">
                <div>INSIDE THIS CLUB, KICK OFF MEMBERSHIP AS A CHALLENGER. RISE THROUGH THE RANKS TO PLAYMAKER, GAME CHANGER & ICON. UNLOCK NEW REWARDS AT EACH STAGE. SOUNDS GOOD? IT GETS BETTER.</div>
            </div>
            <div class="body-page-part-3">
                <div class="body-page-part-3-side">
                    <div class="body-page-part-3-side-container">
                        <h3>THE REWARD</h4>
                        <img src="../Images/level_1.jpg" alt=""/>
                        <div class="hype-access">
                            <h4>HYPE ACCESS</h5>
                        </div>
                        <div class="your-task">LEVEL 1 / CHALLENGER: Access to limited edition adidas shoes and apparel</div>
                    </div>
                </div>
                <div class="body-page-part-3-side">
                    <div class="body-page-part-3-side-container">
                        <img src="../Images/level_2.jpg" alt=""/>
                        <div class="hype-access">
                            <h4>CREATORS CLUB EXCLUSIVES</h5>
                        </div>
                        <div class="your-task">LEVEL 2 / PLAYMAKER: Member only access to special products created with or for you.</div>
                    </div>
                </div>
                <div class="body-page-part-3-side">
                    <div class="body-page-part-3-side-container">
                        <img src="../Images/level_3.jpg" alt=""/>
                        <div class="hype-access">
                            <h4>EARLY ACCESS</h5>
                        </div>
                        <div class="your-task">LEVEL 3 / GAMECHANGER: Access to sneaker and apparel drops before everyone else</div>
                    </div>
                </div>    
                <div class="body-page-part-3-side">
                    <div class="body-page-part-3-side-container">
                        <img src="../Images/level_4.jpg" alt=""/>
                        <div class="hype-access">
                            <h4>RUNTASTIC PREMIUM</h5>
                        </div>
                        <div class="your-task">LEVEL 4 / ICON: Personalized training apps and nutrition plans</div>
                    </div>
                </div>  
                <div class="body-page-part-3-side">
                    <div class="body-page-part-3-side-container">
                        <img src="../Images/level_5.jpg" alt=""/>
                        <div class="hype-access">
                            <h4>SPECIAL EVENTS</h5>
                        </div>
                        <div class="your-task">LEVEL 5 / ICON: Invitations to our most exclusive parties and events</div>
                    </div>
                </div>                  
            </div>
            <div class="body-page-part-4">
                <div class="body-page-part-4-container">
                    <div class="body-page-part-4-1">
                        <div>
                            <img src="../Images/level_creators.jpg" alt=""/>                           
                        </div>
                    </div>   
                    <div class="body-page-part-4-2">
                        <div class="body-page-part-4-2-container">
                            <h1>THE LEVELS</h1>
                            <p>Ready to create at a higher level? Earn points. Level up. Unlock bigger and better rewards.</p>
                            <div class="level-of-club">
                                <button type="button" class="learn-more">
                                        <div class="learn-more-text">
                                            <span>LEARN MORE</span>
                                        </div>
                                        <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                                </button>
                                <button type="button" class="join-the-club">
                                        <div class="learn-more-text">
                                            <span>JOIN THE CLUB</span>
                                        </div>
                                        <svg style="padding:12px;width:25px;height:25px" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="long-arrow-alt-right" class="svg-inline--fa fa-long-arrow-alt-right fa-w-14" role="img" viewBox="0 0 448 512"><path fill="currentColor" d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>
                                </button>
                            </div>
                        </div>                        
                    </div>                    
                </div>
                
            </div>
            <div class="body-page-part-5">
                <div class="body-page-part-5-container">
                    <div class="body-page-part-5-1">
                        <div>
                            <img src="../Images/download_app.jpg" alt=""/>
                        </div>
                    </div> 
                    <div class="body-page-part-5-2">
                        <div class="body-page-part-5-2-container">
                            <h1>CREATE ON THE GO</h1>
                            <p>Earn easy points. See all rewards. Get the glazerr app for the full experience. Wherever you are, whenever you want.</p>
                            <div class="store-container">
                                <a href="https://www.apple.com/ios/app-store/" target="_blank">
                                    <svg xmlns="http://www.w3.org/2000/svg" id="livetype" width="175px" height="52px" style="margin-left: -12px;" viewBox="0 0 119.66407 40">
                                    <title>Download_on_the_App_Store_Badge_US-UK_RGB_blk_4SVG_092917</title>
                                    <g>
                                      <g>
                                        <g>
                                          <path d="M110.13477,0H9.53468c-.3667,0-.729,0-1.09473.002-.30615.002-.60986.00781-.91895.0127A13.21476,13.21476,0,0,0,5.5171.19141a6.66509,6.66509,0,0,0-1.90088.627A6.43779,6.43779,0,0,0,1.99757,1.99707,6.25844,6.25844,0,0,0,.81935,3.61816a6.60119,6.60119,0,0,0-.625,1.90332,12.993,12.993,0,0,0-.1792,2.002C.00587,7.83008.00489,8.1377,0,8.44434V31.5586c.00489.3105.00587.6113.01515.9219a12.99232,12.99232,0,0,0,.1792,2.0019,6.58756,6.58756,0,0,0,.625,1.9043A6.20778,6.20778,0,0,0,1.99757,38.001a6.27445,6.27445,0,0,0,1.61865,1.1787,6.70082,6.70082,0,0,0,1.90088.6308,13.45514,13.45514,0,0,0,2.0039.1768c.30909.0068.6128.0107.91895.0107C8.80567,40,9.168,40,9.53468,40H110.13477c.3594,0,.7246,0,1.084-.002.3047,0,.6172-.0039.9219-.0107a13.279,13.279,0,0,0,2-.1768,6.80432,6.80432,0,0,0,1.9082-.6308,6.27742,6.27742,0,0,0,1.6172-1.1787,6.39482,6.39482,0,0,0,1.1816-1.6143,6.60413,6.60413,0,0,0,.6191-1.9043,13.50643,13.50643,0,0,0,.1856-2.0019c.0039-.3106.0039-.6114.0039-.9219.0078-.3633.0078-.7246.0078-1.0938V9.53613c0-.36621,0-.72949-.0078-1.09179,0-.30664,0-.61426-.0039-.9209a13.5071,13.5071,0,0,0-.1856-2.002,6.6177,6.6177,0,0,0-.6191-1.90332,6.46619,6.46619,0,0,0-2.7988-2.7998,6.76754,6.76754,0,0,0-1.9082-.627,13.04394,13.04394,0,0,0-2-.17676c-.3047-.00488-.6172-.01074-.9219-.01269-.3594-.002-.7246-.002-1.084-.002Z" style="fill: #a6a6a6"/>
                                          <path d="M8.44483,39.125c-.30468,0-.602-.0039-.90429-.0107a12.68714,12.68714,0,0,1-1.86914-.1631,5.88381,5.88381,0,0,1-1.65674-.5479,5.40573,5.40573,0,0,1-1.397-1.0166,5.32082,5.32082,0,0,1-1.02051-1.3965,5.72186,5.72186,0,0,1-.543-1.6572,12.41351,12.41351,0,0,1-.1665-1.875c-.00634-.2109-.01464-.9131-.01464-.9131V8.44434S.88185,7.75293.8877,7.5498a12.37039,12.37039,0,0,1,.16553-1.87207,5.7555,5.7555,0,0,1,.54346-1.6621A5.37349,5.37349,0,0,1,2.61183,2.61768,5.56543,5.56543,0,0,1,4.01417,1.59521a5.82309,5.82309,0,0,1,1.65332-.54394A12.58589,12.58589,0,0,1,7.543.88721L8.44532.875H111.21387l.9131.0127a12.38493,12.38493,0,0,1,1.8584.16259,5.93833,5.93833,0,0,1,1.6709.54785,5.59374,5.59374,0,0,1,2.415,2.41993,5.76267,5.76267,0,0,1,.5352,1.64892,12.995,12.995,0,0,1,.1738,1.88721c.0029.2832.0029.5874.0029.89014.0079.375.0079.73193.0079,1.09179V30.4648c0,.3633,0,.7178-.0079,1.0752,0,.3252,0,.6231-.0039.9297a12.73126,12.73126,0,0,1-.1709,1.8535,5.739,5.739,0,0,1-.54,1.67,5.48029,5.48029,0,0,1-1.0156,1.3857,5.4129,5.4129,0,0,1-1.3994,1.0225,5.86168,5.86168,0,0,1-1.668.5498,12.54218,12.54218,0,0,1-1.8692.1631c-.2929.0068-.5996.0107-.8974.0107l-1.084.002Z"/>
                                        </g>
                                        <g id="_Group_" data-name="&lt;Group&gt;">
                                          <g id="_Group_2" data-name="&lt;Group&gt;">
                                            <g id="_Group_3" data-name="&lt;Group&gt;">
                                              <path id="_Path_" data-name="&lt;Path&gt;" d="M24.76888,20.30068a4.94881,4.94881,0,0,1,2.35656-4.15206,5.06566,5.06566,0,0,0-3.99116-2.15768c-1.67924-.17626-3.30719,1.00483-4.1629,1.00483-.87227,0-2.18977-.98733-3.6085-.95814a5.31529,5.31529,0,0,0-4.47292,2.72787c-1.934,3.34842-.49141,8.26947,1.3612,10.97608.9269,1.32535,2.01018,2.8058,3.42763,2.7533,1.38706-.05753,1.9051-.88448,3.5794-.88448,1.65876,0,2.14479.88448,3.591.8511,1.48838-.02416,2.42613-1.33124,3.32051-2.66914a10.962,10.962,0,0,0,1.51842-3.09251A4.78205,4.78205,0,0,1,24.76888,20.30068Z" style="fill: #fff"/>
                                              <path id="_Path_2" data-name="&lt;Path&gt;" d="M22.03725,12.21089a4.87248,4.87248,0,0,0,1.11452-3.49062,4.95746,4.95746,0,0,0-3.20758,1.65961,4.63634,4.63634,0,0,0-1.14371,3.36139A4.09905,4.09905,0,0,0,22.03725,12.21089Z" style="fill: #fff"/>
                                            </g>
                                          </g>
                                          <g>
                                            <path d="M42.30227,27.13965h-4.7334l-1.13672,3.35645H34.42727l4.4834-12.418h2.083l4.4834,12.418H43.438ZM38.0591,25.59082h3.752l-1.84961-5.44727h-.05176Z" style="fill: #fff"/>
                                            <path d="M55.15969,25.96973c0,2.81348-1.50586,4.62109-3.77832,4.62109a3.0693,3.0693,0,0,1-2.84863-1.584h-.043v4.48438h-1.8584V21.44238H48.4302v1.50586h.03418a3.21162,3.21162,0,0,1,2.88281-1.60059C53.645,21.34766,55.15969,23.16406,55.15969,25.96973Zm-1.91016,0c0-1.833-.94727-3.03809-2.39258-3.03809-1.41992,0-2.375,1.23047-2.375,3.03809,0,1.82422.95508,3.0459,2.375,3.0459C52.30227,29.01563,53.24953,27.81934,53.24953,25.96973Z" style="fill: #fff"/>
                                            <path d="M65.12453,25.96973c0,2.81348-1.50586,4.62109-3.77832,4.62109a3.0693,3.0693,0,0,1-2.84863-1.584h-.043v4.48438h-1.8584V21.44238H58.395v1.50586h.03418A3.21162,3.21162,0,0,1,61.312,21.34766C63.60988,21.34766,65.12453,23.16406,65.12453,25.96973Zm-1.91016,0c0-1.833-.94727-3.03809-2.39258-3.03809-1.41992,0-2.375,1.23047-2.375,3.03809,0,1.82422.95508,3.0459,2.375,3.0459C62.26711,29.01563,63.21438,27.81934,63.21438,25.96973Z" style="fill: #fff"/>
                                            <path d="M71.71047,27.03613c.1377,1.23145,1.334,2.04,2.96875,2.04,1.56641,0,2.69336-.80859,2.69336-1.91895,0-.96387-.67969-1.541-2.28906-1.93652l-1.60937-.3877c-2.28027-.55078-3.33887-1.61719-3.33887-3.34766,0-2.14258,1.86719-3.61426,4.51855-3.61426,2.624,0,4.42285,1.47168,4.4834,3.61426h-1.876c-.1123-1.23926-1.13672-1.9873-2.63379-1.9873s-2.52148.75684-2.52148,1.8584c0,.87793.6543,1.39453,2.25488,1.79l1.36816.33594c2.54785.60254,3.60645,1.626,3.60645,3.44238,0,2.32324-1.85059,3.77832-4.79395,3.77832-2.75391,0-4.61328-1.4209-4.7334-3.667Z" style="fill: #fff"/>
                                            <path d="M83.34621,19.2998v2.14258h1.72168v1.47168H83.34621v4.99121c0,.77539.34473,1.13672,1.10156,1.13672a5.80752,5.80752,0,0,0,.61133-.043v1.46289a5.10351,5.10351,0,0,1-1.03223.08594c-1.833,0-2.54785-.68848-2.54785-2.44434V22.91406H80.16262V21.44238H81.479V19.2998Z" style="fill: #fff"/>
                                            <path d="M86.065,25.96973c0-2.84863,1.67773-4.63867,4.29395-4.63867,2.625,0,4.29492,1.79,4.29492,4.63867,0,2.85645-1.66113,4.63867-4.29492,4.63867C87.72609,30.6084,86.065,28.82617,86.065,25.96973Zm6.69531,0c0-1.9541-.89551-3.10742-2.40137-3.10742s-2.40039,1.16211-2.40039,3.10742c0,1.96191.89453,3.10645,2.40039,3.10645S92.76027,27.93164,92.76027,25.96973Z" style="fill: #fff"/>
                                            <path d="M96.18606,21.44238h1.77246v1.541h.043a2.1594,2.1594,0,0,1,2.17773-1.63574,2.86616,2.86616,0,0,1,.63672.06934v1.73828a2.59794,2.59794,0,0,0-.835-.1123,1.87264,1.87264,0,0,0-1.93652,2.083v5.37012h-1.8584Z" style="fill: #fff"/>
                                            <path d="M109.3843,27.83691c-.25,1.64355-1.85059,2.77148-3.89844,2.77148-2.63379,0-4.26855-1.76465-4.26855-4.5957,0-2.83984,1.64355-4.68164,4.19043-4.68164,2.50488,0,4.08008,1.7207,4.08008,4.46582v.63672h-6.39453v.1123a2.358,2.358,0,0,0,2.43555,2.56445,2.04834,2.04834,0,0,0,2.09082-1.27344Zm-6.28223-2.70215h4.52637a2.1773,2.1773,0,0,0-2.2207-2.29785A2.292,2.292,0,0,0,103.10207,25.13477Z" style="fill: #fff"/>
                                          </g>
                                        </g>
                                      </g>
                                      <g id="_Group_4" data-name="&lt;Group&gt;">
                                        <g>
                                          <path d="M37.82619,8.731a2.63964,2.63964,0,0,1,2.80762,2.96484c0,1.90625-1.03027,3.002-2.80762,3.002H35.67092V8.731Zm-1.22852,5.123h1.125a1.87588,1.87588,0,0,0,1.96777-2.146,1.881,1.881,0,0,0-1.96777-2.13379h-1.125Z" style="fill: #fff"/>
                                          <path d="M41.68068,12.44434a2.13323,2.13323,0,1,1,4.24707,0,2.13358,2.13358,0,1,1-4.24707,0Zm3.333,0c0-.97607-.43848-1.54687-1.208-1.54687-.77246,0-1.207.5708-1.207,1.54688,0,.98389.43457,1.55029,1.207,1.55029C44.57522,13.99463,45.01369,13.42432,45.01369,12.44434Z" style="fill: #fff"/>
                                          <path d="M51.57326,14.69775h-.92187l-.93066-3.31641h-.07031l-.92676,3.31641h-.91309l-1.24121-4.50293h.90137l.80664,3.436h.06641l.92578-3.436h.85254l.92578,3.436h.07031l.80273-3.436h.88867Z" style="fill: #fff"/>
                                          <path d="M53.85354,10.19482H54.709v.71533h.06641a1.348,1.348,0,0,1,1.34375-.80225,1.46456,1.46456,0,0,1,1.55859,1.6748v2.915h-.88867V12.00586c0-.72363-.31445-1.0835-.97168-1.0835a1.03294,1.03294,0,0,0-1.0752,1.14111v2.63428h-.88867Z" style="fill: #fff"/>
                                          <path d="M59.09377,8.437h.88867v6.26074h-.88867Z" style="fill: #fff"/>
                                          <path d="M61.21779,12.44434a2.13346,2.13346,0,1,1,4.24756,0,2.1338,2.1338,0,1,1-4.24756,0Zm3.333,0c0-.97607-.43848-1.54687-1.208-1.54687-.77246,0-1.207.5708-1.207,1.54688,0,.98389.43457,1.55029,1.207,1.55029C64.11232,13.99463,64.5508,13.42432,64.5508,12.44434Z" style="fill: #fff"/>
                                          <path d="M66.4009,13.42432c0-.81055.60352-1.27783,1.6748-1.34424l1.21973-.07031v-.38867c0-.47559-.31445-.74414-.92187-.74414-.49609,0-.83984.18213-.93848.50049h-.86035c.09082-.77344.81836-1.26953,1.83984-1.26953,1.12891,0,1.76563.562,1.76563,1.51318v3.07666h-.85547v-.63281h-.07031a1.515,1.515,0,0,1-1.35254.707A1.36026,1.36026,0,0,1,66.4009,13.42432Zm2.89453-.38477v-.37646l-1.09961.07031c-.62012.0415-.90137.25244-.90137.64941,0,.40527.35156.64111.835.64111A1.0615,1.0615,0,0,0,69.29543,13.03955Z" style="fill: #fff"/>
                                          <path d="M71.34816,12.44434c0-1.42285.73145-2.32422,1.86914-2.32422a1.484,1.484,0,0,1,1.38086.79h.06641V8.437h.88867v6.26074h-.85156v-.71143h-.07031a1.56284,1.56284,0,0,1-1.41406.78564C72.0718,14.772,71.34816,13.87061,71.34816,12.44434Zm.918,0c0,.95508.4502,1.52979,1.20313,1.52979.749,0,1.21191-.583,1.21191-1.52588,0-.93848-.46777-1.52979-1.21191-1.52979C72.72121,10.91846,72.26613,11.49707,72.26613,12.44434Z" style="fill: #fff"/>
                                          <path d="M79.23,12.44434a2.13323,2.13323,0,1,1,4.24707,0,2.13358,2.13358,0,1,1-4.24707,0Zm3.333,0c0-.97607-.43848-1.54687-1.208-1.54687-.77246,0-1.207.5708-1.207,1.54688,0,.98389.43457,1.55029,1.207,1.55029C82.12453,13.99463,82.563,13.42432,82.563,12.44434Z" style="fill: #fff"/>
                                          <path d="M84.66945,10.19482h.85547v.71533h.06641a1.348,1.348,0,0,1,1.34375-.80225,1.46456,1.46456,0,0,1,1.55859,1.6748v2.915H87.605V12.00586c0-.72363-.31445-1.0835-.97168-1.0835a1.03294,1.03294,0,0,0-1.0752,1.14111v2.63428h-.88867Z" style="fill: #fff"/>
                                          <path d="M93.51516,9.07373v1.1416h.97559v.74854h-.97559V13.2793c0,.47168.19434.67822.63672.67822a2.96657,2.96657,0,0,0,.33887-.02051v.74023a2.9155,2.9155,0,0,1-.4834.04541c-.98828,0-1.38184-.34766-1.38184-1.21582v-2.543h-.71484v-.74854h.71484V9.07373Z" style="fill: #fff"/>
                                          <path d="M95.70461,8.437h.88086v2.48145h.07031a1.3856,1.3856,0,0,1,1.373-.80664,1.48339,1.48339,0,0,1,1.55078,1.67871v2.90723H98.69v-2.688c0-.71924-.335-1.0835-.96289-1.0835a1.05194,1.05194,0,0,0-1.13379,1.1416v2.62988h-.88867Z" style="fill: #fff"/>
                                          <path d="M104.76125,13.48193a1.828,1.828,0,0,1-1.95117,1.30273A2.04531,2.04531,0,0,1,100.73,12.46045a2.07685,2.07685,0,0,1,2.07617-2.35254c1.25293,0,2.00879.856,2.00879,2.27V12.688h-3.17969v.0498a1.1902,1.1902,0,0,0,1.19922,1.29,1.07934,1.07934,0,0,0,1.07129-.5459Zm-3.126-1.45117h2.27441a1.08647,1.08647,0,0,0-1.1084-1.1665A1.15162,1.15162,0,0,0,101.63527,12.03076Z" style="fill: #fff"/>
                                        </g>
                                      </g>
                                    </g>
                                  </svg>
                                </a>
                                <a href="https://play.google.com/store" target="_blank">
                                    <svg style="width: 175px;height: 52px;margin-top: 10px;" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" id="artwork" viewBox="0 0 135 40.0002">
                                        <defs>
                                          <linearGradient id="linear-gradient" x1="21.79964" y1="173.29039" x2="5.01723" y2="156.50798" gradientTransform="matrix(1, 0, 0, -1, 0, 182.0002)" gradientUnits="userSpaceOnUse">
                                            <stop offset="0" stop-color="#00a0ff"/>
                                            <stop offset="0.00657" stop-color="#00a1ff"/>
                                            <stop offset="0.2601" stop-color="#00beff"/>
                                            <stop offset="0.5122" stop-color="#00d2ff"/>
                                            <stop offset="0.7604" stop-color="#00dfff"/>
                                            <stop offset="1" stop-color="#00e3ff"/>
                                          </linearGradient>
                                          <linearGradient id="linear-gradient-2" x1="33.83428" y1="161.99865" x2="9.63738" y2="161.99865" gradientTransform="matrix(1, 0, 0, -1, 0, 182.0002)" gradientUnits="userSpaceOnUse">
                                            <stop offset="0" stop-color="#ffe000"/>
                                            <stop offset="0.4087" stop-color="#ffbd00"/>
                                            <stop offset="0.7754" stop-color="orange"/>
                                            <stop offset="1" stop-color="#ff9c00"/>
                                          </linearGradient>
                                          <linearGradient id="linear-gradient-3" x1="24.82685" y1="159.704" x2="2.06857" y2="136.94572" gradientTransform="matrix(1, 0, 0, -1, 0, 182.0002)" gradientUnits="userSpaceOnUse">
                                            <stop offset="0" stop-color="#ff3a44"/>
                                            <stop offset="1" stop-color="#c31162"/>
                                          </linearGradient>
                                          <linearGradient id="linear-gradient-4" x1="7.29723" y1="181.82392" x2="17.45975" y2="171.6614" gradientTransform="matrix(1, 0, 0, -1, 0, 182.0002)" gradientUnits="userSpaceOnUse">
                                            <stop offset="0" stop-color="#32a071"/>
                                            <stop offset="0.0685" stop-color="#2da771"/>
                                            <stop offset="0.4762" stop-color="#15cf74"/>
                                            <stop offset="0.8009" stop-color="#06e775"/>
                                            <stop offset="1" stop-color="#00f076"/>
                                          </linearGradient>
                                        </defs>
                                        <title>img_google-play-store-cta</title>
                                        <g>
                                          <rect width="135" height="40" rx="5" ry="5"/>
                                          <path d="M130,.8a4.20476,4.20476,0,0,1,4.1999,4.2002v30A4.20483,4.20483,0,0,1,130,39.2004H5A4.20485,4.20485,0,0,1,.8,35.0002v-30A4.20478,4.20478,0,0,1,5,.8H130m0-.7998H5a5.0147,5.0147,0,0,0-5,5v30a5.0147,5.0147,0,0,0,5,5H130a5.0147,5.0147,0,0,0,5-5v-30a5.0147,5.0147,0,0,0-5-5Z" style="fill: #a6a6a6"/>
                                          <g>
                                            <path d="M47.4184,10.2433a2.70754,2.70754,0,0,1-.7452,2.0029,2.90882,2.90882,0,0,1-2.2041.8877,3.08975,3.08975,0,0,1-3.1171-3.1338,3.09058,3.09058,0,0,1,3.1171-3.1343,3.09506,3.09506,0,0,1,1.2315.2515,2.475,2.475,0,0,1,.9385.6704l-.5274.5278a2.02625,2.02625,0,0,0-1.6426-.7119,2.31929,2.31929,0,0,0-2.33,2.3965,2.35911,2.35911,0,0,0,4.0058,1.7266,1.88816,1.88816,0,0,0,.5029-1.2154H44.4691V9.7906h2.9073A2.54293,2.54293,0,0,1,47.4184,10.2433Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                            <path d="M52.0277,7.7374H49.2953V9.6397h2.4639v.7208H49.2953v1.9023h2.7324v.7373H48.5248v-6h3.5029Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                            <path d="M55.2787,13.0001h-.7715V7.7374H52.8314V7.0001h4.1231v.7373H55.2787Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                            <path d="M59.9379,13.0001v-6h.7705v6Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                            <path d="M64.1283,13.0001h-.7715V7.7374H61.6811V7.0001h4.123v.7373H64.1283Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                            <path d="M73.6093,12.2247a3.11555,3.11555,0,0,1-4.3994,0,3.06732,3.06732,0,0,1-.8838-2.2246,3.06732,3.06732,0,0,1,.8838-2.2246,3.10493,3.10493,0,0,1,4.3955.0039,3.06771,3.06771,0,0,1,.8877,2.2207A3.07178,3.07178,0,0,1,73.6093,12.2247Zm-3.8301-.5024a2.307,2.307,0,0,0,3.2598,0,2.34837,2.34837,0,0,0,.667-1.7222,2.34837,2.34837,0,0,0-.667-1.7222,2.307,2.307,0,0,0-3.2598,0,2.35121,2.35121,0,0,0-.666,1.7222A2.35121,2.35121,0,0,0,69.7792,11.7223Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                            <path d="M75.5751,13.0001v-6h.9385l2.916,4.6675h.0332l-.0332-1.1563V7.0001h.7715v6h-.8047L76.3456,8.1065h-.0332l.0332,1.1563v3.7373Z" style="fill: #fff;stroke: #fff;stroke-miterlimit: 10;stroke-width: 0.2px"/>
                                          </g>
                                          <path d="M68.1358,21.7517a4.25318,4.25318,0,1,0,4.2693,4.2531A4.19222,4.19222,0,0,0,68.1358,21.7517Zm0,6.8308a2.58419,2.58419,0,1,1,2.4004-2.5777A2.4606,2.4606,0,0,1,68.1358,28.5825Zm-9.3134-6.8308a4.25318,4.25318,0,1,0,4.2692,4.2531A4.19222,4.19222,0,0,0,58.8224,21.7517Zm0,6.8308a2.58419,2.58419,0,1,1,2.4004-2.5777A2.46054,2.46054,0,0,1,58.8224,28.5825ZM47.7436,23.0567V24.861h4.3177a3.76579,3.76579,0,0,1-.9828,2.2716,4.42019,4.42019,0,0,1-3.3349,1.321,4.80134,4.80134,0,0,1,0-9.6018,4.60187,4.60187,0,0,1,3.2544,1.2888l1.2727-1.2727a6.29436,6.29436,0,0,0-4.5271-1.8205,6.606,6.606,0,1,0,0,13.2106,6.03873,6.03873,0,0,0,4.6076-1.8527,5.962,5.962,0,0,0,1.5628-4.2209,5.87161,5.87161,0,0,0-.0968-1.1277Zm45.3083,1.4015a3.95285,3.95285,0,0,0-3.641-2.7065,4.042,4.042,0,0,0-4.0114,4.2531,4.162,4.162,0,0,0,4.2209,4.2532,4.23056,4.23056,0,0,0,3.5442-1.8849l-1.4499-.9666a2.42905,2.42905,0,0,1-2.0943,1.176,2.16354,2.16354,0,0,1-2.0622-1.2888l5.6871-2.3521ZM87.2522,25.876a2.33271,2.33271,0,0,1,2.2231-2.481,1.647,1.647,0,0,1,1.5789.9022Zm-4.6238,4.1242h1.8688V17.4986H82.6284Zm-3.061-7.298H79.503a2.94736,2.94736,0,0,0-2.2394-.9505,4.257,4.257,0,0,0,0,8.5063,2.89974,2.89974,0,0,0,2.2394-.9666h.0644v.6122c0,1.6272-.8699,2.4971-2.2716,2.4971a2.35325,2.35325,0,0,1-2.1426-1.5144l-1.6272.6767a4.05319,4.05319,0,0,0,3.7698,2.5132c2.1911,0,4.0438-1.2888,4.0438-4.4304V22.0094H79.5674Zm-2.1426,5.8803a2.5869,2.5869,0,0,1,0-5.1553,2.39672,2.39672,0,0,1,2.2715,2.5937A2.37677,2.37677,0,0,1,77.4248,28.5825Zm24.381-11.0837H97.3346V30.0002h1.8657V25.2638h2.6055a3.88833,3.88833,0,1,0,0-7.765Zm.0482,6.0252H99.2003V19.2387h2.6537a2.14311,2.14311,0,1,1,0,4.2853Zm11.5317-1.7953a3.50342,3.50342,0,0,0-3.3293,1.9139l1.6566.6916a1.76794,1.76794,0,0,1,1.7048-.9168,1.79665,1.79665,0,0,1,1.9622,1.6083v.1287a4.12778,4.12778,0,0,0-1.9461-.4825c-1.7852,0-3.6026.9811-3.6026,2.8146a2.888,2.888,0,0,0,3.104,2.7502,2.63235,2.63235,0,0,0,2.3804-1.2223h.0643v.965h1.8013V25.1866C117.1813,22.9671,115.5247,21.7287,113.3857,21.7287Zm-.2252,6.8514c-.6112,0-1.4636-.3055-1.4636-1.0615,0-.9649,1.0615-1.3349,1.9783-1.3349a3.32432,3.32432,0,0,1,1.7048.4182A2.26194,2.26194,0,0,1,113.1605,28.5801Zm10.5828-6.578-2.1391,5.42h-.0644l-2.2194-5.42H117.31l3.3292,7.5752-1.8978,4.2138h1.946l5.1306-11.789Zm-16.807,7.9981h1.8656V17.4988h-1.8656Z" style="fill: #fff"/>
                                          <g>
                                            <path d="M10.4353,7.5381A2.00244,2.00244,0,0,0,9.9725,8.943V31.0591a2.00157,2.00157,0,0,0,.4628,1.4049l.074.0721,12.389-12.3889v-.2923L10.5093,7.4655Z" style="fill: url(#linear-gradient)"/>
                                            <path d="M27.0277,24.2786l-4.1294-4.1314v-.2923l4.1304-4.1304.0931.0531,4.8928,2.7801c1.3976.794,1.3976,2.0932,0,2.8877l-4.8928,2.7801Z" style="fill: url(#linear-gradient-2)"/>
                                            <path d="M27.1218,24.225l-4.2235-4.2239L10.4353,32.464a1.62671,1.62671,0,0,0,2.0781.0614L27.1218,24.225" style="fill: url(#linear-gradient-3)"/>
                                            <path d="M27.1218,15.7771,12.5134,7.4767a1.62671,1.62671,0,0,0-2.0781.0614l12.463,12.463Z" style="fill: url(#linear-gradient-4)"/>
                                            <g>
                                              <path d="M27.0287,24.132,12.5134,32.3793a1.66561,1.66561,0,0,1-2.0036.0107h0l-.0745.0745h0l.074.0721.0005-.0005a1.66486,1.66486,0,0,0,2.0036-.0107L27.1218,24.225Z" style="opacity: 0.2;isolation: isolate"/>
                                              <path d="M10.4353,32.3184a2.00279,2.00279,0,0,1-.4628-1.4049v.1461a2.00261,2.00261,0,0,0,.4628,1.4049l.0745-.0745Z" style="opacity: 0.12;isolation: isolate"/>
                                            </g>
                                            <path d="M32.0146,21.2988,27.0287,24.132l.0931.093,4.8928-2.7801a1.7548,1.7548,0,0,0,1.0483-1.4434h0A1.86229,1.86229,0,0,1,32.0146,21.2988Z" style="opacity: 0.12;isolation: isolate"/>
                                            <path d="M12.5134,7.6233l19.5012,11.08a1.86129,1.86129,0,0,1,1.0483,1.2978h0a1.75365,1.75365,0,0,0-1.0483-1.4439L12.5134,7.4772c-1.3976-.7941-2.5409-.1345-2.5409,1.4663v.1461C9.9725,7.4889,11.1158,6.8293,12.5134,7.6233Z" style="fill: #fff;opacity: 0.25;isolation: isolate"/>
                                          </g>
                                        </g>
                                      </svg>
                                </a>
                            </div>
                        </div>
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
