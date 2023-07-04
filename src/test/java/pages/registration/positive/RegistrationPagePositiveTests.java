package pages.registration.positive;

import org.junit.jupiter.api.Test;
import pages.base.*;

import static constants.Constants.TestDataForSigningIn.*;
import static constants.Constants.Urls.REGISTRATION_PAGE;

public class RegistrationPagePositiveTests extends BaseTest {

    /**
     * ID - 1
     **/
    @Test
    public void verifyUserRegistration() {
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterEmail(NEW_EMAIL)
                .enterPassword(NEW_PASSWORD)
                .clickOnCreateAccountButton()
                .checkPersonalGreetingPresent();
    }

    /**
     ID - 10
     **/
    @Test
    public void verifyEyeButtonWorks(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .enterPassword(NEW_PASSWORD)
                .clickOnEyeButton()
                .checkIfEyeButtonShowsPassword();
    }

    /**
     ID - 11
     **/
    @Test
    public void verifyUserAgreementLinkIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnUserAgreementLink()
                .checkHeaderUserAgreementLink(HEADER_USER_AGREEMENT_PAGE);
    }

    /**
     ID - 12
     **/
    @Test
    public void verifyUserPrivacyLinkIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnUserPrivacyLink()
                .checkHeaderUserPrivacyLink(HEADER_USER_PRIVACY_PAGE);
    }

    /**
     ID - 13
     **/
    @Test
    public void verifyUserRegistrationWithGoogle(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnGoogleButton()
                .checkHeaderGoogleAccount(HEADER_GOOGLE_ACCOUNT);
    }

    /**
     ID - 14
     **/
    @Test
    public void verifyUserRegistrationWithFacebook(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnFacebookButton()
                .checkHeaderFacebookAccount(HEADER_FACEBOOK_ACCOUNT);
    }


    /**
     ID - 15
     **/
    @Test
    public void verifyRegistrationWithAppleAccount(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnAppleButton()
                .checkHeaderAppleAccount(HEADER_APPLE_ACCOUNT);
    }

    /**
     ID - 16
     **/
    @Test
    public void verifyHelpButtonIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .checkHeaderHelpPopup(HEADER_HELP_POPUP);
    }

    /**
     ID - 17
     **/
    @Test
    public void verifyArrowDownInHelpPopupIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnArrowDownInHelpPopup()
                .checkIfArrowDownInHelpPopupShowsList();
    }

    /**
     ID - 18
     **/
    @Test
    public void verifyVisitHelpContactButtonIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnVisitHelpContactButtonInHelpPopup()
                .checkHeaderVisitHelpContactPage(HEADER_VISIT_HELP_CONTACT_PAGE);
    }

    /**
     ID - 19
     **/
    @Test
    public void verifyFeedbackButtonIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnFeedbackButton()
                .checkHeaderFeedback(HEADER_FEEDBACK);
    }

    /**
     ID - 21
     **/
    @Test
    public void verifySendButtonInFeedbackIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnFeedbackButton()
                .enterFeedback(FEEDBACK_TEXT)
                .clickOnSendInFeedback();
    }

    /**
     ID - 22
     **/
    @Test
    public void verifyCustomerServiceInFeedbackIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnFeedbackButton()
                .clickOnCustomerServiceInFeedback()
                .checkHeaderCustomerServiceLink(HEADER_CUSTOMER_SERVICE_PAGE);
    }

    /**
     ID - 23
     **/
    @Test
    public void verifyEbayUserAgreementInFeedbackIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnFeedbackButton()
                .clickOnEbayUserAgreementInFeedback()
                .checkHeaderEbayUserAgreementLink(HEADER_USER_AGREEMENT_PAGE);
    }

    /**
     ID - 24
     **/
    @Test
    public void verifyArrowBackInFeedbackIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnFeedbackButton()
                .clickOnArrowBackInFeedback()
                .checkHeaderHelpPopup(HEADER_HELP_POPUP);
    }

    /**
     ID - 25
     **/
    @Test
    public void verifyCloseButtonInHelpPopupIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnHelpButton()
                .clickOnCloseButtonInHelpPopup()
                .verifyHelpPopupWindowClosed();
    }


    /**
    ID - 26
     **/
    @Test
    public void verifyBusinessAccountRegistration(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .enterBusinessEmail(BUSINESS_EMAIL)
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .chooseBusinessLocationGB()
                .clickOnCreateBusinessAccountButton()
                .checkVerifyYourBusinessEmailIsPresent(HEADER_VERIFY_BUSINESS_EMAIL);
    }

    /**
     ID - 33
     **/
    @Test
    public void verifyBizEyeButtonWorks(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .clickOnEyeButton()
                .checkIfEyeButtonShowsBusinessPassword();
    }

    /**
     ID - 36
     **/
    @Test
    public void verifyBusinessAccountRegistrationAsBuyer(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountRadioButton()
                .enterBusinessName(BUSINESS_NAME)
                .enterBusinessEmail(BUSINESS_EMAIL)
                .enterBusinessPassword(BUSINESS_PASSWORD)
                .chooseBusinessLocationGB()
                .clickOnBizAccountToBuyCheckbox()
                .clickOnCreateBusinessAccountButton();
    }

    /**
     ID - 37
     **/
    @Test
    public void verifyBusinessAccountInfoButtonIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountInfoButton()
                .checkBusinessAccountInfoButtonHeader(HEADER_BUSINESS_ACCOUNT_INFO);
    }

    /**
     ID - 38
     **/
    @Test
    public void verifyCloseButtonOfBusinessAccountInfoIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickOnBusinessAccountInfoButton()
                .clickOnBusinessAccountInfoCloseButton()
                .verifyBusinessAccountInfoIsClosed();
    }

    /**
     ID - 39
     **/
    @Test
    public void verifySignInLinkIsClickable(){
        basePage.goToUrl(REGISTRATION_PAGE);
        registrationPage
                .clickSignInLink()
                .checkHeaderSignIn(HEADER_SIGN_IN_PAGE);
    }
}
