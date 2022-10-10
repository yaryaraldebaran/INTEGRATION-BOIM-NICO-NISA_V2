package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCTambahNegatifTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCTambahNegatifTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@Given("Admin login dan open page testimonial tambah negative")
	public void admin_login_dan_open_page_testimonial_tambah_negative() {
		JCAdminTes.goToHome();
	    JCAdminTes.goToTestimonial();
	    extentTest.log(LogStatus.PASS, "Admin login dan open page testimonial tambah negative");
	}

	@When("Admin klik tombol tambah testimonial tambah negative")
	public void admin_klik_tombol_tambah_testimonial_tambah_negative() {
		JCAdminTes.goToTambahTesti();
		extentTest.log(LogStatus.PASS, "Admin klik tombol tambah testimonial tambah negative");
	}

//	publish active kosong nama
	@When("^(.*) Admin mengisi form negative dengan rating (.*) active$")
	public void admin_mengisi_form_negative_dengan_rating_angka_rating_active(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegativeActive(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form negative dengan rating "+strRate+ " publish active");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial active negative$")
	public void admin_menekan_tombol_simpan_testimonial_active_negative(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial active negative");
	}

	@Then("^(.*) Admin menambah testimonial active invalid negative$")
	public void admin_menambah_testimonial_active_invalid_negative(String strCode) {
		assertTrue(JCAdminTes.getTxtNamaKosong().contains("Nama Wajib diisi"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial active invalid negative");
	}

	
	
//	publish no active kosong nama
	@When("^(.*) Admin mengisi form tambah negative dengan rating (.*) publish no active$")
	public void admin_mengisi_form_tambah_negative_dengan_rating_angka_rating_publish_no_active(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegativeNoActive(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form tambah negative dengan rating "+strRate+ " publish no active");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial publish no active negative$")
	public void admin_menekan_tombol_simpan_testimonial_publish_no_active_negative(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial publish no active negative");
	}

	@Then("^(.*) Admin menambah testimonial publish no active invalid negative$")
	public void admin_menambah_testimonial_publish_no_active_invalid_negative(String strCode) {
		assertTrue(JCAdminTes.getTxtNamaKosong().contains("Nama Wajib diisi"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial publish no active invalid negative");
	}
	
//	publish active kosong isi
	@When("^(.*) Admin isi form negative dengan rating (.*) active kosong isi$")
	public void admin_isi_form_negative_dengan_rating_angka_rating_active_kosong_isi(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegativeActiveIsi(strRate);
		extentTest.log(LogStatus.PASS, "Admin isi form negative dengan rating "+strRate+ " active kosong isi");
	}

	@And("^(.*) Admin klik tombol simpan testimonial active negative kosong isi$")
	public void admin_klik_tombol_simpan_testimonial_active_negative_kosong_isi(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik tombol simpan testimonial active negative kosong isi");
	}

	@Then("^(.*) Admin tambah testimonial active invalid negative kosong isi$")
	public void admin_tambah_testimonial_active_invalid_negative_kosong_isi(String strCode) {
		Utils.fullScroll();
		assertTrue(JCAdminTes.getTxtIsiKosong().contains("Harap isi content testimonial"));
		extentTest.log(LogStatus.PASS, "Admin tambah testimonial active invalid negative kosong isi");
	}

//	publish no active kosong isi
	@When("^(.*) Admin isi form negative rating (.*) no active kosong isi testi$")
	public void admin_isi_form_negative_rating_angka_rating_no_active_kosong_isi_testi(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegativeNoActiveIsi(strRate);
		extentTest.log(LogStatus.PASS, "Admin isi form negative dengan rating "+strRate+ " no active kosong isi testi");
	}

	@And("^(.*) Admin klik tombol simpan testimonial no active negative kosong isi testi$")
	public void admin_klik_tombol_simpan_testimonial_no_active_negative_kosong_isi_testi(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik tombol simpan testimonial no active negative kosong isi testi");
	}

	@Then("^(.*) Admin tambah testimonial no active invalid negative kosong isi testi$")
	public void admin_tambah_testimonial_no_active_invalid_negative_kosong_isi_testi(String strCode) {
		Utils.fullScroll();
		assertTrue(JCAdminTes.getTxtIsiKosong().contains("Harap isi content testimonial"));
		extentTest.log(LogStatus.PASS, "Admin tambah testimonial no active invalid negative kosong isi testi");
	}
	
//	publish active karakter 500
	@When("^(.*) Admin mengisi negative form dengan rating (.*) active panjang karakter$")
	public void admin_mengisi_negative_form_dengan_rating_angka_rating_active_panjang_karakter(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegativeActiveChar(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi negative form dengan rating "+strRate+ " active panjang karakter");
	}

	@And("^(.*) Admin pencet tombol simpan testimonial active negative panjang karakter$")
	public void admin_pencet_tombol_simpan_testimonial_active_negative_panjang_karakter(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin pencet tombol simpan testimonial active negative panjang karakter");
	}

	@Then("^(.*) Admin menambah data testimonial active invalid negative panjang karakter$")
	public void admin_menambah_data_testimonial_active_invalid_negative_panjang_karakter(String strCode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin menambah data testimonial active invalid negative panjang karakter");
	}

//	publish no active karakter 500
	@When("^(.*) Admin mengisi form dengan rating (.*) publish no active karakter$")
	public void admin_mengisi_form_dengan_rating_angka_rating_publish_no_active_karakter(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegativeNoActiveChar(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form dengan rating "+strRate+ " publish no active panjang karakter");
	}

	@And("^(.*) Admin pencet tombol simpan negatif testimonial publish no active karakter$")
	public void admin_pencet_tombol_simpan_negatif_testimonial_publish_no_active_karakter(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin pencet tombol simpan negatif testimonial publish no active karakter");
	}

	@Then("^(.*) Admin add data negatif testimonial no active invalid karakter$")
	public void admin_add_data_negatif_testimonial_no_active_invalid_karakter(String strCode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin add data negatif testimonial no active invalid karakter");
	}
	
//	publish active karakter nama dikecualikan
	@When("^(.*) Admin isi negative tambah dengan rating (.*) active nama kecuali$")
	public void admin_isi_negative_tambah_dengan_rating_angka_rating_active_nama_kecuali(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegActiveNama(strRate);
		extentTest.log(LogStatus.PASS, "Admin isi negative tambah dengan rating "+strRate+ " active nama kecuali");
	}

	@And("^(.*) Admin click button simpan testimonial active negative nama kecuali$")
	public void admin_click_button_simpan_testimonial_active_negative_nama_kecuali(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin click button simpan testimonial active negative nama kecuali");
	}

	@Then("^(.*) Admin add negative testimonial active invalid nama kecuali$")
	public void admin_add_negative_testimonial_active_invalid_nama_kecuali(String strCode) {
		assertTrue(JCAdminTes.getTxtIsiKosong().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "Admin add negative testimonial active invalid nama kecuali");
	}

//	publish no active karakter nama dikecualikan
	@When("^(.*) Admin isi negative data tambah dengan rating (.*) no active nama char$")
	public void admin_isi_negative_data_tambah_dengan_rating_angka_rating_no_active_nama_char(String strCode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNegNoActiveNama(strRate);
		extentTest.log(LogStatus.PASS, "Admin isi negative data tambah dengan rating "+strRate+ " no active nama char");
	}

	@And("^(.*) Admin click tombol simpan testimonial active negative nama char$")
	public void admin_click_tombol_simpan_testimonial_active_negative_nama_char(String strCode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin click tombol simpan testimonial active negative nama char");
	}

	@Then("^(.*) Admin add testimonial negative no active invalid nama char$")
	public void admin_add_testimonial_negative_no_active_invalid_nama_char(String strCode) {
		assertTrue(JCAdminTes.getTxtNama().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "Admin add testimonial negative no active invalid nama char");
	}
}
