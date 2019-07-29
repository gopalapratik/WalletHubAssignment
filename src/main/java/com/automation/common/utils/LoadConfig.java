package com.automation.common.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

public class LoadConfig {

	private static String configFile = null, Tags = null;
	public static PropertyReader configProp = null;	
	public static int TimeOut = 0;	
	public static String TestID = null, Browser = null, myCurrentDir = null, projectPath=null, log4jFileName=null, htmlReportPath=null, appURL=null, emails=null, subject=null, description=null, ReportFolderPath=null, zippedReportFolder = null;	
	private Logger LoadConfiglogger = null;
	
	public LoadConfig(String fileName) {
		
		configFile = fileName;
		configProp = new PropertyReader(configFile);
		myCurrentDir = System.getProperty("user.dir");
		Browser = configProp.readProperty("Browser");
		projectPath = configProp.readProperty("projectPath");
		ReportFolderPath = LoadConfig.projectPath+"target/html/"+"Reports_"+new SimpleDateFormat("dd-MM-yyyy_HH-mm").format(new GregorianCalendar().getTime());
		File dir = new File(ReportFolderPath);
		dir.mkdir();
		appURL = configProp.readProperty("appurl");
		log4jFileName = configProp.readProperty("log4jFileName");
		emails = configProp.readProperty("emails");
		subject = configProp.readProperty("subject");
		description = configProp.readProperty("description");
		htmlReportPath = ReportFolderPath+"/"+configProp.readProperty("htmlReportName")+"_"+new SimpleDateFormat("dd-MMM-yyyy_HH-mm").format(new GregorianCalendar().getTime())+".html";		
		Tags = configProp.readProperty("Tags").toString();
		TestID = Tags.split("@")[1];
		zippedReportFolder = LoadConfig.ReportFolderPath+".zip";
		TimeOut = Integer.parseInt(configProp.readProperty("TimeOut"));
		LoadConfiglogger = Logger.getLogger(this.getClass());
		LoadConfiglogger.info(
				"Completed Loading Config File: " + fileName);
	}
}
