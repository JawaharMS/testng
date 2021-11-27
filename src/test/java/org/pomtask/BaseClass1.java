package org.pomtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	
	public static WebDriver driver;
	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void  launch(String url) {
		driver.get(url);
	}

	public static WebElement xpath(String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		return element;
	}

	public static void tSender(WebElement refName, String Values) {
		refName.sendKeys(Values);
	}

	public static void bClick(WebElement refName) {
		refName.click();
	}

	public static WebElement id(String idvalue) {
		WebElement element = driver.findElement(By.xpath(idvalue));
		return element;
	}

	public static WebElement name(String namevalue) {
		WebElement element = driver.findElement(By.xpath(namevalue));
		return element;
	}
	
	private static WebElement sendKey(WebElement ref, String text) {
		ref.sendKeys(text);
		return ref;

	}
	
	public static WebElement select(WebElement refname, String value) {
		
		Select s = new Select(refname);
		s.selectByVisibleText(value);
		return refname;
	}
	
public static WebElement selectV(WebElement refname, String value) {
		
		Select s = new Select(refname);
		s.selectByValue(value);
		return refname;
	}

}
