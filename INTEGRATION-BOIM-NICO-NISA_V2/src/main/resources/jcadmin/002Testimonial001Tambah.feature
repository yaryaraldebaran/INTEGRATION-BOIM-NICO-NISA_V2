Feature: Tambah Testimonial   
	Background: Background login tambah
		Given Admin login dan membuka halaman testimonials tambah
		When 	Admin klik tombol tambah testimonial tambah

  Scenario Outline: Menambah daftar testimonial active
    When  <kode test case> Admin mengisi form dengan rating <angka rating> active
    And <kode test case> Admin menekan tombol simpan testimonial active
    Then <kode test case> Admin menambah testimonial active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE005P |
   	| 1 | TE006P |
   	| 2 | TE007P |
   	| 3 | TE008P |
   	| 4 | TE009P |
   	| 5 | TE010P |
   	
   	Scenario Outline: Menambah daftar testimonial noactive
    When  <kode test case> Admin mengisi form dengan rating <angka rating> noactive
    And <kode test case> Admin menekan tombol simpan testimonial no active
    Then <kode test case> Admin menambah testimonial noactive valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE011P |
   	| 1 | TE012P |
   	| 2 | TE013P |
   	| 3 | TE014P |
   	| 4 | TE015P |
   	| 5 | TE016P |
   	
   	Scenario Outline: Menambah daftar testimonial active format gambar
    When  <kode test case> Admin mengisi format gambar dengan rating <angka rating> active
    And <kode test case> Admin menekan tombol simpan testimonial format gambar active
    Then <kode test case> Admin menambah testimonial format gambar active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE017P |
   	| 1 | TE018P |
   	| 2 | TE019P |
   	| 3 | TE020P |
   	| 4 | TE021P |
   	| 5 | TE022P |
   	
   	Scenario Outline: Menambah testimonial no active format gambar
    When  <kode test case> Admin tambah format gambar dengan rating <angka rating> no active
    And <kode test case> Admin klik tombol simpan testimonial format gambar no active
    Then <kode test case> Admin tambah testimonial format gambar no active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE023P |
   	| 1 | TE024P |
   	| 2 | TE025P |
   	| 3 | TE026P |
   	| 4 | TE027P |
   	| 5 | TE028P |
   	
   	Scenario Outline: Menambah testi active karakter beda
    When  <kode test case> Admin tambah isi karakter beda dengan rating <angka rating> active
    And <kode test case> Admin klik tombol simpan testimonial karakter beda active
    Then <kode test case> Admin tambah testimonial karakter beda active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE029P |
   	| 1 | TE030P |
   	| 2 | TE031P |
   	| 3 | TE032P |
   	| 4 | TE033P |
   	| 5 | TE034P |
   	
   	Scenario Outline: Menambah testi no active format karakter beda
    When  <kode test case> Admin menambah isi format karakter beda dengan rating <angka rating> no active
    And <kode test case> Admin menekan button simpan testimonial karakter beda no active
    Then <kode test case> Admin menambah testimonial karakter beda no active invalid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE035P |
   	| 1 | TE036P |
   	| 2 | TE037P |
   	| 3 | TE038P |
   	| 4 | TE039P |
   	| 5 | TE040P |