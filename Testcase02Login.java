package com.truckhome.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase02Login {
	@Test
	public void baiduSearch() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/truckhome/");
		driver.findElement(By.xpath("html/body/div[1]/div/div/a[1]")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("237017");
		
		
		try {
			Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
		driver.quit();
		}
	}

