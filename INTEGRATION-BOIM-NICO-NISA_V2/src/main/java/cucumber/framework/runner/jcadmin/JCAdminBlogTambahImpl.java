package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminBlogPage;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminBlogTambahImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBlogPage jcBlog; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBlogTambahImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		jcBlog = new JCAdminBlogPage();
		
	}
	
	@Given("^(.*) Admin login dan membuka blog untuk menambah$")
	public void k123_admin_login_dan_membuka_blog_untuk_menambahblogbaru(String kode) {
	    Utils.delay(2, strDelay);
	    Utils.fullScroll();
	    jcBlog.klikTambahBlog();
	    extentTest.log(LogStatus.PASS, "Admin login dan masuk ke halaman blog untuk menambah");
	}

	@Given("^(.*) Admin mengisi form tambah blog baru dengan publish (.*) dan to home (.*)$")
	public void k123_admin_mengisi_form_tambah_dengan_publish_activeblogbaru(String kode, String pub, String toHome) {
	    Utils.zoomOut(4);
	    jcBlog.tambahBlogBaru(kode,pub,toHome);
	    extentTest.log(LogStatus.PASS, "Admin mengisi form tambah blog baru");
	}

	@Given("^(.*) Admin menekan tombol simpan tambah blog baru$")
	public void k123_admin_menekan_tombol_simpan_tambahblogbaru(String kode) {
	    jcBlog.klikSimpan();
	    Utils.zoomIn(4);
	    extentTest.log(LogStatus.PASS, "Admin klik tombol simpan dan tambah blog baru");
	}

	@Then("^(.*) Admin menambah blog baru active valid$")
	public void k123_admin_menambah_rincian_biaya_active_validblogbaru(String kode) {
		assertTrue(jcBlog.getTxtAddVld(10).contains("berhasil"));
		extentTest.log(LogStatus.PASS, "Admin menambah blog baru active valid");
	}


}
