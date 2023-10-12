package parametrisation;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReadfromExcel 
   {
    
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		Workbook work = WorkbookFactory.create(file);
		Sheet sh = work.getSheet("DDF");
		Row rw = sh.getRow(1);
		Cell cl = rw.getCell(1);
		String value = cl.getStringCellValue();
		System.out.println(value);
		
				
		
		/*FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		Workbook work = WorkbookFactory.create(file);
		Sheet sh = work.getSheet("DDF");
		Row rw = sh.getRow(2);
		Cell cl = rw.getCell(1);
		 boolean value = cl.getBooleanCellValue();
		System.out.println(value);*/
		
		
	
//		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
//		Workbook work = WorkbookFactory.create(file);
//		Sheet sh = work.getSheet("DDF");
//		Row rw = sh.getRow(6);
//		Cell cl = rw.getCell(2);
		//double value = cl.getNumericCellValue();
//		System.out.println(value);
		
		
		//FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		//double value = WorkbookFactory.create(file).getSheet("DDF").getRow(6).getCell(2).getNumericCellValue();
		//System.out.println(value);
	}
	
}
