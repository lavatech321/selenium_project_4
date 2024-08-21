package com.lavatech.www;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {

WebDriver driver;
	
	@BeforeClass
	public void connectSite() {
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
	}
	
	@Test(priority=0)
	@Parameters({"email","password","name","lname"})
	public void register(String email, String password, String name, String lname) throws InterruptedException {
		String condition="noskip";
		
		if (condition.equals("skip")) {
			throw new SkipException("Skipping");
		}
		
		WebElement reg_link = driver.findElement(By.linkText("Register"));
		reg_link.click();
		Thread.sleep(2000);
		
		WebElement male = driver.findElement(By.id("gender-male"));
		male.click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys(name);
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys(lname);
		Thread.sleep(2000);
		
		WebElement email1 = driver.findElement(By.id("Email"));
		email1.sendKeys(email);
		Thread.sleep(2000);
		
		WebElement password1 = driver.findElement(By.id("Password"));
		password1.sendKeys(password);
		Thread.sleep(2000);
		
		WebElement password2 = driver.findElement(By.id("ConfirmPassword"));
		password2.sendKeys(password);
		Thread.sleep(2000);
		
		WebElement reg_btn = driver.findElement(By.name("register-button"));
		reg_btn.click();
		Thread.sleep(2000);
		
		WebElement cont = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]"));
		cont.click();
		Thread.sleep(2000);
	
		WebElement lout = driver.findElement(By.linkText("Log out"));
		lout.click();
		Thread.sleep(2000);
	
	}
	
	@Test(priority=1)
	@Parameters({"email","password"})
	public void login(String email, String password) throws InterruptedException {
	//public void login() throws InterruptedException {
		WebElement log = driver.findElement(By.linkText("Log in"));
		log.click();
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.id("Email"));
		e1.sendKeys(email);
		//e1.sendKeys("ramankumar123@gmail.com");
		Thread.sleep(2000);
		
		WebElement p1 = driver.findElement(By.id("Password"));
		p1.sendKeys(password);
		//p1.sendKeys("rk1234@12345@");
		Thread.sleep(2000);
		
		WebElement check = driver.findElement(By.id("RememberMe"));
		check.click();
		Thread.sleep(2000);
		
		WebElement log_btn = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]"));
		log_btn.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void cart() throws InterruptedException {
		WebElement add_cart1 = driver.findElement(By.linkText("$25 Virtual Gift Card"));
		add_cart1.click();
		Thread.sleep(2000);
		
		WebElement rname = driver.findElement(By.id("giftcard_2_RecipientName"));
		rname.sendKeys("Ravi Kumar");
		Thread.sleep(2000);
		
		WebElement remail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
		remail.sendKeys("ravikumar@gmail.com");
		Thread.sleep(2000);
		
		WebElement rmsg = driver.findElement(By.id("giftcard_2_Message"));
		rmsg.sendKeys("Happy Birthday!!");
		Thread.sleep(2000);
		
		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		qty.clear();
		qty.sendKeys("5");
		Thread.sleep(2000);
		
		WebElement add1 = driver.findElement(By.id("add-to-cart-button-2"));
		add1.click();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/cart");
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void orderPlace() throws InterruptedException {
		WebElement t_and_c = driver.findElement(By.name("termsofservice"));
		t_and_c.click();
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		Thread.sleep(2000);
		
		WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
		company.sendKeys("TCS");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		country.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
		city.sendKeys("Pune");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("BillingNewAddress_Address1"));
		address.sendKeys("Hadapsar");
		Thread.sleep(2000);
		
		WebElement code = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		code.sendKeys("411028");
		Thread.sleep(2000);
		
		WebElement phno = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		phno.sendKeys("8732145231");
		Thread.sleep(2000);
		
		WebElement continue1 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"));
		continue1.click();
		Thread.sleep(4000);
		
		WebElement continue2 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]"));
		continue2.click();
		Thread.sleep(4000);
		
		WebElement continue3 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/div[1]/input[1]"));
		continue3.click();
		Thread.sleep(4000);
		
		WebElement continue4 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[2]/input[1]"));
		continue4.click();
		Thread.sleep(4000);
		
		WebElement odetail = driver.findElement(By.linkText("Click here for order details."));
		odetail.click();
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	public void closeSite() {
		driver.quit();
	}

}
