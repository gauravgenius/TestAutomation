package utilities;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications",1);
		//options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        
        

        //Method 1
        driver.get("https://www.redbus.in/");
        Thread.sleep(5000);

}
}
