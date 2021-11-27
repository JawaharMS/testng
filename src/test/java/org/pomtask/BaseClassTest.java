package org.pomtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClassTest extends BaseClass1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		getDriver();
		driver.manage().window().maximize();
		launch("https://adactinhotelapp.com/index.php");
		
		AdactinHotel a = new AdactinHotel();
		WebElement userName = a.getUserName();
		tSender(userName, "MSJAWAHAR");
		WebElement password = a.getPassword();
		tSender(password, "jawarohi95");
		a.getLoginBtn().click();
		WebElement location = a.getLocation();
		select(location, "London");
		Thread.sleep(400);
		WebElement hotel = a.getHotel();
		a.getHotel().click();
		select(hotel, "Hotel Sunshine");
		WebElement roomType = a.getRoomType();
		a.getRoomType().click();
		select(roomType, "Super Deluxe");
		WebElement noOfRoom = a.getNoOfRoom();
		a.getNoOfRoom().click();
		selectV(noOfRoom, "2");
		Thread.sleep(300);
		WebElement ckInDate = a.getCkInDate();
		tSender(ckInDate, "14/11/2021");
		WebElement ckOutDate = a.getCkOutDate();
		tSender(ckOutDate, "15/11/2021");
		WebElement adultPerRoom = a.getAdultPerRoom();
		a.getAdultPerRoom().click();
		selectV(adultPerRoom, "2");
		WebElement childPerRoom = a.getChildPerRoom();
		a.getChildPerRoom().click();
		selectV(childPerRoom, "2");
		WebElement searchBtn = a.getSearchBtn();
		a.getSearchBtn().click();
		
		
	}

}
