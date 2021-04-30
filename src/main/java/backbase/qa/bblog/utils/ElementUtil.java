package backbase.qa.bblog.utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;	
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public void dolinkclick(By locator,String value) {
		List<WebElement> linkList = getElements(locator);
		System.out.println("total links : "+linkList.size());
        for(WebElement e : linkList) {
		String text = e.getText();
        System.out.println(text);
		if(text.equals(value)) {
			e.click();
			break;
		}
	}
		
	}
	
//	***********************************************************Wait Utils***************************************************************
	
	public String waitForTitleIs(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
		
	}
}










