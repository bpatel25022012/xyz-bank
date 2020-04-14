package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountTab = By.xpath("//button[contains(text(),'Open Account')]");
    By customersTab = By.xpath("//button[contains(text(),'Customers')]");
    By homeButtonTab = By.xpath("//button[@class='btn home']");

    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountTab);
    }

    public void clickOnCustomerTab(){
        clickOnElement(customersTab);
    }
    public void clickOnHomeBtn(){
        clickOnElement(homeButtonTab);
    }


}