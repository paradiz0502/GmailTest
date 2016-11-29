package pages.POMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;

/**
 * Created by nykytchuk on 28/11/2016.
 */
public class MainPageElementMap {
    protected WebDriver driver;

    public MainPageElementMap(){
        this.driver = DriverManager.getDriver();
    }


    public WebElement getSentPageLink(){
        return driver.findElement(By.xpath("//a[@title='Sent Mail']"));
    }

    public WebElement getComposeButton(){
        return driver.findElement(By.xpath("//div[@class = 'T-I J-J5-Ji T-I-KE L3']"));
    }




}
