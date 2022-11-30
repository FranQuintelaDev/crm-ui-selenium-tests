package com.serenity.sandbox.AppTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.serenity.sandbox.steps.LoginPageSteps;
import com.serenity.sandbox.steps.SignUpPageSteps;

@RunWith(SerenityRunner.class)
public class SignUpPageTest extends BaseTest{

    @Steps
    SignUpPageSteps signUpPageSteps;
    
    @Before
    public void setup(){
    	signUpPageSteps.isOnSignUpPage();
    }

    @Test
    public void signUpExpectOK(){
    	signUpPageSteps.signUpAsUser();

    }

    @Pending
    @Test
    public void signUpExistingUserExpectKO(){

    }


}