package Testsuitesamsung;

import org.junit.Before;
import org.junit.Test;

import Helper.Config;
import Samsung.Page.SmartTVPage;

public class SmartTVTestSuite {
SmartTVPage TV;
@Before
public void init () {
	Config.ConfigChrome();
	Config.Maximaizewindow();
	String url="https://www.samsung.com/fr/tvs/smart-tv/highlights/";
	Config.driver.get(url);
	
	TV=new SmartTVPage(Config.driver);
	
}
//@Test
public void testtretv() throws InterruptedException {
	TV.treeproductsortby("Prix croissant");
}
@Test
public void shopontv() throws InterruptedException {
	TV.clicenproductbyname("TV OLED 55S90C 2023 4K");
}
}
