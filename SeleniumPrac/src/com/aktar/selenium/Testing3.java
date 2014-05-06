package com.aktar.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Testing3 extends MainClass {
@Test
public void FaceBookConnect(){
	driver.get("https://www.facebook.com/starbucks");
	driver.findElement(By.id("email")).sendKeys("aktarchowdhury7@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("aa786786");
	driver.findElement(By.id("u_0_0")).submit();
}
}
