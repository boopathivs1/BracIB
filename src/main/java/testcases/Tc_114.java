package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_114  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC114";
		testDescription="Teletalk (One Time Pay)-Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC114";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String Otp,String billerName,
			String fromacc,String toaccount,String minimumamount,
			String beneficiarytype,String channeltype,String transHistoryToAccount,String billremarks,String maximumamount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		String minimumAmt=regvalue(minimumamount);

		String maximumAmt=regvalue(maximumamount);

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
.MobileBillerPayForm("onetimepay ToAccount",transHistoryToAccount)
.MobileBillerPayForm("click PrepaidTab","null")
.MobileBillerPayForm("MobilepayAmount",minimumAmt)
.MobileBillerPayForm("ValidateMinimumAmount",null)
.MobileBillerPayForm("MobilepayAmount",maximumAmt)
.MobileBillerPayForm("ValidateMaximumAmount",null)
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

