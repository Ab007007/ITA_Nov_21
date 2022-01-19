package com.ita.selenium.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	static File file;
	static FileInputStream fis ;
	static Properties props ;
	static String value;
	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getProperty(String key) {
		try
		{
			file = new File("data\\config.properties");
			fis = new FileInputStream(file);
			props = new Properties();
			props.load(fis);
			
			//props.load(new FileInputStream(new File("")));
			value= props.getProperty(key);
			fis.close();
		}
		catch(IOException ex) {
			System.out.println("Exception while reading Properties file");
		}
		
		
		return value;
	}
}
