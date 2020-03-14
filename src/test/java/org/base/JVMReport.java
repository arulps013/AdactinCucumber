package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports");
		Configuration con = new Configuration(loc, "Adactin Automation");
		con.addClassifications("OS", "Windows 10");
		con.addClassifications("Browser", "Google Chrome");
		con.addClassifications("Version", "80");
		con.addClassifications("Sprint", "25");
		List<String> l = new LinkedList<String>();
		l.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(l, con);
		builder.generateReports();
		}
}
