package org.propertiesUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesGeneric {

	
	public String getPropertiesData(String key)
	{
		FileInputStream fis;
		try {
		
			fis = new FileInputStream("E:\\github_practice_main_branch\\Orm_Orange_Cucumber_framwork-master\\src\\test\\resources\\org\\propertiesFiles\\Config.properties");
			Properties pop =new Properties();
			pop.load(fis);
			String value=pop.getProperty(key);
            return value;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
	
}
