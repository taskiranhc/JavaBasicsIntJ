package com.syntax.class21;
public class WebDriver {
    void openWebsite(){
        System.out.println("Opening website");

    }
    void SignUp(){
        System.out.println("SignUp on website");
    }
    void LogIn(){
        System.out.println("LogIn on website");
    }
    void ExecuteUserPassword(){
        System.out.println("Entering user password");
    }
    void ClickSubmit(){
        System.out.println("Clicking on submit");
    }
    void CloseBrowser(){
        System.out.println("Close the browser");
    }
}

class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening GoogleChrome");

    }
    void SignUp(){
        System.out.println("SignUp on GoogleChrome");
    }
    void LogIn(){
        System.out.println("LogIn on GoogleChrome");
    }
    void ExecuteUserPassword(){
        System.out.println("Entering user password in GoogleChrome");
    }
    void ClickSubmit(){
        System.out.println("Clicking on submit in GoogleChrome");
    }
    void CloseBrowser(){
        System.out.println("Close the GoogleChrome");
    }
}
class FireFox extends WebDriver {
        void openWebsite() {
            System.out.println("Opening FireFox");

        }

        void SignUp() {
            System.out.println("SignUp on FireFox");
        }

        void LogIn() {
            System.out.println("LogIn on FireFox");
        }

        void ExecuteUserPassword() {
            System.out.println("Entering user password in FireFox");
        }

        void ClickSubmit() {
            System.out.println("Clicking on submit in FireFox");
        }

        void CloseBrowser() {
            System.out.println("Close the FireFox");
        }
    }
class Safari extends WebDriver {
    void openWebsite() {
        System.out.println("Opening Safari");

    }

    void SignUp() {
        System.out.println("SignUp on Safari");
    }

    void LogIn() {
        System.out.println("LogIn on Safari");
    }

    void ExecuteUserPassword() {
        System.out.println("Entering user password in Safari");
    }

    void ClickSubmit() {
        System.out.println("Clicking on submit in Safari");
    }

    void CloseBrowser() {
        System.out.println("Close the Safari");
    }
}