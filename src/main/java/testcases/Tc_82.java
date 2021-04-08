package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_82  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC82";
		testDescription="Banglalink (One Time Pay)";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC82";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String Otp,String billerName,
			String fromacc,String toaccount,String amount,
			String beneficiarytype,String channeltype,String transHistoryToAccount,String billremarks,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()
.clickmobilebillername(billerName)	
.locateFrames()	
.clickOnetimePay()
.MobileBillerPayForm("fromAcc",fromacc)
.balanceAmount()
.MobileBillerPayForm("onetimepay ToAccount",toaccount)
.MobileBillerPayForm("click PrepaidTab","null")
//.MobileBillerPayForm("TransAmount",amount)
.MobileBillerPayForm("MobilepayAmount",amount)
.MobileBillerPayForm("billPayRemarks",billremarks)
//.MobileBillerPayForm("Remarks","Premium")
//.submitPayments()
.submitOnetimePayments()
.otpsubmit()
.VerifyTransfer()
.clickOtherMenu()
.clickTransactionHistory()
.filterTransactionHistory(fromacc, beneficiarytype, channeltype,transHistoryToAccount)
.verifyTransactionHistory(amount)
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

//	.logout();
	
	
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

