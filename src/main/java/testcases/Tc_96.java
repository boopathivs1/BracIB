package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_96  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC96";
		testDescription="Fund Transfer-Within Barac-Existing Beneficiary -Credit Card -Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC96";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String miniamount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String toaccTranHistory,String maxamount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		
		String maximumAmt=regvalue(maxamount);
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clickwithinBracMenu()
	.transferWithinBaracForm(fromACC,miniamount,toAccount,acctype)
	.verifyAmountMinmsg()
	.enterMaxAmount(maximumAmt)
	.verifyAmountMaxmsg()
	.logout();
		
	
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

