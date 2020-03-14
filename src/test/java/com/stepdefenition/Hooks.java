package com.stepdefenition;

import org.base.BaseAdactin;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class Hooks extends BaseAdactin {
	@Before
	public void beforeScenario() {
		 browserLaunch();
	}

	@After
	public void afterScenario(Scenario sc) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] s = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(s, "image/png");
	}
}
