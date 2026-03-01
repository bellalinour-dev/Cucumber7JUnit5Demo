package com.example.actions;

import com.example.locators.LoginPageLocators;
import com.example.utils.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

    LoginPageLocators loginPageLocators = null;

    public LoginPageActions(){
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }

    public WebElement getUserName(){
       return loginPageLocators.username;
    }

    public WebElement getPassword(){
       return loginPageLocators.password;
    }

    public WebElement getLoginButton(){
       return loginPageLocators.loginButton;
    }
}





