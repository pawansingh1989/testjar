package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestJar {

	public WebDriver driver;
	
	@Test
	public void test(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
