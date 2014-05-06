package com.aktar.selenium;

import org.junit.Test;

public class HomePage2 extends BrowserOpens {
@Test
public void SignOnPage1(){
	selene.click("primaryMenu0");
	selene.click("menuItem0_0_0");
	selene.click("menuItem0_0_0_0");
	selene.clickAt("MastHeadA", "Get Started");
	//selene.type("first_en_us", "beverley");
	
	
}
}
