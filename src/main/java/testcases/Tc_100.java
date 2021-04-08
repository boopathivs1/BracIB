package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_100  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC100";
		testDescription="Fund Transfer-other Bank-Account -Existing Beneficiary-Credit card type-Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC100";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String MinimumAmount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String toaccTranHistory,String MaximumAmount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		String maximumAmt=regvalue(MaximumAmount);
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
.clicktransferOtherBank()
	.transferotherBaracForm(fromACC,MinimumAmount,toAccount,acctype)
	.verifyAmountMinmsg()
	.enterMaxAmount(maximumAmt)
	.verifyAmountMaxmsg()

//	.logout();
		
	.logout();
		}
	catch (Exception e) {
logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

