package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_45  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC45";
		testDescription="Mobile Wallet- Tuition Fees-Add Beneficiary";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC45";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String billname,String billtype,
			String billnumber,String shortname,String studentname,String studentid,String updateshortname,String data8,String data1,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
	
		
		String billno=regvalue(billnumber);
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()
	.clickTuitionLink()
//.deleteBillerbeneficiary(billnumber,"Tuition Fees")
.deleteBillerbeneficiaryName(shortname, updateshortname,"Tuition Fees")
//	.deleteBillerbeneficiary(shortname,updateshortname)
	.locateFrames()	
	.clickaddBillersLink()

	.billerForm("Billername",billname)
	//.billerForm("InstitutionName",billtype)
	.billerForm("Mob Biller Number",billno)
	.billerForm("ValidateButton","null")
	//.billerForm("short name",billno)
	//.billerForm("Studentname",studentname)
	//.billerForm("Studentid",studentid)

//	.billerForm("customer name",billno)
	.billerForm("customer name",shortname)

.billerForm("ClickSms","null")
	.billerForm("submitButton","null")
	.billerForm("confirmbillpay","null")
	//.billerForm("confirm","null")
	.otpsubmit()
//	.billerForm("confirm","null")
	.billerForm("verifySucess","null")
	.SwitchdefaultContent()
	//.clickTuitionFeesLink()
	.clickeditTuitionFeesLink()
	.locateFrames()
	.verifyaddBillersLink(shortname)
	.logout();
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}