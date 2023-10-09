package com.practice.readdatafromexcelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Printalldataincolumns 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		  Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		  
		  int lastrow = sh.getLastRowNum();
		  
		  for(int i=0;i<=lastrow;i=i+1) 
		  {
			  int cellindex = sh.getRow(i).getLastCellNum()-1;	  
			  for(int j=0;j<=cellindex;j++)
			  {
				  Cell value = sh.getRow(i).getCell(j);
				  CellType typeofcell = value.getCellType();
				  if(typeofcell==CellType.STRING) {
					 String stringvalue = value.getStringCellValue();
					 System.out.print(stringvalue);
				  }
				  else if(typeofcell==CellType.NUMERIC) {
						  double numericvalue = value.getNumericCellValue();
						 System.out.print(numericvalue);
					  }
				  else if(typeofcell==CellType.BOOLEAN) {
							  boolean booleanvalue = value.getBooleanCellValue();
							 System.out.print(booleanvalue);
						  }
			  }
			  System.out.println();
	      }
	}
}
