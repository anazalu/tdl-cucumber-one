package com.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {
    private final WebDriver driver = WebDriverConfig.getDriver();

    @Given("I am on the Automation Exercise front page")
    public void i_am_on_the_automation_exercise_page() {
        driver.get("https://www.automationexercise.com/");
    }

    @When("I do nothing")
    public void searchFor() {
    }

    @Then("the page title should be {string}")
    public void checkTitle(String titleText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().equals(titleText);
            }
        });
    }

    @Then("the page should contain {string}")
    public void checkProductsFake(String titleText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().equals(titleText);
            }
        });
    }

    @After()
    public void closeBrowser() {
        WebDriverConfig.quitDriver();
    }
}
