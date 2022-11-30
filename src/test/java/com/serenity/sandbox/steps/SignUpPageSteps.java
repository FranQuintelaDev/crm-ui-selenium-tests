package com.serenity.sandbox.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import com.serenity.sandbox.UIPages.SignUpPage;

public class SignUpPageSteps {

    private SignUpPage signUpPage;

    @Step
    public void isOnSignUpPage(){
        signUpPage.open();
    }

    @Step
    public void signUpAsUser(){
        signUpPage.doSignUp();
    }

    @Step
    public void userShouldBeSignedUp(){
        Assert.assertTrue(signUpPage.signUpSuccessMsgIsVisible()!=null);
    }


}