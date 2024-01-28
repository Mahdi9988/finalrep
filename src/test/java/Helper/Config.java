package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {

	public static WebDriver driver;
	public static Actions actions;
	public static void Maximaizewindow() {
		driver.manage().window().maximize();
	}
	public static void ConfigChrome(){
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver=new ChromeDriver();
	}
		
	}

