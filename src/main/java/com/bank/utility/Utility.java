package com.bank.utility;


import com.bank.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;





/*
Created By Bhavesh
*/

public class Utility extends BasePage {

    public WebElement captcha;
    public static String randomEmail;
    public static String randomPassword;
    public static String randomUsername;

    // this method will open the Url in chrome

    public void openingChromeBrowser(String baseUrl) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    // this method will open the Url in Firefox

    public void openingFireFoxBrowser(String baseUrl) {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    // this method will open the Url in Internet Explore

    public void openingIEBrowser(String baseUrl) {

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    //this method will send random email to email field
    public void sendRandomEmail(By by) {
        Random anyEmail = new Random();
        int randomInt = anyEmail.nextInt(1000);
        driver.findElement(by).sendKeys(randomEmail = "Rocky" + randomInt + "@gmail.com");

    }
    //this method will send random username to username field
    public void sendRandomUsername(By by){
        Random userName = new Random();
        int randomInt = userName.nextInt(1000);
        driver.findElement(by).sendKeys(randomUsername ="Tiger"+randomInt);
    }

    // this method will send random username to next field
    public void sendRandomUsernameToNextField (By by){
//        userName = randomUsername;
        driver.findElement(by).sendKeys(randomUsername);

    }


    //this method will get random email from above method and send it to next email field
    public void sendRandomEmailToNextField(By by, String email) {

        email = randomEmail;
        driver.findElement(by).sendKeys(email);
    }

    // this method will send random password to password field
    public void sendRandomPassword(By by) {
        Random password = new Random();
        int randomInt = password.nextInt(1000);
        driver.findElement(by).sendKeys(randomPassword = "Tiger" + randomInt);
    }

    // this method will get random password from above method and send it to next password field
    public void sendRandomPasswordToNextField(By by) {

        driver.findElement(by).sendKeys(randomPassword);
    }
    // this method will click on element

    public void clickonElement(By by) {

        driver.findElement(by).click();
    }

    // this method will click on send text on element

    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);

    }
    // this method will wait for the element to visible

    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    //this method will get text on element

    public String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }

    //this method will used to hover mouse on element

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

    // this method will used to hover mouse on element and click

    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();

    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }

    // this method will used to select drop down menu by visible text

    public void selectByVisibleTextFromDropDownMenu(By by, String str) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(str);
    }


    public void selectByVisibleTextFromDropDownMenu(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    // this method will used to select drop down menu by index

    public void selectByIndexFromDropDownMenu(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }


    public void selectByIndexFromDropDownMenu(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    // this method will used to select drop down menu by value

    public void selectByValueFromDropDownMenu(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);


    }

    public void selectByValueFromDropDownMenu(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    // This method will verify that element is displayed

    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    // This method will verify that element is displayed

    public boolean verifyThatTextIsDisplayed(By by, String text) {

        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
        }
        return false;
    }

    // This method will verify that element is selected

    public boolean verifyThatElementIsSelected(WebElement element) {
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsSelected(By by, String text) {

        WebElement element = driver.findElement(by);

        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }

    }

    // this method will used to sort A to Z and compare with obtained list

    public void sortingAToZ(By by) {

        ArrayList<String> obtainedList = new ArrayList<>();

        List<WebElement> elementList = driver.findElements(by);

        for (WebElement links : elementList) {
            obtainedList.add(links.getText());
        }
        System.out.println("Obtained Product List :" + obtainedList);

        ArrayList<String> sortedList = new ArrayList<>(); // creation of sorting list array

        sortedList.addAll(obtainedList); // adding all list form obtainedblist

        Collections.sort(sortedList); // collections method to sort list

        Assert.assertTrue(obtainedList.equals(sortedList)); // assert of both listy

        System.out.println("Sorted Product List :" + sortedList);
    }

    // this method will used to sort Z to A and compare with obtained list

    public void sortingZToA(By by) {

        ArrayList<String> obtainedList = new ArrayList<>();

        List<WebElement> elementList = driver.findElements(by);

        for (WebElement links : elementList) {
            obtainedList.add(links.getText());
        }
        System.out.println("Obtained Product List :" + obtainedList);

        ArrayList<String> sortedList = new ArrayList<>(); // creation of sorting list array

        sortedList.addAll(obtainedList); // adding all list form obtainedblist

        Collections.sort(sortedList, Collections.reverseOrder()); // collections method to sort list

        Assert.assertEquals(obtainedList, sortedList); // assert of both listy

        System.out.println("Sorted Product List :" + sortedList);
    }

    // this method will sort price

    public void sortPriceLowToHigh(By by) {

//        List<WebElement> elements = driver.findElements(by);
//        List<String> webSortedPrices = elements.stream().map(WebElement::getText).collect(toList());
//        List<String> mySortedPrices = new ArrayList<>();
//        for (WebElement element : elements) {
//            String text = element.getText();
//            mySortedPrices.add(text);
    }

//        Assert.assertEquals(webSortedPrices, mySortedPrices);
//        System.out.println(mySortedPrices);
//        System.out.println(webSortedPrices);
    // }

    // finding the elements and count of links of page

    public void elementsAndLinkCount(By by) {

        List<WebElement> links = driver.findElements(by);

        System.out.println(links.size());

        for (int i = 0; i <= links.size(); i = i + 1) {

            System.out.println(links.get(i).getText());

        }
    }

    // finding captcha value and manage operators on weblink

    public void captchaCalculation(By by) {

        String mathquestionvalue = driver.findElement(by).getText().trim();

        // remove space if exist
        String removespace = mathquestionvalue.replaceAll("\\s+", "");
        // get two numbers
        String[] parts = removespace.split("\\+");
        String part1 = parts[0];
        String part2 = parts[1];
        String[] parts1 = part2.split("=");
        String part11 = parts1[0];
        // sum two numbers
        int summation = Integer.parseInt(part1) + Integer.parseInt(part11);
        // Math Captcha value
        captcha.clear();
        captcha.sendKeys("" + summation);


    }
    // this method will used to drag and drop element

    public void dragAndDrop(By by, By by1) {

        WebElement draggable = driver.findElement(by);
        WebElement droppable = driver.findElement(by1);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();
    }

    // this method will used to resize the window

    public void resizableExample(By by) {

        WebElement resizable = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(resizable, 400, 400).perform();


    }

    // this method is used for right click option
    public void rightClick(By by) {

        WebElement img = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.contextClick(img).perform();
    }


    // this method will go to element through mousehover and inspect element

    public void mouseHoverAndInspectElement(By by) throws AWTException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).perform();
        action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).click().perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);


    }


    // this method will assert expected and actual text
    public void verifyExpectedAndActualText(By by, String expectedText) {
//        String actualText = getTextFromElement(by);
//        Assert.assertEquals(expectedText,actualText);
//        System.out.println("Expected Message On The Screen : "+ expectedText);
//        System.out.println("Actual Message On The Screen : " + actualText);
//

    }

    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }


    //    public void additonBianry(){
//        String a = "";
//        String b = "";
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Insert First Binary : ");
//        a = scan.nextLine();
//
//        System.out.println("Insert Second Binary : ");
//        b = scan.nextLine();
//
//        int a1 = Integer.parseInt(a, 2);
//        int b1 = Integer.parseInt(b, 2);
//        int c1 = a1+b1;
//        System.out.println("Sum of Two Binary Numbers : " +Integer.toBinaryString(c1));
//
//
//    }
//
//    public void decimalToBinary(){
//        int a;
//
//        Scanner scan = new Scanner (System.in);
//
//        System.out.println("Please enter Decimal Number : ");
//        a=scan.nextInt();
//        scan.close();
//
//        String b = Integer.toBinaryString(a);
//
//        System.out.println("Binary Number is : " + b);
//
//    }
//
//    public void numbersTable(){
//
//        int number;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter the Number : ");
//
//        number = scan.nextInt();
//
//        for (int t = 1; t <=10; t++) {
//            System.out.println(number + " X " + t + " = " + number * t);
//                scan.close();
//
//
//    }
    public void alertExample(By by) {

        driver.findElement(by).click();
        Alert alert = driver.switchTo().alert();
        String expectedText = "Customer added successfully";
        String actualText = alert.getText();
        Assert.assertEquals(expectedText,actualText);
        alert.accept();



    }
}