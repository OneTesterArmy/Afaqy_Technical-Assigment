package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    WebElement signupLoginBtn;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickSignupLogin()
    {
        signupLoginBtn.click();
    }
}
