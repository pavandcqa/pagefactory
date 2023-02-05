package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileDemo {

	
	@Test(groups = {"smoke"})
	public void testPropertiesFile() throws IOException {
		
		// Create object for the file class
		File f = new File("./configuration.properties");
		
		// Create FileInputStream Object
		FileInputStream fis = new FileInputStream(f);
		
		//Create object of Properties 
		
		Properties prop = new Properties();
		
		// load the properties file
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("stg_app_url"));
		
	}
	
}
