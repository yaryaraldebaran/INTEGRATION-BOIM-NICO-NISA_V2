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

public class JCAdminLoginInvalidImpl {

	private static WebDriver driver;
	private static ExtentTest extentTest; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	private JCAdminLoginPage JCAdminLogin = new JCAdminLoginPage();
	
	public JCAdminLoginInvalidImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
	}
	
//	background
	@When("Admin membuka browser JCAdmin")
	public void admin_membuka_browser_jcadmin() {
		driver.get(Constants.URL_JCADMIN_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin membuka browser JCAdmin");
	}

//	Scenario: Admin invalid login simpan
	@When("LO001N Admin klik button simpan")
	public void admin_klik_button_simpan() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO001N Admin klik button simpan");
	}

	@Then("LO001N Admin gagal login simpan")
	public void admin_gagal_login_simpan() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "LO001N Admin gagal login simpan");
	}

//	Scenario: Admin invalid login klik submit
	@When("LO002N Admin klik username dan password")
	public void admin_klik_username_dan_password() {
		JCAdminLogin.LoginPageInvalidClick();
		extentTest.log(LogStatus.PASS, "LO002N Admin klik username dan password");
	}

	@And("LO002N Admin klik button simpan klik")
	public void admin_klik_button_simpan_klik() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO002N Admin klik button simpan klik");
	}

	@Then("LO002N Admin gagal login klik submit")
	public void admin_gagal_login_klik_submit() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "LO002N Admin gagal login klik submit");
	}

//	Scenario: Admin invalid login input username
	@When("LO003N Admin input username")
	public void admin_input_username() {
		JCAdminLogin.LoginPageInvalidUname("ucen1315@gmail.com");
		extentTest.log(LogStatus.PASS, "LO003N Admin input username");
	}

	@And("LO003N Admin klik button simpan input uname")
	public void admin_klik_button_simpan_input_uname() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO003N Admin klik button simpan input uname");
	}

	@Then("LO003N Admin gagal login input uname")
	public void admin_gagal_login_input_uname() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "LO003N Admin gagal login input uname");
	}

//	Scenario: Admin invalid login input password
	@When("LO004N Admin input password")
	public void admin_input_password() {
		JCAdminLogin.LoginPageInvalidPass("a");
		extentTest.log(LogStatus.PASS, "LO004N Admin input password");
	}

	@And("LO004N Admin klik button simpan input pass")
	public void admin_klik_button_simpan_input_pass() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO004N Admin klik button simpan input pass");
	}

	@Then("LO004N Admin gagal login input pass")
	public void admin_gagal_login_input_pass() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "LO004N Admin gagal login input pass");
	}

//	Scenario: Admin invalid login input password uppercase
	@When("LO005N Admin input username dan password upper")
	public void admin_input_username_dan_password_upper() {
		JCAdminLogin.LoginPageValid("ucen1315@gmail.com", "A");
		extentTest.log(LogStatus.PASS, "LO005N Admin input username dan password upper");
	}

	@And("LO005N Admin klik button simpan input pass upper")
	public void admin_klik_button_simpan_input_pass_upper() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO005N Admin klik button simpan input pass upper");
	}

	@Then("LO005N Admin gagal login input pass upper")
	public void admin_gagal_login_input_pass_upper() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "LO005N Admin gagal login input pass upper");
	}

//	Scenario: Admin invalid login upper
	@When("LO006N Admin input upper username dan password")
	public void admin_input_upper_username_dan_password() {
		JCAdminLogin.LoginPageInvalid("UCEN1315@GMAIL.COM", "A");
		extentTest.log(LogStatus.PASS, "LO006N Admin input upper username dan password");
	}

	@And("LO006N Admin klik button simpan upper")
	public void admin_klik_button_simpan_upper() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO006N Admin klik button simpan upper");;
	}

	@Then("LO006N Admin gagal login upper")
	public void admin_gagal_login_upper() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "LO006N Admin gagal login upper");
	}

//	Scenario: Admin invalid login input spasi
	@When("LO007N Admin input username dan password spasi")
	public void admin_input_username_dan_password_spasi() {
		JCAdminLogin.LoginPageInvalid(" ", " ");
		extentTest.log(LogStatus.PASS, "LO007N Admin input username dan password spasi");
	}

	@And("LO007N Admin klik button simpan spasi")
	public void admin_klik_button_simpan_spasi() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO007N Admin klik button simpan spasi");
	}

	@Then("LO007N Admin gagal login input spasi")
	public void admin_gagal_login_input_spasi() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "LO007N Admin gagal login input spasi");
	}

//	Scenario: Admin invalid login user tanpa format email
	@When("LO008N Admin input username dan password tanpa format")
	public void admin_input_username_dan_password_tanpa_format() {
		JCAdminLogin.LoginPageInvalid("ucen1315", "a");
		extentTest.log(LogStatus.PASS, "LO008N Admin input username dan password tanpa format");
	}

	@And("LO008N Admin klik button simpan tanpa format")
	public void admin_klik_button_simpan_tanpa_format() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "LO008N Admin klik button simpan tanpa format");
	}

	@Then("LO008N Admin gagal login tanpa format")
	public void admin_gagal_login_tanpa_format() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "LO008N Admin gagal login input tanpa format");
	}

}
