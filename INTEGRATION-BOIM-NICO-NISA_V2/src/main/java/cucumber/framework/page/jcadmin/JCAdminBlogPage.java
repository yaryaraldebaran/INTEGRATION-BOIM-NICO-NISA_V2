package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminBlogPage  extends JCAdminLoginPage
{
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBlogPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
		
	}

	/*----- Extras Nico -----*/
	public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	/*-----------------------*/
	String lokasiGambar = "src/main/resources/gambarboim/catit.png"; 
	File gambar1 = new File(lokasiGambar);
	String jamMenit = Integer.toString(LocalDateTime.now().getHour())+":"+Integer.toString(LocalDateTime.now().getMinute())+":"+Integer.toString(LocalDateTime.now().getMinute());
	@FindBy(xpath ="//alert[@class='alert alert-success']")
	private WebElement vldAddBlog;
	@FindBy(xpath ="//textarea[@name='body_preview']")
	private WebElement vldEditBlog;
	@FindBy(linkText = "Blog")
	private WebElement btnBlog;
	@FindBy(xpath ="//a[normalize-space()='3']")
	private WebElement btnPage3;
	   @FindBy(xpath ="//a[normalize-space()='2']")
	    private WebElement btnPage2;
	@FindBy (linkText = "Tambah")
	private WebElement btnTambah;
	@FindBy(name="uploadedFile")
	private WebElement uploadField;
	
	@FindBy(name = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/figure[1]/a[1]/img[1]")
	private WebElement blogPertama;
	//FIELD TAMBAH BLOG
	@FindBy(id ="judul")
	private WebElement judulBlog;
	@FindBy(xpath ="//div[3]//div[1]//select[1]")
	private WebElement optPublish;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/div[1]/select[1]")
	private WebElement optSetHome;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/textarea[1]")
	private WebElement fieldBodyPreview;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[3]/div[3]")
	private WebElement contentBlog;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	private WebElement btnSubmitAdd;
	
	//validator
	@FindBy(xpath="//form[@id='frmregister']/alert")
	private WebElement validatorAdd;

	public void klikTambahBlog() {
		// this.btnBlog.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(btnBlog)).click();
		// this.btnTambah.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(btnTambah)).click();
	}
	public void tambahBlogBaru(String kode,String pub,String toHome) {
	    uploadGambar(gambar1);
	    System.out.println("publish adalah "+pub+" dan to home adala "+toHome);
		// this.judulBlog.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(judulBlog)).click();
		clearField();
		this.judulBlog.sendKeys("Ini judul pada "+jamMenit);
		Utils.scrollFullMouse(100);
		editPublish(pub);
		editOptSettop(toHome);
		// this.fieldBodyPreview.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(fieldBodyPreview)).click();
		clearField();
		this.fieldBodyPreview.sendKeys("ini adalah isi konten body untuk body preview "+jamMenit);
		Utils.scrollFullMouse(100);
		this.contentBlog.click();
		clearField();
		isiFieldBody("ini adalah isi content boyd untuk artikel blog pada jam "+jamMenit);
		Utils.fullScroll();	
	}
	public void klikSimpan() {
		Utils.fullScroll();
		Utils.delay(2, strDelay);
		// this.btnSubmitAdd.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(btnSubmitAdd)).click();
	}
	
	public void editPublish(String setPub) {
//	    Utils.setengahScroll("250");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Select selPublish = new Select(this.optPublish);
        Utils.delay(1, strDelay);
        String stat = "";
        if (setPub.contains("No")) {
            stat="1";
        }else {
            stat="0";
        }
        
        js.executeScript("window.scrollBy(0,500)", "");
        System.out.println(stat);
        selPublish.selectByValue(stat);
        Utils.delay(2, strDelay);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void editOptSettop(String setTopStat) {
	       JavascriptExecutor js = (JavascriptExecutor) driver;
		Select selSettop = new Select(this.optSetHome);
		Utils.setengahScroll("400");
		Utils.delay(2, strDelay);
		String optSetHome="";
		if (setTopStat.equalsIgnoreCase("yes")) {
			optSetHome="Yes";
		}else {
		    optSetHome="No";
		}
        js.executeScript("window.scrollBy(0,500)", "");
		Utils.delay(2, strDelay);
        selSettop.selectByVisibleText(optSetHome);
        Utils.delay(2, strDelay);
        Utils.delay(1, strDelay);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void editConPrev(String conPrev) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    // this.fieldBodyPreview.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(fieldBodyPreview)).click();
	    Utils.delay(1, strDelay);
        clearField();
        Utils.delay(1, strDelay);
        this.fieldBodyPreview.sendKeys(conPrev+jamMenit);    
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
	public void editContent(String content) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
	    Utils.delay(2, strDelay);
        this.contentBlog.click();
        clearField();
        Utils.delay(2, strDelay);
        isiFieldBody(content+jamMenit);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	//UTILITAS
	public void clearField() {
		try {
		    System.out.println("ini dari robot clearfield");
			Robot rbtclr = new Robot();
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_A);
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_A);
			rbtclr.keyPress(KeyEvent.VK_BACK_SPACE);
			rbtclr.keyRelease(KeyEvent.VK_BACK_SPACE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickMouseUpload() {
		try {
			Robot rbtclr = new Robot();
			rbtclr.mouseMove(420, 492);
			Utils.delay(1, strDelay);
			rbtclr.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			rbtclr.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void uploadGambar(File myFile) {
		try {
			String lokasiFile = myFile.getAbsolutePath();
			System.out.println(lokasiFile);
			StringSelection strlok = new StringSelection(lokasiFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strlok, null);
			Robot rbtclr = new Robot();
			rbtclr.mouseMove(500, 350);
			Utils.delay(1, strDelay);
			rbtclr.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			rbtclr.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Utils.delay(1, strDelay);
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_V);
			Utils.delay(1, strDelay);
		    // release Contol+V for pasting
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_V);
			Utils.delay(1, strDelay);
		    // for pressing and releasing Enter
			rbtclr.keyPress(KeyEvent.VK_ENTER);
			rbtclr.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			System.out.println("error upload file");
		}
	}
	
	public void isiFieldBody(String txtInput) {
		StringSelection stringSelection = new StringSelection(txtInput);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);

		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getTxtAddVld(int delays) {
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(validatorAdd)).getText();
    }
    public void goToBlog() {
        this.btnBlog.click();      
    }
    public void clickBlogPertama() {
//        this.blogPertama.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver; 
//        js.executeScript("document.querySelector('img[alt='Image description'][src='https://dev.ptdika.com/web_jc_v2/public/upload/blog/blog_1952201665044331_44813e4a528ef041c1d2.png']).click();");
        try {
            Robot rbt = new Robot();
            rbt.mouseMove(464,580);
            rbt.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            rbt.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void editJudul() {
        this.judulBlog.click();
        clearField();
        Utils.delay(1, strDelay);
        this.judulBlog.sendKeys("judul hasil edit");
        this.btnSubmitAdd.click();   
    }
    public void keHalamanDua() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        try {
//            Robot rbtclr = new Robot();
//            rbtclr.mouseWheel(2);
//        } catch (AWTException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        js.executeScript("window.scrollBy(0,2000)", "");
        Utils.delay(1, strDelay);
        this.btnPage2.click();
        Utils.delay(1, strDelay);
    }
    public void keHalamanTiga() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("window.scrollBy(0,2000)", "");
        Utils.delay(1, strDelay);
        this.btnPage3.click();
        Utils.delay(1, strDelay);
    }
    public String getVldAdd() {
        //"Data berhasil di tambah"
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(vldAddBlog)).getText();
    }
    public String getVldEditConprev() {
        //"Data berhasil di tambah"
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(fieldBodyPreview)).getText();
    }
    public String getVldEditContentBlog() {
        //"Data berhasil di tambah"
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(contentBlog)).getText();
    }
    public String getVldEditPublish() {
        //"Data berhasil di tambah"
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(optPublish)).getText();
    }
    public String getVldEditsetHome() {
        //"Data berhasil di tambah"
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(optSetHome)).getText();
    }
	
    
    
    //EXTRAS NICO//
    @FindBy(linkText = "Home")
	private WebElement btnHome;
//	@FindBy (xpath = "//li[6]//a[1]")
//	private WebElement btnBlog;
	@FindBy (linkText = "Tambah")
	private WebElement btnTambahBlog;
	
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement uploadXpathAbs;
	@FindBy(xpath="//input[@name='uploadedFile']")
	private WebElement uploadXpathRef;
	@FindBy(xpath="//input[@type='file']")
	private WebElement uploadXpathRef2;
//	@FindBy(xpath ="//figure[1]//a[1]//img[1]")
//	private WebElement blogPertama;
	
//	@FindBy(id = "judul")
//	private WebElement judulBlog;
//	@FindBy(id = "exampleFormControlSelect9")
//	private WebElement optPublish;
	@FindBy(name = "set_top")
	private WebElement optSetTop;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/textarea[1]")
	private WebElement bodyPreview;
	@FindBy(xpath = "//form[@id='frmregister']/div[2]/div/div[6]/div/div/div[3]/div")
	private WebElement fieldBody;
	@FindBy(xpath="//input[@name='mysubmit']")
	private WebElement btnEditSubmit;
	
	/*----- Extras Nico -----*/
	@FindBy(xpath = "//input[@placeholder='Search Judul']")
	private WebElement cariJudul;
	@FindBy(xpath = "//img[@alt='Image description']")
	private WebElement tapKotakBlog;
	@FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
	private WebElement pilihGambarUlang;
	@FindBy(xpath = "//input[@id='filename']")
	private WebElement getValueFoto;
	@FindBy(xpath = "//input[@id='judul']")
	private WebElement editJudul;
	@FindBy(xpath = "//textarea[@name='body_preview']")
	private WebElement editBodyPreview;
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement editBodyField;
	@FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
	private WebElement invalidInput;
	public void tambahBlogBaru() {
		this.btnBlog.click();
		this.btnTambahBlog.click();
		Utils.fullScroll();
		System.out.println("ini tambah baru");
	}
//	public void goToBlog() {
//		this.btnHome.click();
//		this.btnBlog.click();
//	}
	public void tekanTambahBlog() {
		this.btnTambahBlog.click();
	}
	public void clickUpload() {
		this.uploadXpathAbs.click();
	}
	
	/*
	 * EDIT JUDUL BLOG
	 */
	public void clickPertama() {
		this.blogPertama.click();
	}
//	public void editJudul() {
//		this.judulBlog.click();
//		Utils.clearField();
//		Utils.delay(3, strDelay);
//		this.judulBlog.sendKeys("ini adalah judul blog pertama cucumber");
//	}
	public void klikSimpanEditJudul() {
		this.btnEditSubmit.click();
	}
	
	/*
	 * EDIT BODY PREVIEW
	 */
	public void editBodyPreview() {
		Utils.setengahScroll("400");
		this.bodyPreview.click();
		Utils.delay(3, strDelay);
		clearField();
		Utils.delay(2, strDelay);
		this.bodyPreview.sendKeys("ini adalah body preview blog pertama cucumer");
		Utils.delay(3, strDelay);
	}
	public void klikSimpanEditBody() {
//		Utils.setengahScroll("2000");
		Utils.scrollFullMouse(200);
		this.btnEditSubmit.click();
		Utils.delay(2, strDelay);
	}
	
	/*----- Extras Nico -----*/
	public void cariJudulBlog(String cari) {
		Utils.delay(2, strDelay);
		this.cariJudul.sendKeys(cari);
	}
	
	public void tekanEnter() {
		Utils.delay(2, strDelay);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("Next");
		}
	}
	
	public void tekanKotakBlog() {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		this.tapKotakBlog.click();
	}
	
	public void pilihFotoUlang(String foto) {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		this.pilihGambarUlang.click();
		File upFile = new File(foto);
		Utils.delay(2, strDelay);
		Utils.uploadFoto(upFile);
	}
	
//	public void klikSimpan() {
//		Utils.fullScroll();
//		Utils.delay(2, strDelay);
//		this.btnEditSubmit.click();
//	}
	
	public String getValidFoto() {
		Utils.delay(2, strDelay);
		return this.getValueFoto.getAttribute("value");
	}
	
	public void editJudulBlog(String judul) {
		Utils.littleScroll();
		Utils.delay(2, strDelay);
		this.editJudul.sendKeys(judul);
	}
	
//	public void editPublish(String status) {
//		Utils.delay(2, strDelay);
//		Select selc = new Select(this.optPublish);
//		selc.selectByVisibleText(status);
//	}
	
	public void editSetTop(String set) {
		Utils.delay(2, strDelay);
		Select selc = new Select(this.optSetTop);
		selc.selectByVisibleText(set);
	}
	
	public String getValidStatusPublish() {
		Select selc = new Select(this.optPublish);
		String get = selc.getFirstSelectedOption().getText();
		return get;
	}
	
	public String getValidStatusSetTop() {
		Select selc = new Select(this.optSetTop);
		String get = selc.getFirstSelectedOption().getText();
		return get;
	}
	
	public void editContentPreview(String content) {
		Utils.delay(2, strDelay);
		this.editBodyPreview.clear();
		Utils.delay(2, strDelay);
		this.editBodyPreview.sendKeys(content);
	}
	
	public void editContentBody(String content) {
		Utils.delay(2, strDelay);
		this.editBodyField.clear();
		Utils.delay(2, strDelay);
		this.editBodyField.sendKeys(content);
	}
	
	public String getValidContentPreview() {
		return driverWaitTxt(driver, 10, editBodyField);
	}
	
	public String getValidContentBody() {
		return driverWaitTxt(driver, 10, editBodyField);
	}
	
	public String getInvalidInputContent() {
		Utils.littleScroll();
		return driverWaitTxt(driver, 10, invalidInput);
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