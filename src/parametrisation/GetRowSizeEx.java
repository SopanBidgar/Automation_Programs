package parametrisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowSizeEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		 int work = WorkbookFactory.create(file).getSheet("DDF").getLastRowNum();
		 System.out.println(work);
	}

}
