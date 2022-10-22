package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//Set  the path
        XSSFWorkbook wbook1=new XSSFWorkbook("Data/TestDataXL.xlsx");
        //Open the sheet
        XSSFSheet sheet1=wbook1.getSheetAt(0);//read the first sheet
        //Row count
        int rC = sheet1.getLastRowNum(); //ctrl+2+l
        //column count
        short cC = sheet1.getRow(0).getLastCellNum();  //ctrl+2+l
        
         System.out.println("Row Count "+rC);
         System.out.println("Column Count "+cC);
         
         //XSSFRow
         XSSFRow fR =sheet1.getRow(2);
         XSSFCell cmpnyNam=fR.getCell(2);
         System.out.println(cmpnyNam.getStringCellValue());
         
	}

}
