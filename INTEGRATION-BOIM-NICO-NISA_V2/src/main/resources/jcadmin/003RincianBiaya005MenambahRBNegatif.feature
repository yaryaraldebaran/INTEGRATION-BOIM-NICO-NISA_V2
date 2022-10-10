Feature: Rincian Biaya   
  Scenario Outline: <kode test case> Menambah daftar RB negative invalid
    When <kode test case> Admin login dan membuka halaman rincian biaya tambah dan klik tambah untuk negatif
    And  <kode test case> Admin mengisi <field> tambah dengan <harga awal>, <diskon>, <publish>
    And <kode test case> Admin menekan tombol simpan tambah
    Then <kode test case> Admin menambah rincian biaya active valid
    
   Examples:
   	|kode test case|field|harga awal|diskon|publish|
   	|RI001N|harga awal|huruf harga|||
   	|RI002N|diskon||huruf diskon||
   	|RI003N|publish kosong||||