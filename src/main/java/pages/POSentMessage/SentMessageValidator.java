package pages.POSentMessage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import pages.POMain.MainPageValidator;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class SentMessageValidator extends MainPageValidator {
    private static final Logger log = Logger.getLogger(SentMessageValidator.class);
    private SentMessageElementMap Map =new SentMessageElementMap();

    public boolean assertMessagePresent(String expected) {
        log.info("Verify if message is present in current folder");
        Boolean result;
        String actual = Map.getLastMessageSubject().getText();
        try {
            Assert.assertEquals(actual, expected);
            log.info("Message is present in current folder");
            result = true;
        } catch (AssertionError d) {
            log.error(d);
            result = false;
        }

        return result;
    }

}
