package RunCases;

import Methods.Base;
import PageFactory.*;
import Propreader.PropertyReader;
import Utils.ToSleep;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.ITestResult;

import java.io.File;

import static Utils.Launch.driver;

public class RUN extends PropertyReader {

    Base Method = new Base();


    login login = new login();
    ToSleep sleep = new ToSleep();
    sidebar side = new sidebar();
    navbar nav = new navbar();
    ginfo info = new ginfo();
    location loc = new location();


    @BeforeClass()
    public void Driver() throws Exception {
        Load("src/test/java/Resources/config.properties");
        login.launchWebBrowser(GetValue("url"));
    }

    // Case 1
    // When both, password and username are left empty.
    @Test(priority = 1)
    public void Case1() throws InterruptedException {
        sleep.wait(3000);
        login.Submit("//button[@type=\"submit\"]");
    }

    // Case 2
    // When password is correct but username is left empty.
    @Test(priority = 2)
    public void Case2() throws InterruptedException {
        sleep.wait(3000);
        login.Email("//input[@name=\"username\"]", " ");
        login.Password("//input[@name=\"password\"]", GetValue("password"));
        login.Submit("//button[@type=\"submit\"]");
    }


    // Case 3
    // When username is correct but password is left empty.
    @Test(priority = 3)
    public void Case3() throws InterruptedException {
        sleep.wait(3000);
        login.Email("//input[@name=\"username\"]", GetValue("username"));
        login.Password("//input[@name=\"password\"]", " ");
        login.Submit("//button[@type=\"submit\"]");
    }


    // Case 4
    // When password and username, both are wrong.
    @Test(priority = 4)
    public void Case4() throws InterruptedException {
        sleep.wait(3000);
        login.Email("//input[@name=\"username\"]", "awb");
        login.Password("//input[@name=\"password\"]", "mymymy");
        login.Submit("//button[@type=\"submit\"]");
    }

    // Case 4
    // When username and password, both are correct.
    @Test(priority = 5)
    public void Case5() throws InterruptedException {
        sleep.wait(3000);
        login.Email("//input[@name='username']", GetValue("username"));
        login.Password("//input[@name='password']", GetValue("password"));
        login.Submit("//button[@type='submit']");

    }


    // GENERAL INFORMATION PAGE


    @Test(priority = 6)
    public void selectsidebar() throws InterruptedException {
        sleep.wait(3000);
        side.sidebar("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    }

    @Test(priority = 7)
    public void navselection() throws InterruptedException {
        sleep.wait(3000);
        nav.option("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span");
        sleep.wait(3000);
        nav.ddoption("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]");
        sleep.wait(3000);
    }

    @Test(priority = 8)
    public void alloweidt() {
        info.toclick("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div/label/span");
    }

    @Test(priority = 9)
    public void organization_name() {
        info.sendinfo(GetValue("OrganizationName"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input");
    }

    @Test(priority = 10)
    public void registration_number() {
        info.sendinfo(GetValue("RegistrationNumber"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    }

    @Test(priority = 11)
    public void tax_id() {
        info.sendinfo(GetValue("TaxID"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    }


    @Test(priority = 12)
    public void Phone() {
        info.sendinfo(GetValue("Phone"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
    }

    @Test(priority = 13)
    public void Fax() {
        info.sendinfo(GetValue("Fax"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    }

    @Test(priority = 14)
    public void Email() {
        info.sendinfo(GetValue("Email"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[3]/div/div[2]/input");
    }

    @Test(priority = 15)
    public void Add() {
        info.sendinfo(GetValue("Add"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/input");
    }

    @Test(priority = 16)
    public void City() {
        info.sendinfo(GetValue("City"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/input");
    }

    @Test(priority = 17)
    public void State() {
        info.sendinfo(GetValue("State"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input");
    }


    @Test(priority = 18)
    public void Zip() {
        info.sendinfo(GetValue("Zip"), "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/input");
    }

    @Test(priority = 19)
    public void Save() {
        info.toclick("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/button");
    }


    // LOCATIONS PAGE

    @Test(priority = 20)
    public void navselect() throws InterruptedException {
        nav.option("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span");
        sleep.wait(2000);
        nav.option("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]");
        sleep.wait(2000);
    }

    @Test(priority = 21)
    public void searchlocation() throws InterruptedException {
        loc.SearchEdit("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input",
                GetValue("City"));
        loc.toclick("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
        sleep.wait(3000);
    }

    @Test(priority = 22)
    public void newvalue() {
        loc.toclick("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[7]/div/button[2]");
        loc.SearchEdit("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input", GetValue("City"));
        loc.toclick("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    }

    @Test(priority = 23)
    public void todelete() {
        loc.toclick("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[7]/div/button[1]");
        loc.toclick("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
    }



    @Test(priority = 50)
    public void quit() throws InterruptedException {
        sleep.wait(3000);
        Method.quit();
    }


    @AfterMethod
    public static void captureScreenshot(ITestResult result) {

        if (ITestResult.SUCCESS == result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(src, new File("src/test/java/ScreenShot/" + result.getName() + ".png"));
                System.out.println("Successfully captured a screenshot");

            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
    }
}
