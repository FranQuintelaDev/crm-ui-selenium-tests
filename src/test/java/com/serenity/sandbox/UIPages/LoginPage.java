package com.serenity.sandbox.UIPages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:3000/signIn")
public class LoginPage extends PageObject {

  public void doLogin(){
      $("#email").sendKeys("solera@solera.com");
      $("#password").sendKeys("bootcamp4");
      $(By.xpath("//button[@type='submit']")).click();

  }

  public String logoutLinkIsVisible(){
      return $("//text()[contains(.,'Logout')]/parent::span/parent::div").getText();
  }

  public void goToTransactionsPage(){
      $(By.xpath("//a[@href='/dashboard/transactions']")).click();
  }

}