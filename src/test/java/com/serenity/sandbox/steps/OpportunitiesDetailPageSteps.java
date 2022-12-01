package com.serenity.sandbox.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import com.serenity.sandbox.UIPages.LoginPage;
import com.serenity.sandbox.UIPages.OpportunitiesDetailPage;

public class OpportunitiesDetailPageSteps {

    private OpportunitiesDetailPage opportunitiesDetailPage;

    @Step
    public void isOnOpportunitiesPage(){
    	opportunitiesDetailPage.open();
    }


    @Step
    public void existingOpportunityShouldBeVisible(){
    	opportunitiesDetailPage.navigateToExistingOpportunity();
        Assert.assertTrue(opportunitiesDetailPage.existingOpportunityIsVisible());
    }


}