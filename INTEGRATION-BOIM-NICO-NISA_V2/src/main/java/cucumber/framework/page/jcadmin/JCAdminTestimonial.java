package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminTestimonial extends JCAdminLoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
//	deklarasi file gambar
	private String lokasiFileGambarTambahNoAct = "src\\main\\resources\\gambarnisa\\raisa.jpg";
	private String lokasiFileGambarTambahAct = "src\\main\\resources\\gambarnisa\\aliando.jpeg";
	private String lokasiFileGambarTambahNegNoAct = "src\\main\\resources\\gambarnisa\\dev.png";
	private String lokasiFileGambarTambahNegAct = "src\\main\\resources\\gambarnisa\\jerome.jpeg";
	private String lokasiFileGambarTambahForAct = "src\\main\\resources\\gambarnisa\\kartun.gif";
	private String lokasiFileGambarTambahForNoAct = "src\\main\\resources\\gambarnisa\\dog.webp";
	private String lokasiFileGambarTambahKarAct = "src\\main\\resources\\gambarnisa\\duta.jpg";
	private String lokasiFileGambarTambahKarNoAct = "src\\main\\resources\\gambarnisa\\tulus.jpg";
	private String lokasiFileGambarEdit = "src\\main\\resources\\gambarnisa\\aliando.jpeg";
	private String lokasiFileGambarSearch = "src\\main\\resources\\gambarnisa\\angga.jpg";
	
	public JCAdminTestimonial() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy(linkText = "Testimonial")
	private WebElement btnTestimonial;
	@FindBy(linkText = "Tambahh")
	private WebElement btnTambahhTestimonial;
	@FindBy(xpath = "//h3[normalize-space()='List Testimonial']")
	private WebElement txtLaman;
	@FindBy(xpath = "//a[normalize-space()='1']")
	private WebElement lamanSatu;
	@FindBy(xpath = "//a[normalize-space()='2']")
	private WebElement lamanDua;
	@FindBy(xpath = "//a[normalize-space()='3']")
	private WebElement lamanTiga;
	@FindBy(xpath = "//a[@aria-label='Next']")
	private WebElement lamanNext;
	@FindBy(xpath = "//a[@aria-label='Previous']")
	private WebElement lamanPrevious;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/*[name()='svg'][1]")
	private WebElement lamanScrollUp;
	
	//form tambah testimonial
	@FindBy(xpath = "//input[@name='uploadedFile']")
	private WebElement upload;
	@FindBy(name = "nama")
	private WebElement nama;
	@FindBy(xpath = "//input[@id='nama']")
	private WebElement editNamaPeserta;
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement selPublish;
	@FindBy(name = "body")
	private WebElement isiTesti;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/select[1]")
	private WebElement selRating;	
//	Karakter (<|>|'|") tidak diizinkan
	@FindBy(xpath = "//div[@id='pageWrapper']//div[4]//div[1]//div[1]")
	private WebElement txtIsi;
//	Karakter (<|>|'|") tidak diizinkan
	@FindBy(xpath = "//div[@class='invalid-feedback']")
	private WebElement txtNamaSalah;
//	Karakter (<|>|'|") tidak diizinkan
	@FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
	private WebElement txtNamaKarSalah;
//	Nama Wajib diisi
	@FindBy(xpath = "//div[@class='card-body']//div[2]//div[1]//div[1]")
	private WebElement txtNamaKosong;
//	Harap isi content testimonial
	@FindBy(xpath = "//div[@class='invalid-feedback']")
	private WebElement txtIsiKosong;
	
//	data yang akan diedit 
	@FindBy(xpath ="//figure[1]//a[1]//img[1]")
	private WebElement editPertama;
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSubmit;
	@FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
	private WebElement uploadUlang;
	
//	cari data
	@FindBy(xpath ="//input[@placeholder='Search Nama Peserta']")
	private WebElement fieldSearch;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/b[1]")
	private WebElement txtTotal; 
	@FindBy(xpath ="//b[normalize-space()='Total Search : 0 Data']")
	private WebElement txtSearchKosong;
	
	
//	=====================
//	LIST TESTIMONIAL
//	=====================
	
	public void cekListTestimonial() {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
//		lamanDua.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanDua)).click();
		Utils.delay(3, strDelay);
//		Utils.fullScroll();
		Utils.scrollFullMouse(500);
//		lamanNext.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanNext)).click();
		Utils.delay(3, strDelay);
//		Utils.fullScroll();
		Utils.scrollFullMouse(500);
//		lamanScrollUp.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanScrollUp)).click();
		Utils.delay(3, strDelay);
	}
	
	public void searchNamaPesertaList() {
		this.fieldSearch.sendKeys("Nadin");
		Utils.delay(2, strDelay);
	}
	
//	=====================
//	SLIDE PAGE TESTIMONIAL
//	=====================
	
	public void slidePageTestimonialPertama() {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
//		lamanDua.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanDua)).click();
		Utils.delay(3, strDelay);
		Utils.scrollFullMouse(500);
//		lamanScrollUp.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanScrollUp)).click();
		Utils.delay(3, strDelay);
	}
	
	public void slidePageTestimonialKedua() {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
//		lamanTiga.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanTiga)).click();
		Utils.delay(3, strDelay);
		Utils.scrollFullMouse(500);
//		lamanScrollUp.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanScrollUp)).click();
		Utils.delay(3, strDelay);
	}
	
	public void slidePageTestimonialKetiga() {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
//		lamanNext.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanNext)).click();
		Utils.delay(3, strDelay);
		Utils.scrollFullMouse(500);
//		lamanScrollUp.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(lamanScrollUp)).click();
		Utils.delay(3, strDelay);
	}
	
//	=====================
//	MENAMBAH DATA
//	=====================
	
	public void tambahDataTestimonialPublishActive(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Aliando Syarief");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Coding memang membuatku sibuk, tapi dengan coding membuatku tidak gabut lagi");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialPublishNoActive(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Raisa");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Apalah arti aku menunggu bila kamu tak sibuk lagiSalah satu yang paling nikmat dari kesempatan hidup adalah hari-hari baik yang datang bagi si yakin dan berusaha");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialActiveGambar(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahForAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Kartun");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Salah satu yang paling nikmat dari kesempatan hidup adalah hari-hari baik yang datang bagi si yakin dan berusaha");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNoActiveGambar(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahForNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Cute");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Semangat menjalani kehidupan");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialActiveIsi(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahKarAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Duta Sheila");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("<Hai>");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNoActiveIsi(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahKarNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Tulus");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("/<Hallo>");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}

	public void pilihRating(int nilaiRate) {
	try {
		Robot rbt = new Robot();
		for (int i= 0; i<nilaiRate;i++) {
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
		}
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public void uploadFile(File fileInput){
	Utils.delay(1, strDelay);
	String lokasiFile = fileInput.getAbsolutePath();
	this.upload.sendKeys(lokasiFile);
	}
	
//	=====================
//	MENAMBAH DATA NEGATIF
//	=====================
	
	public void tambahDataTestimonialNegativeActive(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Terkadang ditengah jalan kita kehilangan motivasi, saat seperti itu coba lihat kebelakang. Kita bisa sadar betapa jauhnya kita sudah melangkah, seberapa besar energi dan waktu yang sudah kita korbankan");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegativeNoActive(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Menanyakan apakah komputer dapat berpikir sama seperti menanyakan apakah kapal selam dapat berenang.");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegativeActiveIsi(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Jerome");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegativeNoActiveIsi(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Developper");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegativeActiveChar(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("hgadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhhhhhhhhhhhhhhhhhasssssssssssssssssssnnnnnnnnnnnnnnnnnnnnnassashsajjhbdhjjjjjjjjjnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhgadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjkLHgadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhhhhhhhhhhhhhhhhhasssssssssssssssssssnnnnnnnnnnnnnnnnnnnnnassashsajjhbdhjjjjjjjjjnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhgadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjkl");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Terkadang ditengah jalan kita kehilangan motivasi, saat seperti itu coba lihat kebelakang. Kita bisa sadar betapa jauhnya kita sudah melangkah, seberapa besar energi dan waktu yang sudah kita korbankan");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegativeNoActiveChar(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("mkaihdbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhhhhhhhhhhhhhhhhhasssssssssssssssssssnnnnnnnnnnnnnnnnnnnnnassashsajjhbdhjjjjjjjjjnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhgadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjjABjadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhhhhhhhhhhhhhhhhhasssssssssssssssssssnnnnnnnnnnnnnnnnnnnnnassashsajjhbdhjjjjjjjjjnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhgadadbnsadmnvmnmaaaaaaajjjjjjjjjjjjjjjjjjjjjjjjjjjkl");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Menanyakan apakah komputer dapat berpikir sama seperti menanyakan apakah kapal selam dapat berenang.");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegActiveNama(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("<Semangat 'n");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Hallo");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
	public void tambahDataTestimonialNegNoActiveNama(String rate){
		Utils.delay(3, strDelay);
		File myFile = new File(lokasiFileGambarTambahNegNoAct);
		uploadFile(myFile);
		Utils.delay(3, strDelay);
		this.nama.sendKeys("/n ini kurang dari <");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText("No Active");
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Selamat datang");
		Utils.delay(3, strDelay);
//		selRating.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(selRating)).click();
		
		Integer intRate = Integer.parseInt(rate);
		pilihRating(intRate);
		Utils.delay(3, strDelay);
	}
	
//	=====================
//	MENGEDIT DATA
//	=====================

	public void editClickDataPertama() {
//		this.editPertama.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(editPertama)).click();
	}
	
		public void editNamaPeserta() {
			editNamaPeserta.clear();
			this.editNamaPeserta.sendKeys("Aliando Syarif");
			Utils.delay(2, strDelay);
		}
		
		public void editIsiTesti() {
			isiTesti.clear();
			this.isiTesti.sendKeys("Fasilitas di JuaraCoding sangat lengkap dari internet yang cepat");
			Utils.delay(2, strDelay);
		}
		
		public void editGambar() {
//			uploadUlang.click();
			new WebDriverWait(driver, Duration.ofSeconds(15))
			.until(ExpectedConditions.visibilityOf(uploadUlang)).click();
			File myFile = new File(lokasiFileGambarEdit);
			uploadUlangAction(myFile);
			Utils.delay(3, strDelay);
		}
		
		public void editActNoAct() {
			Utils.delay(3, strDelay);
			Select selPublish = new Select(this.selPublish);
			selPublish.selectByVisibleText("No Active");
		}
		
		public void editNoActAct() {
			Utils.delay(3, strDelay);
			Select selPublish = new Select(this.selPublish);
			selPublish.selectByVisibleText("Active");
		}
		
		public void editRatingNol() {
			Utils.delay(3, strDelay);
			Select selRating = new Select(this.selRating);
			selRating.selectByVisibleText("0");
			}
		
		public void editRatingSatu() {
			Utils.delay(3, strDelay);
			Select selRating = new Select(this.selRating);
			selRating.selectByVisibleText("1");
			}
		
		public void editRatingDua() {
			Utils.delay(3, strDelay);
			Select selRating = new Select(this.selRating);
			selRating.selectByVisibleText("2");
			}
		
		public void editRatingTiga() {
			Utils.delay(3, strDelay);
			Select selRating = new Select(this.selRating);
			selRating.selectByVisibleText("3");
			}
		
		public void editRatingEmpat() {
			Utils.delay(3, strDelay);
			Select selRating = new Select(this.selRating);
			selRating.selectByVisibleText("4");
			}
		
		public void editRatingLima() {
			Utils.delay(3, strDelay);
			Select selRating = new Select(this.selRating);
			selRating.selectByVisibleText("5");
			}
		
		public void uploadUlangAction(File fileInput) {
			// creating object of Robot class
		    Robot rb;
		    String lokasiFile = fileInput.getAbsolutePath();
			try {
				rb = new Robot();
			    // copying File path to Clipboard
			    StringSelection str = new StringSelection(lokasiFile);
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			 
			     // press Contol+V for pasting
			     rb.keyPress(KeyEvent.VK_CONTROL);
			     rb.keyPress(KeyEvent.VK_V);
			 
			    // release Contol+V for pasting
			    rb.keyRelease(KeyEvent.VK_CONTROL);
			    rb.keyRelease(KeyEvent.VK_V);
			 
			    // for pressing and releasing Enter
			    rb.keyPress(KeyEvent.VK_ENTER);
			    rb.keyRelease(KeyEvent.VK_ENTER);

			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		=====================
//		MENGEDIT DATA NEGATIF
//		=====================
		public void editTestimonialNegativeNama(){
			Utils.delay(3, strDelay);
			editNamaPeserta.clear();
			this.nama.sendKeys("<Kamu>");
		}
		
		public void editTestimonialNegativeActiveNoActive(){
			Utils.delay(3, strDelay);
			editNamaPeserta.clear();
			this.editNamaPeserta.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Utils.delay(3, strDelay);
			Select selPublish = new Select(this.selPublish);
			selPublish.selectByVisibleText("No Active");
			}
		
		public void editTestimonialNegativeNoActiveActive(){
			Utils.delay(3, strDelay);
			editNamaPeserta.clear();
			this.editNamaPeserta.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBBbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			Utils.delay(3, strDelay);
			Select selPublish = new Select(this.selPublish);
			selPublish.selectByVisibleText("Active");
			}
		
//		=====================
//		MENCARI DATA
//		=====================
		
		public void searchNamaPeserta() {
			this.fieldSearch.sendKeys("Nadin");
			Utils.delay(3, strDelay);
		}
		
//		=====================
//	   	MENCARI DATA NEGATIVE
//		=====================
		
		public void searchNamaPesertaNeg() {
			this.fieldSearch.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBBbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			Utils.delay(2, strDelay);
		}
		
		public void searchIsiTestiNeg() {
			this.fieldSearch.sendKeys("JuaraCoding");
			Utils.delay(2, strDelay);
		}
		
//		=====================
//		MENCARI DAN EDIT DATA
//		=====================

		public void searchEditNamaPeserta() {
			this.fieldSearch.sendKeys("Ahmad Saifur");
			Utils.delay(2, strDelay);
		}
		
		public void searchEditNamaPesertaDua() {
			this.fieldSearch.sendKeys("Raisa");
			Utils.delay(2, strDelay);
		}
		
		public void editClickDataSearch() {
//			this.editPertama.click();
			new WebDriverWait(driver, Duration.ofSeconds(15))
			.until(ExpectedConditions.visibilityOf(editPertama)).click();
		}
		
		public void editGambarSearch() {
//			uploadUlang.click();
			new WebDriverWait(driver, Duration.ofSeconds(15))
			.until(ExpectedConditions.visibilityOf(uploadUlang)).click();
			File myFile = new File(lokasiFileGambarSearch);
			uploadUlangActionSearch(myFile);
			Utils.delay(3, strDelay);
		}
		
		public void uploadUlangActionSearch(File fileInput) {
			// creating object of Robot class
		    Robot rb;
		    String lokasiFile = fileInput.getAbsolutePath();
			try {
				rb = new Robot();
			    // copying File path to Clipboard
			    StringSelection str = new StringSelection(lokasiFile);
			    System.out.println(str+" ini dari upload search ganti");
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			    Utils.delay(3, strDelay);
			    
			     // press Contol+V for pasting
			     rb.keyPress(KeyEvent.VK_CONTROL);
			     rb.keyPress(KeyEvent.VK_V);
			 
			    // release Contol+V for pasting
			    rb.keyRelease(KeyEvent.VK_CONTROL);
			    rb.keyRelease(KeyEvent.VK_V);
			 
			    // for pressing and releasing Enter
			    rb.keyPress(KeyEvent.VK_ENTER);
			    rb.keyRelease(KeyEvent.VK_ENTER);

			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void editNamaPesertaSearch() {
			editNamaPeserta.clear();
			this.editNamaPeserta.sendKeys("Angga Yunanda");
			Utils.delay(2, strDelay);
		}
		
		public void editIsiTestiSearch() {
			isiTesti.clear();
			this.isiTesti.sendKeys("JuaraCoding menambah pengetahuan tentang kepemahaman di dunia pemrogramman");
			Utils.delay(2, strDelay);
		}
		
		public void editActNoActSearch() {
			Utils.delay(3, strDelay);
			Select selPublish = new Select(this.selPublish);
			selPublish.selectByVisibleText("No Active");
		}
		
		public void editNoActActSearch() {
			Utils.delay(3, strDelay);
			Select selPublish = new Select(this.selPublish);
			selPublish.selectByVisibleText("Active");
		}
		
		public void clickField() {
			Utils.fullScroll();;
			Utils.delay(1, strDelay);
//			this.fieldSearch.click();
			new WebDriverWait(driver, Duration.ofSeconds(15))
			.until(ExpectedConditions.visibilityOf(fieldSearch)).click();
		}
		
		public void tekanEnter() {
			Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void goToHome() {
//		this.btnHome.click();
			new WebDriverWait(driver, Duration.ofSeconds(15))
			.until(ExpectedConditions.visibilityOf(btnHome)).click();
		}
	
		public void goToTestimonial() {
//		this.btnTestimonial.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(btnTestimonial)).click();
		}
		
		public void goToTambahTesti() {
//		this.btnTambahhTestimonial.click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOf(btnTambahhTestimonial)).click();
		}
		
		public void clickSimpan() {
			Utils.fullScroll();;
			Utils.delay(1, strDelay);
//			this.btnSubmit.click();
			new WebDriverWait(driver, Duration.ofSeconds(15))
			.until(ExpectedConditions.visibilityOf(btnSubmit)).click();
		}
		
		public String getTxtTestimonial() {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(txtLaman)).getText();
		}
		
		public String getTxtIsi() {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtIsi)).getText();
			}
		
		public String getTxtSearch() {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtTotal)).getText();
			}
		
		public String getTxtNama() {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtNamaSalah)).getText();
			}
		
		public String getTxtIsiKosong() {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtIsiKosong)).getText();
			}
		
		public String getTxtNamaKosong() {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtNamaKosong)).getText();
			}
		
		public String getTxtNamaKarSalah() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement btn = driver.findElement(By.xpath("//input[@value='Pilih Gambar Ulang']"));
			js.executeScript("arguments[0].scrollIntoView();", btn);
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtNamaKarSalah)).getText();
			}
		
		public String getTxtSearchKosong() {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtSearchKosong)).getText();
			}
		
//		hapus kolom edit (steril)
		public void clearField() {
		try {
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
		
		
	
	
//	driver.get("https://dev.ptdika.com/web_jc_v2/index.php/admin#");
//    driver.findElement(By.linkText("Home")).click();
//    driver.findElement(By.linkText("Testimonial")).click();
//    driver.findElement(By.linkText("Tambahh")).click();
//    driver.findElement(By.name("uploadedFile")).click();
//    driver.findElement(By.name("uploadedFile")).clear();
//    driver.findElement(By.name("uploadedFile")).sendKeys("C:\\fakepath\\shutterstock.jpeg");
//    driver.findElement(By.name("nama")).click();
//    driver.findElement(By.name("nama")).clear();
//    driver.findElement(By.name("nama")).sendKeys("Siapa");
//    driver.findElement(By.id("exampleFormControlSelect9")).click();
//    driver.findElement(By.xpath("//option[@value='1']")).click();
//    driver.findElement(By.name("body")).click();
//    driver.findElement(By.name("body")).clear();
//    driver.findElement(By.name("body")).sendKeys("Sangat bagus");
//    driver.findElement(By.id("rating")).click();
//    new Select(driver.findElement(By.id("rating"))).selectByVisibleText("2");
//    driver.findElement(By.xpath("//option[@value='2']")).click();
//    driver.findElement(By.name("mysubmit")).click();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div[2]/div/div/div/div")).click();
	
	
}
