package dataFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcelFile {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("sheet1");
		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Vasavi");
		Cell c1 = r0.createCell(1);
		c1.setCellValue("Hello");
		
		//File f = new File("C:\\JavaWorkspace\\XlsFiles\\src\\writeintoxlsFiles\\sheet1.xls");
		File f = new File("C:\\JavaWorkspace\\XlsFiles\\src\\writeintoxlsFiles\\sheet2.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		
		fos.close();
		workbook.close();
		
		System.out.println("Sheet created successfully");

	}

}
