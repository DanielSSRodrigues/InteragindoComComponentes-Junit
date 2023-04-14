import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {

	@Test
	public void testeTextField() {
		
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().setSize(new Dimension(1200, 765));
		browser.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		browser.findElement(By.id("elementosForm:nome")).sendKeys("Teste de Escrita");
		Assert.assertEquals("Teste de Escrita", browser.findElement(By.id("elementosForm:nome")));
		
		browser.quit(); 
	}
	
	@Test
	public void deveInteragirComTextArea() {
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().setSize(new Dimension(1200, 765));
		browser.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		browser.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste");
		Assert.assertEquals("teste", browser.findElement(By.id("elementosForm:sugestoes")));
	
		browser.quit(); 

	}
	
	@Test
	public void deveinteragirComRabioButton(){
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().setSize(new Dimension(1200, 765));
		browser.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		browser.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(browser.findElement(By.id("elementosForm:sexo:0")).isSelected());//Assertiva se o o campo foi marcado
		browser.quit(); 
}
	
	@Test
	public void deveinteragirComCheckBox(){
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().setSize(new Dimension(1200, 765));
		browser.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		browser.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		Assert.assertTrue(browser.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());//Assertiva se o o campo foi marcado
		//browser.quit(); 
}
}