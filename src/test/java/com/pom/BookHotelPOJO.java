package com.pom;

import org.base.BaseAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPOJO extends BaseAdactin {
	public BookHotelPOJO() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNum;
	
	@FindBy(id="cc_type")
	private WebElement ddCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ddCCMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ddCCYear;
	
	@FindBy(id="cc_cvv")
	private WebElement ddCC_Cvv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getDdCCType() {
		return ddCCType;
	}

	public WebElement getDdCCMonth() {
		return ddCCMonth;
	}

	public WebElement getDdCCYear() {
		return ddCCYear;
	}

	public WebElement getDdCC_Cvv() {
		return ddCC_Cvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
}
