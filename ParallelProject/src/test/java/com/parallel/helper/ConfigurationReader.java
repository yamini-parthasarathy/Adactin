package com.parallel.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties ps;
	
	public ConfigurationReader() throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\parallel\\property\\Configuration.properties");
		FileInputStream fis =new FileInputStream(file);
		ps = new Properties();
		ps.load(fis);
		
	}
	
	public static String browserName() {
		
		String browser = ps.getProperty("browsername");
		return browser;
	}
	
	public static String getUrl() {
		String url = ps.getProperty("url");
		return url;
	}
	
	public static String getUrl1() {
		String url1 = ps.getProperty("url1");
		return url1;
	}

}
