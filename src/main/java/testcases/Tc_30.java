package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_30  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC30";
		testDescription="Add Benef Rocket";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC30";
		LogoutStatus=true;	
		usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String accnumber,String payeename,String nickname,String phonenum,String remarks,String updatenickname,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
			Boolean payenameStatus=true;
			
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clickeditMobileWallet()
	.locatingFrames()
	.clickrocketpay()
//	.deletebeneficiary(nickname)


	.deleteUpdbeneficiary(nickname,updatenickname)
	.clickAddBeneficiaryMobie_Wallet()
	.fillMobileAddBeneficiary(accnumber, payeename, nickname,phonenum, remarks,payenameStatus)
.clickConfirmbutton()
.otpsubmit()
.verifyBeneficiaryAdded(accnumber)
.verifySearchBeneficiary(nickname)
.logout();
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

