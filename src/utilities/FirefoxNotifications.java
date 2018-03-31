package utilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class FirefoxNotifications {
	
	WebDriver driver;
	
	@Test
	public void init() {
		
		System.setProperty("webdriver.gecko.driver", "C:/WebDrivers/geckodriver.exe");
		
		FirefoxOptions options =  new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		
		/*launching firefox with notifications disabled
		 *see list of firefox preferences through "about:config" commands */

		driver = new FirefoxDriver(options);	
		
	}
}
