package com.serenity.sandbox.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://localhost:44434/opportunities")
public class OpportunitiesListPage extends PageObject {


	  public boolean existingOpportunityIsVisible(){
	      return  $(By.xpath("//text()[contains(.,'Juan')]/parent::*")) != null;
	  }
	

}