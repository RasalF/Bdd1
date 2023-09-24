package pageObject;


import base.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class signup extends config {

    public void firstName(String name){
        driver.findElement(By.name("firstName")).sendKeys(name);
    }
    public void lastName(String name){
        driver.findElement(By.name("lastname")).sendKeys(name);
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
        Select mn = new Select(driver.findElement(By.name("month")));
        mn.selectByVisibleText("feb");
    }
    public void dob_day(String day){
        Select da = new Select(driver.findElement(By.name("day")));
        da.selectByVisibleText("10");
    }
    public void dob_yr(String year){
        Select yr = new Select(driver.findElement(By.name("year")));
        yr.selectByVisibleText("2000");
    }
    public void gender (String gen) {
        // Generate a random number (0 or 1) to represent gender (0 for male, 1 for female)
        Random random = new Random();
        int randomGender = random.nextInt(2); // 0 or 1
        // Find the gender input element
        WebElement genderInput = driver.findElement(By.xpath("//form[@id=\'signup-form\']/label[2]"));
        if (randomGender == 0) {
            // Select Male
            genderInput.findElement(By.id("male")).click();
        } else {
            // Select Female
            genderInput.findElement(By.id("female")).click();
        }
    }
        public void agreement(){
            driver.findElement(By.xpath("//span[@class='help-block']")).click();
        }
        public void button(){
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

    }


