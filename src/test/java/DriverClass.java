import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.Time;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DriverClass {

    public WebDriver driver = launchWebDriver();

    public DriverClass() throws InterruptedException {
    }

    @BeforeClass
    public WebDriver launchWebDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        return driver;
    }
}
