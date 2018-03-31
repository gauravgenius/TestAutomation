package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StackTest1 {
	
	WebDriver driver = new ChromeDriver();
	List<WebElement> status = driver.findElements(By.id(""));
	
	WebElement statuss = status.get(9);

}
