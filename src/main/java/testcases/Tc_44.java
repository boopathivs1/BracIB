package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_44  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC44";
		testDescription="Mobile Wallet- Insurance-Add Beneficiary";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC44";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void checkAccSummary(String casename,String Username,String Password,String Otp,String billersubcat,String Insurancecompanyone,
			String InsuranceCompTwo,String billnumber,String customername,String shortname,String studentname,String studentid,String data0,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17) throws Exception{
		try{
		new	BaracHomePage(driver,test)
	.enterUserName(Username)
	.clickContinueButton()
	
	.enterPassword(Password)
	.clickSecureCheckBox()
	.clickLoginButton()
	.clickBillPaymentsLink()	
.clickInsurLink()
.deleteBillerbeneficiary(billnumber,"InsurancetBill")
.locateFrames()
	//.clickMobileLink()
	.clickaddBillersLink()
	
	//.billerForm("InsuranceComp",billersubcat)
	.billerForm("InsuranceComp",Insurancecompanyone)
	//.billerForm("InsuranceComptwo",InsuranceCompTwo)
	//.billerForm("InsuranceCompanySecondField",InsuranceCompTwo)
	.billerForm("Mob Biller Number",billnumber)
	.billerForm("ValidateButton","null")
	
	.billerForm("Insurance customer name",customername)
	.billerForm("Insurance short name bene",shortname)
	.billerForm("ClickSms","null")

	//.billerForm("Studentname",studentname)
	//.billerForm("Studentid",studentid)
	.billerForm("submitButton","null")
	.billerForm("confirmbillpay","null")
	//.billerForm("confirm","null")
	.otpsubmit()
//	.billerForm("confirm","null")
	.billerForm("verifySucess","null")
	.SwitchdefaultContent()
	.clickInsuranceeditLink()
	.locateFrames()
	.verifyaddBillersLink(billnumber)
	.logout();

	
	
	
	
	
/*	
	.transferWithinSubmitForm(Remarks)
	.otpsubmit()
	.VerifyTransfer()
	.clickOtherMenu()
	.clickTransactionHistory()
	.filterTransactionHistory(fromACC, beneficiarytype, channeltype)
	.verifyTransactionHistory(amount)
	.clickAccountMenu()
	.verifyAccountsPagebalance()
	.verifyMiniStatementbalance(amount);
*/

//	.logout();
		
	
		
		}

	catch (Exception e) {

logout();
		throw new Exception();
		
		// TODO: handle exception
	}

	}
	}

