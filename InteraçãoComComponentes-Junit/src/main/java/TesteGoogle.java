import org.openqa.selenium.Dimension;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	@Test
	public void teste() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		//driver.manage().window().maximize(); maximizar
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle()); //Assertiva, validando se o nome "google" é igual ao gettitle da tela
		
		//driver.close();
		driver.quit();
	}
	
}
