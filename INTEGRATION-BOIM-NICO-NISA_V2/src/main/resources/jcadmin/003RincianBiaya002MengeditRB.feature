Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya edit
		And Admin klik tombol edit rincian biaya pertama edit
		        
 Scenario: Mengedit nama program positive di data pertama
  When RI010P Admin melakukan edit nama program positive dengan <nama program>
  And RI010P Admin menekan tombol simpan edit nama program
  Then RI010P Admin melakukan edit nama program THEN <nama program>
  Examples:
  |nama program|
  |Pemrograman cucumber baru|
  
 Scenario: Mengedit harga awal positive di data pertama
  When RI011P Admin melakukan edit harga awal positive dengan <harga awal>
  And RI011P Admin menekan tombol simpan edit harga awal 
  Then RI011P Admin melakukan edit harga awal THEN <harga awal>
 Examples:
 |harga awal|
 |50000|
 
  Scenario: Mengedit diskon positive di data pertama
  When RI012P Admin melakukan edit diskon positive dengan <diskon>
  And RI012P Admin menekan tombol simpan edit diskon
  Then RI012P Admin melakukan edit diskon THEN <diskon>
  Examples:
  |diskon|
  |30|
  
  Scenario: Mengedit keunggulan1 positive di data pertama
  When RI013P Admin melakukan edit keunggulan1 positive dengan <keunggulan1>
  And RI013P Admin menekan tombol simpan edit keunggulan1
  Then RI013P Admin melakukan edit keunggulan1 THEN <keunggulan1>
  Examples:
  |keunggulan1|
  |dapat link kerja satu|
  
    Scenario: Mengedit keunggulan2 positive di data pertama
  When RI013P Admin melakukan edit keunggulan2 positive dengan <keunggulan2>
  And RI013P Admin menekan tombol simpan edit keunggulan2
  Then RI013P Admin melakukan edit keunggulan2 THEN <keunggulan2>
  Examples:
  |keunggulan2|
  |trainer hebat dua|
  
    Scenario: Mengedit keunggulan3 positive di data pertama
  When RI013P Admin melakukan edit keunggulan3 positive dengan <keunggulan3>
  And RI013P Admin menekan tombol simpan edit keunggulan3
  Then RI013P Admin melakukan edit keunggulan3 THEN <keunggulan3>
  Examples:
  |keunggulan3|
  |trainer berpengalaman tiga|
  
    Scenario: Mengedit keunggulan4 positive di data pertama
  When RI013P Admin melakukan edit keunggulan4 positive dengan <keunggulan4>
  And RI013P Admin menekan tombol simpan edit keunggulan4
  Then RI013P Admin melakukan edit keunggulan4 THEN <keunggulan4>
  Examples:
  |keunggulan4|
  |materi berkualitas empat|
  
    Scenario: Mengedit keunggulan5 positive di data pertama
  When RI013P Admin melakukan edit keunggulan5 positive dengan <keunggulan5>
  And RI013P Admin menekan tombol simpan edit keunggulan5
  Then RI013P Admin melakukan edit keunggulan5 THEN <keunggulan5>
  Examples:
  |keunggulan5|
  |materi lengkap lima|
