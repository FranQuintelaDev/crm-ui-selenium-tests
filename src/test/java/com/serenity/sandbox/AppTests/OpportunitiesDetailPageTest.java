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
import com.serenity.sandbox.steps.OpportunitiesDetailPageSteps;

@RunWith(SerenityRunner.class)
public class OpportunitiesDetailPageTest extends BaseTest{

    @Steps
    OpportunitiesDetailPageSteps opportunitiesDetailPageSteps;

    @Before
    public void setup(){
    	opportunitiesDetailPageSteps.isOnOpportunitiesPage();
    }

    @Test
    public void getOpportunityExpectOK(){
    	opportunitiesDetailPageSteps.existingOpportunityShouldBeVisible();
    }

    @Test
    public void getOpportunityWithContactsExpectOK(){
    	opportunitiesDetailPageSteps.existingOpportunityShouldBeVisible();

    }

    @Pending
    @Test
    public void getOpportunityWithNonExistingOpExpectKO(){

    }

    @Test
    public void markAsClientOKExpectOK(){
    	opportunitiesDetailPageSteps.existingOpportunityShouldBeVisible();
    	opportunitiesDetailPageSteps.updateOpportunityAsClient("Ha comprado un coche");
    	opportunitiesDetailPageSteps.isClientTextShouldBeVisible();
    }
    
    @Pending
    @Test
    public void markAsClientWithInvalidDataExpectKO(){

    }

    
    @Test
    public void saveContactExpectOK(){
    	opportunitiesDetailPageSteps.existingOpportunityShouldBeVisible();
    	opportunitiesDetailPageSteps.addContact("Phone","Descuento 20%","2022-12-02");
    	opportunitiesDetailPageSteps.addedContactShouldBeVisible();
    }

    
    @Pending
    @Test
    public void saveContactWithInvalidDataExpectKO(){

    }
    
    


}