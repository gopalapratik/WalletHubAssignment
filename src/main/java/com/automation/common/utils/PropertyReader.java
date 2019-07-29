package com.automation.common.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * This class is declared to read and configure the Property Files.
 */
public class PropertyReader {
	Properties properties = new Properties();
	InputStream inputStream = null;
	private Logger loggerPropertyReader = null;

	/**
	 * This method take fileName/filePath as input to configure the required
	 * property file.
	 * 
	 * @param fileName/filePath should be a string value
	 */
	public PropertyReader(String fileName) {
		try {
			inputStream = new FileInputStream(fileName);
			properties.load(inputStream);
			inputStream.close();
			PropertyConfigurator.configure(properties);
			loggerPropertyReader = Logger.getLogger(PropertyReader.class.getName());
			loggerPropertyReader.info(
					"Completed Loading Properties with File: " + fileName + "|| Poperties are: " + properties.values());
		} catch (IOException e) {
			loggerPropertyReader.error("Error in Property Reader Class: " + e.getMessage());
		}
	}

	public String readProperty(String key) {
		return properties.getProperty(key);
	}

	
}
