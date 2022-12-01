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
    @Step
    public void existingContactShouldBeVisible(){
        Assert.assertTrue(opportunitiesDetailPage.existingContactIsVisible());
    }


	public void updateOpportunityAsClient(String reason) {
    	opportunitiesDetailPage.updateOpportunityAsClient(reason);
	}
	
	public void isClientTextShouldBeVisible() {
    	opportunitiesDetailPage.isClientTextIsVisible();
	}


	public void addContact(String type, String title, String date) {
    	opportunitiesDetailPage.addContact(type, title, date);
		
	}


	public void addedContactShouldBeVisible() {
    	opportunitiesDetailPage.addedContactShouldIsVisible();
		
	}

}