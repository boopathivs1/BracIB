package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_39  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC39";
		testDescription="Pay Rocket (with Beneficiaries)";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC39";
		LogoutStatus=true;	
		//usertype="CIBUser";

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
	.clickMobileWalletDropdown()
	.clickWalletMenu("Rocket")
	.mobileWalletToBeneficiary(fromACC, amount, toAccount, acctype)
//	.baractransferOneTimePayForm(fromACC, amount, toAccount, acctype)
	//.transferWithinBaracOnTimePayForm(fromACC, amount, toAccount, acctype)
	//.transferWithinSubmitForm(Remarks)
//	.transferWithinForm(Remarks)
	.transferwalletpay(Remarks)
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

