package testes.api.SeleniumTestesInmetrics;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ){
    	WebDriver driver = new FirefoxDriver();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dyeslen\\Desktop");
    	try {
    		driver.get("https://www.google.com");
    		driver.findElement(By.name("INSS")).sendKeys("aposentadoria" + Keys.ENTER);
    		WebElement firstResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Show advanced settings...']")));
    		System.out.println(firstResult.getAttribute("textContent"));
    	}finally {
			driver.quit();
		}
    				
    }

	
}
