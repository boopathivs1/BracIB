package testcases;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;

import pages.BaracHomePage;
import wrappers.ProjectWrapp;
public class Tc_58  extends ProjectWrapp {
	@BeforeClass(groups={"common"})
	public void setDatag() {
		testCaseName="TC58";
		testDescription="Currency converter";
		browserName="Chrome";
		dataSheetName="Barac";
		category="Regression";
		authors="Boopathi";
		testKeyword="TC58";
		LogoutStatus=true;	
		//usertype="CIBUser";

	}
	@Test(groups={"sanity"},dataProvider="fetch")
	public void mobileBillRegularPayments(String casename,String Username,String Password,String amount,String data01,String data02,
			String data03,String data04,String data05,
			String data06,String data07,String data6,String data8,String data9,String data10,String data11,
			String data12,String data13,String data14,String data15,String data16) throws Exception{
		try{
			new	BaracHomePage(driver,test)
		.enterUserName(Username)
		.clickContinueButton()
		
		.enterPassword(Password)
		.clickSecureCheckBox()
		.clickLoginButton()
		//.clickTransferMenu()
		.clickOther()
        .clickCurrency()
        .locatingFrames()
        
    //    .currencyConverterForm("AED","BDT", amount)
    // .currencyConverterForm("CHF","BDT", amount)
     //   .currencyConverterForm("SAR", "BDT", amount)
       .currencyConverterForm("USD", "BDT", amount)
    	.logout();
		
		
			
			}

		catch (Exception e) {

	logout();
			throw new Exception();
			
			// TODO: handle exception
		}

		}
		}

