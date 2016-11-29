package pages.POLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DriverManager;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class LoginPageElementMap {

    private WebDriver driver;

    @FindBy(id = "Email")
    private WebElement emailInputField;

    @FindBy(id = "next")
    private WebElement nextButoon;

    @FindBy(id = "Passwd")
    private WebElement inputPasswordField;

    @FindBy(id = "signIn")
    private WebElement signInButton;


    public LoginPageElementMap(){
        this.driver = DriverManager.getDriver();
    }

    public WebElement getEmailInputField(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement getNextButton(){
        return driver.findElement(By.id("next"));
    }

    public WebElement getInputPasswordField(){
        return driver.findElement(By.id("Passwd"));
    }

    public WebElement getSignInButton(){
        return driver.findElement(By.id("signIn"));
    }


}
