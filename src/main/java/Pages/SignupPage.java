package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage
{
    WebDriver driver;
    @FindBy(name = "name")
    WebElement nameInput;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailInput;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupBtn;
    @FindBy(id = "id_gender1")
    WebElement genderMale;
    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "days")
    WebElement days;

    @FindBy(id = "months")
    WebElement months;

    @FindBy(id = "years")
    WebElement years;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccountBtn;

    public SignupPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterSignupNameEmail(String name, String email)
    {
        nameInput.sendKeys("Taha");
        emailInput.sendKeys("itaha903@gmail.com");
        signupBtn.click();
    }
    public void fillSignupForm(String password)
    {
        genderMale.click();
        passwordInput.sendKeys("Test@1234");
        days.sendKeys("11");
        months.sendKeys("December");
        years.sendKeys("1992");
        createAccountBtn.click();
    }
}
