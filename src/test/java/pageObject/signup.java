package pageObject;


import base.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

public class signup extends config {

    public void createNewAccountButton() {
        driver.findElement(By.xpath("//a[@class='new-account']")).click();
    }

    public void firstName(String name){
        driver.findElement(By.name("firstName")).sendKeys(name);
    }
    public void lastName(String name1){
        driver.findElement(By.name("lastName")).sendKeys(name1);
    }
    public void email(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }
    public void password(String pass){
        driver.findElement(By.name("password")).sendKeys(pass);
    }
    public void confirmPassword(String conPass){
        driver.findElement(By.name("confirmPassword")).sendKeys(conPass);
    }
    public void dob_mn(String month){
//        driver.findElement(By.name("month")).sendKeys("Feb");
        Select mn = new Select(driver.findElement(By.name("month")));
        mn.selectByVisibleText(month);

    }
    public void dob_day(String day){
        Select da = new Select(driver.findElement(By.name("day")));
        da.selectByVisibleText(day);
    }
    public void dob_yr(String year){
        Select yr = new Select(driver.findElement(By.name("year")));
        yr.selectByVisibleText(year);
    }
    public void gender (){
        driver.findElement(By.id("male")).click();
    }

        public void agreement(){
            driver.findElement(By.xpath("//*[@id=\'defaultCheck1\']")).click();
        }
        public void submitButton(String button){
            driver.findElement(By.xpath("//button[@type='submit']")).click();;
        }
    public void verifySuccessfulMessage(String exp) {
        // Selenium code - verify if account is created or not
        String longText = driver.findElement(By.xpath("//*[@id='success_message']/div")).getText();
        //String act = longText.substring(0,21);
        String[] parts = longText.split(",");
        String act = parts[0].trim();
        Assert.assertEquals(act, exp);
    }

    }


