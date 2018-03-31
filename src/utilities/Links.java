package utilities;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links 
{
	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C://WebDrivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.exportersindia.com/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 
	System.out.println("All links found on web page are: " + allLinks.size() + " links");
	 
	for (int i=0; i<allLinks.size();i++)
	{ 
		String url = allLinks.get(i).getAttribute("href");
		System.out.println(url);
		String selectAll = Keys.chord(Keys.CONTROL, Keys.RETURN);
		allLinks.get(i).sendKeys(selectAll);
		Thread.sleep(3000);
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		//driver.switchTo().defaultContent();
		//driver.navigate().forward();
			 if(driver.getPageSource().contains("iso") || driver.getPageSource().contains("ISO"))
			 {
				  System.out.println("hello");
			 }
		driver.close();
		driver.switchTo().window(tab.get(0));
		  }		 
	  
	}
}


