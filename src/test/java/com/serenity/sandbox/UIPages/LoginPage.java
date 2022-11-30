package com.serenity.sandbox.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://localhost:44434/log-in")
public class LoginPage extends PageObject {

	  public void doLogIn(){
	      $("#username").sendKeys("Ford employee");
	      $("#password").sendKeys("samplepass");
	      $("#logInButton").click();

	  }

	  public boolean welcomePageMsgIsVisible(){
	      return  $("#welcomePageMsg").getText()!=null;
	  }
	  

}