import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;


public class Cases extends DriverClass {
    @Test(priority = 1, description = "Step 1")
    public void Check() {
        System.out.println("Just checking...");
    }

    public void ForQuit() {
        driver.quit();
    }

    @Test(priority = 2, description = "Step 2")
    public void Login() throws InterruptedException {
        driver.findElement(By.id("user[email]")).sendKeys("leo.awb@gmail.com");
        driver.findElement(By.name("user[password]")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // For page to load properly and navigate to Products page.
        //Thread.sleep(8000);
    }

    public void CheckLogin() {
        String check = driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li[1]/a")).getText();
        assert !Objects.equals(check, "My Dashboard") : "LOGIN WAS UNSUCCESSFUL. PLEASE TRY AGAIN.";
//        if (check != null && check.equals("My Dashboard")) {
//            System.out.println("YOU HAVE LOGGED IN SUCCESSFULLY :)) ");
//        } else {
//            System.out.println("LOGIN WAS UNSUCCESSFUL. PLEASE TRY AGAIN.");
//        }
    }

    public void CreateAccount() throws InterruptedException {
        driver.findElement(By.className("sign-in__sign-up")).click();
        Thread.sleep(8000);

        driver.findElement(By.id("user[first_name]")).sendKeys("Random");
        driver.findElement(By.id("user[last_name")).sendKeys("Person");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("random@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.wait(8000);
    }

    public void LogOut() throws InterruptedException {
        driver.findElement(By.className("dropdown__toggle-button")).click();
        driver.wait(1000);
        driver.findElement(By.xpath("//*[@id=\"header-dropdown-menu\"]/li[4]/a")).click();
        driver.wait(6000);
    }
}
