package com.aktar.selenium;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MainClass {
WebDriver driver=new FirefoxDriver();
@Before
public void OpenBrowse(){
	driver.get("http://www.starbucks.com/");
	driver.findElement(By.id("nav_coffee")).click();
	driver.findElement(By.id("nav_menu")).click();
	driver.findElement(By.id("nav_coffeehouse")).click();
	driver.findElement(By.id("nav_responsibility")).click();
	driver.findElement(By.id("nav_card")).click();
	//driver.findElement(By.id("nav_shop")).click();
	
}
@After
public void TestComplete(){
	//driver.close();
}
}
