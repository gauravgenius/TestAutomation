package utilities;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClipboardRead {
	
	@Test
	public void getClipboardContents() {
        String result = "";
        
        System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String copy = Keys.chord(Keys.CONTROL,Keys.chord("c")); 
        driver.findElement(By.linkText("Images")).sendKeys(copy);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        Transferable contents = clipboard.getContents(null);
        boolean hasTransferableText = (contents != null)
                && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException ex) {
                System.out.println(ex);
                ex.printStackTrace();
            }
        }
        System.out.println(result);
    }
}
