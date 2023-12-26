package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileExample {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData\\Registration.xlsx");
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		
		XSSFSheet sheet = workbook.getSheet("Student");				//sheetname 
//		XSSFSheet sheet = workbook.getSheetAt(1);				//index 
		
		
		
		//no of rows
		int rowsCount = sheet.getLastRowNum();	
		
		
		
		int columnsCount = sheet.getRow(0).getLastCellNum();
		
		
		
		
		
		
		System.out.println("no of rows are: " + rowsCount);
		System.out.println("no of columns are: " + columnsCount);			
		
		
		
		
		
		
		for (int i = 1; i <= rowsCount; i++) {
			
			
			
			
			String firstName = sheet.getRow(i).getCell(0).toString();
			
			String Offical_address = sheet.getRow(i).getCell(5).toString();
			
			
			System.out.println("=================================");
			System.out.println("Name : " + firstName + " :  " + Offical_address);
			
		
		
		
		
		}
		
		
		
		

	}

}
