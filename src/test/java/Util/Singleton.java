package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinition.AbstractStepDef;

import static Util.AbstractLocation.SET_PROPERTY_CHROME;


public class Singleton extends AbstractStepDef {
    public static WebDriver driver = null;
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(String.valueOf(SET_PROPERTY_CHROME), chromeDriver);
            driver = new ChromeDriver();
        }
        return driver;
        }

        public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

}

