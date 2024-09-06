package org.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver chromedriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void urllunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();

	}

	public static void implicitilywait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	

	public static void quite() {
		driver.quit();

	}
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	
	public static void selectByVisibleText(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}

	public static void clickAndHold(WebElement e) {
		Actions a = new Actions(driver);
		a.clickAndHold(e).perform();
	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void release(WebElement e) {
		Actions a = new Actions(driver);
		a.release(e).perform();
	}



	
	
	
	
	
	
	

}
