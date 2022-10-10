package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCListTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCListTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
	@When("TE001P Admin login dan membuka page list testimonials")
	public void te001p_admin_login_dan_membuka_page_list_testimonials() {
		JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "TE001P Admin login dan membuka page list testimonials");
	}

	@And("TE001P Admin scroll page dan klik button halaman")
	public void te001p_admin_scroll_page_dan_klik_button_halaman() {
		Utils.delay(1, strDelay);
		JCAdminTes.cekListTestimonial();
		extentTest.log(LogStatus.PASS, "TE001P Admin scroll page dan klik button halaman");
	}

	@And("TE001P Admin mengetikkan nama peserta pada field search")
	public void te001p_admin_mengetikkan_nama_peserta_pada_field_search() {
		JCAdminTes.searchNamaPesertaList();
		extentTest.log(LogStatus.PASS, "TE001P Admin mengetikkan nama peserta pada field search");
	}

	@And("TE001P Admin enter keyboard untuk mencari nama peserta")
	public void te001p_admin_enter_keyboard_untuk_mencari_nama_peserta() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE001P Admin enter keyboard untuk mencari nama peserta");
	}

	@Then("TE001P Data peserta berhasil ditemukan")
	public void te001p_data_peserta_berhasil_ditemukan() {
		assertTrue(JCAdminTes.getTxtSearch().contains("Total Search"));
		extentTest.log(LogStatus.PASS, "TE001P Data peserta berhasil ditemukan");
	}
}
