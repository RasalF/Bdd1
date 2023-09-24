package stepDef;

import base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.signup;

public class signUp_steps extends config {

    Faker f = new Faker();
    signup s = new signup();

    @Given("user at TalentTek")
    public void userAtTalentTek() {
        //verify the home page
        String exp ="Sign In";
        String act = driver.getTitle();
        Assert.assertEquals(act, exp);

    }

    @And("user click on {string} Button")
    public void userClickOnButton(String buttonName) {
        // link to click on Create account button
        driver.findElement(By.linkText("+buttonName+")).click();

    }

    @And("user fill out the sign up form with all valid data")
    public void userFillOutTheSignUpFormWithAllValidData() {
        //All the details to fillip the signup page

        s.firstName(f.name().firstName());
        s.lastName(f.name().lastName());
        s.email(f.internet().emailAddress());
        s.password("");
        s.confirmPassword("");
        s.dob_mn("");
        s.dob_day("");
        s.dob_yr("");
        s.gender("randomGender");
        s.agreement();


    }

    @When("user click on {string} button at the end")
    public void userClickOnButtonAtTheEnd(String buttonName) {
        s.button();
    }

    @Then("user should be able to see {string} message")
    public void userShouldBeAbleToSeeMessage(String text) {

        // Selenium code - verify if account is created or not
        String longText = driver.findElement(By.xpath("//*[@id='success_message']/div")).getText();
        //String act = longText.substring(0,21);
        String[] parts = longText.split("-");
        String act = parts[0].trim();
        Assert.assertEquals(act, text);

    }
}
