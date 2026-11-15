package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	Properties properties;
	String path = "E:\\Java Project Directory\\Test1\\src\\test\\java\\PropertiesFile\\ConfigText.txt";
	public ReadConfigFile()
	{
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getURL()
	{
		String url = properties.getProperty("url");
		if(url!=null)
			return url;
		else 
			throw new RuntimeException("url not specifed in config file.");
	}
	public String getUserNae()
	{
		String username = properties.getProperty("username");
		if(username!=null)
			return username;
		else 
			throw new RuntimeException("username not specifed in config file.");
	}
	
	public String getPassword()
	{
		String password = properties.getProperty("password");
		if(password!=null)
			return password;
		else 
			throw new RuntimeException("password not specifed in config file.");
	}
	
	

}
