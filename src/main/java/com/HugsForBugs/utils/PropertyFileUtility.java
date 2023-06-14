package com.HugsForBugs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertyFileUtility {
	/**
	 * This method will read the specific key value from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(ConstatntUtility.Propertyfilepath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
		
	}
	
}
