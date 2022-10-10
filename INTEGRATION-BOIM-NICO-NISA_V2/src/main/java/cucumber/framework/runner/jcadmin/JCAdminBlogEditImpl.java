package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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

public class JCAdminBlogEditImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBlogPage JCAdminBlog; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBlogEditImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminBlog = new JCAdminBlogPage();
	}
	/*
	 * BACKGROUND
	 */
	@Given("Admin login dan masuk ke halaman blog untuk mengedit")
	public void admin_login_dan_masuk_ke_halaman_blog_untuk_mengedit() {
	    JCAdminBlog.goToBlog();
	    extentTest.log(LogStatus.PASS, "Admin login dan masuk ke halaman blog untuk mengedit");
	}
	@When("Admin menekan tombol edit blog pertama")
	public void admin_menekan_tombol_edit_blog_pertama() {
		Utils.delay(2, strDelay);
	    JCAdminBlog.clickBlogPertama();
	    extentTest.log(LogStatus.PASS, "Admin menekan tombol edit blog pertama");
	}
	//AKHIR BACKGROUND
	@When("^(.*) Admin edit (.*) menjadi (.*), (.*), (.*), (.*), blog$")
	public void editBlog(String kode,String nama, String publish,
	        String setHome, String conPrev, String content) {
	    System.out.println("publish blank? "+publish.isBlank()+" dengan "+publish);
	    System.out.println("opt Home blank? "+setHome.isBlank()+" dengan "+setHome);
	    System.out.println("conprev blank? "+conPrev.isBlank()+" dengan "+conPrev);
	    
	    if(!publish.isBlank()) {
	        JCAdminBlog.editPublish(publish);
	    }else if (!setHome.isBlank()) {
	        JCAdminBlog.editOptSettop(setHome);
	    }else if (!conPrev.isBlank()) {
	        JCAdminBlog.editConPrev(conPrev);
	    }else if(!content.isBlank()) {
	        JCAdminBlog.editContent(content);
	        
	    }
	    Utils.delay(3, strDelay);
	    extentTest.log(LogStatus.PASS, "Admin edit data");
	}
	@When("^(.*) Admin klik simpan edit pada blog$")
	public void adminKlikSimpanEdit(String kode) {
	    Utils.delay(2, strDelay);
	    JCAdminBlog.klikSimpan();
	    Utils.delay(5, strDelay);
	    extentTest.log(LogStatus.PASS, "Admin klik simpan edit data blog");
	}
	@Then("^(.*) Admin telah mengedit (.*), (.*), (.*), (.*)$")
	public void admin_telah_mengedit(String kode, String publish,
            String setHome, String conPrev, String content) {
	    Utils.delay(2, strDelay);
	    if(!publish.isBlank()) {
	        assertTrue(JCAdminBlog.getVldEditPublish().contains(publish));
        }else if (!setHome.isBlank()) {
            assertTrue(JCAdminBlog.getVldEditsetHome().contains(setHome));
        }else if (!conPrev.isBlank()) {
            assertTrue(JCAdminBlog.getVldEditConprev().contains(conPrev));
        }else if(!content.isBlank()) {
            assertTrue(JCAdminBlog.getVldEditContentBlog().contains(content));
        }
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit");
	}
	
	// AWAL GESER BLOG PAGE
	@When("BL014P Admin login dan masuk ke halamn utama blog")
	public void admin_login_dan_masuk_ke_halamn_utama_blog() {
	    JCAdminBlog.goToBlog();
	    extentTest.log(LogStatus.PASS, "Admin login dan masuk ke halaman utama blog");
	}

	@And("^BL014P Admin klik tombol halaman (.*)$")
	public void admin_klik_tombol_halaman_no_hal(String hal) {
	    if (hal.contains("2")) {
	        JCAdminBlog.keHalamanDua();
	    }else {
	        JCAdminBlog.keHalamanTiga();
	    }
	    extentTest.log(LogStatus.PASS, "Admin klik tombol halaman "+hal);
	}
	@And("BL014P Admin sudah pindah halaman")
    public void admin_klik_tombol_halaman() {
        System.out.println("admin klik tombol halamn");
        extentTest.log(LogStatus.PASS, "Admin sudah berpindah halaman");
    }
    // public static void zoomIn(int nilai) {
    //     try {
    //         Robot rob = new Robot();
    //         for (int i = 0; i < nilai; i++) {
    //             rob.keyPress(KeyEvent.VK_CONTROL);
    //             rob.keyPress(KeyEvent.VK_ADD);
    //             rob.keyRelease(KeyEvent.VK_ADD);
    //             rob.keyRelease(KeyEvent.VK_CONTROL);
    //         }
    //     } catch (Exception e) {
    //         System.out.println("ERROR : zoomIn Method");
    //     }
    // }
    // public static void zoomOut(int x) {
    //     Robot rbt;
    //     try {
    //         rbt = new Robot();
    //         for (int i = 0; i < x; i++) {
    //             rbt.keyPress(KeyEvent.VK_CONTROL);
    //             rbt.keyPress(KeyEvent.VK_SUBTRACT);
    //             rbt.keyRelease(KeyEvent.VK_SUBTRACT);
    //             rbt.keyRelease(KeyEvent.VK_CONTROL);
    //         }
    //     } catch (AWTException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    // }
}
