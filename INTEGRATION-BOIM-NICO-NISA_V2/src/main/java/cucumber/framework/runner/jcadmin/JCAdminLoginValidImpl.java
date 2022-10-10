package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminLoginValidImpl {

	private static WebDriver driver;
	private static ExtentTest extentTest; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	private JCAdminLoginPage JCAdminLogin = new JCAdminLoginPage();
	
	public JCAdminLoginValidImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
	}
	
//	bg
	@When("Admin membuka browser JC")
	public void admin_membuka_browser_jc() {
		driver.get(Constants.URL_JCADMIN_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin membuka browser JC");
	}
	
//	user valid
	@When("LO001P Admin input valid username dan password")
	public void admin_input_valid_username_dan_password() {
	    JCAdminLogin.LoginPageValid("ucen1315@gmail.com", "a");
		extentTest.log(LogStatus.PASS, "LO001P Admin input valid username dan password");
	}

	@And("LO001P Admin klik button simpan")
	public void admin_klik_button_simpan() {
	    JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO001P Admin klik button simpan");
	}

	@Then("LO001P Admin berhasil login")
	public void admin_berhasil_login() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO001P Admin berhasil login");
	}

//	user valid upper user
	@When("LO002P Admin input username dan password upper user")
	public void admin_input_username_dan_password_upper_user() {
	    JCAdminLogin.LoginPageValid("UCEN1315@gmail.com", "a");
		extentTest.log(LogStatus.PASS, "LO002P Admin input username dan password upper user");
	}

	@And("LO002P Admin klik button simpan upper user")
	public void admin_klik_button_simpan_upper_user() {
	    JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO002P Admin klik button simpan upper user");
	}

	@Then("LO002P Admin berhasil login upper user")
	public void admin_berhasil_login_upper_user() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO003P Admin berhasil login upper user");
	}
	
//	user valid upper email
	@When("LO003P Admin input username dan password upper email")
	public void admin_input_username_dan_password_upper_email() {
	    JCAdminLogin.LoginPageValid("ucen1315@GMAIL.COM", "a");
		extentTest.log(LogStatus.PASS, "LO003P Admin input username dan password upper email");
	}

	@And("LO003P Admin klik button simpan upper email")
	public void admin_klik_button_simpan_upper_email() {
	    JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO003P Admin klik button simpan upper email");
	}

	@Then("LO003P Admin berhasil login upper email")
	public void admin_berhasil_login_upper_email() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO003P Admin berhasil login upper email");
	}
	
//	user valid upper 
	@When("LO004P Admin input username dan password upper")
	public void admin_input_username_dan_password_upper() {
	    JCAdminLogin.LoginPageValid("UCEN1315@GMAIL.COM", "a");
		extentTest.log(LogStatus.PASS, "LO004P Admin input username dan password upper");
	}

	@And("LO004P Admin klik button simpan upper")
	public void admin_klik_button_simpan_upper() {
	    JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO004P Admin klik button simpan upper");
	}

	@Then("LO004P Admin berhasil login upper")
	public void admin_berhasil_login_upper() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO004P Admin berhasil login upper");
	}

//	user valid uplow user
	@When("LO005P Admin input username dan password uplow user")
	public void admin_input_username_dan_password_uplow_user() {
		JCAdminLogin.LoginPageValid("UCen1315@gmail.com", "a");
		extentTest.log(LogStatus.PASS, "LO005P Admin input username dan password uplow user");
	}

	@And("LO005P Admin klik button simpan uplow user")
	public void admin_klik_button_simpan_uplow_user() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO005P Admin klik button simpan uplow user");
	}

	@Then("LO005P Admin berhasil login uplow user")
	public void admin_berhasil_login_uplow_user() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO005P Admin berhasil login uplow user");
	}
	
//	user valid uplow email
	@When("LO006P Admin input username dan password uplow email")
	public void admin_input_username_dan_password_uplow_email() {
		JCAdminLogin.LoginPageValid("ucen1315@GMAil.com", "a");
		extentTest.log(LogStatus.PASS, "LO006P Admin input username dan password uplow email");
	}

	@And("LO006P Admin klik button simpan uplow email")
	public void admin_klik_button_simpan_uplow_email() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO006P Admin klik button simpan uplow email");
	}

	@Then("LO006P Admin berhasil login uplow email")
	public void admin_berhasil_login_uplow_email() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO006P Admin berhasil login uplow email");
	}

//	user valid uplow 
	@When("LO007P Admin input username dan password uplow")
	public void admin_input_username_dan_password_uplow() {
		JCAdminLogin.LoginPageValid("Ucen1315@Gmail.com", "a");
		extentTest.log(LogStatus.PASS, "LO007P Admin input username dan password uplow");
	}

	@And("LO007P Admin klik button simpan uplow")
	public void admin_klik_button_simpan_uplow() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO007P Admin klik button simpan uplow");
	}

	@Then("LO007P Admin berhasil login uplow")
	public void admin_berhasil_login_uplow() {
		assertTrue(JCAdminLogin.getTxtName(5).contains("husaini al banna"));
		extentTest.log(LogStatus.PASS, "LO007P Admin berhasil login uplow");
	}
	
}
