package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CarLoan;


public class TS001_CarLoanTest extends DriverSetup{
	

	@Test
	public void carLoan() 
	{
		try {
		CarLoan obj = new CarLoan(driver);
		obj.navigator();
		obj.clickCarLoan();
		obj.setLoanAmt(p.getProperty("carLoanAmt"));
		obj.setInterest(p.getProperty("carLoanInt"));
		obj.moveLoanTenureSlider(p.getProperty("carLoanYr"));
		obj.clickOnYear();
		obj.scrollToTable();
		obj.clickOnYears();
		obj.printTheEMIPaymentTable();
		Assert.assertTrue(true);
		
	}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
