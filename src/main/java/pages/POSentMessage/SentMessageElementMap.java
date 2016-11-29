package pages.POSentMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.POMain.MainPageElementMap;

import java.util.List;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class SentMessageElementMap extends MainPageElementMap {

    public WebElement getLastMessageSubject(){
        return driver.findElement(By.xpath("//div[7]/div[3]//div[2]/div[1]//div[4]/div[1]//table/tbody/tr/td[6]//span[1]"));
    }

    public WebElement getConfirmDeleteButton(){
        return driver.findElement(By.xpath("//*[@name='ok']"));
    }

    public WebElement getLastMessageCheck(){
        List<WebElement> mesagesCheck = driver.findElements(By.xpath("//*[@role='checkbox']"));

        return mesagesCheck.get(40);

    }
    public WebElement getDeleteButton(){
        List<WebElement> panelElements  = driver.findElements(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']"));
        return panelElements.get(1);
    }

}
