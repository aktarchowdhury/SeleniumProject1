package com.aktar.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Testing1 extends MainClass {
@Test
public void TestContinue(){	
	driver.findElement(By.id("signIn")).click();
	driver.findElement(By.linkText("Create An Account")).click();
	driver.findElement(By.id("Address_FirstName")).sendKeys("aktaruddin");
	driver.findElement(By.id("Address_LastName")).sendKeys("chowdhury");
	driver.findElement(By.id("Account_NewEmailAddress")).sendKeys("aktarchowdhury78@gmail.com");
	driver.findElement(By.id("Account_NewPassword")).sendKeys("Aa34567");
	driver.findElement(By.id("Account_NewPasswordConfirm")).sendKeys("Aa34567");
	driver.findElement(By.id("sbux_send_me_email")).getLocation();
	driver.findElement(By.id("Address_PostalCode")).sendKeys("11223");	
	driver.findElement(By.id("terms_and_conditons")).submit();
}
}
