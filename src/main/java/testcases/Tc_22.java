package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_22  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC22";
		testDescription="Fund Transfer-other Bank-Account -Existing Beneficiary AccountType";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC22";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String amount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String toaccTranHistory,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clicktransferOtherBank()
	
	
	
	.transferotherBaracForm(fromACC,amount,toAccount,acctype)
//	.transferWithinSubmitForm(Remarks)
	.transferothercardSubmitForm(Remarks)
	.otpsubmit()
	.VerifyTransfer()
	.clickOtherMenu()
	.clickTransactionHistory()
	.filterTransactionHistory(fromACC, beneficiarytype, channeltype,toaccTranHistory)
	.verifyTransactionHistory(amount)
	.clickAccountMenu()
	.verifyAccountsPagebalance()
	.verifyMiniStatementbalance(amount)
	.logout();
		
	
		
		}

	catch (Exception e) {
System.out.println(e);
logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

