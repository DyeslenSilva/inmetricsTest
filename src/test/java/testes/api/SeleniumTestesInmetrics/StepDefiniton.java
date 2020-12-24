package testes.api.SeleniumTestesInmetrics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class StepDefiniton {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Given("^sample feature file is ready$")
	public void givenStatment() {
		System.out.println("Given statement executed succesfully");
	}
	
	@When("^I run the feature file$")
	public void whenStatement() {
		System.out.println("When statement executed successfully");
	}
	
	@Then("^run should be successful$")
	public void thenStatement() {
		System.out.println("Then statement executed successfully");
	}
	
	
	
}
