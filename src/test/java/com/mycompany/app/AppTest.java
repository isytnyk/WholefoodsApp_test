package com.mycompany.app;

import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;


public class AppTest {

private WebDriver driver = null;


@BeforeTest

public void setUp () throws MalformedURLException, InterruptedException {
	
	DesiredCapabilities capabilities = new DesiredCapabilities ();
	File app = new File ("D:\\Whole_Foods_1.1.3_51.apk");
	capabilities.setCapability ("deviceName", "emulator-5554");
	capabilities.setCapability ("platformName", "Android");
	capabilities.setCapability ("app", app.getAbsolutePath ());
	driver = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
}

@AfterTest
	    public void tearDown() throws Exception {
	        driver.quit();
	    }
	   
@Test
	
public void findCoffe() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	WholefoodsAppPage page = PageFactory.initElements(driver, WholefoodsAppPage.class);
	
	wait.until(ExpectedConditions.elementToBeClickable(page.home_button));

	page.home_button.click();
	
	wait.until(ExpectedConditions.visibilityOf(page.rec_search));
	
	page.recps.click();
	page.search.sendKeys("coffee");
	page.search_icon.click();
	
	SearchResultsPage search = PageFactory.initElements(driver, SearchResultsPage.class);
	int i = 1;
	Integer j = Integer.parseInt(search.res_num.getText());
	assert (i<j);

}	
}

