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

public class JCEditNegatifTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCEditNegatifTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@When("Admin login dan open page testimonials edit negative")
	public void admin_login_dan_open_page_testimonials_edit_negative() {
		JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan open page testimonials edit negative");
	}

	@And("Admin click button edit testimonial data pertama")
	public void admin_click_button_edit_testimonial_data_pertama() {
		JCAdminTes.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin click button edit testimonial data pertama");
	}
	
//	edit nama karakter
	@When("TE049N Admin edit field nama dengan karakter")
	public void te049n_admin_edit_field_nama_dengan_karakter() {
		JCAdminTes.editTestimonialNegativeNama();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE049N Admin edit field nama dengan karakter");
	}

	@And("TE049N Admin click button simpan edit nama peserta")
	public void te049n_admin_click_button_simpan_edit_nama_peserta() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE049N Admin click button simpan edit nama peserta");
	}

	@Then("TE049N Admin tidak berhasil mengedit nama")
	public void te049n_admin_tidak_berhasil_mengedit_nama() {
		assertTrue(JCAdminTes.getTxtNamaKarSalah().contains("Karakter (<|>|'|\") tidak diizinkan"));
		extentTest.log(LogStatus.PASS, "TE049N Admin tidak berhasil mengedit nama");
	}
	
//	edit publish nama peserta
	@When("^(.*) Admin edit full nama peserta publish (.*) data pertama$")
	public void admin_edit_full_nama_peserta_publish_publish_data_pertama(String strCode,String strPublish) {
		if(strPublish.equalsIgnoreCase("Active")){
	    	JCAdminTes.editTestimonialNegativeActiveNoActive();
	    } else {
	    	JCAdminTes.editTestimonialNegativeNoActiveActive();
	    }
	    extentTest.log(LogStatus.PASS, "Admin edit full nama peserta publish " +strPublish+ " data pertama");
	}

	@And("^(.*) Admin klik tombol simpan edit full nama peserta$")
	public void admin_klik_tombol_simpan_edit_full_nama_peserta(String strCode) {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik tombol simpan edit full nama peserta");
	}

	@Then("^(.*) Admin berhasil edit full nama peserta$")
	public void admin_berhasil_edit_full_nama_peserta(String strCode) {
		extentTest.log(LogStatus.PASS, "Admin berhasil edit full nama peserta");
}
}
