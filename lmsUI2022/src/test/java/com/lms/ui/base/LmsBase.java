package com.lms.ui.base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lms.ui.util.LmsUtil;

public class LmsBase {
	public static  WebDriver driver;
	public  static Properties prop;

	
	
	public LmsBase() {
		
	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "C:\\Archana\\newest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(LmsUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(LmsUtil.IMPLICIT_WAIT));

		
	}
	public static void openUrl(String url)
	{
		driver.get(url);
	}
}


