package com.serenity.sandbox.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import com.serenity.sandbox.UIPages.LoginPage;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsUser(){
        loginPage.doLogIn();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.welcomePageMsgIsVisible());
    }


}