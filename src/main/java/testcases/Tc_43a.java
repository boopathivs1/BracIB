package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_43a  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC43a";
		testDescription="Mobile Wallet- Insurance-Edit Internet";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC43a";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String billersubcat,String Insurancecompanyone,
			String billnumber,String shortname,String updateshortname,String customername,String studentid,String InsuranceCompTwo,String data0,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()	
.clicknetLink()
.editbeneficiaryMobileWallet(billnumber, updateshortname)
.clickConfirm()
//.otpsubmit()
.billerForm("verifySucess","null")
.logout();
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		//System.out.println("pass");
		
		// TODO: handle exception
	}

	}
	}

