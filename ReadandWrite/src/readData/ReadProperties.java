package readData;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Create an object of FileReader Class
		//FileReader fr = new FileReader("C:\\JavaWorkspace\\ReadandWrite\\src\\readProperties\\properties.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\readProperties\\properties.properties");
		
		//step 2 : Create an object of Properties class 
		Properties p = new Properties();
		
		//step 3 : load the properties file
		p.load(fis);
		
		//step 4 : Use get Property method to get property
		System.out.println(p.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
	}

}
