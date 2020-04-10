package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class BankManagerLoginPage extends Utility {
    By addCustomerLink = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountLink = By.xpath("//button[contains(text(),'Open Account')]");
    By customersLink = By.xpath("//button[contains(text(),'Customers')]");
    By homeButtonLink = By.xpath("//button[@class='btn home']");

    public void clickOnAddCustomerLink() {
        waitUntilElementToBeClickable(addCustomerLink, 30);
        clickonElement(addCustomerLink);
    }

    public void clickOnOpenAccountLink() {

        clickonElement(openAccountLink);
    }

    public void clickOnCustomersLink() {

        clickonElement(customersLink);
    }

    public void clickOnHomeBtn() {
        clickonElement(homeButtonLink);
    }
}