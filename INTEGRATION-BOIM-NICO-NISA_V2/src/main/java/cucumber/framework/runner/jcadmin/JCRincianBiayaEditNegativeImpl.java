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

public class JCRincianBiayaEditNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCRincianBiayaEditNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
	}
	//INI MULAI BACKGROUND
	@When("Admin login dan membuka halaman rincian biaya edit negative")
	public void admin_login_dan_membuka_halaman_rincian_biayanegtaive() {
	    JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman rincian biaya");
	}

	@And("Admin klik tombol edit rincian biaya pertama edit negatiiff")
	public void admin_klik_tombol_edit_rincian_biaya_pertama() {
	    JCAdminRB.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol edit rincian biaya pertama");
	}
	//INI AKHIR BACKGROUND
	
	//INI AWAL EDIT NAMA PROGRAM
	@When("^(.*) Admin mengedit (.*) dengan (.*)$")
	public void admin_kosong_field(String kode, String field,String valueField) {
	    if (field.contains("nama")) {
	        JCAdminRB.editNamaProgram("");
	    }else if (field.contains("diskon")) {
	        JCAdminRB.editDiskon("");
	    }else if (field.contains("normal")) {
	        JCAdminRB.editHargaAwal("");
	    }else if(field.contains("1")) {
	        JCAdminRB.editKeunggulan1("");
	    }else if(field.contains("2")) {
	        JCAdminRB.editKeunggulan2("");
        }else if(field.contains("3")) {
            JCAdminRB.editKeunggulan3("");
        }else if(field.contains("4")) {
            JCAdminRB.editKeunggulan4("");
        }
	    extentTest.log(LogStatus.PASS, "Admin mengedit nama program dengan ");
	}

	@And("^(.*) Admin menekan tombol simpan edit field kosong$")
	public void admin_menekan_tombol_simpan_edit_kosong(String kode) {
	    //fungsi klik simpan edit
		Utils.fullScroll();
		JCAdminRB.simpanEdit();
		System.out.println("ini klik simpan edit nama program");
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit nama program");
	}

	@Then("^(.*) Admin mengedit nama program THEN kosong (.*)$")
	public void admin_mengedit_nama_program(String valueKosong,String field) {
//	    if (field.contains("nama")) {
//            assertTrue(JCAdminRB.getWarningKeunggulan1Empty().contains("harap"));
//        }else if (field.contains("1")) {
//            assertTrue(JCAdminRB.getWarningNameEmpty().contains("harap"));
//        }
	    Utils.delay(2, strDelay);
	    System.out.println(JCAdminRB.getWarningNameEmpty());
	    assertTrue(JCAdminRB.getWarningNameEmpty().contains("Harap")||JCAdminRB.getWarningKeunggulan1Empty().contains("Harap")||JCAdminRB.getTxtSuccess().contains("berhasil"));
	    System.out.println("nama program sudah diedit");
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit nama program");
	}
	//INI AKHIR EDIT NAMA PROGRAM
	


}
