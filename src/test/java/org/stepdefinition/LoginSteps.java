package org.stepdefinition;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.security.auth.callback.TextOutputCallback;

import org.junit.Assert;
import org.loginpage.LoginPojo;

import com.base.libGloble;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class LoginSteps extends libGloble
{
	LoginPojo l;

	@Given("User in AdactinHotel page")
	public void user_in_AdactinHotel_page() {
		loadUrl();
		loadUrl("http://adactinhotelapp.com/");
	}

	@When("User login with valid {string} and {string} and user navigate to SearchHotel page")
	public void user_login_with_valid_and_and_user_navigate_to_SearchHotel_page(String uname, String pass) {
		l = new LoginPojo();
		toType(l.getUnameTxt(), uname);
		toType(l.getPassTxt(), pass);
		toClick(l.getBtnLogin());
		
	}


	@Given("User choose  {string},{string} , {string} and {string}")
	public void user_choose_and(String hLoc, String hName, String roomType, String numRoom) {
		toSelectText(l.getLocationDropDown(), hLoc);
		toSelectText(l.getHotelDropDown(), hName);
		toSelectText(l.getRoomDropDown(), roomType);
		toSelectText(l.getRoomCountDD(), numRoom);
	}

	@When("User choosing {string},{string} , {string},{string} , {string} , {string} , {string} ,{string}")
	public void user_choosing(String hLoc, String hName, String roomType, String numRoom, String cIn, String cOut,
			String numAdult, String numChild) {
		toSelectText(l.getLocationDropDown(), hLoc);
		toSelectText(l.getHotelDropDown(), hName);
		toSelectText(l.getRoomDropDown(), roomType);
		toSelectVal(l.getRoomCountDD(), numRoom);
		toType(l.getCheckInDateTxt(), cIn);
		toType(l.getCheckOutTxt(), cOut);
		toSelectVal(l.getAdultCountDD(),numAdult);
		toSelectVal(l.getChildCountDD(),numChild);
	}

	@When("User click Search button and User go to the Select Hotel page")
	public void user_click_Search_button_and_User_go_to_the_Select_Hotel_page() {
		toClick(l.getSearchBtn());
	}

	@When("User choose a Hotel in the list and click Continue button and User should be in payment page")
	public void user_choose_a_Hotel_in_the_list_and_click_Continue_button_and_User_should_be_in_payment_page() {
		toClick(l.getRadioBtnCont());
		toClick(l.getContinueBtn());
		assertTrue(currentUrl().contains("BookHotel"));
		
	}

	@When("User Enter {string},{string} and {string}, {string} , {string} , {string} ,{string} and {string}")
	public void user_Enter_and_and(String fName, String lName, String billAddress, String cardNum, String cardType,
			String expMonth, String expYear, String cvv) {
		toType(l.getFirstNameTxt(),         fName);
		toType(l.getLastName(),             lName);
		toType(l.getBillAddTxt(),           billAddress);
		toType(l.getCreditCardNum(),        cardNum);
		toSelectText(l.getCardTypeDD(),     cardType);
		toSelectText(l.getCardExpMonthDD(), expMonth);
		toSelectText(l.getCardExpYearDD(),  expYear);
		toType(l.getCvvNumTxt(), cvv);
	}

	@When("User click Book Now button and then user get the Booked Room details")
	public void user_click_Book_Now_button_and_then_user_get_the_Booked_Room_details() throws InterruptedException, IOException {
		toClick(l.getBookBtn());
		Thread.sleep(11000);
		assertTrue(currentUrl().contains("BookingConfirm"));
		System.out.println("Your Order ID = " + l.getOrderNumber());
		screenShot("ticket1");
	}

	@Then("User click search hotel then moved to home page of search hotel")
	public void user_click_search_hotel_then_moved_to_home_page_of_search_hotel() throws IOException, InterruptedException {
        waitImplicit(10);  
		toClick(l.getSearchHotelBtn());
		assertTrue(currentUrl().contains("SearchHotel"));
	}
}
