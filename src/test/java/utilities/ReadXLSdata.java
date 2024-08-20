package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSdata {


	@DataProvider(name="bvtdata")
		public String[][] getData(Method m) throws Exception {
		
		String excelsheetName=m.getName();
	File fr=new File("C:/Users/Naveen Reddy E/OneDrive/Desktop/Roopa Project/SeleniumProject/src/test/resources/testdata/testdata.xlsx");
	FileInputStream fis=new FileInputStream(fr);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet SheetName=wb.getSheet(excelsheetName);
	
	
	int TotalRows=SheetName.getLastRowNum();
	System.out.println(TotalRows);
	Row  Rowsell=SheetName.getRow(0);
	int totalcols=Rowsell.getLastCellNum();
	System.out.println(totalcols);
	
	
	DataFormatter format=new DataFormatter() ;
	  
	String testData[][]=new String[TotalRows][totalcols];
	for(int i=1; i<=TotalRows; i++) {
		for(int j=0; j<totalcols; j++ ) {
			testData[i-1][j]=format.formatCellValue(SheetName.getRow(i).getCell(j));
			System.out.println(testData[i-1][j]); 
		}
	}
	
		return testData;

	
}
}
	



