package cucumber.framework.runner.jcadmin;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.scenariotest.jcadmin.JCAdminTesting;
import cucumber.framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class JCAdminHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/jcadmin/extentreport/jcadmin-scene-login-outline-xr.html");
	private static JCAdminTesting[] tests = JCAdminTesting.values();
	private static final int[] DATA_OUTLINE = {
			1,1,1,1,1,1,1, //001_001
			1,1,1,1,1,1,1,1, //001_002
			6,6,6,6,6,6, //002_001
			6,6,6,6,6,6,6,6, //002_002
			1,1,1,1,1,1,1,1,1,1,1,//002_003
			1,2, //002_004
			1, //002_005
			1,1, //002_006
			1,1,1,2, //002_007
			1, //002_008
			1,1,1, //002_009
			
			
			 //003_001
	        2,
	      //003_002
	        1,1,1,1,1,1,1,1,
	      //003_003
	        1,1,1,
	      //003_004
	        1,1,1,1,
	      //003_005
	        3,
	      //003_006
	        12,
	      //003_007
	        8,
	      //004_001
	        1,
	      //004_002
	        10,
	      //005_001
	        4,
	      //005_002
	        6,
	      //005_003
	        2,
	        
	        
	        
	        1,2,8,3,1,1,1,1,1,1,1,1,5,2,1,1,1,1,3,3,3,1,1,1,1,2,1,1,6,2,2,1,5,5,2,1,4,4,4,4,5
	        
	};

	private String testReport = "";
	
	@Before
	public void setUp() {		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);		
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "HRMS_SceneOutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		delay(2);
		DriverSingleton.closeObjectInstance();
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
}
