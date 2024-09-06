package org.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement emailid;

	@FindBy(xpath = "//span[text()='Continue with email']")
	private WebElement clickemail;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement Btnlogin;

	@FindBy(xpath = "//p[text()='demo-dev']")
	private WebElement democlick;
	
	@FindBy(xpath="//span[text()='Catalog']")
	private WebElement catlog;
	
	@FindBy(xpath="//a[@href='/products']")
	private WebElement products;
	
	@FindBy(xpath="//span[text()='Add Product']")
	private WebElement newproduct;
	
	@FindBy(name="name")
	private WebElement productname;
	
	@FindBy(name="sku")
	private WebElement sku;
	
	@FindBy(name="price")
	private WebElement price;
	
	@FindBy(name="shortDescription")
	private WebElement shortdescript;
	
	@FindBy(xpath="//span[text()='Upload File']")
	private WebElement uploadphoto;
	
	@FindBy(xpath="//span[text()='Chandru']/parent::div/preceding-sibling::div")
	private WebElement uploadimg;
	
	@FindBy(xpath="//button[text()='Assign']")
	private WebElement assign;
	
	@FindBy(xpath="//div[@class='text-gray-300 bg-[#f4fdff] py-1 px-3 flex items-center justify-center border-l border-gray-200 cursor-pointer']")
	private WebElement category;
	
	@FindBy(xpath="//input[@type='checkbox'])[1]")
	private WebElement safty;
	
	//@FindBy(xpath="//input[@type='checkbox'])[2]")
	//private WebElement saftyproduct;
	
	@FindBy(name="name")
	private WebElement givename;
	
	@FindBy(xpath="(//button[@type='button'])[41]")
	private WebElement clickgivenname;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	public WebElement getClickgivenname() {
		return clickgivenname;
	}

	public WebElement getGivename() {
		return givename;
	}

	public WebElement getSafty() {
		return safty;
	}

	//public WebElement getSaftyproduct() {
		//return saftyproduct;
	//}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getAssign() {
		return assign;
	}

	public WebElement getUploadimg() {
		return uploadimg;
	}

	public WebElement getUploadphoto() {
		return uploadphoto;
	}

	public WebElement getShortdescript() {
		return shortdescript;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getSku() {
		return sku;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getNewproduct() {
		return newproduct;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getCatlog() {
		return catlog;
	}

	//========================================
	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getClickemail() {
		return clickemail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnlogin() {
		return Btnlogin;
	}

	public WebElement getDemoclick() {
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = w.until(ExpectedConditions.visibilityOf(democlick));
		return until;
	}
	
	@FindBy(xpath="//span[text()='Catalog']")
	private WebElement addcatlog;

	public WebElement getAddcatlog() {
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addcatlogs = w.until(ExpectedConditions.visibilityOf(addcatlog));
		return addcatlogs;
	}
	
	

}
