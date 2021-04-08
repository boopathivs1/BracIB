package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_91  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC91";
		testDescription="Change Existing PIN-Prepaid card";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC91";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String Otp,String services,
			String debitcardnum,String fourCarddigitnum,
			String cvvpin,String ACCiD,String newpin,
			String confirmpin,String year,String month,String reason,String data1,String data10,String data11,String data12,String data13,String data14,String data15,String data16) throws Exception{
		String debno=regvalue(debitcardnum);
		String cvpino=regvalue(cvvpin);
		String accno=regvalue(ACCiD);
		String newpinno=regvalue(newpin);
		String confirmpinno=regvalue(confirmpin);
		String yearnum=regvalue(year);
		String monthnum=regvalue(month);
		String fourcardnum=regvalue(fourCarddigitnum);
		try{
			new	BaracHomePage(driver,test)
		.enterUserName(Username)
		.clickContinueButton()
		
		.enterPassword(Password)
		.clickSecureCheckBox()
		.clickLoginButton()
		.clickServices()
//		.selectServices("Forgot PIN/Generate New PIN")
		.selectServices(services)
		
		.clickPrepaid()
		.debitCardChoosen(debno)
		.enterfourdigitNumber(fourcardnum)

		.enterCardPIN(cvpino)
		.enteraccid(accno)
		.cardSubmit(newpinno, confirmpinno, yearnum, monthnum,reason,3,3)
		.logout();
		
		
			
			}

		catch (Exception e) {

	logout();
			throw new Exception();
			
			// TODO: handle exception
		}

		}
		}