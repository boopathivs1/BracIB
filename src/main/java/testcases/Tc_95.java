package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_95  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC95";
		testDescription="Fund Transfer-Within Barac-Existing Beneficiary-Account Type -Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC95";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String minimumamount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String toaccTranHistory,String maximumamount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clickwithinBracMenu()
	.transferWithinBaracForm(fromACC,minimumamount,toAccount,acctype)
	.verifyAmountMinmsg()
	.enterMaxAmount(maximumamount)
	.verifyAmountMaxmsg()
	
	
	.logout();
		
		//.//span[text()='Amount']/following::p[1]
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

