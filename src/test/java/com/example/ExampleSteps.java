package com.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {
    private final WebDriver driver = WebDriverConfig.getDriver();
    private By productsLinkBy = By.xpath("//a[@href='/products']");

    @Given("I am on the Automation Exercise front page")
    public void i_am_on_the_automation_exercise_page() {
        driver.get("https://www.automationexercise.com/");
    }

    // @Then("the page title should be {string}")
    // public void checkTitle(String titleText) {
    //     new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
    //         public Boolean apply(WebDriver d) {
    //             return d.getTitle().equals(titleText);
    //         }
    //     });
    // }

    @Then("the page title should be {string}")
    public void checkTitle(String titleText) {
        String actualTitle = driver.getTitle();
        String expectedTitle = titleText;
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
    }

    @Then("the Products link should contain text {string}")
    public void checkProductsLinkText(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productsLink = wait.until(ExpectedConditions.visibilityOfElementLocated(productsLinkBy));
        String actualLinkText = productsLink.getText();
        String expectedLinkTextFragment = linkText;
        Assert.assertTrue(actualLinkText.contains(expectedLinkTextFragment), "Link text mismatch");
    }

    @When("I click Products link")
    public void clickProductsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productsLink = wait.until(ExpectedConditions.visibilityOfElementLocated(productsLinkBy));
        productsLink.click();
    }

    @Then ("the Products page opens that has {string} header")
    public void verifyLocationIsProductsPage(String headerText) {
        By allProductsHeaderBy = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2");        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement allProductsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsHeaderBy));
        String actualHeaderText = allProductsHeader.getText().toLowerCase();
        String expectedHeaderText = headerText.toLowerCase();
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "Header text mismatch");
    }

    @After()
    public void closeBrowser() {
        WebDriverConfig.quitDriver();
    }
}
