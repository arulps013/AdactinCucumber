package org.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseAdactin {
	public static WebDriver driver;

	public void screenShot() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\ARUL\\eclipse-workspace\\AdactinCucu\\ScreenShots\\" + randomDate() + ".png");
		try {
			FileUtils.copyFile(s, d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARUL\\eclipse-workspace\\Day1\\src\\test\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		screenShot();
		return driver;
	}

	public void getURL(String URL) {
		driver.get(URL);
	}

	public String randomDate() {
		return new SimpleDateFormat("EE_MM_dd_yyyy_hhmmss").format(new Date());
	}

	public void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public void btnClick(WebElement ele) {
		ele.click();
	}

	public void dropDown(WebElement ele, String value) {
		new Select(ele).selectByVisibleText(value);
	}

	public void javascriptexecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

	}

}
