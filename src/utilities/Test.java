package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Test {

	public static String username, password, repassword,name;
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C://WebDrivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://members.exportersindia.com/join-now.php");
			Thread.sleep(10000);
			System.out.println("hello");
			driver.findElement(By.name("username")).sendKeys("webtree@ei.com");
			System.out.println("hello2");
			driver.findElement(By.id("pass1")).sendKeys("111111"); 
			driver.findElement(By.id("pass2")).sendKeys("111111");
			driver.findElement(By.id("your_name")).sendKeys("Testing");
			Thread.sleep(5000);
			Select dropdown=new Select(driver.findElement(By.id("country")));
			dropdown.selectByVisibleText("India");
			driver.findElement(By.id("mobile_phone")).sendKeys("5487470231");
			driver.findElement(By.id("comp_name")).sendKeys("My company"); 
			driver.findElement(By.id("street_address")).sendKeys("Kirti nagar");
			Thread.sleep(5000);
			Select dropdown1=new Select(driver.findElement(By.id("state_code")));
			dropdown1.selectByVisibleText("Delhi");
			driver.findElement(By.name("product_desc[]")).sendKeys("Bag");
			driver.findElement(By.xpath("/html/body/div[1]/div/form/article/div[4]/ul[2]/li[2]/p[2]/button")).click();
		}
	}
