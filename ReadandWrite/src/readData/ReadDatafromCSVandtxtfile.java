package readData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatafromCSVandtxtfile {

	public static void main(String[] args) throws IOException {
		FileReader txt = new FileReader(System.getProperty("user.dir")+"\\src\\readProperties\\textFile.txt");
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\readProperties\\CsvFilfgh.csv");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader jk = new BufferedReader(txt);
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		for(int i=0; i<= 5; i++) {
			System.out.println(jk.readLine());
		}
		
		for(int i=0; i<= 5; i++) {
			System.out.println(br.readLine());
		}
	}

}
