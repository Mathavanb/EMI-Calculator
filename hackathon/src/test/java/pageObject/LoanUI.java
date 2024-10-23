package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanUI extends BasePage{
	
	public LoanUI(WebDriver driver) {
		
		super(driver);
	}
	
	//Main Menu Element
		@FindBy(xpath = "//a[@id = 'menu-item-dropdown-2696']")
		WebElement mainMenuBtn;
		
		//Loan Calculator Element
		@FindBy(xpath = "//a[@title = 'Loan Calculator']")
		WebElement loanCalcBtn;
		
		
		//All the elements
		//Loan Amount Text Box
		@FindBy(xpath = "//input[@id = 'loanamount']")
		WebElement loanAmountTextBox;
		
		//Loan Amount Slider
		@FindBy(xpath = "//div[@id = 'loanamountslider']/span")
		WebElement loanAmountSlider;
		
		//Interest Rate Text Box
		@FindBy(xpath = "//input[@id = 'loaninterest']")
		WebElement IntRateTextBox;
		
		//Interest Rate Slider
		@FindBy(xpath = "//div[@id = 'loaninterestslider']/span")
		WebElement IntRateSlider;
		
		//Loan Tenure Text Box
		@FindBy(xpath = "//input[@id = 'loanterm']")
		WebElement LoanTenureTextBox;
			
		//Loan Tenure Slider
		@FindBy(xpath = "//div[@id = 'loantermslider']/span")
		WebElement LoanTenureSlider;
		
		//Fees & Charges Text Box
		@FindBy(xpath = "//input[@id = 'loanfees']")
		WebElement FeesAndChargesTextBox;
		
		//Fees & Charges Slider
		@FindBy(xpath = "//div[@id = 'loanfeesslider']/span")
		WebElement FeesAndChargesSlider;
		
		//EMI Text Box
		@FindBy(xpath = "//input[@id = 'loanemi']")
		WebElement emiTextBox;
		
		//EMI Slider
		@FindBy(xpath = "//div[@id = 'loanemislider']/span")
		WebElement emiSlider;
		
		//Year Button
		@FindBy(xpath = "//input[@id = 'loanyears']")
		WebElement yearBtn;
		
		//Month Button
		@FindBy(xpath = "//input[@id = 'loanmonths']")
		WebElement monthBtn;
		
		//Element of Loan Amount Calculator
		//Loan Amount Calculator Button
		@FindBy(id = "loan-amount-calc")
		WebElement loanAmountCalcBtn;
		
		
		//Element of Loan Tenure Calculator
		//Loan Amount Calculator Button
		@FindBy(id = "loan-tenure-calc")
		WebElement loanTenureCalcBtn;
		

	
}
