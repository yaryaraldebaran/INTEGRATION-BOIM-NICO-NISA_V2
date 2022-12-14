package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCRincianBiayaTambahImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCRincianBiayaTambahImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
	}
    public void fullScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
	@Given("^(.*) Admin login dan membuka halaman rincian biaya tambah$")
	public void admin_login_dan_membuka_halaman_rincian_biaya(String kodeTest) {
	    
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    extentTest.log(LogStatus.PASS, "admin login dan membuka halaman rincian biaya");
	}

	@When("^(.*) Admin klik tombol tambah$")
	public void admin_klik_tombol_tambah(String kodeTest) {
	    JCAdminRB.goToTambahRB();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol tambah");
	}

	@And("^(.*) Admin mengisi form tambah dengan publish (.*)$")
	public void admin_mengisi_form_dengan_publish_active(String kodeTest,String stat) {
		System.out.println(kodeTest);
		JCAdminRB.tambahDataRincianBiayaPublish(stat);
		extentTest.log(LogStatus.PASS, "Admin mengisi form tambah dengan publish "+stat);
	}

	@And("^(.*)Admin menekan tombol simpan tambah rincian biaya baru$")
	public void admin_menekan_tombol_simpan(String kodeTest) {
	    Utils.delay(2, strDelay);
//	    if (kodeTest.contains("RI006P")) {Utils.zoomOut(4);}
	    Utils.fullScroll();
	    JCAdminRB.simpanTambah();
		
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan tambah");
	}

	@Then("^(.*) Admin menambah rincian biaya biaya baru dengan active valid$")
	public void admin_menambah_rincian_biaya_active_valid(String kodeTest) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    assertTrue(JCAdminRB.getTxtSuccess().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin menambah rincian biaya active valid");
	}

}
