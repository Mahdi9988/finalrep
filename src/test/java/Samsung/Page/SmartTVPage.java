package Samsung.Page;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class SmartTVPage {
@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[1]/section/div/div/div[1]/div[2]/div/a/span")
WebElement btnTV;
@FindBy (className="menu__select")
WebElement treproductselect;
@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div[3]/div/div[3]/section/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/a/p")
List<WebElement> producttvs;
@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div[3]/div[2]/div[1]/div[3]/div[3]/a")
WebElement ajoutpanier;
@FindBy (xpath="/html/body/main/div[2]/div/div[3]/div[1]/div[2]/div/ul/li[1]/div/div/div[3]/div[1]/div[1]/a/h3")
WebElement contenentpanier;
public SmartTVPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void treeproductsortby(String sorttre) throws InterruptedException {
	System.out.println(Config.driver.getWindowHandle());
	btnTV.click();
//WebElement Test=	Config.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[3]/div/div[3]/section/div/div[1]/div[3]/div[1]/div[2]/button"));
//WebDriverWait wait=new WebDriverWait(Config.driver,Duration.ofSeconds(10));	
//wait.until(ExpectedConditions.elementToBeClickable(Test));
//Test.click();
	System.out.println(Config.driver.getWindowHandle());
Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Select select=new Select(treproductselect);
	select.selectByVisibleText(sorttre);

}
public void clicenproductbyname(String productname) throws InterruptedException {
	btnTV.click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) Config.driver;
	js.executeScript("window.scrollBy(0,200)");
	try {
	for(WebElement producttv:producttvs) {
		if(producttv.getText().contains(productname));
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		producttv.click();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ajoutpanier.click();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue("Produit non ajouter au panier",contenentpanier.getText().contains(productname)); 
		
	}
}catch (Exception e) {
	// TODO: handle exception
}
}
}
