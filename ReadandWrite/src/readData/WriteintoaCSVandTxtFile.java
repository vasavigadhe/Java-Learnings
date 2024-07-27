package readData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteintoaCSVandTxtFile {
	public static void main(String[] args) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\readProperties\\CsvFilfgh.csv");
		//step 1: Create an object of Filewriter class
		FileWriter fw = new FileWriter(f, true);
		// step 2: Create an object of BufferedWriter
		BufferedWriter bw = new BufferedWriter(fw);
	
		// step 3: write data 
		for(int i=0; i<=10; i++) {
			bw.write("This is a csv file"+ ",");
		}
		
		
		// step 4: close file		
		bw.close();
	}
}
