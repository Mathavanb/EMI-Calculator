package TestCase;

import org.testng.annotations.Test;

import pageObject.HomeLoan;

public class TS002_HomeLoanTest extends DriverSetup{
	
	
	
	@Test
	public void homeloan()
	{
		HomeLoan home = new HomeLoan(driver);
		home.navigator();
		home.scrollToTable();
		home.getTableData();
		
		
	}

}
