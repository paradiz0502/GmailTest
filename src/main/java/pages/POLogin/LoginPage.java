package pages.POLogin;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;


public class LoginPage {
    protected WebDriver driver;
    private static final Logger log = Logger.getLogger(LoginPage.class);
    private LoginPageElementMap Map =new LoginPageElementMap();
    private static final String MAIN_GMAIL_PAGE_LOCATION = "https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier";


    public LoginPage(){
        this.driver = DriverManager.getDriver();
    }

    public void openLoginPage(){
        driver.get(MAIN_GMAIL_PAGE_LOCATION);
    }

    public void clickNextButton() {
        this.Map.getNextButton().click();

    }

    public void clickSignINButton() {
        this.Map.getSignInButton().click();
    }


    public void enterName(String name) {
        this.Map.getEmailInputField().sendKeys(name);
    }

    public void enterPassword(String password) {
       this.Map.getInputPasswordField().sendKeys(password);
    }

    public void login(String name, String password){
        log.info("Log in with credentials name - "+name+", password - "+password);
        enterName(name);
        clickNextButton();
        enterPassword(password);
        clickSignINButton();
    }



}
