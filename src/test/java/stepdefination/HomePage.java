package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.HomePageLocator;

public class HomePage {
	static WebDriver driver;
	@Before
	public void lunchTheFip()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

	}
	@Given("^close the popup$")
	public void close_the_popup() throws Throwable {
		HomePageLocator hl= PageFactory.initElements(driver,HomePageLocator.class);
		hl.getPopUp().click();
	   
	}

	@When("^login to filpkat$")
	public void login_to_filpkat() throws Throwable {
		HomePageLocator hl= PageFactory.initElements(driver,HomePageLocator.class);
		hl.loginToFilkatApp("9471301914","punit@16");
	   
	}

	@And("^capture the all mobile brand name$")
	public void capture_the_all_mobile_brand_name() throws Throwable {
		HomePageLocator hl= PageFactory.initElements(driver,HomePageLocator.class);
		Actions act = new Actions(driver);
		act.moveToElement(hl.getElectonicLink()).build().perform();
		List<WebElement> mb =hl.getAllMobileLink();
		System.out.println(mb.size());
		Thread.sleep(5000);
		for(int i=0;i<=mb.size()-1;i++)
		{
			System.out.println(mb.get(i).getAttribute("title"));
		}
		
	}

	@Then("^search particular brand$")
	public void search_particular_brand() throws Throwable {
		
		HomePageLocator hl= PageFactory.initElements(driver,HomePageLocator.class);
		Actions act = new Actions(driver);
		act.moveToElement(hl.getElectonicLink()).build().perform();
		List<WebElement> mb =hl.getAllMobileLink();
		System.out.println(mb.size());
		for(int i=0;i<=mb.size()-1;i++)
		{
			SoftAssert softasset = new SoftAssert();
			String str = mb.get(i).getAttribute("title");
			softasset.assertEquals(str,"Mi");
			if(str.equalsIgnoreCase("mi"))
			{
				mb.get(i).click();
				WebElement name=hl.getNameOfBrand();
				softasset.assertTrue(name.isDisplayed());	
				softasset.assertAll();
			}
			
		}
	   
	}
	

@When("^capture the deal time from application$")
public void capture_the_deal_time_from_application() throws Throwable {
	
	HomePageLocator hl= PageFactory.initElements(driver,HomePageLocator.class);
	String str=hl.getDealTime().getText();
	System.out.println(str);
}
	@After
	public void closeTheApp()
	{
		driver.close();
	}


}
