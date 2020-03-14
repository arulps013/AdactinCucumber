package com.stepdefenition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base.BaseAdactin;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManager;
import com.pom.BookHotelPOJO;
import com.pom.ConfiramtionPOJO;
import com.pom.LoginPOJO;
import com.pom.SearchHotelPOJO;
import com.pom.SelectHotelPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefAdactin extends BaseAdactin {
	PageObjectManager pageObjectManager;

	@Given("go to Adactin page")
	public void tc1() {
		getURL("https://www.adactin.com/HotelApp/");
	}

	@When("user enters username")
	public void tc2(io.cucumber.datatable.DataTable data) throws InterruptedException {
		pageObjectManager = new PageObjectManager();
		Map<String, String> asMap = data.asMap(String.class, String.class);
		String s1 = asMap.get("user");
		String s2 = asMap.get("pass");
		fill(pageObjectManager.getLoginPOJO().getTxtUsername(),s1);
		fill(pageObjectManager.getLoginPOJO().getTxtPassword(), s2);
		btnClick(pageObjectManager.getLoginPOJO().getBtnLogin());
		Thread.sleep(1000);
		screenShot();
		dropDown(pageObjectManager.getSearchHotelPOJO().getDdLocation(), "Sydney");
		dropDown(pageObjectManager.getSearchHotelPOJO().getDdHotels(), "Hotel Sunshine");
		dropDown(pageObjectManager.getSearchHotelPOJO().getDdRoomType(), "Double");
		dropDown(pageObjectManager.getSearchHotelPOJO().getDdRoomNos(), "1 - One");
		fill(pageObjectManager.getSearchHotelPOJO().getTxtCheckIn(), "04/03/2020");
		fill(pageObjectManager.getSearchHotelPOJO().getTxtCheckOut(), "05/03/2020");
		dropDown(pageObjectManager.getSearchHotelPOJO().getDdAdult(), "1 - One");
		dropDown(pageObjectManager.getSearchHotelPOJO().getDdChild(), "1 - One");
		btnClick(pageObjectManager.getSearchHotelPOJO().getBtnSearch());
		screenShot();
	}

	@When("user clicks login button")
	public void tc3() {
		btnClick(pageObjectManager.getSelectHotelPOJO().getBtnRadio());
		btnClick(pageObjectManager.getSelectHotelPOJO().getBtnContinue());
		screenShot();
		fill(pageObjectManager.getBookHotelPOJO().getTxtFirstName(), "Arul");
		fill(pageObjectManager.getBookHotelPOJO().getTxtLastName(), "Murugan");
		fill(pageObjectManager.getBookHotelPOJO().getTxtAddress(), "Chennai");
		fill(pageObjectManager.getBookHotelPOJO().getTxtCCNum(), "1234123412341234");
		dropDown(pageObjectManager.getBookHotelPOJO().getDdCCType(), "VISA");
		dropDown(pageObjectManager.getBookHotelPOJO().getDdCCMonth(), "May");
		dropDown(pageObjectManager.getBookHotelPOJO().getDdCCYear(), "2022");
		fill(pageObjectManager.getBookHotelPOJO().getDdCC_Cvv(), "123");
		btnClick(pageObjectManager.getBookHotelPOJO().getBtnBookNow());
		screenShot();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement orderNo = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
		String attribute = orderNo.getAttribute("value");
		screenShot();
		System.out.println(attribute);
		btnClick(pageObjectManager.getConfiramtionPOJO().getBtnBookedIternary());
		WebElement boxCancel = driver
				.findElement(By.xpath("//input[@value='" + attribute + "']/parent::td/preceding-sibling::td"));
		boxCancel.click();
		WebElement btnCancelSelected = driver.findElement(By.xpath("//input[@name='cancelall']"));
		btnCancelSelected.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	@Then("verifying the details")
	public void tc4() {
		System.out.println();
	}
}
