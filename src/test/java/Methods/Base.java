package Methods;

import Utils.Launch;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base extends Launch {

    WebElement elem;

    public WebElement xpath(String xpath) {
        try {
            elem = driver.findElement(By.xpath(xpath));
        } catch (Exception ex) {
            Assert.fail("XPATH does not exist");
        }
        return elem;
    }

    public WebElement id(String id) {
        try {
            elem = driver.findElement(By.id(id));
        } catch (Exception ex) {
            Assert.fail("ID does not exist");
        }
        return elem;
    }

    public WebElement classelem(String elem) {
        try {
            this.elem = driver.findElement(By.className(elem));
        } catch (Exception ex) {
            Assert.fail("Element does not exist");
        }
        return this.elem;
    }

    public void senddata(String attr, WebElement driver) {
        try {
            driver.clear();
            driver.sendKeys(attr);
        } catch (Exception ex) {
            Assert.fail("Failed to send data");
        }
    }

    public void click(WebElement driver) {
        try {
            driver.click();
        } catch (Exception ex) {
            Assert.fail("Failed to click");
        }
    }

    public void cleartext(WebElement driver) {
        try {
            driver.clear();
        } catch (Exception ex) {
            Assert.fail("Unable to clear the text");
        }
    }

    public void goback() {
        try {
            driver.navigate().back();
        } catch (Exception ex) {
            Assert.fail("Unable to go back");
        }
    }

    public void quit() {
        driver.quit();
    }


}
