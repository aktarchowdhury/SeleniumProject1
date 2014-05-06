package com.aktar.selenium;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class BrowserOpens {
	DefaultSelenium selene = new DefaultSelenium("localhost", 4444, "firefox",
			"https://www.chase.com/");

	@Before
	public void HomePage() {
		selene.start();
		selene.open("/");
		selene.windowMaximize();
		selene.setSpeed("5000");
	}

	@After
	public void TestDone() {
		// selene.close();
		// selene.stop();
	}
}
