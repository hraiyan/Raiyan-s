package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	XSSFSheet st;
	{
	File src=new File("./ApplicationTestData/testdata.xlsx");
	
try {
	FileInputStream fis=new FileInputStream(src);
	wb = new XSSFWorkbook(fis);
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

	public String getData(int sheet,int row,int col){
		
		st=wb.getSheetAt(sheet);
		String data = st.getRow(row).getCell(col).getStringCellValue();
		return(data);
		
		
		
	}
	
}