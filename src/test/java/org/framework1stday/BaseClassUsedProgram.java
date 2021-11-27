package org.framework1stday;

import org.openqa.selenium.WebElement;

public class BaseClassUsedProgram extends BaseClass {
	
	public static void main(String[] args) {
		
		BaseClassUsedProgram b = new BaseClassUsedProgram();
		
		b.getDriver();
		b.launch("https://www.facebook.com/");
		WebElement userName = b.xpath("//input[@data-testid='royal_email']");
		userName.sendKeys("jawa@gmail.com");
		WebElement password = b.xpath("//input[@data-testid='royal_pass']");
		password.sendKeys("123456789");
		WebElement login = b.xpath("//button[@data-testid='royal_login_button']");
		login.click();
	}

}
