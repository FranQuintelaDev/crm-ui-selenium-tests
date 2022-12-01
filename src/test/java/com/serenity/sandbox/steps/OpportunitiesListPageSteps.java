package com.serenity.sandbox.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import com.serenity.sandbox.UIPages.LoginPage;
import com.serenity.sandbox.UIPages.OpportunitiesListPage;

public class OpportunitiesListPageSteps {

    private OpportunitiesListPage opportunitiesListPage;

    @Step
    public void isOnOpportunitiesPage(){
    	opportunitiesListPage.open();
    }


    @Step
    public void existingOpportunityShouldBeVisible(){
        Assert.assertTrue(opportunitiesListPage.existingOpportunityIsVisible());
    }


	public void existingClientShouldBeVisible() {
        Assert.assertTrue(opportunitiesListPage.existingClientIsVisible());
		
	}


}