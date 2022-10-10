package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCTambahTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCTambahTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
		
	}
	
	//background
	@Given("Admin login dan membuka halaman testimonials tambah")
	public void admin_login_dan_membuka_halaman_testimonials_tambah() {
		JCAdminTes.goToHome();
	    JCAdminTes.goToTestimonial();
	    extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials tambah");
	}

	@When("Admin klik tombol tambah testimonial tambah")
	public void admin_klik_tombol_tambah_testimonial_tambah() {
		JCAdminTes.goToTambahTesti();
		extentTest.log(LogStatus.PASS, "Admin klik tombol tambah testimonial tambah");
	}
	//background

	//publish active
	@When("^(.*)Admin mengisi form dengan rating (.*) active$")
	public void admin_mengisi_form_dengan_rating_angka_rating_active(String strKodeTest,String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialPublishActive(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form dengan rating "+strRate+ " publish active");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial active$")
	public void admin_menekan_tombol_simpan_testimonial_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial active");
	}

	@Then("^(.*) Admin menambah testimonial active valid$")
	public void admin_menambah_testimonial_active_valid(String strKode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial active valid");
	}

//	publish no active
	@When("^(.*)Admin mengisi form dengan rating (.*) noactive$")
	public void admin_mengisi_form_dengan_rating_angka_rating_noactive(String strKodeTest,String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialPublishNoActive(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form dengan rating "+strRate+ " publish noactive");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial no active$")
	public void admin_menekan_tombol_simpan_testimonial_no_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial no active");
	}

	@Then("^(.*) Admin menambah testimonial noactive valid$")
	public void admin_menambah_testimonial_noactive_valid(String strKode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial noactive valid");
	}
	
//	publish active format gambar
	@When("^(.*) Admin mengisi format gambar dengan rating (.*) active$")
	public void admin_mengisi_format_gambar_dengan_rating_angka_rating_active(String strKode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialActiveGambar(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi format gambar dengan rating "+strRate+ " publish active");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial format gambar active$")
	public void admin_menekan_tombol_simpan_testimonial_format_gambar_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial format gambar active");
	}

	@Then("^(.*) Admin menambah testimonial format gambar active valid$")
	public void admin_menambah_testimonial_format_gambar_active_valid(String strKode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial format gambar active valid");
	}
	
//	publish no active format gambar
	@When("^(.*) Admin tambah format gambar dengan rating (.*) no active$")
	public void admin_tambah_format_gambar_dengan_rating_angka_rating_no_active(String strKode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNoActiveGambar(strRate);
		extentTest.log(LogStatus.PASS, "Admin tambah format gambar dengan rating "+strRate+ " publish no active");
	}

	@And("^(.*) Admin klik tombol simpan testimonial format gambar no active$")
	public void admin_klik_tombol_simpan_testimonial_format_gambar_no_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik tombol simpan testimonial format gambar no active");
	}

	@Then("^(.*) Admin tambah testimonial format gambar no active valid$")
	public void admin_tambah_testimonial_format_gambar_no_active_valid(String strKode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin tambah testimonial format gambar no active valid");
	}
	
//	publish active isi karakter beda
	@When("^(.*) Admin tambah isi karakter beda dengan rating (.*) active$")
	public void admin_tambah_isi_karakter_beda_dengan_rating_angka_rating_active(String strKode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialActiveIsi(strRate);
		extentTest.log(LogStatus.PASS, "Admin tambah isi karakter beda dengan rating "+strRate+ " publish active");
	}

	@And("^(.*) Admin klik tombol simpan testimonial karakter beda active$")
	public void admin_klik_tombol_simpan_testimonial_karakter_beda_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik tombol simpan testimonial karakter beda active");
	}

	@Then("^(.*) Admin tambah testimonial karakter beda active valid$")
	public void admin_tambah_testimonial_karakter_beda_active_valid(String strKode) {
		Utils.fullScroll();
		assertTrue(JCAdminTes.getTxtIsi().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "Admin tambah testimonial karakter beda active valid");
	}
	
//	publish no active isi karakter beda
	@When("^(.*) Admin menambah isi format karakter beda dengan rating (.*) no active$")
	public void admin_menambah_isi_format_karakter_beda_dengan_rating_angka_rating_no_active(String strKode, String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialNoActiveIsi(strRate);
		extentTest.log(LogStatus.PASS, "Admin menambah isi format karakter beda dengan rating "+strRate+ " publish no active");
	}

	@And("^(.*) Admin menekan button simpan testimonial karakter beda no active$")
	public void admin_menekan_button_simpan_testimonial_karakter_beda_no_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan button simpan testimonial karakter beda no active");
	}

	@Then("^(.*) Admin menambah testimonial karakter beda no active invalid$")
	public void admin_menambah_testimonial_karakter_beda_no_active_invalid(String strKode) {
		Utils.fullScroll();
		assertTrue(JCAdminTes.getTxtIsi().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial karakter beda no active invalid");
	}
	
	
	
}