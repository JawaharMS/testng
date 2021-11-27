package org.framework1stday;

import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
//01
	public void launch(String url) {
		driver.get(url);
	}
//02
	public WebElement xpath(String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		return element;
	}
//03
	public void insertValues(WebElement refName, String Values) {
		refName.sendKeys(Values);
	}
//04
	public void buttonClick(WebElement refName) {
		refName.click();
	}
//05
	public WebElement id(String idvalue) {
		WebElement element = driver.findElement(By.xpath(idvalue));
		return element;
	}
//06
	public void javaScriptExecutor(){
		
		 jsc=(JavascriptExecutor)driver;
		 
		}
//07
	public void javaScriptsetAttribute(String argsvalue,WebElement refname) {
		

		jsc.executeScript("arguments[0].setAttribute('value',argsvalue)", refname);
		
	}
//08
	public void javaScriptgetAttribute(String argsvalue,WebElement refname) {
		

		jsc.executeScript("return arguments[0].getAttribute('value')", refname);
		
	}
//09
	public void javaScriptClick(String argsvalue,WebElement refname) {
		

		jsc.executeScript("arguments[0].click()", refname);
		
	}
//10
	public void scrollUp(WebElement refnamescrollUp) {
		
		jsc.executeScript("arguments[0].scrollIntoView(false)", refnamescrollUp);

	}
//11
	public void scrollDown(WebElement refnamescrollDown) {
		
		jsc.executeScript("arguments[0].scrollIntoView(true)", refnamescrollDown);

	}
//12
	public void select(WebElement refname) {
		
		Select slt=new Select(refname);

	}
//13
	public void selectByIndex(int a) {
		slt.selectByIndex(a);

	}
//14
	public void selectByValue(String value) {
		slt.selectByValue(value);

	}
//15
	public void selectByVisibleText(String value) {
		slt.selectByVisibleText(value);
	}
//16
	public void getOptions() {
		
		slt.getOptions();

	}
//17
	public void implicitwaitMillisec(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.MILLISECONDS);
	}
//18
	public void implicitwaitseconds(long sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
//19
	public void explicitWebdriverWait() {
		
		webwait=new WebDriverWait(driver, 5);

	}
//20
	public WebElement getAttributes(WebElement refname,String value) {
	
	refname.getAttribute(value);
	return refname;
	
	}
//21
	public void navigatelink(String nlink) {
		
		driver.navigate().to(nlink);

	}
//22
	public void threadSleep(int milliseconds) throws InterruptedException {
	
		Thread.sleep(milliseconds);

	}
//23
	public Actions actions() {
			actions=new Actions(driver);
			return actions;
	}
//24	
	public WebElement movetoElement(WebElement m2Elevalue) {
		actions.moveToElement(m2Elevalue).perform();
		return m2Elevalue;
	}
//25
	public WebElement draganddrop(WebElement ddvalue, WebElement ddtargetvalue) {
		
		actions.dragAndDrop(ddvalue, ddtargetvalue);
		return ddtargetvalue;
	}
//26
	public WebElement contextClick(WebElement Refname) {
	
		actions.contextClick(Refname).perform();;
		return Refname;
	
	}

//27
	public WebElement actionDownUpSendkeys(WebElement Refname,String actionDownUpSendkeysValue ) {
	
		actions.keyDown(Keys.SHIFT).sendKeys(Refname, actionDownUpSendkeysValue).keyUp(Keys.SHIFT);
		return Refname;
	}
//28
	public Robot robot() throws AWTException {
	
		robot=new Robot();
		return robot;
	
	}

//29
	public void robotShift() {
	
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	
	}
//30
	public void robotEnter() {
	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
//31
	public void enumEnter(WebElement refname,String enumvalue) {
	
	refname.sendKeys(enumvalue,Keys.ENTER);
	
	}
//32
	public void actionDoubleClick(WebElement refname) {
	
	actions.doubleClick(refname).perform();

	}
//33
	public void alert() {
	
	 al = driver.switchTo().alert();

	}

//34
	public void simpleAlert() {
	
		al.accept();

	}
//35
	public void confirmAlert() {
	
		al.dismiss();

	}
//36
	public void promptAlert(String value) {
	
		al.sendKeys(value);al.accept();

	}
//37
	public void screenShot() throws IOException {
	
	 screenshot=(TakesScreenshot)driver;
	
	}
//38
	public void filesUtil(String path,String Filename) throws IOException {
	
	File ss = screenshot.getScreenshotAs(OutputType.FILE);
	file=new File(path+Filename+".png");
	FileUtils.copyFile(ss, file);
	}
//39
	public void alertgetText() {
	
	al.getText();

	}
//40
	public void navigateRefresh() {
	
	driver.navigate().refresh();

	}
//41
	public void navigateBack() {
	
	driver.navigate().back();

	}
//42
	public void navigateforward() {
	
	driver.navigate().forward();

	}
//43
	public void getTitle() {
	
		driver.getTitle();
	}
//44
	public void getCurrentUrl() {
	
	driver.getCurrentUrl();

	}
//45
	public void getSourceCode() {
	driver.getPageSource();
	}
//46
	public void multiselectFirstSelect() {
	
	slt.getFirstSelectedOption();

	}
//47
	public void multiselectAllSelect() {
	
	slt.getAllSelectedOptions();

	}
//48
	public void webdriverWait(String value) {
	
	webwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	
	}
//49
	public void fluentwait() {
						
	 w1=new FluentWait(driver).withTimeout(100,TimeUnit.SECONDS).PollingEvery(20,TimeUnit.SECONDS).ignoring(Throwable.class);
	
	}
//50
	public void webelementframes(WebElement refname) {
	
	driver.switchTo().frame(refname);
	
	}
//51
	public void indexframes(int indexrefname) {
	
	driver.switchTo().frame(indexrefname);

	}
//52
	public void parentframes() {
	
	driver.switchTo().parentFrame();

	}
//53
	public void defaultContent() {
	
	driver.switchTo().defaultContent();

	}
//54
	public void parentWindow() {
	
	driver.getWindowHandle();	

	}
//55
	public void allwindowsId() {
	driver.getWindowHandles();	

	}
//56
	public void windowsIdString(String urlandwindowsId) {
	
	driver.switchTo().window(urlandwindowsId);
	
	}
//57
	public void webtableTagname(String tagValue) {
	
	List<WebElement> tagrefname = driver.findElements(By.tagName(tagValue));
	
	}
//58
	public void findElementsXpath(String tagValue) {
	
	List<WebElement> tagrefname = driver.findElements(By.xpath(tagValue));
	
	}

}
