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
		return $(By.xpath("//text()[contains(.,'Juan')]")) != null;
	}

	public boolean existingContactIsVisible() {
		return $(By.xpath("//*[@id='contact']//text()[contains(.,'Email list')]")) != null;
	}

	public void updateOpportunityAsClient(String reason) {
		$("#markAsClientButton").click();
		$("#isClientReason").sendKeys(reason);
		$("#isClientSubmitButton").click();
		$("#closeModalButton").click();
	}
	public boolean isClientTextIsVisible() {
		return $("#isClientText") != null;
	}

	public boolean addedContactShouldIsVisible() {
		return $(By.xpath("//*[@id='contact']//text()[contains(.,'Descuento 20%')]")) != null;
	}

	public void addContact(String type, String title, String date) {
		$("#addContactButton").click();
		$("#title").sendKeys(title);
		$("#type").sendKeys(type);
		$("#date").sendKeys(date);
		$("#addContactSubmitButton").click();
		$("#closeModalButton").click();
		
	}
}