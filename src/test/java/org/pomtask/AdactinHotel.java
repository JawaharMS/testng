package org.pomtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends BaseClass1 {
	
	public AdactinHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginBtn;
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noOfRoom;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement ckInDate;
	@FindBy(xpath="(//input[@name='datepick_in'])[1]")
	private WebElement ckOutDate;
	@FindBy(xpath="//input[@name='adult_room']")
	private WebElement adultPerRoom;
	@FindBy(xpath="//input[@name='child_room']")
	private WebElement childPerRoom;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchBtn;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getCkInDate() {
		return ckInDate;
	}

	public WebElement getCkOutDate() {
		return ckOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	
	public WebElement getSearchBtn() {
		return searchBtn;
	
	
	}
	
	
	
	
	
	
	
}
