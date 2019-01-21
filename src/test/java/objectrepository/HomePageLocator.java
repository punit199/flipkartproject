package objectrepository;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import stepdefination.HomePage;

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
	
	public WebElement getProduct() {
		return product;
	}

	@FindBy(xpath="//div[@class='Yg3scO']/span")
	private WebElement dealTime;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement product;
	
	@FindBy(xpath="//*[text()='to']/../div[@class='_1qKb_B']/select[@class='fPjUPw']")
	private WebElement minRangeLink;
	
	@FindBy(xpath="//*[text()='to']/../div[@class='_1YoBfV']/select[@class='fPjUPw']")
	private WebElement maxRangeLink;
	
	@FindBys({@FindBy(xpath="//*[text()='RAM']/../../div[2]/div/div/div/div/label/div[2]")})
	private List<WebElement> listOfRamSize;
	
	@FindBy(xpath="//div[@class='bhgxx2']/div/span")
	private WebElement resultOfFilter;
	
	@FindBy(xpath="//*[text()='Add to Compare']/../../../../../../..//div[@class='_1-2Iqu row']/div/div[@class='_3wU53n']")
	private List<WebElement> nameOfPhone;
	
	public void getThePhName() {
		List<WebElement> lt=nameOfPhone;
		System.out.println("number of product get search==>"+lt.size());
		for(int i=0;i<=lt.size()-1;i++)
		{
			System.out.println(lt.get(i).getText());
		}
	}
	
	public void getTheResult()
	{
		String str=resultOfFilter.getText();
		System.out.println(str);
	}
	public void selectTheRam(String size)
	{
		List<WebElement> lt = listOfRamSize;
		for(WebElement wb:lt)
		{
			if(wb.getText().contains(size))
			{
				wb.click();
				break;
			}
		}
	}
	 public void selectTheRange(WebElement dropDownNmae,String value)
	 {
		 Select sel = new Select(dropDownNmae);
		 List<WebElement> lt =sel.getOptions();
		 for(int i=0;i<=lt.size()-1;i++)
		 {
			 if(lt.get(i).getAttribute("value").equalsIgnoreCase(value))
			 {
				 sel.selectByIndex(i);
			 }
		 }
		 
	 }
	
	public WebElement getMinRangeLink() {
		return minRangeLink;
	}

	public WebElement getMaxRangeLink() {
		return maxRangeLink;
	}	
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
