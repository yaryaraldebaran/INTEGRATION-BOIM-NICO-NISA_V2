Feature: Rincian Biaya
 Scenario Outline: Mencari <opsi search> di form pencarian data
 When Admin login dan membuka halaman rincian biaya search negative
  When <kode> Admin memilih <opsi search> dengan <keyword search>, <nama program>, <harga>, <diskon>, <harga diskon>
  Then <kode> Admin mendapat data search
  Examples:
  |kode |opsi search	 |keyword search|nama program|harga|diskon				|harga diskon|
  |RI012|nama program  |harga				  |						 |50000|							|			|
  |RI013|nama program  |diskon			  |						 |		 |40						|			|
  |RI014|nama program  |harga diskon  |						 |		 |							|50000|
  |RI015|harga				 |nama program  |pemrograman |		 |							|			|
  |RI016|harga			   |diskon			  |						 |		 |	80					|			|
  |RI017|harga				 |harga diskon  |						 |		 |							|50		|
  |RI018|diskon	       |nama program  |pemrograman |		 |							|			|
  |RI019|diskon			   |harga				  |						 |50	 |							|			|
  |RI020|diskon	       |harga diskon  |						 |		 |							|5000 |
  |RI021|harga diskon  |nama program  |pemrograman |		 |							|			|
  |RI022|harga diskon  |harga				  |						 |500	 |							|			|
  |RI023|harga diskon  |diskon			  |						 |		 |40						|			|