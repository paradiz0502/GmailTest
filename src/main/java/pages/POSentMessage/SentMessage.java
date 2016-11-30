package pages.POSentMessage;

import org.apache.log4j.Logger;
import pages.POMain.MainPage;

import static java.lang.Thread.*;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class SentMessage extends MainPage {
    private static final Logger log = Logger.getLogger(SentMessage.class);
    SentMessageElementMap Map = new SentMessageElementMap();

    public SentMessageValidator Validate(){
        return new SentMessageValidator();
    }

    public void deleteLastMessage() {
        Map.getLastMessageSubject().click();
        Map.getDeleteButton().click();
        log.info("Message has been deleted");

    }
}
