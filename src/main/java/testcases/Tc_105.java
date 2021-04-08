package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_105  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC105";
		testDescription="Pay Ipay (with Beneficiaries)-Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC105";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String fromACC,String minimumamount,String toAccount,String Remarks,String acctype,String beneficiarytype,String channeltype,String transHistoryToAccount,String maximumamount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		String maximumAmt=regvalue(maximumamount);

		try{
		new	BaracHomePage(driver,test)
		.enterUserName(Username)
	.clickContinueButton()

	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickTransferMenu()
	.clickMobileWalletDropdown()
	.clickWalletMenu("iPay")
	.mobileWalletToBeneficiary(fromACC,minimumamount, toAccount, acctype)
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

