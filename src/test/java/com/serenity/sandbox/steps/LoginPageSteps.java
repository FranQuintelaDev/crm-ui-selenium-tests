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
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.logoutLinkIsVisible().equals("Logout"));
    }

    @Step
    public void navigateToTransactionsPage(){
        loginPage.goToTransactionsPage();
    }

	public void navigateToContactsUsPage() {
		// TODO Auto-generated method stub
		
	}



}