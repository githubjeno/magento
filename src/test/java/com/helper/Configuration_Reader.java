package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
    public static Properties prop= new Properties();
	public Configuration_Reader() throws IOException {
	  File f = new File("C:\\Users\\ashin\\eclipse-workspace\\magento\\src\\test\\java\\com\\helper\\magento.properties");
	  FileInputStream fis = new FileInputStream(f);
	  prop.load(fis);
  }

	public static  String geturl() {
		String url = prop.getProperty("url");
		return url;
		
	}
	
}
