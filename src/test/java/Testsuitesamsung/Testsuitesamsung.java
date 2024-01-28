package Testsuitesamsung;

import org.junit.Before;
import org.junit.Test;

import Helper.Config;
import Samsung.Page.homepage;

public class Testsuitesamsung {
homepage home;
	@Before
	public void initialisation () {
		Config.ConfigChrome();
		Config.Maximaizewindow();
		String url="https://www.samsung.com/fr/";
		Config.driver.get(url);
		home = new homepage(Config.driver);
		
	}
	
	@Test
	public void mousehoverbytitele () throws InterruptedException {
		
		home.mousehovermenu("Mobiles","Tablettes");
		
}
}