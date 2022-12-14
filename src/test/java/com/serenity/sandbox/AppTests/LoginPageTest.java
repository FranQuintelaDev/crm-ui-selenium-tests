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

@RunWith(SerenityRunner.class)
public class LoginPageTest extends BaseTest{


    @Before
    public void setup(){
        
    }

    @Pending
    @Test
    public void loginExpectOk(){

    }

    @Pending
    @Test
    public void loginWrongPassExpectKO(){

    }

    @Pending
    @Test
    public void loginNonExistingUserExpectKO(){

    }

    @Pending
    @Test
    public void loginInvalidDataExpectKO(){

    }

}