package pages.registration.negative;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.base.BaseTest;

import static constants.Constants.TestDataForSigningIn.*;
import static constants.Constants.Urls.REGISTRATION_PAGE;
import org.junit.jupiter.api.Test;


public class RegistrationPageNegativeTests extends BaseTest {

    /**
     * ID - 2
     **/
    @Test
    public void verifyErrorMessageWithEmptyFirstName() {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnFirstNameInputField()
                .enterLastName(LAST_NAME)
                .enterEmail(NEW_EMAIL)
                .enterPassword(NEW_PASSWORD)
                .checkErrorMessageWithEmptyFirstName(ERROR_TEXT_EMPTY_FIRST_NAME)
                .checkCreateAccountButtonIsNotClickable();
    }

    /**
     * ID - 3
     **/
    @Test
    public void verifyErrorMessageWithEmptyLastName(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .clickOnLastNameInputField()
                .enterEmail(NEW_EMAIL)
                .enterPassword(NEW_PASSWORD)
                .checkErrorMessageWithEmptyLastName(ERROR_TEXT_EMPTY_LAST_NAME)
                .checkCreateAccountButtonIsNotClickable();
    }

    /**
     ID - 4
     **/
    @Test
    public void verifyErrorMessageWithEmptyEmail(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .clickOnEmailAddressInput()
                .enterPassword(NEW_PASSWORD)
                .checkErrorMessageWithEmptyEmailAddress(ERROR_TEXT_EMPTY_EMAIL_ADDRESS)
                .checkCreateAccountButtonIsNotClickable();
    }


    /**
     ID - 5
     **/
    @Test
    public void verifyErrorMessageWithEmptyPassword(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterEmail(NEW_EMAIL)
                .clickOnPasswordInput()
                .clickOnEmailAddressInput()
                .checkErrorMessageWithEmptyPassword(ERROR_TEXT_EMPTY_PASSWORD)
                .checkCreateAccountButtonIsNotClickable();
    }

    /**
     ID - 6
     Bug!
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_FIRST_NAME_NUMBERS
                            ,INVALID_FIRST_NAME_SYMBOLS})
    public void verifyErrorMessageWithInvalidFName(String firstName){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(firstName)
                .enterLastName(LAST_NAME)
                .enterEmail(NEW_EMAIL)
                .enterPassword(NEW_PASSWORD)
                .checkErrorMessageWithInvalidFirstName(ERROR_TEXT_INVALID_FIRST_NAME)
                .checkCreateAccountButtonIsNotClickable();
    }

    /**
     ID - 7
     Bug!
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_LAST_NAME_NUMBERS,
                            INVALID_LAST_NAME_SYMBOLS})
    public void verifyErrorMessageWithInvalidLName(String lastName){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(lastName)
                .enterEmail(NEW_EMAIL)
                .enterPassword(NEW_PASSWORD)
                .checkErrorMessageWithInvalidLastName(ERROR_TEXT_INVALID_LAST_NAME)
                .checkCreateAccountButtonIsNotClickable();
    }

    /**
     ID - 8
     Bug with invalid email address format (invalid characters as symbols)
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_EMAIL_MISSING_SIGN
                            ,INVALID_EMAIL_MISSING_DOMAIN
                            ,INVALID_EMAIL_CYRILLIC_LETTERS
                            ,INVALID_EMAIL_SYMBOLS})
    public void verifyErrorMessageWithInvalidEmail(String email){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterEmail(email)
                .enterPassword(NEW_PASSWORD)
                .checkErrorMessageWithInvalidEmail(ERROR_TEXT_INVALID_EMAIL_ADDRESS)
                .checkCreateAccountButtonIsNotClickable();
    }

    /**
     ID - 9
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_PASSWORD_NO_LETTER,
            INVALID_PASSWORD_LESS_CHARACTERS,
            INVALID_PASSWORD_NO_SYMBOLS})
    public void verifyErrorMessageWithInvalidPassword(String password) {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterEmail(NEW_EMAIL)
                .enterPassword(password)
                .clickOnEmailAddressInput()
                .checkErrorMessageWithInvalidPassword(ERROR_TEXT_INVALID_PASSWORD)
                .checkCreateAccountButtonIsNotClickable();

        }

    /**
     ID - 27
     **/
    @Test
    public void verifyErrorMessageWithEmptyBusinessName() {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .clickOnBusinessNameInputField()
                .enterBusinessEmail(BUSINESS_EMAIL)
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .chooseBusinessLocationGB()
                .checkErrorMessageWithEmptyBusinessName(ERROR_TEXT_EMPTY_BUSINESS_NAME)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }


    /**
     ID - 28
     **/
    @Test
    public void verifyErrorMessageWithEmptyBusinessEmail() {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .clickOnBusinessEmailInputField()
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .chooseBusinessLocationGB()
                .checkErrorMessageWithEmptyBusinessEmail(ERROR_TEXT_EMPTY_BUSINESS_EMAIL)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }

    /**
     ID - 29
     **/
    @Test
    public void verifyErrorMessageWithEmptyBusinessPassword() {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .enterBusinessEmail(BUSINESS_EMAIL)
                .clickOnBusinessPasswordInputField()
                .chooseBusinessLocationGB()
                .checkErrorMessageWithEmptyBusinessPassword(ERROR_TEXT_EMPTY_BUSINESS_PASSWORD)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }

    /**
     ID - 30
     Bug!
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_BUSINESS_NAME_NUMBERS
            ,INVALID_BUSINESS_NAME_SYMBOLS})
    public void verifyErrorMessageWithInvalidBizName(String bizName){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(bizName)
                .enterBusinessEmail(BUSINESS_EMAIL)
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .chooseBusinessLocationGB()
                .checkErrorMessageWithInvalidBizName(ERROR_TEXT_INVALID_BUSINESS_NAME)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }

    /**
     ID - 31
     Bug with invalid email address format (invalid characters as symbols)
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_BUSINESS_EMAIL_MISSING_SIGN
            ,INVALID_BUSINESS_EMAIL_MISSING_DOMAIN
            ,INVALID_BUSINESS_EMAIL_CYRILLIC_LETTERS
            ,INVALID_BUSINESS_EMAIL_SYMBOLS})
    public void verifyErrorMessageWithInvalidBizEmail(String email){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .enterBusinessEmail(email)
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .chooseBusinessLocationGB()
                .checkErrorMessageWithInvalidBizEmail(ERROR_TEXT_INVALID_BUSINESS_EMAIL)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }

    /**
     ID - 32
     **/
    @ParameterizedTest
    @ValueSource(strings = {INVALID_BUSINESS_PASSWORD_NO_LETTER,
            INVALID_BUSINESS_PASSWORD_NO_SYMBOLS,
            INVALID_BUSINESS_PASSWORD_LESS_CHARACTERS})
    public void verifyErrorMessageWithInvalidBizPassword(String password) {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .enterBusinessEmail(BUSINESS_EMAIL)
                .enterBusinessPassword(password)
                .clickOnBusinessEmailInputField()
                .checkErrorMessageWithInvalidBizPassword(ERROR_TEXT_INVALID_BUSINESS_PASSWORD)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }

    /**
     ID - 34
     **/
    @Test
    public void verifyErrorMessageWithExistingEmail(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterEmail(EXISTING_EMAIL)
                .enterPassword(EXISTING_PASSWORD)
                .clickOnCreateAccountButton()
                .checkHeaderAccountExists(HEADER_ACCOUNT_EXISTS);
    }

    /**
     ID - 35
      **/
    @Test
    public void verifyErrorMessageWithExistingBizEmail(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .enterBusinessEmail(EXISTING_BUSINESS_EMAIL)
                .enterBusinessPassword(EXISTING_BUSINESS_PASSWORD)
                .checkErrorMessageWithExistingBizEmail(ERROR_TEXT_EXISTING_BUSINESS_EMAIL)
                .checkCreateBusinessAccountButtonIsNotClickable();
    }



}








