package testes.api.SeleniumTestesInmetrics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TesteCliente {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//

	private WebDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://inmetrics.com.br");
		driver.manage().window().maximize();
	}
	
	@Test
	public void encontrarElementos() {
		WebElement processoSeletivo = driver.findElement(By.className("option-switcher-heading"));
		assertTrue(processoSeletivo.getText().contains("prova"));
		
		WebElement cursos = driver.findElement(By.id("ctl00_menuprincipal_hp10"));
		assertTrue(cursos.isDisplayed());
		
		WebElement faculdades = driver.findElement(By.id("ctl00_menuprincipal_logo"));
		assertTrue(faculdades.getText().equals("docentes"));
	}
	
	public void atualizar() {
		driver.navigate().refresh();
	}
	
	public void fechar() {
		driver.quit();
	}
}
