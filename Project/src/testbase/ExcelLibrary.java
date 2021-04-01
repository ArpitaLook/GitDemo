package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {

	public String getData(String sheetName,int rowNum, int cellNUm)
	{
		FileInputStream fis;
		String retVal=null;
		try {
			fis = new FileInputStream("G:\\Data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			Row r=s.getRow(rowNum);
			Cell c=r.getCell(cellNUm);
			retVal=c.getStringCellValue();
		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retVal;
		
		
		
	}

}
