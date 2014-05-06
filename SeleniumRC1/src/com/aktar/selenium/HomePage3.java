package com.aktar.selenium;

import org.junit.Test;

public class HomePage3 extends BrowserOpens {
@Test
public void SignOnPage2(){
	selene.click("primaryMenu0");
	selene.click("menuItem0_0_1");
	selene.click("menuItem0_0_1_0");
	//selene.type("ZIP_en_US", "11223");
	
}
@Test
public void SignOnPage3(){
	selene.click("primaryMenu1");
}
}
