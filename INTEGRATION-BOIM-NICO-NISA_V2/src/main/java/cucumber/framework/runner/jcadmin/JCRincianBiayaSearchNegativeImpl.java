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

public class JCRincianBiayaSearchNegativeImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCRincianBiayaSearchNegativeImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
	}
	@When("Admin login dan membuka halaman rincian biaya search negative")
	public void admin_login_dan_membuka_halaman_rincian_biaya_search_negative() {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman rincian biaya search engine");
	}

	@When("^(.*) Admin memilih (.*) dengan (.*), (.*), (.*), (.*), (.*)")
	public void kode_admin_memilih_opsi_search_dengan_keyword_search(
	        String kode, String opsiSearch, String keywordSearch,
	        String namaProgram, String harga, String diskon, String hargaDiskon
	        ) 
	{
	    if (opsiSearch.contains("nama")&&keywordSearch.equalsIgnoreCase("harga")) {
	        JCAdminRB.lihatNamaProgram();
	        JCAdminRB.searchNamaProgram(namaProgram);
	    }else if (opsiSearch.contains("nama")&&keywordSearch.equalsIgnoreCase("diskon")) {
	        JCAdminRB.lihatNamaProgram();
            JCAdminRB.searchDiskon(diskon);
	    }else if (opsiSearch.contains("nama")&&keywordSearch.equalsIgnoreCase("harga diskon")) {
	        JCAdminRB.lihatNamaProgram();
            JCAdminRB.searchHargaDiskon(hargaDiskon);
        }
	    
	    else if(opsiSearch.equalsIgnoreCase("harga")&&keywordSearch.equalsIgnoreCase("nama program")) {
	        JCAdminRB.lihatHargaNormal();
	        JCAdminRB.searchNamaProgram(namaProgram);
	    }else if(opsiSearch.equalsIgnoreCase("harga")&&keywordSearch.equalsIgnoreCase("diskon")) {
            JCAdminRB.lihatHargaNormal();
            JCAdminRB.searchDiskon(diskon);
        }else if(opsiSearch.equalsIgnoreCase("harga")&&keywordSearch.equalsIgnoreCase("harga diskon")) {
            JCAdminRB.lihatHargaNormal();
            JCAdminRB.searchHargaDiskon(hargaDiskon);
        }
	    
	    else if(opsiSearch.equalsIgnoreCase("diskon")&&keywordSearch.equalsIgnoreCase("nama program")) {
	        JCAdminRB.lihatDiskon();
	        JCAdminRB.searchNamaProgram(namaProgram);
        }else if(opsiSearch.equalsIgnoreCase("diskon")&&keywordSearch.equalsIgnoreCase("harga")) {
            JCAdminRB.lihatDiskon();
            JCAdminRB.searchHargaNormal(harga);
        }else if(opsiSearch.equalsIgnoreCase("diskon")&&keywordSearch.equalsIgnoreCase("harga diskon")) {
            JCAdminRB.lihatDiskon();
            JCAdminRB.searchHargaDiskon(hargaDiskon);
        }
	    
	    
	    else if(opsiSearch.equalsIgnoreCase("harga diskon")&&keywordSearch.equalsIgnoreCase("nama program")) {
            JCAdminRB.lihatHargaDiskon();
            JCAdminRB.searchNamaProgram(namaProgram);
        }else if(opsiSearch.equalsIgnoreCase("harga diskon")&&keywordSearch.equalsIgnoreCase("harga")) {
            JCAdminRB.lihatHargaDiskon();
            JCAdminRB.searchHargaNormal(harga);
        }else if(opsiSearch.equalsIgnoreCase("harga diskon")&&keywordSearch.equalsIgnoreCase("diskon")) {
            JCAdminRB.lihatHargaDiskon();
            JCAdminRB.searchDiskon(diskon);
        }
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "Admin mencari "+ opsiSearch+" dengan keyword " +keywordSearch);
	}

	@Then("^(.*) Admin mendapat data search$")
	public void kode_admin_mendapat_data_search(String kode) {
	    System.out.println("ini then "+kode);
	    extentTest.log(LogStatus.PASS, "Admin mendapat data search");
	}

	


}
