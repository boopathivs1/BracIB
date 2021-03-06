package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_48  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC48";
		testDescription="Pay Utility(Regular payment)";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC48";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void utilityRegularPayments(String casename,String Username,String Password,String Otp,String billermenu,String billerName,
			String fromacc,String toaccount,String amount,
			String beneficiarytype,String channeltype,String transHistoryToAccount,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{
		try{
			new	BaracHomePage(driver,test)
		.enterUserName(Username)
		.clickContinueButton()
		
		.enterPassword(Password)
		.clickSecureCheckBox()
		.clickLoginButton()
		.clickBillPaymentsLink()
		.clickmobilebillerMenu(billermenu)
	.clickmobilebillername(billerName)	
	.locateFrames()	
	.MobileBillerPayForm("fromAcc",fromacc)
	.balanceAmount()
	.MobileBillerPayForm("toAcc",toaccount)
	.MobileBillerPayForm("ClickGetAmount",null)
	.getUtiityamt()
	
	
	
	//.MobileBillerPayForm("TransAmount",amount)
	.submitPayments()
	.otpsubmit()
	.VerifyTransfer()
	.clickOtherMenu()
	.clickTransactionHistory()
	.filterTransactionHistory(fromacc, beneficiarytype, channeltype,transHistoryToAccount)
	.verifyTransactionHistoryBillers(BillDueAmount)
	//.verifyTransactionHistory(amount)
	.clickAccountMenu()
	.verifyAccountsPagebalance()
	.verifyMiniStatementbalance(amount)
	.logout();

		
		
		
		
		
		
		
		

	/*




		.clickaddBillersLink()
		.locateFrames()
		.billerForm("Billername",billerName)
		.billerForm("BillerType",Billertype)
		.billerForm("Biller Number",billNumber)
		.billerForm("ValidateButton","null")
		.billerForm("short name",ShortName)
		.billerForm("submitButton","null")
		.billerForm("confirm","null")
		.SwitchdefaultContent()
		.clickMobileLink()
		.locateFrames()
		.verifyaddBillersLink(billNumber);
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

		
			
			}

		catch (Exception e) {

	logout();
			throw new Exception();
			
			// TODO: handle exception
		}

		}
		}

