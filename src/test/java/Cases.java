import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Objects;


public class Cases extends DriverClass {

    Actions action = new Actions(driver);

    public Cases() throws InterruptedException {
    }

    @Test(priority = 1, description = "Step 1")
    public void Check() {
        System.out.println("Just checking...");
    }

    @Test(priority = 2, description = "Step 2")
    public void Men() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[2]/a")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 3, description = "Step 3")
    public void selectproduct(String product, String size, String color) throws InterruptedException {
        driver.findElement(By.xpath(product)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(size)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(color)).click();
        Thread.sleep(3000);
        driver.findElement(By.id("product-addtocart-button")).click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Test(priority = 4, description = "Step 4")
    public void billing() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("top-cart-btn-checkout")).click();
        Thread.sleep(6000);
    }
    @Test(priority = 5, description = "Step 5")
    public void form() throws InterruptedException {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("leo.awb@gmail.com");
        //WebElement email = driver.findElement(By.name("username"));
        //action.moveToElement(email).click().sendKeys("leo.awb@gmail.com");
        driver.findElement(By.name("firstname")).sendKeys("Abdul Wahab");
        driver.findElement(By.name("lastname")).sendKeys("Butt");
        driver.findElement(By.name("street[0]")).sendKeys("Address 1");
        driver.findElement(By.name("street[1]")).sendKeys("Address 2");
        driver.findElement(By.name("street[2]")).sendKeys("Address 3");
        driver.findElement(By.name("city")).sendKeys("Karachi");

        Select state = new Select(driver.findElement(By.xpath("//*[@id='K9SXBIO']")));
        state.deselectByValue("Alaska");

        driver.findElement(By.name("postcode")).sendKeys("9999");

        Select count = new Select(driver.findElement(By.xpath("//*[@id='QK94IAA']")));
        count.deselectByValue("Pakistan");

        driver.findElement(By.xpath("//*[@id=\"GTBT796\"]")).sendKeys("03322109944");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 6, description = "Step 6")
    public void confirmation() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String check = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
        assert !Objects.equals(check, "Thank you for your purchase!") : "LOGIN WAS UNSUCCESSFUL. PLEASE TRY AGAIN.";

//        if (check.equals("Thank you for your purchase!")) {
//            System.out.println("YOU HAVE LOGGED IN SUCCESSFULLY :)) ");
//        } else {
//            System.out.println("LOGIN WAS UNSUCCESSFUL. PLEASE TRY AGAIN.");
//        }

    }


}
