package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_111  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC111";
		testDescription="Pay Mobile(Regular payment)-Airtel-Minimum Amount and Maximum Amount";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC111";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String Otp,String billerName,
			String fromacc,String toaccount,String miniamount,
			String beneficiarytype,String channeltype,String transHistoryToAccount,String billremarks,String maximumamount,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		String maximumAmt=regvalue(maximumamount);

		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()
.clickmobilebillername(billerName)	
.locateFrames()	
.MobileBillerPayForm("fromAcc",fromacc)
.balanceAmount()
.MobileBillerPayForm("toAcc",toaccount)
.MobileBillerPayForm("MobilepayAmount",miniamount)
.MobileBillerPayForm("ValidateMinimumAmount",null)
.MobileBillerPayForm("MobilepayAmount",maximumAmt)
.MobileBillerPayForm("ValidateMaximumAmount",null)
.logout();
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

