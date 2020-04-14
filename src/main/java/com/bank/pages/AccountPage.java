package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class AccountPage extends Utility {
    By logOutBtn = By.xpath("//button[@class='btn logout']");
    By transactionTab = By.xpath("//button[contains(text(),'Transactions')]");
    By depositTab = By.xpath("//button[contains(text(),'Deposit')]");
    By withdrawlTab = By.xpath("//button[contains(text(),'Withdrawl')]");
    By amount = By.xpath("//input[@placeholder='amount']");
    By depositWithdrawBtn = By.xpath("//button[@class='btn btn-default']");
    By errorMessage = By.xpath("//span[@class='error ng-binding']");
    By homeButtonTab = By.xpath("//button[@class='btn home']");

    public void clickOnLogoutButton() {
        clickOnElement(logOutBtn);
    }

    public boolean isLogoutButtonDisplayed() {
        if (getElement(logOutBtn).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void clickOnTransactionTab() {
        clickOnElement(transactionTab);
    }

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void clickOnWithdrawlTab() {
        clickOnElement(withdrawlTab);
    }

    public void enterAmount(int amount) {
        sendTextToElement(this.amount, String.valueOf(amount));
    }

    public void clickOnDepositWithdrawButton() {
        clickOnElement(depositWithdrawBtn);
    }

    public String getErrorSuccessMessage() {
        return getTextFromElement(errorMessage);
    }

    public void clickOnHomeBtn() {
        clickOnElement(homeButtonTab);

    }
}

