package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCSlidePageTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCSlidePageTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@When("Admin login dan membuka page testimonial slide page")
	public void admin_login_dan_membuka_page_testimonial_slide_page() {
		JCAdminTes.goToHome();
	    JCAdminTes.goToTestimonial();
	    extentTest.log(LogStatus.PASS, "Admin login dan membuka page testimonial slide page");
	}

//	halaman pertama kedua
	@When("TE002P Admin scroll page dan klik button halaman pertama ke kedua")
	public void te002p_admin_scroll_page_dan_klik_button_halaman_pertama_ke_kedua() {
		Utils.fullScroll();
		JCAdminTes.slidePageTestimonialPertama();
		extentTest.log(LogStatus.PASS, "TE002P Admin scroll page dan klik button halaman pertama ke kedua");
	}

	@Then("TE002P Data halaman kedua berhasil ditemukan")
	public void te002p_data_halaman_kedua_berhasil_ditemukan() {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "TE002P Data halaman kedua berhasil ditemukan");
	}

//	halaman kedua ketiga
	@When("TE003P Admin full scroll dan klik tombol halaman satu ke ketiga")
	public void te003p_admin_full_scroll_dan_klik_tombol_halaman_satu_ke_ketiga() {
		Utils.fullScroll();
		JCAdminTes.slidePageTestimonialKedua();
		extentTest.log(LogStatus.PASS, "TE003P Admin full scroll dan klik tombol halaman satu ke ketiga");
	}

	@Then("TE003P Data halaman ketiga berhasil ditemukan")
	public void te003p_data_halaman_ketiga_berhasil_ditemukan() {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "TE003P Data halaman ketiga berhasil ditemukan");
	}

//	halaman ketiga
	@When("TE004P Admin scroll page full dan klik tombol halaman pertama ke next")
	public void te004p_admin_scroll_page_full_dan_klik_tombol_halaman_pertama_ke_next() {
		Utils.fullScroll();
		JCAdminTes.slidePageTestimonialKetiga();
		extentTest.log(LogStatus.PASS, "TE004P Admin scroll page full dan klik tombol halaman pertama ke next");
	}

	@Then("TE004P Data halaman keempat berhasil ditemukan")
	public void te004p_data_halaman_keempat_berhasil_ditemukan() {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "TE004P Data halaman keempat berhasil ditemukan");
	}
}
