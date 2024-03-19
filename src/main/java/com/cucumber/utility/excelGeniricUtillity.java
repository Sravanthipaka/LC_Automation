package com.cucumber.utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.cucumber.PageObjects.EncryptedDocumentException;
//import com.cucumber.PageObjects.IOException;
import com.google.common.collect.Table.Cell;

public class excelGeniricUtillity {

	public String getDataFromExcel(String sheet, int rownum , int cellnum) throws Exception
	{
		FileInputStream f  = new FileInputStream(".\\src\\test\\resources\\ORFiles\\ResponsiveED 1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet sh = book.getSheet(sheet);
		DataFormatter format= new DataFormatter();
		String data = format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return data;
	}

	
	}

