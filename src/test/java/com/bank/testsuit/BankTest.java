package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/
public class BankTest extends TestBase {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomerPage customerPage = new CustomerPage();
    AccountPage accountPage =new AccountPage();

    @Test (priority = 0)

    public void bankManagerShouldAddCustomerSuccessfully()  {

        homePage.clickOnBankManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerLink();
        addCustomerPage.enterFirstName("Chinki");
        addCustomerPage.enterLastName("Vaghela");
        addCustomerPage.enterPostCode("E77N33");
        addCustomerPage.clickOnAddCustomerBtn();
        Alert alert = driver.switchTo().alert();
        String expectedText = "Customer added successfully";
        String actualText = alert.getText();
        Assert.assertTrue(actualText.contains("Customer added successfully"),expectedText);
        alert.accept();
       // driver.navigate().refresh();
        bankManagerLoginPage.clickOnHomeBtn();
    }


    @Test (priority = 1)

    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLoginLink();
        bankManagerLoginPage.clickOnOpenAccountLink();
        openAccountPage.selectCustomerName("Chinki Vaghela");
        openAccountPage.selectCurrency();
        openAccountPage.clickOnProcessBtn();
        Alert alert = driver.switchTo().alert();
        String expectedText = "Account created successfully ";
        String actualText = alert.getText();
        Assert.assertTrue(actualText.contains("Account created successfully "),expectedText);
        alert.accept();
        bankManagerLoginPage.clickOnHomeBtn();


    }

    @Test (priority = 2)

    public void verifyCustomerShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnCustomerLoginLink();
        customerLoginPage.selectYourNameOnCustomerPage("Chinki Vaghela");
        customerLoginPage.clickOnCustomerLoginButton();
        customerPage.verifyCustomerLogOutTabIsDisplayed();
        String expectedTab = "Logout";
        String actualTab = customerPage.getCustomerLogOutText();
        Assert.assertEquals(expectedTab, actualTab);
        customerPage.clickOnCustomerLogOutButton();
        customerLoginPage.verifyThatYourNameTextIsDisplayed();
        String expectedText = "Your Name :";
        String actualText = customerLoginPage.getYourNameTextMessage();
        Assert.assertEquals(expectedText, actualText);
        bankManagerLoginPage.clickOnHomeBtn();


    }
    @Test (priority = 3)

    public void verifyUserShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLoginLink();
        customerLoginPage.selectYourNameOnCustomerPage("Chinki Vaghela");
        customerLoginPage.clickOnCustomerLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterDepositAmount("1000");
        accountPage.clickOnDepositButton();
        accountPage.verifyThatDepositSuccessfulTextisDisplayed();
        accountPage.getDepositSuccessfulText();
        String expectedText = "Deposit Successful";
        String actualText = accountPage.getDepositSuccessfulText();
        Assert.assertEquals(expectedText, actualText);
        accountPage.clickOnHomeBtn();





    }
    @Test (priority = 4)

    public void customerShouldWithdrawMoneySuccessfully () {
        homePage.clickOnCustomerLoginLink();
        customerLoginPage.selectYourNameOnCustomerPage("Chinki Vaghela");
        customerLoginPage.clickOnCustomerLoginButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.enterWithdrawlAmount("50");
        accountPage.clickOnWithdrawlButton();
        accountPage.verifyThatTransactionSuccessfulTextisDisplayed();
        String expectedText = "Transaction successful";
        String actualText = accountPage.getTransactionSuccessfulText();
        Assert.assertEquals(expectedText, actualText);


    }


}
