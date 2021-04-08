package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_43  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC43";
		testDescription="Mobile Wallet- Internet-Add Beneficiary";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC43";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String billName,String billType
			,String BillNumber,String ShortName,String data0,String data1,String data2,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()

	.clicknetLink()
	.deleteBillerbeneficiary(BillNumber,"InternetBill")
	.locateFrames()
	.clickaddBillersLink()
	
	//.clickinternetLink()
	
	//.clickMobileLink()
//	.clickaddBillersLink()
	//.locateFrames()
	.billerForm("Billername",billName)
//	.billerForm("BillerType",billType)
	.billerForm("Mob Biller Number",BillNumber)
	.billerForm("ValidateButton","null")
	.billerForm("customer name",ShortName)
	.billerForm("short name",ShortName)
	.billerForm("ClickSms","null")

//	.billerForm("Insurance customer name",customername)
	//.billerForm("Insurance short name",shortname)
	.billerForm("submitButton","null")
	.billerForm("confirmbillpay","null")
	//.billerForm("confirm","null")
	.otpsubmit()
	.billerForm("verifySucess","null")
	.SwitchdefaultContent()
	.clickeditinternetLink()
	.locateFrames()
	.verifyaddBillersLink(BillNumber)
	.logout();

	
	
	
	
	
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

//	.logout();
		
	
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

