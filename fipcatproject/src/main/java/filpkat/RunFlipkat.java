package filpkat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunFlipkat {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> lt=driver.findElements(By.xpath("//*[text()='RAM']/../../div[2]/div/div/div/div/label/div[2]"));
		System.out.println(lt.size());
		for(WebElement wb:lt)
		{
			System.out.println(wb.getText());
			String str = wb.getText();
			if(str.contains("2"))
			{
				wb.click();
				break;
			}
		}
		String str=driver.findElement(By.xpath("//div[@class='bhgxx2']/div/span")).getText();
		System.out.println(str);
		

	}

}
