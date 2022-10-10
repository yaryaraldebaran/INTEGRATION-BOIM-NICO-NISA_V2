package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCRincianBiayaTambahNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCRincianBiayaTambahNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
	}
	//INI MULAI BACKGROUND
	@When("(.*) Admin login dan membuka halaman rincian biaya tambah dan klik tambah untuk negatif$")
	public void kode_test_case_admin_login_dan_membuka_halaman_rincian_biaya_tambah_dan_klik_tambah(String kode) {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    JCAdminRB.goToTambahRB();
	    extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman rincian biaya tambah dan klik tambah");
	}

	@When("^(.*) Admin mengisi (.*) tambah dengan (.*), (.*)$")
	public void kode_test_case_admin_mengisi_formm_tambah_dengan_harga_awal_diskon(String kode,String hargaAwal, String diskon, String publish) {
	    JCAdminRB.tambahNegative(hargaAwal,diskon,publish);
	    extentTest.log(LogStatus.PASS, "Admin mengisi form tambah");
	}

	@When("^(.*) Admin menekan tombol simpan tambah$")
	public void kode_test_case_admin_menekan_tombol_simpan_tambah(String kode) {
	    JCAdminRB.simpanEdit();
	    extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan tambah");
	}

	@Then("^(.*) Admin menambah rincian biaya active valid$")
	public void kode_test_case_admin_menambah_rincian_biaya_active_valid(String kode) {
	    assertTrue(JCAdminRB.getWarningKeunggulan1Empty().contains("harap")||JCAdminRB.getWarningNameEmpty().contains("harap")||JCAdminRB.getEditDiskonSuccess().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin menambah rincian biaya active valid");
	}


}
