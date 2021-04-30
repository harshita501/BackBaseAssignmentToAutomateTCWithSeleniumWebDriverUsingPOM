package backbase.qa.bblog.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import backbase.qa.bblog.base.BaseTest;
import backbase.qa.bblog.utils.Constants;

public class BBlogHomePageTest extends BaseTest {
	

	@Test(priority = 1)
	public void bblogHomePageTitleTest() {
		String title = bblogHomePage.getHomePageTitle();
		System.out.println("home page title : " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}
	
	@Test(priority = 2)
	public void headerTextExistTest() {
		Assert.assertTrue(bblogHomePage.isHeaderTextExist());
	}
	
	@Test(priority = 3)
	public void getYourFeedClickTest() {
		bblogHomePage.doClickOnYourFeed();
	}
	
	@Test(priority = 4)
	public void getPopularTagListTest() {
		List<String> list = bblogHomePage.getPopularTagList();
		System.out.println("Correct list : " + list);
	}

}
