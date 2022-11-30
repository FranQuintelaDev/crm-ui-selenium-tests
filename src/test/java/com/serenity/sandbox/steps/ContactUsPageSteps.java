package com.serenity.sandbox.steps;

import com.serenity.sandbox.UIPages.ContactUsPage;

import net.thucydides.core.annotations.Step;

public class ContactUsPageSteps {

    private ContactUsPage contactUsPage;

    @Step
    public String fillContactsUsFormStep(){
        return contactUsPage.fillContactsUsPage();
    }

}