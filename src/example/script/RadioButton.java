package example.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver","/home/kumar/Selenium/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			List<WebElement> radio = driver.findElements(By.className("_58mt"));
			for(int i=0;i<radio.size();i++)
			{
				WebElement local_radio = radio.get(i);
				String Value=local_radio.getText();
				System.out.println(Value);
			}
			//driver.close();
		}
}
