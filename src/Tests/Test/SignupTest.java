package Test;

import Base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.*;

public class SignupTest extends BaseTest
{

    @Test
    public void testSignupFlow()
    {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        SignupPage signupPage = new SignupPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        String uniqueEmail = "user" + System.currentTimeMillis() + "@test.com";

        homePage.clickSignupLogin();
        signupPage.enterSignupNameEmail("John Doe", uniqueEmail);
        signupPage.fillSignupForm("Test@1234");

        String successMsg = accountPage.getAccountCreatedMessage();
        softAssert.assertEquals(successMsg, "ACCOUNT CREATED!", "Account creation message should match.");

        accountPage.logout();

        softAssert.assertAll();
    }
}
