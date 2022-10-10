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

public class JCSearchTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCSearchTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@When("Admin login dan membuka halaman testimonials search")
	public void admin_login_dan_membuka_halaman_testimonials_search() {
		JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials search");
	}

//	search nama
	@When("TE052P Admin mengetikkan nama peserta")
	public void TE052P_admin_mengetikkan_nama_peserta() {
	    JCAdminTes.searchNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE050P Admin mengetikkan nama peserta");
	}

	@And("TE052P Admin menekan enter pada keyboard")
	public void TE052P_admin_menekan_enter_pada_keyboard() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE050P Admin menekan enter pada keyboard");
	}

	@Then("TE052P Data ditemukan")
	public void TE052P_data_ditemukan() {
		Utils.delay(2, strDelay);
		assertTrue(JCAdminTes.getTxtSearch().contains("Total Search"));
		extentTest.log(LogStatus.PASS, "TE052P Data ditemukan");
	}
}
