package org.test;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pages.LoginPage;
import org.product.ProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class DcKapTest extends BaseClass {
	public Properties properties = new Properties();

	@BeforeMethod
	private void beformethod() throws FileNotFoundException, IOException {

		chromedriver();
		properties.load(new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//config//Credentials.properties"));
	}

	@Test
	private void test1() {

		urllunch(properties.getProperty("url"));
		
		implicitilywait(20);
		
		LoginPage l = new LoginPage();

		sendkeys(l.getEmailid(), properties.getProperty("username"));

		click(l.getClickemail());

		sendkeys(l.getPassword(), properties.getProperty("password"));

		click(l.getBtnlogin());

		click(l.getDemoclick());
		//=================================================================
		
		
		moveToElement(l.getCatlog());
		l.getCatlog().click();
		
		l.getProducts().click();
		l.getNewproduct().click();
		l.getProductname().sendKeys("Audi Car A6");
		l.getSku().sendKeys("Audi");
		l.getPrice().sendKeys("64,00,000/- ");
		l.getShortdescript().sendKeys("The Audi A6 is a sporty, comfortable, and versatile sedan");
		//l.getUploadphoto().click();
		//l.getUploadimg().click();
		//l.getAssign().click();
		l.getCategory().click();
		l.getSafty().click();
		//l.getSaftyproduct().click();
		l.getGivename().sendKeys("luxury car");
		l.getClickgivenname().click();
		
		
		
		
	
		
	
	
		
		}
	
	




  }
		
	


