package com.practice.readdatafromexcelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		  Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		  
		  int lastrow = sh.getLastRowNum();
		  
		  for(int i=0;i<=lastrow;i=i+1) 
		  {
			  int cellindex = sh.getRow(i).getLastCellNum()-1;	  
			  for(int j=0;j<=cellindex;j++)
			  {
				  String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
				
				
				
				System.out.println("clones successfullyyyyyyyy");
				
				System.out.println("branch demo -----testing");
			
				System.out.println("branch demo merging-----testing");


	}

}
}
}