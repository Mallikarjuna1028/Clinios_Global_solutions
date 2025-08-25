package TestDatapack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PomCoding extends PomReusedMethod{
	
	@FindBy(xpath="//input[@id='userName']")   WebElement User;
	@FindBy(xpath="//input[@id='Password']")   WebElement Pass;
	@FindBy(xpath="//button[text()='Sign in']") WebElement Signin;
	@FindBy(xpath="//input[@name='phoneNumber']")WebElement phone;
    @FindBy(xpath="//input[@name='firstName']") WebElement PatFirs;
    @FindBy(xpath="//input[@name='lastName']") WebElement PatLas;
    @FindBy(xpath="//input[@name='age']") WebElement Age;
    @FindBy(xpath="//input[@name='email']") WebElement email;
    @FindBy(xpath="//input[@name='quantity']") WebElement Quantity;
    
    
    //Add one medicine appear//
    @FindBy(xpath="//div[@id=\"root\"]/div/main/section/div/div[2]/div[1]/div[1]/div[2]/form/div[1]/div[1]/div/div/div[1]/div[2]")
    WebElement Medicinemane;
    @FindBy(xpath="//div[@id=\"root\"]/div/main/section/div/div[2]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div/div/div[1]/div[2]") 
    WebElement BrandName;
    @FindBy(xpath="//button[text()='+ Add']") WebElement addclick;
    @FindBy(xpath="//input[@id='Bill Discount']")WebElement BillDiscount;
    @FindBy(xpath="//div[@id=':r9:']")WebElement PaymentMode;
    @FindBy(xpath="//input[@id='Paid Amount']") WebElement Paidamount;
    
	   public void LoginApplication() throws InterruptedException {
	
		driver.get("https://cliniosqa-7f2c0-f0eb6.web.app/IOTXi9UI");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		User.sendKeys("suri");
		
		Pass.sendKeys("1234");
		Signin.click();
		
	}
        //Verify manadatory fields//
	    public void verifyMandatoryPatientFiled() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        
		phone.click();
		t(2);
        PatFirs.click();
        t(2);
        PatLas.click();
        t(2);
        Age.click();
        t(2);
        email.click();
        t(2);
        addclick.click();
        
       String ph=   driver.findElement(By.xpath("//span[text()='Phone Number is required']")).getText();
       Assert.assertEquals("Phone Number is required", ph);
       System.out.println(ph);      
       
       String PFname =   driver.findElement(By.xpath("//span[text()='Patient First Name is required']")).getText();
       Assert.assertEquals("Patient First Name is required", PFname);
       System.out.println(PFname);
       
       String PLname =   driver.findElement(By.xpath("//span[text()='Patient Last Name is required']")).getText();
       Assert.assertEquals("Patient Last Name is required", PLname);
       System.out.println(PLname);
       
       String Age= driver.findElement(By.xpath("//span[text()='Age is required']")).getText();
       Assert.assertEquals("Age is required", Age);
       System.out.println(Age);
       
       
       String Brandname =   driver.findElement(By.xpath("//div[text()='Brand Name is required']")).getText();
       Assert.assertEquals("Brand Name is required", Brandname);
       System.out.println(Brandname);
       
       
       String BatchNo =   driver.findElement(By.xpath("//div[text()='Batch No is required']")).getText();
       Assert.assertEquals("Batch No is required", BatchNo);
       System.out.println(BatchNo);
       
       String HcnCode =   driver.findElement(By.xpath("//div[text()='HSN Code is required']")).getText();
       Assert.assertEquals("HSN Code is required", HcnCode);
       System.out.println(HcnCode);
       
       String Quantity =   driver.findElement(By.xpath("//div[text()='Qunatity is required']")).getText();
       Assert.assertEquals("Qunatity is required", Quantity);
       System.out.println(Quantity);

       
       String Total =  driver.findElement(By.xpath("//div[text()='Total is required']")).getText();
       Assert.assertEquals("Total is required", Total);
       System.out.println(Total);
   
   }     
		
		
	    // Add one Medicine//
	    public void AddoneMedicine() throws AWTException, InterruptedException {
		
		Medicinemane.click();
		Robot y= new Robot();
	    y.keyPress(KeyEvent.VK_DOWN);
		y.keyRelease(KeyEvent.VK_DOWN);
		t(3);
		y.keyPress(KeyEvent.VK_ENTER);
		y.keyRelease(KeyEvent.VK_ENTER);


	    t(3);
		BrandName.click();
	    y.keyPress(KeyEvent.VK_ENTER);
	    y.keyRelease(KeyEvent.VK_ENTER);
	  
	    t(2);
	    Quantity.sendKeys("20");
	    t(2);
	    addclick.click();
     }
	    public void DiscountCalculation() throws InterruptedException, AWTException {
		
	    BillDiscount.sendKeys("30");	
 
		 
}
	    void verify_Bal_Bill_Paid_Amnt() throws AWTException, InterruptedException {
	
	    PaymentMode.click();	
	    Robot y= new Robot();
        y.keyPress(KeyEvent.VK_DOWN);
	    y.keyRelease(KeyEvent.VK_DOWN);
	    t(3);
	    y.keyPress(KeyEvent.VK_ENTER);
	    y.keyRelease(KeyEvent.VK_ENTER);
    
	    Paidamount.sendKeys("1000");
	
	    WebElement Discount =driver.findElement(By.xpath("//input[@name='discount']"));
	    System.out.println("The Costumer Discount is:"+Discount.getAttribute("values"));
	
	    WebElement v = driver.findElement(By.xpath("//input[@id='Net Price']"));
		System.out.println("The Net Price Amount is :"+v.getAttribute("value"));
	
	    WebElement P= driver.findElement(By.xpath("//input[@name='paidAmount']"));	
	    System.out.println("The paid bill amount is :"+P.getAttribute("value"));	
		
	    WebElement  V = driver.findElement(By.xpath("//input[@name='balanceAmount']"));
	    System.out.println("The balance Amount is:"+V.getAttribute("value"));
	
	
	}
		
		
	}

