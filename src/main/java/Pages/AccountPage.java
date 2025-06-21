package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage
{
    private WebDriver driver;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    WebElement accountCreatedMsg;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logoutBtn;
    public AccountPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getAccountCreatedMessage()
    {
        return accountCreatedMsg.getText();
    }

    public void logout()
    {
        logoutBtn.click();
    }
}
