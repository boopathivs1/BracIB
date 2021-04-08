package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_59  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC59";
		testDescription="Mobile Wallet- Mobile Bill Add Beneficiary-Teletalk";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC59";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String billerName,
			String Billertype,String billNumber,String ShortName,
			String data1,String data2,String data3,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()
	.clickMobileLink()
	.deleteBillerbeneficiary(billNumber,"MobileLink")
	//.clickMobileLink()
	.locateFrames()
	.clickaddBillersLink()
	.billerForm("Billername",billerName)
	.billerForm("BillerType",Billertype)
	.billerForm("Mob Biller Number",billNumber)
	//.billerForm("ValidateButton","null")
	.billerForm("short name",ShortName)
	.billerForm("ClickSms","null")
	.billerForm("submitButton","null")
	//.billerForm("confirm","null")
	.billerForm("confirmbillpay","null")
	
	.otpsubmit()

	
	.billerForm("verifySucess","null")
	.SwitchdefaultContent()
	.clickMobileLink()
	.locateFrames()
	.verifyaddBillersLink(billNumber)
	.logout();

		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

