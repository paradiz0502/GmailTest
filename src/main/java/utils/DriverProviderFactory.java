package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverProviderFactory {
    private static final String CHROME_DRIVER_PATH = "src\\resources\\chromedriver.exe";
    private static final String CHROME_PROPERTY_KEY = "webdriver.chrome.driver";

    public static WebDriver getDriver (String driverName) {
        if ("chrome".equals(driverName)){
            System.setProperty(CHROME_PROPERTY_KEY,CHROME_DRIVER_PATH);
            return new ChromeDriver();
        }else{
            return new FirefoxDriver();
        }

    }

}
