package com.serenity.sandbox.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://localhost:44434/opportunities")
public class OpportunitiesDetailPage extends PageObject {

	public void navigateToExistingOpportunity() {
		$(By.xpath("//text()[contains(.,'Juan')]/parent::*/parent::a")).click();
	}

	public boolean existingOpportunityIsVisible() {
		return $(By.xpath("//text()[contains(.,'Juan')]/parent::*[@id='opportunityName']")) != null;
	}

}