package com.automation.runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/main/java/com/automation/feature/", glue = {

		"com.automation.stepdefs" }, tags = {"@Assignment"},monochrome = true, plugin = {

				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }, format = { "pretty",
						"html:target/cucumber-reports/cucumber-pretty",
						"json:target/cucumber-reports/CucumberTestReport.json",
						"rerun:target/cucumber-reports/rerun.txt" })

public class CommonRunner {

	static {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hhmmss");
		System.setProperty("current.date", dateFormat.format(new Date()));
	}
	private TestNGCucumberRunner testNGCucumberRunner;
	String projectPath = System.getProperty("user.dir");
	File htmlReportOutputFile;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws IOException {
		Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
		testNGCucumberRunner.finish();
		htmlReportOutputFile = new File(projectPath + "/output/Reports/Facebook/" + "Facebook_Automation_Report_"
				+ new SimpleDateFormat("dd-MMM-yyyy_HH-mm").format(new GregorianCalendar().getTime()) + ".html");
		File reportFile = new File(projectPath + "/output/report.html");
		FileUtils.copyFile(reportFile, htmlReportOutputFile);

	}
}
