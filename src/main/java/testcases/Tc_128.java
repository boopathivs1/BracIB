package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_128  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC128,TC130";
		testDescription="Beneficiary Creation,Deletion-RTGS OtherBank";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Sreejith";
		testKeyword="TC128";
		LogoutStatus=true;	
		usertype="User";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String accnumber,String nickname,String BankName,String BranchName,String updatenickname,String Data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	
	.clickeditButtonBeneficiary()
	.clickOtherBankTab()
	.deleteUpdbeneficiary(nickname,updatenickname)
	.clickAddBeneficiaryButtonNoFrames()
	.fillOtherBank_RTGSAccount_Beneficiary(BankName,BranchName, accnumber, nickname)
	
//	.clickCardTab()
//.fillWithinBank_Account_Beneficiary(accnumber, nickname)
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

