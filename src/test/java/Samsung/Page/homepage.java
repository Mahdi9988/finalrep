package Samsung.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class homepage {
@FindBy (xpath="/html/body/div[1]/nav/div[1]/div[5]/ul[1]/li/button")
List<WebElement> menus;
@FindBy (xpath="/html/body/div[1]/nav/div[1]/div[5]/ul[1]/li[2]/div/div[1]/ul/li/a")
List<WebElement> submenus;

public homepage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void mousehovermenu(String menutitle,String submenuTitel) throws InterruptedException {
	
	for (WebElement menu:menus) {
		System.out.println(menus);
		if (menu.getText().contains(menutitle)) {
			
			Config.actions=new Actions(Config.driver);
			Config.actions.moveToElement(menu).perform();
			Thread.sleep(3000);
			for(WebElement submenu:submenus) {
				if(submenu.getText().contains(submenuTitel)) {
					submenu.click();
				}
			}
			
			
	
		}
	}
			
		}

}



