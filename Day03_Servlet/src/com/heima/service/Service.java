package com.heima.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Service {
	public void method() throws FileNotFoundException, IOException{		
		Properties prop = new Properties();
		prop.load(new FileInputStream(Service.class.getClassLoader().getResource("../../config.properties").getPath()));		
		System.out.println(prop.getProperty("key"));
		System.out.println(prop.getProperty("value"));
	}
	
}
