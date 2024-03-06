package com.Berluti.genricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtils //properties utils
{
public String readDataFromPropertyFile(String key) throws Throwable 
{
	FileInputStream fis = new FileInputStream(IpathConstants.FilePath);
	Properties pobj = new Properties();
	pobj.load(fis);
	
	String value = pobj.getProperty(key);
	return value;
	
	
}
}
