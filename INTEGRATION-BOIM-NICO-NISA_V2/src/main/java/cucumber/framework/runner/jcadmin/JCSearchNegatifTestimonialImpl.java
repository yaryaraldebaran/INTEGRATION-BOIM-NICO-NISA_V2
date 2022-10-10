package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCSearchNegatifTestimonialImpl{
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCSearchNegatifTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@When("Admin login dan membuka halaman testimonials search negative")
	public void admin_login_dan_membuka_halaman_testimonials_search_negative() {
		JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials search negative");
	}

//	cari nama peserta 500 karakter
	@When("TE052N Admin mengetikkan jumlah karakter nama peserta yang dicari")
	public void te052n_admin_mengetikkan_jumlah_karakter_nama_peserta_yang_dicari() {
		JCAdminTes.searchNamaPesertaNeg();
		extentTest.log(LogStatus.PASS, "TE052N Admin mengetikkan jumlah karakter nama peserta yang dicari");
	}

	@And("TE052N Admin menekan enter untuk melakukan pencarian data")
	public void te052n_admin_menekan_enter_untuk_melakukan_pencarian_data() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE052N Admin menekan enter untuk melakukan pencarian data");
	}

	@Then("TE052N Data tidak ditemukan")
	public void te052n_data_tidak_ditemukan() {
		assertTrue(JCAdminTes.getTxtSearchKosong().contains("Total Search : 0 Data"));
		extentTest.log(LogStatus.PASS, "TE052N Data tidak ditemukan");
	}

//	cari isi testimonial
	@When("TE053N Admin mengetikkan jumlah isi testimonial yang dicari")
	public void te053n_admin_mengetikkan_jumlah_isi_testimonial_yang_dicari() {
		JCAdminTes.searchIsiTestiNeg();
		extentTest.log(LogStatus.PASS, "TE053N Admin mengetikkan jumlah isi testimonial yang dicari");
	}

	@And("TE053N Admin enter keyboard untuk pencarian data")
	public void te053n_admin_enter_keyboard_untuk_pencarian_data() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE053N Admin enter keyboard untuk pencarian data");
	}

	@Then("TE053N Data isi testimonial tidak ditemukan")
	public void te053n_data_isi_testimonial_tidak_ditemukan() {
		assertTrue(JCAdminTes.getTxtSearchKosong().contains("Total Search : 0 Data"));
		extentTest.log(LogStatus.PASS, "TE053N Data isi testimonial tidak ditemukan");
	}
}
