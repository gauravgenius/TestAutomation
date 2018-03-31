package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver","C://WebDrivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.instagram.com");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("rahulreddy.olay@gmail.com");
	    }
	}
