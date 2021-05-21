package com.netcore.CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtilss 
{
	public String getPropertyKeyValue(String key) throws Throwable  {
		  
		FileInputStream fis = new FileInputStream("./testData/CommonData.properties");
		 Properties pObj = new Properties();
		 pObj.load(fis);
		 String value = pObj.getProperty(key);
	
	return value;
}

	
}
