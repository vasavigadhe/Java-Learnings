package readData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) throws IOException {
		//Step 1 : Create an object of FileWriter Class
		FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\src\\readProperties\\propertiesNew.properties",true);
		//FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\src\\readProperties\\data.properties",true);
		
		
		//step 2 : Create an object of Properties class 
		Properties p = new Properties();
		
		//step 3 : set values to the properties file
		p.setProperty("app", "Face");
		
		//step 4 : Use store Property method to store values in to the file
		p.store(fw, "comments");

	}

}
