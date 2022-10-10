
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

public class JCEditTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCEditTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
	//INI BACKGROUND
	@When("Admin login dan membuka halaman testimonials")
	public void admin_login_dan_membuka_halaman_testimonial() {
	    JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials");
	}

	@And("Admin klik tombol edit testimonial pertama")
	public void admin_klik_tombol_edit_testimonial_pertama() {
	    JCAdminTes.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol edit testimonial pertama");
	}
	//INI AKHIR BACKGROUND
	
//	edit gambar peserta
	@When("TE041P Admin mengedit gambar peserta")
	public void admin_mengedit_gambar_peserta() {
		System.out.println("INI DARI ADMIN EDIT GAMBAR");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editGambar();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE041P Admin mengedit gambar peserta");
	}

	@And("TE041P Admin menekan tombol simpan edit gambar peserta")
	public void admin_menekan_tombol_simpan_edit_gambar_peserta() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE041P Admin menekan tombol simpan edit gambar peserta");
	}

	@Then("TE041P Admin berhasil edit gambar peserta")
	public void admin_berhasil_edit_gambar_peserta() {
	    extentTest.log(LogStatus.PASS, "TE041P Admin berhasil edit gambar peserta");
	}
	
//	edit rating 0
	@When("TE042P Admin mengedit rating nol dropdown")
	public void te042p_admin_mengedit_rating_nol_dropdown() {
		System.out.println("INI DARI ADMIN EDIT RATING 0");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editRatingNol();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE042P Admin mengedit rating nol dropdown");
	}

	@And("TE042P Admin klik tombol simpan dropdown rating nol")
	public void te042p_admin_klik_tombol_simpan_dropdown_rating_nol() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE042P Admin klik tombol simpan dropdown rating nol");
	}

	@Then("TE042P Admin berhasil edit dropdown rating nol")
	public void te042p_admin_berhasil_edit_dropdown_rating_nol() {
		extentTest.log(LogStatus.PASS, "TE042P Admin berhasil edit dropdown rating nol");
		}
	
//	edit rating 1 
	@When("TE043P Admin mengedit rating satu dropdown menu")
	public void te043p_admin_mengedit_rating_satu_dropdown_menu() {
		System.out.println("INI DARI ADMIN EDIT RATING 1");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editRatingSatu();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE043P Admin mengedit rating satu dropdown menu");
	}

	@And("TE043P Admin klik tombol simpan dropdown menu rating satu")
	public void te043p_admin_klik_tombol_simpan_dropdown_menu_rating_satu() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE043P Admin klik tombol simpan dropdown menu rating satu");
	}

	@Then("TE043P Admin berhasil edit dropdown menu rating satu")
	public void te043p_admin_berhasil_edit_dropdown_menu_rating_satu() {
		extentTest.log(LogStatus.PASS, "TE043P Admin berhasil edit dropdown menu rating satu");
		}

//	edit rating 2
	@When("TE044P Admin mengedit rating dua menu dropdown")
	public void te044p_admin_mengedit_rating_dua_menu_dropdown() {
		System.out.println("INI DARI ADMIN EDIT RATING 2");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editRatingDua();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE044P Admin mengedit rating dua menu dropdown");
	}

	@And("TE044P Admin klik tombol simpan menu dropdown rating dua")
	public void te044p_admin_klik_tombol_simpan_menu_dropdown_rating_dua() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE044P Admin klik tombol simpan menu dropdown rating dua");
	}

	@Then("TE044P Admin berhasil edit menu dropdown rating dua")
	public void te042p_admin_berhasil_edit_menu_dropdown_rating_dua() {
		extentTest.log(LogStatus.PASS, "TE044P Admin berhasil edit menu dropdown rating dua");
		}

//	edit rating 3
	@When("TE045P Admin mengedit rating tiga dropdown")
	public void te045p_admin_mengedit_rating_tiga_dropdown() {
		System.out.println("INI DARI ADMIN EDIT RATING 3");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editRatingTiga();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE045P Admin mengedit rating tiga dropdown");
	}

	@And("TE045P Admin klik tombol simpan rating tiga dropdown")
	public void te045p_admin_klik_tombol_simpan_rating_tiga_dropdown() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE045P Admin klik tombol simpan rating tiga dropdown");
	}

	@Then("TE045P Admin berhasil edit rating tiga dropdown")
	public void te045p_admin_berhasil_edit_rating_tiga_dropdown() {
		extentTest.log(LogStatus.PASS, "TE045P Admin berhasil edit rating tiga dropdown");
		}

//	edit rating 4
	@When("TE046P Admin mengedit rating empat menu dropdown")
	public void te046p_admin_mengedit_rating_empat_menu_dropdown() {
		System.out.println("INI DARI ADMIN EDIT RATING 4");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editRatingEmpat();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE046P Admin mengedit rating empat menu dropdown");
	}

	@And("TE046P Admin klik button simpan rating empat menu dropdown")
	public void te046p_admin_klik_button_simpan_rating_empat_menu_dropdown() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE046P Admin klik button simpan rating empat menu dropdown");
	}

	@Then("TE046P Admin berhasil edit rating menu empat dropdown")
	public void te046p_admin_berhasil_edit_rating_menu_empat_dropdown() {
		extentTest.log(LogStatus.PASS, "TE046P Admin berhasil edit rating menu empat dropdown");
		}

//	edit rating 5
	@When("TE047P Admin mengedit rating lima dropdown menu")
	public void te047p_admin_mengedit_rating_lima_dropdown_menu() {
		System.out.println("INI DARI ADMIN EDIT RATING 5");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editRatingLima();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE047P Admin mengedit rating lima dropdown menu");
	}

	@And("TE047P Admin klik tombol simpan rating lima dropdown menu")
	public void te047p_admin_klik_tombol_simpan_rating_lima_dropdown_menu() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE047P Admin klik tombol simpan rating lima dropdown menu");
	}

	@Then("TE047P Admin berhasil edit rating lima dropdown menu")
	public void te047p_admin_berhasil_edit_rating_lima_dropdown_menu() {
		extentTest.log(LogStatus.PASS, "TE047P Admin berhasil edit rating lima dropdown menu");
		}
	
//	edit nama peserta
	@When("TE048P Admin mengedit nama peserta")
	public void admin_mengedit_nama_peserta() {
		System.out.println("INI DARI ADMIN EDIT NAMA");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editNamaPeserta();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE048P Admin mengedit nama peserta");
	}

	@And("TE048P Admin menekan tombol simpan edit nama peserta")
	public void admin_menekan_tombol_simpan_edit_nama_peserta() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE048P Admin menekan tombol simpan edit nama peserta");
	}

	@Then("TE048P Admin berhasil edit nama peserta")
	public void admin_berhasil_edit_nama_peserta() {
		extentTest.log(LogStatus.PASS,"TE048P nama peserta sudah diedit");
	}
	
//	edit isi
	@When("TE049P Admin mengedit isi testimonial")
	public void admin_mengedit_isi_testimonial() {
		System.out.println("INI DARI ADMIN EDIT ISI");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editIsiTesti();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE049P Admin mengedit isi testimonial");
	}

	@And("TE049P Admin menekan tombol simpan edit isi testimonial")
	public void admin_menekan_tombol_simpan_edit_isi_testimonial() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE049P Admin menekan tombol simpan edit isi testimonial");
	}

	@Then("TE049P Admin berhasil edit isi testimonial")
	public void admin_berhasil_edit_isi_testimonial() {
		extentTest.log(LogStatus.PASS, "TE049P Admin berhasil edit isi testimonial");
	}
	
//	edit active no active
	@When("TE050P Admin mengedit dropdown menu active no active")
	public void te050p_admin_mengedit_dropdown_menu_active_no_active() {
		System.out.println("INI DARI ADMIN EDIT ACTIVE NO ACTIVE");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editActNoAct();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE050P Admin mengedit dropdown menu active no active");
	}

	@And("TE050P Admin menekan tombol simpan edit dropdown active no active")
	public void te050p_admin_menekan_tombol_simpan_edit_dropdown_active_no_active() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE050P Admin menekan tombol simpan edit dropdown active no active");
	}

	@Then("TE050P Admin berhasil edit dropdown active no active")
	public void te050p_admin_berhasil_edit_dropdown_active_no_active() {
		extentTest.log(LogStatus.PASS, "TE050P Admin berhasil edit dropdown active no active");
		}

//	edit no active active
	@When("TE051P Admin mengedit dropdown no active active")
	public void te051p_admin_mengedit_dropdown_no_active_active() {
		System.out.println("INI DARI ADMIN EDIT NO ACTIVE ACTIVE");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editNoActAct();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE051P Admin mengedit dropdown no active active");
	}

	@And("TE051P Admin menekan tombol simpan edit dropdown menu no active active")
	public void te051p_admin_menekan_tombol_simpan_edit_dropdown_menu_no_active_active() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE051P Admin menekan tombol simpan edit dropdown menu no active active");
	}

	@Then("TE051P Admin berhasil edit dropdown active no active")
	public void te051p_admin_berhasil_edit_dropdown_active_no_active() {
		extentTest.log(LogStatus.PASS, "TE051P Admin berhasil edit dropdown active no active");
		}

}
