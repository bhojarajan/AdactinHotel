package org.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.libGloble;

public class LoginPojo extends libGloble {
	public LoginPojo() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement unameTxt;

	@FindBy(id = "password")
	private WebElement passTxt;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(id = "location")
	private WebElement locationDropDown;

	@FindBy(id = "hotels")
	private WebElement hotelDropDown;

	@FindBy(id = "room_type")
	private WebElement roomDropDown;

	@FindBy(id = "room_nos")
	private WebElement roomCountDD;

	@FindBy(id = "datepick_in")
	private WebElement checkInDateTxt;

	@FindBy(id = "datepick_out")
	private WebElement checkOutTxt;

	@FindBy(id = "adult_room")
	private WebElement adultCountDD;

	@FindBy(id = "child_room")
	private WebElement childCountDD;

	@FindBy(id = "Submit")
	private WebElement searchBtn;

	@FindBy(id = "Reset")
	private WebElement resetBtn;
	        
	@FindBy(id = "radiobutton_0")
	private WebElement radioBtnCont;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(id = "first_name")
	private WebElement firstNameTxt;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement billAddTxt;

	@FindBy(id = "cc_num")
	private WebElement creditCardNum;

	@FindBy(id = "cc_type")
	private WebElement cardTypeDD;

	@FindBy(id = "cc_exp_month")
	private WebElement cardExpMonthDD;

	@FindBy(id = "cc_exp_year")
	private WebElement cardExpYearDD;

	@FindBy(id="cc_cvv")
	private WebElement cvvNumTxt;

	
	@FindBy(id="book_now")
	private WebElement bookBtn;

	@FindBy(id="cancel")
	private WebElement cancelBtn;
	
	@FindBy(xpath = "(//td[@colspan='2'])[2]")
	private WebElement ticket;
	
	@FindBy(id = "order_no")
	private WebElement orderNumber;
	
	@FindBy(id="search_hotel")
	private WebElement searchHotelBtn;
	
	public WebElement getSearchHotelBtn() {
		return searchHotelBtn;
	}

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public WebElement getUnameTxt() {
		return unameTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLocationDropDown() {
		return locationDropDown;
	}

	public WebElement getHotelDropDown() {
		return hotelDropDown;
	}

	public WebElement getRoomDropDown() {
		return roomDropDown;
	}

	public WebElement getRoomCountDD() {
		return roomCountDD;
	}

	public WebElement getCheckInDateTxt() {
		return checkInDateTxt;
	}

	public WebElement getCheckOutTxt() {
		return checkOutTxt;
	}

	public WebElement getAdultCountDD() {
		return adultCountDD;
	}

	public WebElement getChildCountDD() {
		return childCountDD;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getRadioBtnCont() {
		return radioBtnCont;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirstNameTxt() {
		return firstNameTxt;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillAddTxt() {
		return billAddTxt;
	}

	public WebElement getCreditCardNum() {
		return creditCardNum;
	}

	public WebElement getCardTypeDD() {
		return cardTypeDD;
	}

	public WebElement getCardExpMonthDD() {
		return cardExpMonthDD;
	}

	public WebElement getCardExpYearDD() {
		return cardExpYearDD;
	}

	public WebElement getCvvNumTxt() {
		return cvvNumTxt;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getTicket() {
		return ticket;
	}
	
	
}
