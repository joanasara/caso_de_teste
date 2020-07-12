package registerSucefullyTestCase;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
public class registerSuccessFully {
	
	


	

	
	@BeforeAll
	public static void setUp()  {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
	  }


	@Test
	public void testWithFirefox() {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("your firefox version");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);

		 WebDriver driver = new FirefoxDriver(capabilities);

	
		driver.navigate().to("https://www.organizze.com.br/cadastro");
		driver.findElement(By.id("termsOfUse")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("organizze_teste_cadastro0016@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("abcd102030");
		driver.findElement(By.id("passwordConfirmation")).clear();
		driver.findElement(By.id("passwordConfirmation")).sendKeys("abcd102030");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector("h3.signup__status-title.mb-3")).isDisplayed();
	}



}