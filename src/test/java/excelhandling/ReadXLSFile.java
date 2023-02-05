package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;


public class ReadXLSFile {

	@Test
	public void readExcelFile() throws IOException {
		
		File f = new File("TestData", "hrm_test_data2.xls");

		FileInputStream fis = new FileInputStream(f);

		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		HSSFSheet sheet = workbook.getSheet("hrm_sheet1");
		
		for(int row = 0; row< sheet.getLastRowNum(); row++) {
			
			System.out.println(sheet.getRow(row).getCell(0).getStringCellValue());
		}

		workbook.close();
	}

}
