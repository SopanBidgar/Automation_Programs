package com.practice.readdatafromexcelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetColumnSizeEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Java\\Sopan1.xlsx");
		 int work = WorkbookFactory.create(file).getSheet("DDF").getRow(0).getLastCellNum();
		 System.out.println(work);
	}
	}


