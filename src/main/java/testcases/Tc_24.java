package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_24  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC24";
		testDescription="Fund Transfer-Other Bank -One time Payment -Account Type";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC24";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String amount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String transHistoryToAccount,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clicktransferOtherBank()
	
	
	.transferOtherOneTimePayForm(fromACC, amount, toAccount, acctype)
	//.transferOtherBankOnTimePayForm(fromACC, amount, toAccount, acctype)
	.transferothercardSubmitForm(Remarks)
	
	//.transferWithinSubmitForm(Remarks)
.otpsubmit()
	.VerifyTransfer()
	.clickOtherMenu()
	.clickTransactionHistory()
	.filterTransactionHistory(fromACC, beneficiarytype, channeltype,transHistoryToAccount)
	.verifyTransactionHistory(amount)
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

