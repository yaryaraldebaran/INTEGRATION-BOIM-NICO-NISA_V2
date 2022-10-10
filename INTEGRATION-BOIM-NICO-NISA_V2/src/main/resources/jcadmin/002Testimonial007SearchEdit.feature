Feature: Search Edit Testimonial

  Background: Background login search edit
    When Admin login dan membuka halaman testimonials search edit

  Scenario: Mencari dan edit gambar
    When TE053P Admin mengetikkan nama peserta search edit
    And TE053P Admin menekan enter pada keyboard search edit
    And TE053P Data ditemukan dan admin klik data search edit
    And TE053P Admin mengedit ulang gambar peserta search edit
    And TE053P Admin menekan tombol simpan gambar search edit
    Then TE053P Admin berhasil edit gambar search edit

  Scenario: Mencari dan edit nama
    When TE054P Admin mengetikkan nama peserta search edit nama
    And TE054P Admin menekan enter pada keyboard search edit nama
    And TE054P Data ditemukan dan admin klik data search edit nama
    And TE054P Admin mengedit ulang nama peserta search edit nama
    And TE054P Admin menekan tombol simpan nama search edit nama
    Then TE054P Admin berhasil edit nama search edit nama

  Scenario: Mencari dan edit isi
    When TE055P Admin mengetikkan nama peserta search edit isi
    And TE055P Admin menekan enter pada keyboard search edit isi
    And TE055P Data ditemukan dan admin klik data search edit isi
    And TE055P Admin mengedit ulang isi testimonial search edit isi
    And TE055P Admin menekan tombol simpan search edit isi
    Then TE055P Admin berhasil edit isi search edit isi

  #|gambar|nama|isi|
  #|lokasigambar|||
  #||nama baru||
  #|||isi baru|
  Scenario Outline: Mencari dan edit publish
    When <kode test case> Admin mengetikkan nama peserta search edit publish
    And <kode test case> Admin menekan enter pada keyboard search edit publish
    And <kode test case> Data ditemukan dan admin klik data search edit publish
    And <kode test case> Admin edit ulang publish <publish> search edit
    And <kode test case> Admin menekan tombol simpan search edit publish
    Then <kode test case> Admin berhasil edit publish search edit

    Examples: 
      | publish   | kode test case |
      | active    | TE056P         |
      | no active | TE057P         |
