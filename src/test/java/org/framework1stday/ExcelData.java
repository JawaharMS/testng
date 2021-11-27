package org.framework1stday;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13pro", Keys.ENTER);
		List<WebElement> iphone = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
		
		File f = new File("C:\\Users\\ELCOT\\Documents\\Fritz 17.19 Multilingual\\Jawahar\\iphone.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		Workbook a = new XSSFWorkbook();
		Sheet createSheet = a.createSheet("list");
		
		for (int i = 0; i < iphone.size(); i++) {
			
			WebElement x = iphone.get(i);
			String text = x.getText();
			System.out.println(text);
		
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			}
		
		a.write(fo);
	}}
