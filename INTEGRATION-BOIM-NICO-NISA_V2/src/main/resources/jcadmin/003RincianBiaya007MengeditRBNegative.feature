Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya edit negative
		And Admin klik tombol edit rincian biaya pertama edit negatiiff
		        
 Scenario Outline: Mengosongkan <field> di data pertama rincian biaya
  When <kode> Admin mengedit <field> dengan <nilai kosong>, 
  And <kode> Admin menekan tombol simpan edit field kosong
  Then <kode> Admin mengedit nama program THEN kosong <field>
  Examples:
  |kode|field|nilai kosong|
  |RI004N|nama program||
  |RI005N|harga normal||
  |RI006N|diskon||
  |RI007N|keunggulan1||
  |RI008N|keunggulan2||
  |RI009N|keunggulan3||
  |RI010N|keunggulan4||
  |RI011N|keunggulan5||