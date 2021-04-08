package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_93  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC93";
		testDescription="Transfer between my Accounts-Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC93";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String MiniMumAmount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String toaccTranHistory,String maximumamount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
	String miniamt=regvalue(MiniMumAmount);
		
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clickownacclink()
	//.transferOwnAccountBaracForm(fromACC,miniamt, toAccount, acctype)
	.transferOwnAccForm(fromACC,miniamt,toAccount, acctype)
	.verifyAmountMinmsg()
	.enterMaxAmount(maximumamount)
	.verifyAmountMaxmsg()
//	.transferownAccSubmForm(Remarks)
	.logout();
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

