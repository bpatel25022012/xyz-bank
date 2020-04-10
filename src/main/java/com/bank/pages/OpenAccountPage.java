package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class OpenAccountPage extends Utility {
    By selectCustomerName = By.xpath("//select[@name='userSelect']");
    By selectCurrency = By.xpath("//select[@name='currency']");
    By processBtn = By.xpath("//button[contains(text(),'Process')]");

    public void selectCustomerName(String customerName){
     selectByVisibleTextFromDropDownMenu(selectCustomerName,customerName);
        //sendRandomUsernameToNextField(customerNameDDList);


    }
    public void selectCurrency(){

        selectByValueFromDropDownMenu(selectCurrency,"Pound");
    }
    public void clickOnProcessBtn(){
        clickonElement(processBtn);
    }

}
