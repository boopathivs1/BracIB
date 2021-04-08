package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_55  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC55";
		testDescription="Pay Tuition fees(One Time payment)";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC55";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String Otp,String billermenu,String billerName,
			String fromacc,String toaccount,String amount,
			String beneficiarytype,String channeltype,String transHistoryToAccount,String payslipnumber,String billremarks,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{
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
//		.clickBillermenu(billermenu)
	//.clickmobilebillername(billerName)	
	.locateFrames()	
	.clickOnetimePay()
	.MobileBillerPayForm("fromAcc",fromacc)
	.balanceAmount()
	//"00501710"
//	.MobileBillerPayForm("onetimepay ToAccount",toaccount)	
	.MobileBillerPayForm("PayslipNumber",payslipnumber)
	

//	.MobileBillerPayForm("GetAmount","null")
	.MobileBillerPayForm("ClickGetAmount","null")
	.getbracunivamt()
	//.MobileBillerPayForm("TransAmount",amount)
	.MobileBillerPayForm("billPayRemarks",billremarks)
	//.MobileBillerPayForm("ClickSms","null")
	.submitPayments()
	.otpsubmit()
	.VerifyTransfer()
	.clickOtherMenu()
	.clickTransactionHistory()
	.filterTransactionHistory(fromacc, beneficiarytype, channeltype,transHistoryToAccount)
	.verifyTransactionHistoryBillers(BillDueAmount)

	.clickAccountMenu()
	.verifyAccountsPagebalance()
	.verifyMiniStatementbalance(amount)
	.logout();
		
		
			
			}

		catch (Exception e) {

	logout();
			throw new Exception();
			
			// TODO: handle exception
		}

		}
		}

