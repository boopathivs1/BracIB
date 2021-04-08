package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_56  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC56";
		testDescription="Transaction History";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC56";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String fromacc,String toBeneciary,String channel1,
			String channel2,String localFromAcc,String localToAcc,
			String ownFromAcc,String ownToAcc,String okwallet,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{
		try{
			new	BaracHomePage(driver,test)
		.enterUserName(Username)
		.clickContinueButton()
		
		.enterPassword(Password)
		.clickSecureCheckBox()
		.clickLoginButton()
		//.clickTransferMenu()
		.clickOtherMenu()
		
	.clickTransactionHistory()
	.locatingFrames()
	.transactionHistory(fromacc, "Within Bank Beneficiary",channel1,toBeneciary)
	.verifyTransactionHistoryPresent()
//	 .transactionHisacc(localFromAcc,"Local Bank Beneficiary",channel1,localToAcc,"one")
//	.verifyTransactionHistoryPresent()
//	 .transactionHisacc(fromacc,"Wallet beneficiary",channel1,okwallet,"one")
//
//	.verifyTransactionHistoryPresent()
//	 .transactionHisacc(ownFromAcc,"Own Account Beneficiary",channel1,ownToAcc,"two")
//
//	.verifyTransactionHistoryPresent()		
			.logout();
		
		
			
			}

		catch (Exception e) {

logout();
			throw new Exception();
			
			// TODO: handle exception
		}

		}
		}

