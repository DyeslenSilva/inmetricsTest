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
		driver.get("https://nga.com.br");
		driver.manage().window().maximize();
	}
	
	@Test
	public void encontrarElementos() {
		WebElement processoSeletivo = driver.findElement(By.className("clientSide"));
		assertTrue(processoSeletivo.getText().contains("cliente"));
		
		WebElement cursos = driver.findElement(By.id("nomeCliente"));
		assertTrue(cursos.isDisplayed());
		
		WebElement faculdades = driver.findElement(By.id("endereco"));
		assertTrue(faculdades.getText().equals("enderecoCliente"	));
	}
	
	public void atualizar() {
		driver.navigate().refresh();
	}
	
	public void fechar() {
		driver.quit();
	}
}
