package listener.base;

import driverFactory.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sergey_Potapov
 */

public class BaseTest {
    protected static WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
    }

    public static String capture(String screenShotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + "/ErrorScreenShot/" + screenShotName + ".png";
        File destination = new File(dest);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dest;
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}