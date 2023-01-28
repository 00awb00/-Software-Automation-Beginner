package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

    public static WebDriver driver;

    public void launchWebBrowser(String appurl) throws Exception {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to(appurl);
            driver.manage().window().maximize();

        } catch (Exception ex) {
            Assert.fail("Unable to launch browser");
        }
    }

}

