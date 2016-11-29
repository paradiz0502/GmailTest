package pages.POSendMessageForm;

import org.apache.log4j.Logger;
import pages.POMain.MainPage;


/**
 * Created by nykytchuk on 28/11/2016.
 */
public class SendMessageForm extends MainPage{

    private static final Logger log = Logger.getLogger(SendMessageForm.class);
    private SendMessageFormElementMap Map =new SendMessageFormElementMap();

    public void sendMessage(String address, String subject, String message) {
        log.info("Writing message to - " + address + ", with subject - " + subject);
        Map.getSendAddressField().sendKeys(address);
        Map.getSubjectField().sendKeys(subject);
        Map.getMessageTextField().sendKeys(message);
        Map.getSendButton().click();
    }



}
