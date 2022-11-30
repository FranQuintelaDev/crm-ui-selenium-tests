package com.serenity.sandbox.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://localhost:44434/sign-up")
public class SignUpPage extends PageObject {

  public void doSignUp(){
      $("#username").sendKeys("Ford employee");
      $("#password").sendKeys("samplepass");
      $("#signUpButton").click();

  }

  public String signUpSuccessMsgIsVisible(){
      return  $("#signUpSuccessMsg").getText();
  }
  


}