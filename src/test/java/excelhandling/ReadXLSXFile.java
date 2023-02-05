package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXLSXFile {

	
	@Test
	public void readXLSXFile() throws IOException {
		
		
		File f = new File("TestData", "hrm_test_data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
		XSSFSheet sheet = workbook.getSheetAt(0);
		
//		XSSFRow row = sheet.getRow(0);
		
//		XSSFCell cell = row.getCell(1);
//		
//		System.out.println(cell.getStringCellValue());
//		
//		System.out.println(row.getLastCellNum());
		
		for(int row = 0; row<7; row++) {
			String data  = sheet.getRow(row).getCell(1).getStringCellValue();
			
			System.out.println(data);
		}
		
		
		workbook.close();
	}
	
}
