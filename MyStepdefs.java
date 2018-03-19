package stepdefs;

import Pages.Home;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    public static WebDriver driver;

    @Given("^I am on the home page$")
    public void IAmOnTheHomePage() throws Throwable {
        System.out.println("Executed HomePage StepDef");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.macys.com");
    }


    @When("^I search with \"([^\"]*)\" keyword$")
    public void iSearchWithKeyword(String keyword) throws Throwable {
        Home home = new Home(driver);
        home.search(keyword);
    }

    @Then("^I should see search results$")
    public void iShouldSeeSearchResults() throws Throwable {

    }

    @When("^I click on search results product$")
    public void iClickOnSearchResultsProduct() throws Throwable {

    }

    @Then("^I should see product details page$")
    public void iShouldSeeProductDetailsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should product image$")
    public void iShouldProductImage() throws Throwable {

    }
}
