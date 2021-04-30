package backbase.qa.bblog.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import backbase.qa.bblog.factory.DriverFactory;
import backbase.qa.bblog.pages.BBlogHomePage;


public class BaseTest {
	
	private WebDriver driver;
	public Properties prop;
	public DriverFactory df;
	public BBlogHomePage bblogHomePage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		bblogHomePage = new BBlogHomePage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
  }

}
