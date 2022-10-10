package cucumber.framework.runner.jcadmin;


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCSearchEditTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCSearchEditTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@When("Admin login dan membuka halaman testimonials search edit")
	public void admin_login_dan_membuka_halaman_testimonials_search_edit() {
		JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials search edit");
	}

//	search edit gambar
	@When("TE053P Admin mengetikkan nama peserta search edit")
	public void TE053P_admin_mengetikkan_nama_peserta_search_edit() {
		JCAdminTes.searchEditNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE053P Admin mengetikkan nama peserta search edit");
	}

	@And("TE053P Admin menekan enter pada keyboard search edit")
	public void TE053P_admin_menekan_enter_pada_keyboard_search_edit() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE053P Admin menekan enter pada keyboard search edit");
	}

	@And("TE053P Data ditemukan dan admin klik data search edit")
	public void TE053P_data_ditemukan_dan_admin_klik_data_search_edit() {
	    JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "TE053P Data ditemukan dan admin klik data search edit");
	}

	@And("TE053P Admin mengedit ulang gambar peserta search edit")
	public void TE053P_admin_mengedit_ulang_gambar_peserta_search_edit() {
	    JCAdminTes.editGambarSearch();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE053P Admin mengedit ulang gambar peserta search edit");
	}

	@And("TE053P Admin menekan tombol simpan gambar search edit")
	public void TE053P_admin_menekan_tombol_simpan_gambar_search_edit() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE053P Admin menekan tombol simpan gambar search edit");
	}

	@Then("TE053P Admin berhasil edit gambar search edit")
	public void TE053P_admin_berhasil_edit_gambar_search_edit() {
		extentTest.log(LogStatus.PASS, "TE053P Admin berhasil edit gambar search edit");
	}
	
//	search edit nama
	@When("TE054P Admin mengetikkan nama peserta search edit nama")
	public void TE054P_admin_mengetikkan_nama_peserta_search_edit_nama() {
		JCAdminTes.searchEditNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE054P Admin mengetikkan nama peserta search edit nama");
	}

	@And("TE054P Admin menekan enter pada keyboard search edit nama")
	public void TE054P_admin_menekan_enter_pada_keyboard_search_edit_nama() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE054P Admin menekan enter pada keyboard search edit nama");
	}

	@And("TE054P Data ditemukan dan admin klik data search edit nama")
	public void TE054P_data_ditemukan_dan_admin_klik_data_search_edit_nama() {
		JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "TE054P Data ditemukan dan admin klik data search edit nama");
	}

	@And("TE054P Admin mengedit ulang nama peserta search edit nama")
	public void TE054P_admin_mengedit_ulang_nama_peserta_search_edit_nama() {
		JCAdminTes.editNamaPesertaSearch();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE054P Admin mengedit ulang nama peserta search edit nama");
	}

	@And("TE054P Admin menekan tombol simpan nama search edit nama")
	public void TE054P_admin_menekan_tombol_simpan_nama_search_edit_nama() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE054P Admin menekan tombol simpan nama search edit nama");
	}

	@Then("TE054P Admin berhasil edit nama search edit nama")
	public void TE054P_admin_berhasil_edit_nama_search_edit_nama() {
		extentTest.log(LogStatus.PASS,"TE054P Admin berhasil edit nama search edit nama");
	}
	
//	search edit isi
	@When("TE055P Admin mengetikkan nama peserta search edit isi")
	public void TE055P_admin_mengetikkan_nama_peserta_search_edit_isi() {
		JCAdminTes.searchEditNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE055P Admin mengetikkan nama peserta search edit isi");
	}

	@And("TE055P Admin menekan enter pada keyboard search edit isi")
	public void TE055P_admin_menekan_enter_pada_keyboard_search_edit_isi() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE055P Admin menekan enter pada keyboard search edit isi");
	}

	@And("TE055P Data ditemukan dan admin klik data search edit isi")
	public void TE055P_data_ditemukan_dan_admin_klik_data_search_edit_isi() {
		JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "TE055P Data ditemukan dan admin klik data search edit isi");
	}

	@And("TE055P Admin mengedit ulang isi testimonial search edit isi")
	public void TE055P_admin_mengedit_ulang_isi_testimonial_search_edit_isi() {
		JCAdminTes.editIsiTestiSearch();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE055P Admin mengedit ulang isi testimonial search edit isi");
	}

	@And("TE055P Admin menekan tombol simpan search edit isi")
	public void TE055P_admin_menekan_tombol_simpan_search_edit_isi() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE055P Admin menekan tombol simpan search edit isi");
	}

	@Then("TE055P Admin berhasil edit isi search edit isi")
	public void TE055P_admin_berhasil_edit_isi_search_edit_isi() {
		extentTest.log(LogStatus.PASS, "TE055P Admin berhasil edit isi search edit isi");
	}
	
//	search edit publish
	@When("^(.*)Admin mengetikkan nama peserta search edit publish$")
	public void kode_test_case_admin_mengetikkan_nama_peserta_search_edit_publish(String strCode) {
		JCAdminTes.searchEditNamaPesertaDua();
		extentTest.log(LogStatus.PASS, "Admin mengetikkan nama peserta search edit publish");
	}

	@And("^(.*) Admin menekan enter pada keyboard search edit publish$")
	public void kode_test_case_admin_menekan_enter_pada_keyboard_search_edit_publish(String strCode) {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "Admin menekan enter pada keyboard search edit publish" +strCode);
	}

	@And("^(.*) Data ditemukan dan admin klik data search edit publish$")
	public void kode_test_case_data_ditemukan_dan_admin_klik_data_search_edit_publish(String strCode) {
		JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "Data ditemukan dan admin klik data search edit publish");
	}

	@And("^(.*) Admin edit ulang publish (.*) search edit$")
	public void kode_test_case_admin_edit_ulang_publish_publish_search_edit(String strCode,String strPublish) {
	    if(strPublish.equalsIgnoreCase("Active")){
	    	JCAdminTes.editActNoActSearch();
	    } else {
	    	JCAdminTes.editNoActActSearch();
	    }
	    extentTest.log(LogStatus.PASS, "Admin edit ulang publish " +strPublish);
	}

	@And("^(.*) Admin menekan tombol simpan search edit publish$")
	public void kode_test_case_admin_menekan_tombol_simpan_search_edit_publish(String strCode) {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan search edit publish");
	}

	@Then("^(.*) Admin berhasil edit publish search edit$")
	public void kode_test_case_admin_berhasil_edit_publish_search_edit(String strCode) {
		extentTest.log(LogStatus.PASS, "Admin berhasil edit publish active search edit");
	}	
}