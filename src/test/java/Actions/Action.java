package Actions;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Util.Singleton.driver;

public class Action {
    public static void isDisplayed(WebElement element) {
        element.isDisplayed();
    }

    public static void sendKey(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void click(WebElement element, Integer timeToWaitInSeconds) {
        try {
            Thread.sleep(timeToWaitInSeconds * 1000);
            element.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void navigate(String navigateTo, WebDriver driver) {
        driver.get(navigateTo);
    }
}
//   public static void takeScreenShort(Scenario scenario, WebDriver driver) {
//        try {
//            String screenshortName = generateScreenshortName(scenario.getName());
//            String directoryName = "target/screenshorts/";
//            createDirectoryIfNotExists(directoryName);
//            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(file, new File(directoryName + screenshortName + ".png"));
//        } catch (Exception e) {
//            System.out.println("Screenshort nu lucreaza" + e);
//   }
//
//}
//private static String generateScreenshortName(String scenarioName) {
//    LocalDateTime currentTime = LocalDateTime.now();
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
//    String timestamp = currentTime.format(formatter);
//    return scenarioName.replaceAll("[a-zA-ZO-9_-]", "_") + "_" + timestamp;
//}
//}

