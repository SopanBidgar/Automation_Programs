package com.practice.readdatafromexcelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		  Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		  
				  
		  for(int i=0;i<=sh.getLastRowNum();i=i+1) {
			 String value = sh.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(value);
				Thread.sleep(3000);

		  }
	}

}
