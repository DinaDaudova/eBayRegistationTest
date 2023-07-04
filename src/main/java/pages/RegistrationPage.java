package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static constants.Constants.TimeoutVariables.EXPLICIT_WAIT;


public class RegistrationPage extends BasePage {


    /**
     * User registration
     * **/

    public final By inputFieldFirstName = By.xpath("//input[@name='firstname']");
    public final By inputFieldLastName = By.xpath("//input[@name='lastname']");
    public final By inputFieldEmail = By.xpath("//input[@name='Email']");
    public final By inputFieldPassword = By.xpath("//input[@name='password']");
    public final By buttonCreateAccount = By.xpath("//button[@name='EMAIL_REG_FORM_SUBMIT']");
    public final By personalGreetingText = By.xpath("//button[@id='gh-ug']");
    public final By errorMessageFirstName = By.xpath("//span[@id='firstname_err']");
    public final By errorMessageLastName = By.xpath("//span[@id='lastname_err']");
    public final By errorMessageEmailAddress = By.xpath("//span[@id='Email_err']");
    public final By errorMessagePassword = By.xpath("//span[@id='password_err']");
    public final By eyeButton = By.xpath("//span[@class='checkbox field__control']");
    public final By buttonGoogle = By.xpath("//button[@id='google']");
    public final By buttonFacebook = By.xpath("//button[@id='facebook']");
    public final By buttonApple = By.xpath("//button[@id='apple']");
    public final By headerGoogleAccount = By.xpath("//h1[@id='headingText']");
    public final By headerFacebookAccount = By.xpath("//div[contains(text(),'Facebook')]");
    public final By headerAppleAccount = By.xpath("//app-title[@signin-label='true']");
    public final By headerAccountExists = By.xpath("//div[@class='module--reclaim-container']/h1");

    /**
     * Links
     * **/

    public final By linkUserAgreement = By.xpath("(//a[contains(text(),'User Agreement')])[1]");
    public final By linkUserPrivacy = By.xpath("//a[contains(text(),'User Privacy')]");
    public final By headerUserPrivacyPage = By.xpath("//div[@class='article_header']/h1");
    public final By headerUserAgreementPage = By.xpath("//div[@class='article_header']/h1");

    /**
     * Help window pop-up
     * **/

    public final By headerVisitHelpPage = By.xpath("//h2[contains(text(),'How can we help you today?')]");
    public final By headerFeedback = By.xpath("//div[@class='ifh-survey']//label");
    public final By buttonHelp = By.xpath("//button[@title='Help']");
    public final By buttonFeedback = By.xpath("//button[@id='ifhSurveyText']");
    public final By buttonArrowDownInHelpPopup = By.xpath("//li[@class='listbox-button ']//button");
    public final By headerHelpPopup = By.xpath("//header[@id='ifhOverlayHeader']");
    public final By buttonVisitHelpContactInHelpPopup = By.xpath("//a[@id='ifhChannelHelp']");
    public final By inputTextBox = By.xpath("//div[@class='textbox']//textarea");
    public final By buttonSendInFeedback = By.xpath("//button[@id='ifhSurveySubmitBtn']");
    public final By linkCustomerServiceInFeedback = By.xpath("//a[@title='opens in new tab or window']");
    public final By headerCustomerServicePage = By.xpath("//div[@class='relate_content']/h2");
    public final By linkEbayUserAgreementInFeedback = By.xpath("//a[@title='opens in new window or tab']");
    public final By buttonArrowBackInFeedback = By.xpath("//button[@id='ifhOverlayBack']");
    public final By buttonCloseInHelpPopup = By.xpath("//button[@id='ifhOverlayClose']");
    public final By popUpWindowHelp = By.xpath("//div[@class='ifh-modal-container ']");
    public final By headerSignIn = By.xpath("//h1[@class='heading']");

    /**
     * Business account registration
     * **/
    public final By radioButtonBusinessAccount = By.xpath("(//span[@class='radio'])[2]");
    public final By inputFieldBusinessName = By.xpath("//input[@id='businessName']");
    public final By inputFieldBusinessEmail = By.xpath("//input[@id='businessEmail']");
    public final By inputFieldBusinessPassword = By.xpath("//input[@id='bizPassword']");
    public final By dropdownBusinessLocation = By.xpath("//select[@id='businessCountry']");
    public final By checkboxBusinessAccountAsBuyer = By.xpath("(//span[@class='checkbox field__control'])[2]");
    public final By buttonCreateBusinessAccount = By.xpath("//button[@name='BUSINESS_REG_FORM_SUBMIT']");
    public final By headerVerifyBusinessEmail = By.xpath("//div[@class='module--verify-container']/h1");
    public final By errorMessageBusinessName = By.xpath("//span[@id='businessName_err']");
    public final By errorMessageBusinessEmail = By.xpath("//span[@id='businessEmail_err']");
    public final By errorMessageBusinessPassword = By.xpath("//span[@id='bizPassword_err']");
    public final By buttonBusinessAccountInfo = By.xpath("//button[@aria-label='Business account help']");
    public final By buttonCloseBusinessAccountInfo = By.xpath("//button[@aria-label='Close business account help']");
    public final By headerBusinessAccountInfo = By.xpath("//span[@class='infotip__heading']");
    public final By linkSignIn = By.xpath("//a[@class='action-link']");




    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


/**
 * Methods of User registration
 * **/


    public RegistrationPage enterFirstName (String fName){
        WebElement inputField = driver.findElement(inputFieldFirstName);
        waitElementIsVisible(inputField);
        inputField.sendKeys(fName);
        return this;
    }

    public RegistrationPage enterLastName (String lName){
        WebElement inputField = driver.findElement(inputFieldLastName);
        waitElementIsVisible(inputField);
        inputField.sendKeys(lName);
        return this;
    }

    public RegistrationPage enterEmail (String email){
        WebElement inputField = driver.findElement(inputFieldEmail);
        waitElementIsVisible(inputField);
        inputField.sendKeys(email);
        return this;
    }

    public RegistrationPage enterPassword (String password){
        WebElement inputField = driver.findElement(inputFieldPassword);
        waitElementIsVisible(inputField);
        inputField.sendKeys(password);
        return this;
    }

    public RegistrationPage clickOnCreateAccountButton(){
        WebElement button = driver.findElement(buttonCreateAccount);
        waitElementIsClickable(button);
        button.click();
        return this;
    }

    public void checkPersonalGreetingPresent(){
        WebElement personalGreeting = driver.findElement(personalGreetingText);
        waitElementIsVisible(personalGreeting);
    }

    public RegistrationPage clickOnFirstNameInputField(){
        WebElement inputField = driver.findElement(inputFieldFirstName);
        waitElementIsVisible(inputField);
        inputField.click();
        return this;
    }

    public RegistrationPage clickOnLastNameInputField(){
        WebElement inputField = driver.findElement(inputFieldLastName);
        waitElementIsVisible(inputField);
        inputField.click();
        return this;
    }

    public RegistrationPage clickOnEmailAddressInput(){
        WebElement inputField = driver.findElement(inputFieldEmail);
        waitElementIsVisible(inputField);
        inputField.click();
        return this;
    }
    public RegistrationPage clickOnEyeButton(){
        WebElement button = driver.findElement(eyeButton);
        waitElementIsVisible(button);
        button.click();
        return this;
    }

    public RegistrationPage clickOnPasswordInput(){
        WebElement inputField = driver.findElement(inputFieldPassword);
        waitElementIsVisible(inputField);
        inputField.click();
        return this;
    }

    public RegistrationPage checkErrorMessageWithEmptyFirstName(String errorText){
        String ErrorMessage = driver.findElement(errorMessageFirstName).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithInvalidFirstName(String errorText){
        String ErrorMessage = driver.findElement(errorMessageFirstName).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }


    public RegistrationPage checkErrorMessageWithEmptyLastName(String errorText){
        String ErrorMessage = driver.findElement(errorMessageLastName).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithInvalidLastName(String errorText){
        String ErrorMessage = driver.findElement(errorMessageLastName).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithEmptyEmailAddress(String errorText){
        String ErrorMessage = driver.findElement(errorMessageEmailAddress).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithInvalidEmail(String errorText){
        String ErrorMessage = driver.findElement(errorMessageEmailAddress).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithEmptyPassword(String errorText){
        String ErrorMessage = driver.findElement(errorMessagePassword).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithInvalidPassword (String errorText){
        WebElement text = driver.findElement(errorMessagePassword);
        waitElementIsVisible(text);
        String ErrorMessage = driver.findElement(errorMessagePassword).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkCreateAccountButtonIsNotClickable(){
        WebElement button = driver.findElement(buttonCreateAccount);
        button.click();
        button.isEnabled();
        return this;
    }


    public WebElement checkIfEyeButtonShowsPassword(){
        WebElement inputField = driver.findElement(inputFieldPassword);
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.attributeToBe(inputField,"type", "text"));
        return inputField;
    }

    public RegistrationPage clickOnGoogleButton(){
        WebElement button = driver.findElement(buttonGoogle);
        waitElementIsVisible(button).click();
        return this;
    }

    public RegistrationPage clickOnFacebookButton(){
        WebElement button = driver.findElement(buttonFacebook);
        waitElementIsVisible(button).click();
        return this;
    }

    public RegistrationPage clickOnAppleButton(){
        WebElement button = driver.findElement(buttonApple);
        waitElementIsVisible(button).click();
        return this;
    }


    public RegistrationPage checkHeaderGoogleAccount (String headerText){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String Header = driver.findElement(headerGoogleAccount).getText();
                Assert.assertEquals(headerText, Header);
                break;
            }
        }
        return this;
    }

    public RegistrationPage checkHeaderFacebookAccount(String headerText){
        String Header = driver.findElement(headerFacebookAccount).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

    public RegistrationPage checkHeaderAppleAccount(String headerText){
        String Header = driver.findElement(headerAppleAccount).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

    public RegistrationPage checkHeaderAccountExists(String headerText){
        String Header = driver.findElement(headerAccountExists).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

/**
 * Methods of links
 * **/

    public RegistrationPage clickOnUserAgreementLink(){
        WebElement link = driver.findElement(linkUserAgreement);
        link.click();
        return this;
    }

    public RegistrationPage clickOnUserPrivacyLink(){
        WebElement link = driver.findElement(linkUserPrivacy);
        link.click();
        return this;
    }

    public RegistrationPage checkHeaderUserAgreementLink (String headerText){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String Header = driver.findElement(headerUserAgreementPage).getText();
                Assert.assertEquals(headerText, Header);
                break;
            }
        }
        return this;
    }

    public RegistrationPage checkHeaderUserPrivacyLink (String headerText){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String Header = driver.findElement(headerUserPrivacyPage).getText();
                Assert.assertEquals(headerText, Header);
                break;
            }
        }
        return this;
    }

    public RegistrationPage clickSignInLink(){
        WebElement button = driver.findElement(linkSignIn);
        waitElementIsVisible(button).click();
        return this;
    }

    public RegistrationPage checkHeaderSignIn(String headerText){
        String Header = driver.findElement(headerSignIn).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }


/**
 * Methods of Help window pop-up
 * **/


    public RegistrationPage clickOnHelpButton(){
        WebElement button = driver.findElement(buttonHelp);
        waitElementIsVisible(button).click();
        return this;
    }

    public RegistrationPage clickOnFeedbackButton(){
        WebElement button = driver.findElement(buttonFeedback);
        waitElementIsVisible(button).click();
        return this;
    }

    /**
     * We use JavascriptExecutor because button is covered by another element, so we could not click on it.
     **/
    public RegistrationPage clickOnVisitHelpContactButtonInHelpPopup(){
        WebElement button = driver.findElement(buttonVisitHelpContactInHelpPopup);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", button);
        return this;
    }

    public RegistrationPage checkHeaderVisitHelpContactPage(String headerText){
        String Header = driver.findElement(headerVisitHelpPage).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

    public RegistrationPage checkHeaderFeedback(String headerText){
        String Header = driver.findElement(headerFeedback).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

    public RegistrationPage clickOnArrowDownInHelpPopup(){
        WebElement button = driver.findElement(buttonArrowDownInHelpPopup);
        waitElementIsVisible(button).click();
        return this;
    }
    public RegistrationPage clickOnSendInFeedback(){
        WebElement button = driver.findElement(buttonSendInFeedback);
        waitElementIsVisible(button).click();
        return this;
    }

    public WebElement checkIfArrowDownInHelpPopupShowsList(){
        WebElement field = driver.findElement(buttonArrowDownInHelpPopup);
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.attributeToBe(field,"aria-expanded", "true"));
        return field;
    }


    public RegistrationPage checkHeaderHelpPopup(String headerText){
        String Header = driver.findElement(headerHelpPopup).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

    public RegistrationPage enterFeedback (String feedback){
        WebElement textBox = driver.findElement(inputTextBox);
        waitElementIsVisible(textBox);
        textBox.sendKeys(feedback);
        return this;
    }


    public RegistrationPage clickOnCustomerServiceInFeedback(){
        WebElement link = driver.findElement(linkCustomerServiceInFeedback);
        waitElementIsVisible(link).click();
        return this;
    }

    public RegistrationPage clickOnEbayUserAgreementInFeedback(){
        WebElement link = driver.findElement(linkEbayUserAgreementInFeedback);
        waitElementIsVisible(link).click();
        return this;
    }

    public RegistrationPage clickOnArrowBackInFeedback(){
        WebElement arrow = driver.findElement(buttonArrowBackInFeedback);
        waitElementIsVisible(arrow).click();
        return this;
    }

    public RegistrationPage clickOnCloseButtonInHelpPopup(){
        WebElement button = driver.findElement(buttonCloseInHelpPopup);
        waitElementIsVisible(button).click();
        return this;
    }


    public RegistrationPage checkHeaderCustomerServiceLink (String headerText){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String Header = driver.findElement(headerCustomerServicePage).getText();
                Assert.assertEquals(headerText, Header);
                break;
            }
        }
        return this;
    }

    public RegistrationPage checkHeaderEbayUserAgreementLink (String headerText){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String Header = driver.findElement(headerUserAgreementPage).getText();
                Assert.assertEquals(headerText, Header);
                break;
            }
        }
        return this;
    }

    public void verifyHelpPopupWindowClosed() {
        boolean isHelpPopupClosed = driver.findElements(popUpWindowHelp).isEmpty();
        Assert.assertTrue("The Help popup window is not closed.", isHelpPopupClosed);
    }



    /**
 * Business Account methods
 * **/

    public RegistrationPage clickOnBusinessAccountRadioButton(){
        WebElement radioButton = driver.findElement(radioButtonBusinessAccount);
        waitElementIsVisible(radioButton).click();
        return this;
    }


    public RegistrationPage enterBusinessName (String Name){
        WebElement inputField = driver.findElement(inputFieldBusinessName);
        waitElementIsVisible(inputField);
        inputField.sendKeys(Name);
        return this;
    }

    public RegistrationPage enterBusinessEmail (String Email){
        WebElement inputField = driver.findElement(inputFieldBusinessEmail);
        waitElementIsVisible(inputField);
        inputField.sendKeys(Email);
        return this;
    }

    public RegistrationPage enterBusinessPassword (String Password){
        WebElement inputField = driver.findElement(inputFieldBusinessPassword);
        waitElementIsVisible(inputField);
        inputField.sendKeys(Password);
        return this;
    }

    public RegistrationPage chooseBusinessLocationGB (){
        WebElement dropdownList = driver.findElement(dropdownBusinessLocation);
        waitElementIsVisible(dropdownList).click();
        driver.findElement(By.xpath("//option[@value='GB']")).click();
        return this;
    }

    public RegistrationPage clickOnBizAccountToBuyCheckbox(){
        WebElement checkbox = driver.findElement(checkboxBusinessAccountAsBuyer);
        waitElementIsClickable(checkbox).submit();
        return this;
    }

    public RegistrationPage clickOnCreateBusinessAccountButton(){
        WebElement button = driver.findElement(buttonCreateBusinessAccount);
        waitElementIsClickable(button).click();
        return this;
    }

    public RegistrationPage checkVerifyYourBusinessEmailIsPresent(String headerText){
        String Header = driver.findElement(headerVerifyBusinessEmail).getText();
        Assert.assertEquals(headerText, Header);
        return this;
    }

    public RegistrationPage clickOnBusinessNameInputField(){
        WebElement inputField = driver.findElement(inputFieldBusinessName);
        waitElementIsVisible(inputField);
        inputField.click();
        return this;
    }

    public RegistrationPage clickOnBusinessEmailInputField(){
        WebElement inputField = driver.findElement(inputFieldBusinessEmail);
        waitElementIsVisible(inputField);
        inputField.click();
        return this;
    }

    public RegistrationPage clickOnBusinessPasswordInputField(){
        WebElement inputField = driver.findElement(inputFieldBusinessPassword);
        waitElementIsVisible(inputField).click();
        return this;
    }

    public RegistrationPage checkErrorMessageWithEmptyBusinessName(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessName).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithEmptyBusinessEmail(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessEmail).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithEmptyBusinessPassword(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessPassword).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }


    public RegistrationPage checkErrorMessageWithInvalidBizName(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessName).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }


    public RegistrationPage checkErrorMessageWithInvalidBizEmail(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessEmail).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkErrorMessageWithExistingBizEmail(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessEmail).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }


    public RegistrationPage checkErrorMessageWithInvalidBizPassword(String errorText){
        String ErrorMessage = driver.findElement(errorMessageBusinessPassword).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public RegistrationPage checkCreateBusinessAccountButtonIsNotClickable(){
        WebElement button = driver.findElement(buttonCreateBusinessAccount);
        button.click();
        button.isEnabled();
        return this;
    }

    public WebElement checkIfEyeButtonShowsBusinessPassword(){
        WebElement inputField = driver.findElement(inputFieldBusinessPassword);
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.attributeToBe(inputField,"type", "text"));
        return inputField;
    }

    public RegistrationPage clickOnBusinessAccountInfoButton(){
        WebElement button = driver.findElement(buttonBusinessAccountInfo);
        waitElementIsVisible(button).click();
        return this;
    }

    public RegistrationPage clickOnBusinessAccountInfoCloseButton(){
        WebElement button = driver.findElement(buttonCloseBusinessAccountInfo);
        waitElementIsVisible(button).click();
        return this;
    }

    public RegistrationPage checkBusinessAccountInfoButtonHeader(String errorText){
        String ErrorMessage = driver.findElement(headerBusinessAccountInfo).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }


    public WebElement verifyBusinessAccountInfoIsClosed() {
        WebElement infoWindow = driver.findElement(buttonBusinessAccountInfo);
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.attributeToBe(infoWindow,"aria-expanded", "false"));
        return infoWindow;
    }

}
