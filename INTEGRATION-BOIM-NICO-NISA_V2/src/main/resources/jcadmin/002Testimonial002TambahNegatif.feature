Feature: Tambah Testimonial Negative
	Background: Background login tambah negative
		Given Admin login dan open page testimonial tambah negative
		When 	Admin klik tombol tambah testimonial tambah negative

		Scenario Outline: Menambah daftar negative testimonial active
    When  <kode test case> Admin mengisi form negative dengan rating <angka rating> active
    And <kode test case> Admin menekan tombol simpan testimonial active negative
    Then <kode test case> Admin menambah testimonial active invalid negative
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE001N |
   	| 1 | TE002N |
   	| 2 | TE003N |
   	| 3 | TE004N |
   	| 4 | TE005N |
   	| 5 | TE006N |
   	
   	Scenario Outline: Menambah daftar negative testimonial no active
    When  <kode test case> Admin mengisi form tambah negative dengan rating <angka rating> publish no active
    And <kode test case> Admin menekan tombol simpan testimonial publish no active negative
    Then <kode test case> Admin menambah testimonial publish no active invalid negative
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE007N |
   	| 1 | TE008N |
   	| 2 | TE009N |
   	| 3 | TE010N |
   	| 4 | TE011N |
   	| 5 | TE012N |
   	
   	Scenario Outline: Menambah daftar negative testimonial kosong isi active
    When  <kode test case> Admin isi form negative dengan rating <angka rating> active kosong isi
    And <kode test case> Admin klik tombol simpan testimonial active negative kosong isi
    Then <kode test case> Admin tambah testimonial active invalid negative kosong isi
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE013N |
   	| 1 | TE014N |
   	| 2 | TE015N |
   	| 3 | TE016N |
   	| 4 | TE017N |
   	| 5 | TE018N |
   	
   	Scenario Outline: Menambah daftar negative testimonial kosong isi no active
    When  <kode test case> Admin isi form negative rating <angka rating> no active kosong isi testi
    And <kode test case> Admin klik tombol simpan testimonial no active negative kosong isi testi
    Then <kode test case> Admin tambah testimonial no active invalid negative kosong isi testi
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE019N |
   	| 1 | TE020N |
   	| 2 | TE021N |
   	| 3 | TE022N |
   	| 4 | TE023N |
   	| 5 | TE024N |
   	
   	Scenario Outline: Menambah daftar negative testimonial panjang karakter active
    When  <kode test case> Admin mengisi negative form dengan rating <angka rating> active panjang karakter
    And <kode test case> Admin pencet tombol simpan testimonial active negative panjang karakter
    Then <kode test case> Admin menambah data testimonial active invalid negative panjang karakter
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE025N |
   	| 1 | TE026N |
   	| 2 | TE027N |
   	| 3 | TE028N |
   	| 4 | TE029N |
   	| 5 | TE030N |
   	
   	Scenario Outline: Menambah data negative testimonial karakter no active
    When  <kode test case> Admin mengisi form dengan rating <angka rating> publish no active karakter
    And <kode test case> Admin pencet tombol simpan negatif testimonial publish no active karakter
    Then <kode test case> Admin add data negatif testimonial no active invalid karakter
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE031N |
   	| 1 | TE032N |
   	| 2 | TE033N |
   	| 3 | TE034N |
   	| 4 | TE035N |
   	| 5 | TE036N |
   	
   	Scenario Outline: Menambah daftar negative testimonial nama kecuali active
    When  <kode test case> Admin isi negative tambah dengan rating <angka rating> active nama kecuali
    And <kode test case> Admin click button simpan testimonial active negative nama kecuali
    Then <kode test case> Admin add negative testimonial active invalid nama kecuali
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE037N |
   	| 1 | TE038N |
   	| 2 | TE039N |
   	| 3 | TE040N |
   	| 4 | TE041N |
   	| 5 | TE042N |
   	
   	Scenario Outline: Menambah daftar negative testimonial nama char no active
    When  <kode test case> Admin isi negative data tambah dengan rating <angka rating> no active nama char
    And <kode test case> Admin click tombol simpan testimonial active negative nama char
    Then <kode test case> Admin add testimonial negative no active invalid nama char
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE043N |
   	| 1 | TE044N |
   	| 2 | TE045N |
   	| 3 | TE046N |
   	| 4 | TE047N |
   	| 5 | TE048N |