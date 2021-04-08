package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_14a  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC14a";
		testDescription="Other Bank Edit Beneficiary  -NPSB/BEFTN";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC14a";
		LogoutStatus=true;	
		usertype="User";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String accnumber,String nickname,String bankname,String BranchName,String updatenickname,String Data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
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
	//.clickeditButtonBeneficiary()
	.editbeneficiary(nickname,updatenickname)
	//.clickConfirmbutton()
//.otpsubmit()

//.verifySearchBeneficiary(updatenickname)
	
.clickbenbutton()
.clickbenbutton()
//.clickConfirmbutton()
//.otpsubmit()

.verifyEditSearchBeneficiary(updatenickname)
.logout();
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

