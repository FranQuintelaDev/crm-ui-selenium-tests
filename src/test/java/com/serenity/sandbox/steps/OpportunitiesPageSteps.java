package com.serenity.sandbox.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import com.serenity.sandbox.UIPages.LoginPage;
import com.serenity.sandbox.UIPages.OpportunitiesPage;

public class OpportunitiesPageSteps {

    private OpportunitiesPage opportunitiesPage;

    @Step
    public void isOnOpportunitiesPage(){
    	opportunitiesPage.open();
    }


    @Step
    public void existingOpportunityShouldBeVisible(){
        Assert.assertTrue(opportunitiesPage.existingOpportunityIsVisible());
    }


}