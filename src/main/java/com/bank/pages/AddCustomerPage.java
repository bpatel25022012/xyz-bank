package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class AddCustomerPage extends Utility {

    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerBtn =By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");


    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);
       // sendRandomUsername(firstNameField);
    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);

    }
    public void enterPostCode(String postCode){

        sendTextToElement(postCodeField,postCode);
    }

    public void clickOnAddCustomerBtn(){
        clickonElement(addCustomerBtn);
    }

}
