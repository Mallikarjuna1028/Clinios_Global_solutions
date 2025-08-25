package TestDatapack;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePack.Baseclass;

public class MyTestcases extends Baseclass{
@Test
	public void Login() throws InterruptedException, AWTException {
		
		
		PomCoding P= PageFactory.initElements(driver, PomCoding.class);
		
		P.LoginApplication();
		P.verifyMandatoryPatientFiled();
//		P.AddoneMedicine();
//		P.DiscountCalculation();
//		P.verify_Bal_Bill_Paid_Amnt();
//		
		
		
		
		
		
		
		
	}
	
	
}
