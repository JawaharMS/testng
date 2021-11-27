package org.framework1stday;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExcel {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement titleHead = table.findElement(By.tagName("tr"));
		
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> tbody2 = tbody.findElements(By.tagName("tr"));
		
		
		WebElement titleRow = titleHead.findElement(By.tagName("td"));
		List<WebElement> datas = titleRow.findElements(By.tagName("h3"));
		
		File f = new File("C:\\Users\\ELCOT\\Documents\\Fritz 17.19 Multilingual\\Jawahar\\List of Countries.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Table");
		Row createRow = createSheet.createRow(0);
		
		for (int i = 0; i < datas.size(); i++) {
			
			WebElement data1 = datas.get(i);
			String text = data1.getText();
			Cell cell = createRow.createCell(i);
			cell.setCellValue(text);
			
			
			
		for (int j = 0; j < tbody2.size(); j++) {
			
			Row createRow2 = createSheet.createRow(j);
			WebElement data2 = tbody2.get(j);
			
			List<WebElement> td2 = data2.findElements(By.tagName("td"));
			
		for (int k = 0; k < td2.size(); k++) {
			
			WebElement data3 = td2.get(k);
			String text2 = data3.getText();
			Cell createCell = createRow2.createCell(k);
			createCell.setCellValue(text2);
			
			
			}}
		
		}w.write(fo);
		
}
}

