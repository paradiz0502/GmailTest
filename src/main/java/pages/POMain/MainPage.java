package pages.POMain;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.POSendMessageForm.SendMessageForm;
import pages.POSentMessage.SentMessage;
import utils.DriverManager;
import utils.PageProvider;

import static java.lang.Thread.sleep;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class MainPage {
    protected WebDriver driver;
    private static final Logger log = Logger.getLogger(MainPage.class);
    private MainPageElementMap Map =new MainPageElementMap();
    private PageProvider page = new PageProvider();

    public MainPage(){
        this.driver = DriverManager.getDriver();
    }

    public SentMessage goToSentMessagePage() {
        Map.getSentPageLink().click();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return page.SentMessagePage();
    }

    public SendMessageForm  clickComposeMessage() {
        Map.getComposeButton().click();
        return page.SendMessageForm();
    }


}
