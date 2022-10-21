package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgSteps {
WebDriver driver = new ChromeDriver();
 String varExe="C://Driver//chromedriver.exe/";
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.SetProperty("webdriver.chrome.driver", varExe);
        driver=new ChromeDriver();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get ("https://opensource-demo.orangehrmlive.com/");

    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[1]/img")).isDisplayed();
        Assert.assertArrayEquals(true,status);

    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();

    }


}
