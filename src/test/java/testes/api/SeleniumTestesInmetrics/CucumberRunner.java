package testes.api.SeleniumTestesInmetrics;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
class CucumberRunner {

	private WebDriver driver;
	
	@Given("^I have open the browser$")
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	
	@When("^I open NGA site$")
	public void goToNGApage() {
		driver.navigate().to("https://www.nga.com");
	}
	
	@Then("^Register button should exists$")
	public void registerButton() {
		if(driver.findElement(By.id("reg")).isEnabled()) {
			System.out.println("Test 1 passed");
		}else {
			System.out.println("Test 1 failed");
		}
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@When("^I forgot to fill the textbox name")
	public void forgotName(String name) {
		if(driver.findElement(By.id("name")).equals(name)) {
			System.out.println("Test name passed");
		}else {
			System.out.println("Test name failed");
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@When("^I forgot to fill the textbox address")
	public void forgotAddress(String address) {
		if(driver.findElement(By.id("adress")).equals(address)) {
			System.out.println("Test address passed");
		}else {
			System.out.println("Test address failed");
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@When("^I forgot to fill textbox phone")
	public void forgotPhone(String phone) {
		if(driver.findElement(By.id("phone")).equals(phone)) {
			System.out.println("Test phone passed");
		}else {
			System.out.println("Test phone failed");
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@When("^I forgot to fill textbox city")
	public void forgotCity(String city) {
		if(driver.findElement(By.id("city")).equals(city)) {
			System.out.println("Test city passed");
		}else {
			System.out.println("Test city failed");
		}
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@When("^I forgot to fill textbox state")
	public void forgotState(String state) {
		if(driver.findElement(By.id("state")).equals(state)) {
			System.out.println("Test satate passed");
		}else {
			System.out.println("Test state failed");
		}
	}
	
	
	
	
}
