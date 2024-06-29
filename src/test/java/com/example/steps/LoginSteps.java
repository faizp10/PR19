package com.example.steps;

import com.example.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        loginPage.enterUsername("invalid_user");
        loginPage.enterPassword("invalid_password");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assertions.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Assertions.assertTrue(driver.getPageSource().contains("Username and password do not match"));
        driver.quit();
    }
}
