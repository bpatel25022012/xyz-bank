package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class CustomerPage extends Utility {
    By customerLogoutBtn = By.xpath("//button[@class='btn logout']");

    public String getCustomerLogOutText (){
        return getTextFromElement(customerLogoutBtn);
    }

    public void verifyCustomerLogOutTabIsDisplayed (){
        verifyThatElementIsDisplayed(customerLogoutBtn);
    }

    public void clickOnCustomerLogOutButton(){
        clickonElement(customerLogoutBtn);
    }


}
