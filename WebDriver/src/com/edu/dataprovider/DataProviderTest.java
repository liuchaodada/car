package com.edu.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.test.Log;

import static org.testng.Assert.*;

public class DataProviderTest {

	@DataProvider(name = "keyw")
	public Object[][] getData() {
		return new Object[][] { { "�Ա�" ,"123456"}, { "����" ,"123457"}, { "����","11111" }, };
	}

	@Test(dataProvider = "keyw")
	public void searchTest(String keyWord,String s2) throws InterruptedException {
		System.out.println(keyWord+" "+s2);

	}

}
