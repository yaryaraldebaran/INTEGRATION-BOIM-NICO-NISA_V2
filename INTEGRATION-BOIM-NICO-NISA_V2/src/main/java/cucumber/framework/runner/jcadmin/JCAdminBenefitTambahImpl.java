package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminBenefitPage;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminBenefitTambahImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBenefitPage JCBenefit; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBenefitTambahImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCBenefit = new JCAdminBenefitPage();
	}
	//AWAL BACKGROUND
	@Given("Admin login dan masuk ke halaman benefit untuk menambah")
	public void admin_login_dan_masuk_ke_halaman_benefit_untuk_menambah() {
	    JCBenefit.lihatBenefit();
	    extentTest.log(LogStatus.PASS, "Admin login dan masuk ke halaman benefit untuk menambah");
	}
	@When("Admin menekan tombol tambah benefit")
	public void admin_menekan_tombol_tambah_benefit() {
	    JCBenefit.klikTambahBenefit();
	    extentTest.log(LogStatus.PASS, "Admin menekan tombol tambah benefit");
	}
	//AKHIR BACKGROUND

	@When("Admin menambah benefit baru")
	public void admin_menambah_benefit_baru() {
	    JCBenefit.tambahBenefit();
	    extentTest.log(LogStatus.PASS, "Admin menambah benefit baru");
	}

	@When("Admin klik simpan benefit baru")
	public void admin_klik_simpan_benefit_baru() {
		Utils.scrollFullMouse(500);
		Utils.delay(2, strDelay);
	    JCBenefit.klikSimpanBenefit();
	    extentTest.log(LogStatus.PASS, "Admin klik simpan benefit baru");
	}

	@Then("admin telah menambah benefit baru")
	public void admin_telah_menambah_benefit_baru() {
//	    System.out.println("ini then");
	    assertTrue(JCBenefit.getVldAdd().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin telah menambah benefit baru");
	}

}
