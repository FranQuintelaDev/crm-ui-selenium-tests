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
public class OpportunityPageTest extends BaseTest{


    @Before
    public void setup(){
        
    }

    @Pending
    @Test
    public void getOpportunityWithContactsExpectOK(){

    }

    @Pending
    @Test
    public void getOpportunityWithNonExistingOpExpectKO(){

    }

    @Pending
    @Test
    public void markAsClientOKExpectOK(){

    }
    
    @Pending
    @Test
    public void markAsClientWithInvalidDataExpectKO(){

    }

    
    @Pending
    @Test
    public void saveContactExpectOK(){

    }

    
    @Pending
    @Test
    public void saveContactWithInvalidDataExpectKO(){

    }




}