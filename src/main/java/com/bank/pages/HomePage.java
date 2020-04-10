package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class HomePage extends Utility {


    By homeButtonLink = By.xpath("//button[@class='btn home']");
    By customerLoginLink = By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");

public void clickOnHomeBtn(){
    clickonElement(homeButtonLink);
}
public void clickOnCustomerLoginLink(){
    clickonElement(customerLoginLink);
}
public void clickOnBankManagerLoginLink(){
    clickonElement(bankManagerLoginLink);
}
}
