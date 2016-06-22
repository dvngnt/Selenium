package ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public FileInputStream file = null;
	public FileOutputStream fileOut = null;
	String path = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;


	public ExcelReader(){
		path = System.getProperty("user.dir") + "\\src\\ex10\\testdata.xlsx";
		try {
			file = new FileInputStream(path);
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);

		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist");	} catch (IOException e) {
				e.printStackTrace();
			}
	}
	public ExcelReader(String path){
		try {
			file = new FileInputStream(path);
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);


		} catch (IOException e) {
			System.out.println("The file does not exist");
		}

	}
	/**
	 * @param sheetName
	 * 
	 * 
	 * @return the number of rows
	 */
	public int getSheetRows(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		return 1 + sheet.getLastRowNum();
		 }
	
	/**
	 * @param sheetName
	 * 
	 * 
	 * @return the number of columns
	 */
	public int getSheetColumns(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(0);
		return row.getLastCellNum();
		
	}
	
	
	/**
	 * @param sheetName, column, row
	 * 
	 * 
	 * @return The data at that location
	 */
	public String getCellData(String sheetName, int colNum, int rowNum){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		return cell.getStringCellValue();
		
	}
	
	public String getCellData(String sheetName, String colName, int rowNum){
		int colNum = -1;
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		for(int i = 0; i < getSheetColumns(sheetName); i++){
			row = sheet.getRow(0);
			cell = row.getCell(i);
			
			if(cell.getStringCellValue().equals(colName)){
				colNum = cell.getColumnIndex();
				break;
			} 
		}
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		return cell.getStringCellValue();
	}
	
	public void setCellData(String sheetName, int colNum, int rowNum, String str){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum);
		cell = row.createCell(colNum);
		cell.setCellValue(str);
		try {
			fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}
	}
	
	public static void main(String[] args){
		ExcelReader reader = new ExcelReader();
		System.out.println(reader.getSheetRows("SignUpTest"));
		System.out.println(reader.getSheetColumns("SignUpTest"));
		System.out.println(reader.getCellData("SignUpTest",1,2));
		System.out.println(reader.getCellData("LoginTest", "password", 2));
		reader.setCellData("LoginTest", 1, 1, "hello");

	}
}
