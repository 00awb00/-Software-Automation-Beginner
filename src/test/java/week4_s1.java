import com.sun.glass.ui.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class week4_s1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Software Automation/sqa2/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ultimateqa.com/automation");
        Thread.sleep(3000);
        driver.manage().window().maximize();
//        driver.navigate().to("www.google.com");
//        driver.navigate().back();

        driver.findElement(By.xpath("//*[@id=\"post-507\"]/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/ul/li[6]/a")).click();
        Thread.sleep(2000);
//
//        driver.findElement(By.id("user[email]")).sendKeys("leo.awb@gmail.com");
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/aside/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"user[first_name]\"]")).sendKeys("Abdul Wahab");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"user[last_name]\"]")).sendKeys("Butt");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("leo.awb@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"user[terms]\"]")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        // String check = driver.findElement(By.className("header__nav-item header__nav-item--default")).getText();
        String check = driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li[1]")).getText();
        if (check != null && check.equals("My Dashboard")) {
            System.out.println("YOU HAVE LOGGED IN SUCCESSFULLY :)) ");
        } else {
            System.out.println("LOGIN WAS UNSUCCESSFUL. PLEASE TRY AGAIN.");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
