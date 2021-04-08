package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_42  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC42";
		testDescription="Mobile Wallet- Utility-Add Beneficiary";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC42";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	
	
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String billername,String billertype,
			String billerService,String billnumber,String shortname,String data0,String data1,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	
	.clickBillPaymentsLink()
//	.clickUtilityLink()
	.clickUtilLink()
	
	.deleteBillerbeneficiary(billnumber,"Utility")
	.locateFrames()
	.clickaddBillersLink()
	
	
	
	
	
	//.clickUtilityLink()	
//	.clickMobileLink()
	//.clickaddBillersLink()
	//.locateFrames()
	//.billerForm("BillerCategory",billertype)
	.billerForm("Billername",billername)
	.billerForm("BillerService",billerService)
	.billerForm("Mob Biller Number",billnumber)
	.billerForm("ValidateButton","null")
	.billerForm("short name",shortname)
	.billerForm("ClickSmsThird","null")
	.billerForm("submitButton","null")
.billerForm("confirmbillpay","null")
	
//	.billerForm("confirm","null")
	.otpsubmit()
	.billerForm("verifySucess","null")
	.SwitchdefaultContent()
	.clickeditUtilityLink()
	.locateFrames()
	.verifyaddBillersLink(billnumber)
	
	
	
	
	
	
	
/*	
	.transferWithinSubmitForm(Remarks)
	.otpsubmit()
	.VerifyTransfer()
	.clickOtherMenu()
	.clickTransactionHistory()
	.filterTransactionHistory(fromACC, beneficiarytype, channeltype)
	.verifyTransactionHistory(amount)
	.clickAccountMenu()
	.verifyAccountsPagebalance()
	.verifyMiniStatementbalance(amount);
*/

	.logout();
		
	
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}