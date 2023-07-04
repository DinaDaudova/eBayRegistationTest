package constants;
import org.apache.commons.lang3.RandomStringUtils;



public class Constants {
    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 10;
    }
    public static class Urls{
        public static final String REGISTRATION_PAGE = "https://signup.ebay.com/pa/crte";

    }
    public static class TestDataForSigningIn {

            public static String generatePassword(int length) {
                String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
                return RandomStringUtils.random(length, characters);
            }

            public static final String NEW_PASSWORD = generatePassword(10);
            public static final String EXISTING_PASSWORD = "-nnS79GZaMVeTf8";
            public static final String INVALID_PASSWORD_NO_LETTER = "1111111111";
            public static final String INVALID_PASSWORD_NO_SYMBOLS = "LLLLLLLLLL";
            public static final String INVALID_PASSWORD_LESS_CHARACTERS = "L1";

        public final static String FIRST_NAME = "Dina";
        public final static String INVALID_FIRST_NAME_NUMBERS = "88888888";
        public final static String INVALID_FIRST_NAME_SYMBOLS = "---";
        public final static String LAST_NAME = "El";
        public final static String INVALID_LAST_NAME_NUMBERS = "88888888";
        public final static String INVALID_LAST_NAME_SYMBOLS = "---";
        public final static String NEW_EMAIL = "test" + RandomStringUtils.randomAlphanumeric(5) + "@gmail.com";
        public final static String EXISTING_EMAIL = "test3@gmail.com";
        public final static String INVALID_EMAIL_MISSING_SIGN = "test3gmail.com";
        public final static String INVALID_EMAIL_MISSING_DOMAIN = "test3@gmail";
        public final static String INVALID_EMAIL_CYRILLIC_LETTERS = "тест@пьфшд.сщь";
        public final static String INVALID_EMAIL_SYMBOLS = "---@gmail.com";

        public final static String ERROR_TEXT_EMPTY_FIRST_NAME = "Please enter your first name";
        public final static String ERROR_TEXT_INVALID_FIRST_NAME = "First name format is invalid. Please enter a valid first name";
        public final static String ERROR_TEXT_EMPTY_LAST_NAME = "Please enter your last name";
        public final static String ERROR_TEXT_INVALID_LAST_NAME = "Last name format is invalid. Please enter a valid Last name";
        public final static String ERROR_TEXT_EMPTY_EMAIL_ADDRESS = "Please enter your email address.";
        public final static String ERROR_TEXT_INVALID_EMAIL_ADDRESS = "Email address is invalid. Please enter a valid email address.";
        public final static String ERROR_TEXT_EMPTY_PASSWORD = "Please enter a password.";
        public final static String ERROR_TEXT_INVALID_PASSWORD = "At least 1 letter, a number or symbol, at least 8 characters.";
        public final static String HEADER_GOOGLE_ACCOUNT = "Вход";
        public final static String HEADER_FACEBOOK_ACCOUNT = "Вход на Facebook";
        public final static String HEADER_APPLE_ACCOUNT = "Use your Apple ID to sign in to eBay.";
        public final static String HEADER_ACCOUNT_EXISTS = "An account already exists";


        public final static String HEADER_HELP_POPUP = "Help";
        public final static String HEADER_VISIT_HELP_CONTACT_PAGE = "How can we help you today?";
        public final static String HEADER_FEEDBACK = "Tell us about any difficulties you had during registration";
        public final static String FEEDBACK_TEXT = RandomStringUtils.randomAlphanumeric(50);
        public final static String HEADER_CUSTOMER_SERVICE_PAGE = "How can we help you today?";
        public final static String HEADER_SIGN_IN_PAGE = "Hello";
        public final static String HEADER_USER_AGREEMENT_PAGE = "User Agreement";
        public final static String HEADER_USER_PRIVACY_PAGE = "User Privacy Notice";

        public final static String BUSINESS_NAME = "Dina";
        public final static String BUSINESS_EMAIL = "test" + RandomStringUtils.randomAlphanumeric(5) + "@gmail.com";
        public final static String EXISTING_BUSINESS_EMAIL = "test3@gmail.com";
        public final static String BUSINESS_PASSWORD = generatePassword(10);
        public static final String EXISTING_BUSINESS_PASSWORD = "-nnS79GZaMVeTf8";

        public final static String HEADER_VERIFY_BUSINESS_EMAIL = "Verify your email address";
        public final static String ERROR_TEXT_EMPTY_BUSINESS_NAME = "Please enter your business name.";
        public final static String ERROR_TEXT_EMPTY_BUSINESS_EMAIL = "Please enter your email address.";
        public final static String ERROR_TEXT_EMPTY_BUSINESS_PASSWORD = "Please enter a password.";
        public final static String INVALID_BUSINESS_NAME_NUMBERS = "88888888";
        public final static String INVALID_BUSINESS_NAME_SYMBOLS = "---";
        public final static String INVALID_BUSINESS_EMAIL_MISSING_SIGN = "test3gmail.com";
        public final static String INVALID_BUSINESS_EMAIL_MISSING_DOMAIN = "test3@gmail";
        public final static String INVALID_BUSINESS_EMAIL_CYRILLIC_LETTERS = "тест@пьфшд.сщь";
        public final static String INVALID_BUSINESS_EMAIL_SYMBOLS = "---@gmail.com";
        public final static String ERROR_TEXT_INVALID_BUSINESS_NAME = "Business name format is invalid. Please enter a valid first name";
        public final static String ERROR_TEXT_INVALID_BUSINESS_EMAIL = "Email address is invalid. Please enter a valid email address.";
        public final static String ERROR_TEXT_EXISTING_BUSINESS_EMAIL = "Your email address is already registered with eBay. Need help with your password";
        public final static String ERROR_TEXT_INVALID_BUSINESS_PASSWORD = "At least 1 letter, a number or symbol, at least 8 characters.";
        public static final String INVALID_BUSINESS_PASSWORD_NO_LETTER = "1111111111";
        public static final String INVALID_BUSINESS_PASSWORD_NO_SYMBOLS = "LLLLLLLLLL";
        public static final String INVALID_BUSINESS_PASSWORD_LESS_CHARACTERS = "L1";
        public static final String HEADER_BUSINESS_ACCOUNT_INFO = "You should choose this option if:";

    }

}
