package com.pom;

import org.base.BaseAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPOJO extends BaseAdactin {
	public SearchHotelPOJO() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement	ddLocation;
	
	@FindBy(id="hotels")
	private WebElement	ddHotels;
	
	@FindBy(id="room_type")
	private WebElement	ddRoomType;
	
	@FindBy(id="room_nos")
	private WebElement	ddRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement	txtCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement	txtCheckOut;
	
	@FindBy(id="adult_room")
	private WebElement	ddAdult;
	
	@FindBy(id="child_room")
	private WebElement	ddChild;
	
	@FindBy(id="Submit")
	private WebElement	btnSearch;

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotels() {
		return ddHotels;
	}

	public WebElement getDdRoomType() {
		return ddRoomType;
	}

	public WebElement getDdRoomNos() {
		return ddRoomNos;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDdAdult() {
		return ddAdult;
	}

	public WebElement getDdChild() {
		return ddChild;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
}
