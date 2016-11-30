package com.nikitchuk.gmail.test;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.*;
import utils.DriverManager;
import utils.PageProvider;
import utils.XMLDataProvider;


//@Listeners({ReportPortalTestNGListener.class})
public class GmailTestSuit {

    private final static Logger log = Logger.getLogger(GmailTestSuit.class);
    PageProvider page = new PageProvider();

    @BeforeSuite
    public void beforeSuite() {
        DriverManager.getDriver();
    }

    @DataProvider(name = "LoginTestData")
    public Object[][] getLoginData() {
        return XMLDataProvider.xmlParser("login");
    }

    @DataProvider(name = "MessageTestData")
    public Object[][] getMessageData() {
        return XMLDataProvider.xmlParser("message");
    }


    @AfterSuite
    public void tearDown() {
        DriverManager.closeDriver();
    }


    @Test(dataProvider = "LoginTestData", groups = "Group1")
    public void loginTest(String name, String password) {
        page.Login().openLoginPage();
        page.Login().login(name, password);
    }

    @Test(dataProvider = "MessageTestData", groups = "Group2")
    public void messageSentTest(String address, String subject, String messageText) {
        page.Main().clickComposeMessage().sendMessage(address,subject,messageText);
        page.Main().goToSentMessagePage();
        if(page.SentMessagePage().Validate().assertMessagePresent(subject)) {
            page.SentMessagePage().deleteLastMessage();
        }
    }

    @Test
    public void failTest() {
        log.error("Problem - ERROR");
        Assert.fail("problems");
    }

    @Test
    public void logVariantsTest() {
        log.error("Problem - ERROR");
        log.error("Problem - ERROR");
        log.error("Problem - ERROR");
        log.info("Problem - Info");
        log.info("Problem - Info");
        log.warn("Problem - Warning");
        log.debug("Problem - Debug");

    }





}
