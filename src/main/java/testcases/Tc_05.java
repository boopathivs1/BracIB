package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_05  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC05";
		testDescription="Credit Card Statement(All types)";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC05";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String Data1,String Data2,String Data3,String Data4,String Data5,String Data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.frameSwitching()
	.clickCreditCardSummaryTab()
	.clickSummaryTab()
.verifyCreditCardTab("Unbilled transaction has been displaying","Unbilled transaction has not been displaying")
	.clickBilledTransactionTab()
	.verifyCreditCardTab("billed transaction has been displaying","billed transaction has not been displaying")

	.clicklastStatement()
	.verifyCreditCardTab("lastStatement has been displaying","lastStatement has not been displaying")

	.supplimentaryCards()
	//.verifyCreditCardTab("Supplimentary Cards has been displaying","Supplimentary Cards has not been displaying")
	.verifySupplimentaryCardTab("Supplimentary Cards has been displaying","Supplimentary Cards has not been displaying")

	
	.last6Statements()
	.verifyCreditCardTab("last6Statements has been displaying","last6Statements has not been displaying")
	.logout();

	
	
	
			
		
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}