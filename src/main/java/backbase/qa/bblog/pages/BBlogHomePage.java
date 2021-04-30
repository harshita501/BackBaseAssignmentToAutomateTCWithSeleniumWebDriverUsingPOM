package backbase.qa.bblog.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import backbase.qa.bblog.utils.Constants;
import backbase.qa.bblog.utils.ElementUtil;

public class BBlogHomePage {
	
	private ElementUtil elementUtil;
	private WebDriver driver;
	
//	Page Objects - By locators - OR
	private By header = By.xpath("/html/body/app-root/app-home/div/div[1]/div/p");
	private By yourFeed = By.xpath("/html/body/app-root/app-home/div/div[2]/div/div[1]/div/ul/li[1]/a");
	private By popularTageCount = By.cssSelector(".tag-list a");
	
	
	
//	constructor:
	public BBlogHomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
//	page actions:
	
	public String getHomePageTitle() {
		return elementUtil.waitForTitleIs(5, Constants.HOME_PAGE_TITLE);
	}
	
	public boolean isHeaderTextExist() {
		return 	elementUtil.doIsDisplayed(header);
	}
	
	public void doClickOnYourFeed() {
		elementUtil.doClick(yourFeed);
	}
	
	public List<String> getPopularTagList() {
		List<WebElement> tagList = elementUtil.getElements(popularTageCount);
		List<String> tagSectionList = new ArrayList<String>();
		for(WebElement e : tagList ) {
			tagSectionList.add(e.getText());
		}
		return tagSectionList;
	}

}
