package testes.api.SeleniumTestesInmetrics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
class CucumberRunner {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	
}
