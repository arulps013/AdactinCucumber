package com.stepdefenition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base.BaseAdactin;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pom.BookHotelPOJO;
import com.pom.ConfiramtionPOJO;
import com.pom.LoginPOJO;
import com.pom.SearchHotelPOJO;
import com.pom.SelectHotelPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefAdactin extends BaseAdactin {
	WebDriver driver;

	@Given("go to Adactin page")
	public void tc1() {
		driver = browserLaunch();
	}

	@When("user enters username")
	public void tc2(io.cucumber.datatable.DataTable data) throws InterruptedException {
		LoginPOJO l;
		SearchHotelPOJO sh;
		getURL("https://www.adactin.com/HotelApp/");
		Map<String, String> asMap = data.asMap(String.class, String.class);
		String s1 = asMap.get("user");
		String s2 = asMap.get("pass");
		l = new LoginPOJO();
		fill(l.getTxtUsername(), s1);
		fill(l.getTxtPassword(), s2);
		btnClick(l.getBtnLogin());
		Thread.sleep(1000);
		screenShot();
		sh = new SearchHotelPOJO();
		dropDown(sh.getDdLocation()	, "Sydney");
		dropDown(sh.getDdHotels(), "Hotel Sunshine");
		dropDown(sh.getDdRoomType(), "Double");
		dropDown(sh.getDdRoomNos(), "1 - One");
		fill(sh.getTxtCheckIn(), "04/03/2020");
		fill(sh.getTxtCheckOut(), "05/03/2020");
		dropDown(sh.getDdAdult(), "1 - One");
		dropDown(sh.getDdChild(), "1 - One");
		btnClick(sh.getBtnSearch());
		screenShot();
		}

	@When("user clicks login button")
	public void tc3()  {
		SelectHotelPOJO sl = new SelectHotelPOJO();
		btnClick(sl.getBtnRadio());
		btnClick(sl.getBtnContinue());
		screenShot();
		BookHotelPOJO b = new BookHotelPOJO();
		fill(b.getTxtFirstName(), "Arul");
		fill(b.getTxtLastName(), "Murugan");
		fill(b.getTxtAddress(), "Chennai");
		fill(b.getTxtCCNum(), "1234123412341234");
		dropDown(b.getDdCCType(), "VISA");
		dropDown(b.getDdCCMonth(), "May");
		dropDown(b.getDdCCYear(),"2022");
		fill(b.getDdCC_Cvv(), "123");
		btnClick(b.getBtnBookNow());
		screenShot();
		
	}

	@Then("verifying the details")
	public void tc4()  {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement orderNo = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
		String attribute = orderNo.getAttribute("value");
		screenShot();
		System.out.println(attribute);
		ConfiramtionPOJO c = new ConfiramtionPOJO();
		btnClick(c.getBtnBookedIternary());
		WebElement boxCancel = driver.findElement(By.xpath("//input[@value='"+attribute+"']/parent::td/preceding-sibling::td"));
		boxCancel.click();
		WebElement btnCancelSelected = driver.findElement(By.xpath("//input[@name='cancelall']"));
		btnCancelSelected.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
}
