package com.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonMethods {

	
	
	public static Map readExcel(String path )
	{
		Map<String, String> map1 = new HashMap<String, String>();
		String username = null;
		String pwd = null;
		String val = null;
		String val2 = null;
		
		File file=new File(path);
   	  
		 try {
				FileInputStream fis = new FileInputStream(file);
				 
		    	 XSSFWorkbook book = new XSSFWorkbook(fis); //read file
		    	 XSSFSheet sheet = book.getSheetAt(0); // mapping with excel so thats why we create object of XSSFSheet class
		    	int numberofrow = sheet.getLastRowNum();
		    	
		    	for(int i=0; i<=numberofrow;i++) // getting row size
		    	{
		    		for(int j=0;j<=1;j++) // getting column size
		    		{
		    			if(j==0) //if column size is zero give first value otherwise give second value
		    			{
		    			val = sheet.getRow(i).getCell(j).getStringCellValue();
		    			}
		    			else {
		    				val2 = sheet.getRow(i).getCell(j).getStringCellValue();
		    			}
		    		}
		    		
		    		map1.put(val, val2);
		    	}
		    	
		    	
		    	
			} catch ( IOException e) {
			e.printStackTrace();
			}
		return map1;
	
	
	}
}
