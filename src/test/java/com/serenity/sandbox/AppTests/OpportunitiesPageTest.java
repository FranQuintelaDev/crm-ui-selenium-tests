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
import com.serenity.sandbox.steps.OpportunitiesPageSteps;

@RunWith(SerenityRunner.class)
public class OpportunitiesPageTest extends BaseTest{

    @Steps
    OpportunitiesPageSteps opportunitiesPageSteps;

    @Before
    public void setup(){
    	opportunitiesPageSteps.isOnOpportunitiesPage();
    }

    @Test
    public void getOpportunitiesFindExistingOpExpectOK(){
    	opportunitiesPageSteps.existingOpportunityShouldBeVisible();
    }

    @Pending
    @Test
    public void getOpportunitiesThenCantFindExistingClientExpectOK(){

    }

    @Pending
    @Test
    public void getClientsThenFindExistingClExpectOK(){

    }
    @Pending
    @Test
    public void getClientsThenCantFindExistingOpExpectOK(){

    }
    
    


}