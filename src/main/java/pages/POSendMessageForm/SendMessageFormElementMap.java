package pages.POSendMessageForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.POMain.MainPageElementMap;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class SendMessageFormElementMap extends MainPageElementMap{


    public WebElement getSubjectField(){
        return this.driver.findElement(By.xpath("//input[@name = 'subjectbox']"));
    }
    public WebElement getSendAddressField(){
        return this.driver.findElement(By.xpath("//textarea[@role='combobox']"));

    }
    public WebElement getMessageTextField(){
        return driver.findElement(By.xpath("//div[@class = 'Am Al editable LW-avf']"));
    }
    public WebElement getSendButton() {
        return driver.findElement(By.xpath("//div[@class = 'T-I J-J5-Ji aoO T-I-atl L3']"));
    }







}
