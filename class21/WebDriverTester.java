package com.syntax.class21;

public class WebDriverTester {
    public static void main(String[] args){
        /*WebDriver webDriver=new WebDriver();
        webDriver.openWebsite();
        webDriver.SignUp();
        webDriver.LogIn();
        webDriver.ExecuteUserPassword();
        webDriver.ClickSubmit();
        webDriver.CloseBrowser();*/

        WebDriver[] webDrivers={new GoogleChrome(),new FireFox(),new Safari()};
        for(WebDriver wd:webDrivers){
            wd.SignUp();
            wd.LogIn();
            wd.ExecuteUserPassword();
            wd.ClickSubmit();
            wd.CloseBrowser();
        }
    }
}
