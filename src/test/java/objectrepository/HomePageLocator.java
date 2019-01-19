package objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocator {
	@FindBy(xpath="//button[text()='✕']")
	private WebElement popUp;
	
	@FindBy(xpath="//*[text()='Login & Signup']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//input[@type='text' and contains(@class,'_2zrpKA')]")
	private WebElement phNumber;
	
	@FindBy(xpath="//input[@type='password' and contains(@class,'_2zrpKA')]")
	private WebElement passBtn;
	
	@FindBy(xpath="//*[text()='Electronics']")
	private WebElement electonicLink;
	
	@FindBys({@FindBy(xpath="//a[@title='Mobiles']/../../li/a")})
	private List<WebElement> allMobileLink;
	
	@FindBy(xpath="//button[@type='submit']/span")
	private WebElement login;
	
	@FindBy(xpath="//h1[text()='Mi Mobiles']")
	private WebElement nameOfBrand;
	
	@FindBy(xpath="//div[@class='Yg3scO']/span")
	private WebElement dealTime;
	
	public WebElement getNameOfBrand() {
		return nameOfBrand;
	}
	

	public WebElement getDealTime() {
		return dealTime;
	}


	public WebElement getElectonicLink() {
		return electonicLink;
	}

	public List<WebElement> getAllMobileLink() {
		return allMobileLink;
	}

	public void loginToFilkatApp(String phNo,String password)
	{
		loginBtn.click();
		phNumber.sendKeys(phNo);
		passBtn.sendKeys(password);
		login.click();
	}
	
	public WebElement getPopUp() {
		return popUp;
	}

	

}
