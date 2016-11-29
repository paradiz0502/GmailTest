package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class DriverManager {
    private static WebDriver webDriver;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if(webDriver==null) {

            webDriver = DriverProviderFactory.getDriver(getDriverType());
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return webDriver;
    }

    public static void closeDriver() {
        webDriver.close();
        webDriver.quit();
        webDriver=null;

    }


    public static String getDriverType() {

        return PropertiesManager.getInstance("src/test/resources/driver.properties").getValue("driver.Name");
    }
}
