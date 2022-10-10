Feature: Blog

Scenario Outline: Menggeser halaman blog
	When BL014P Admin login dan masuk ke halamn utama blog
	And BL014P Admin klik tombol halaman <noHal>
	Then BL014P Admin sudah pindah halaman
	
	Examples:
	|noHal|
	|2|
	|3|