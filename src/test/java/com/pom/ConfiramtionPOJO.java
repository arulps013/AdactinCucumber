package com.pom;

import org.base.BaseAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfiramtionPOJO extends BaseAdactin {
	public ConfiramtionPOJO() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnBookedIternary;

	public WebElement getBtnBookedIternary() {
		return btnBookedIternary;
	}

	
}
