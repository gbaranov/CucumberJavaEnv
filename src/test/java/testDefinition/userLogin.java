package testDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userLogin {

    WebDriver driver = new ChromeDriver();

    @Given("Open Amazon page")
    public void openWebPage() {
        //System.setProperty("webdriver.chrome.driver", "/Users/admin/IdeaProjects/CuTest/chromedriver");
        driver.get("https://amazon.com");
    }

    @When("Click login")
    public void clickLogin() {
        driver.findElement(By.id("nav-link-accountList")).click();
    }


    @When("^Enters username as \"(.*)\"$")
    public void entersCredentials(String username) {
        driver.findElement(By.id("ap_email")).sendKeys(username);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("testpass");
        driver.findElement(By.id("signInSubmit")).click();
    }

    @When("^the user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String user, String pass) {

    }

    @Then("Info shows up")
    public void showInfo() {
        System.out.println("Third step");
        String notice = driver.findElement(By.xpath("//*[@id=\"body\"]/div/div/div[2]/span")).getText();
        Assert.assertTrue(notice.contains("To continue, approve the notification sent to:"));
        driver.quit();
    }


}
