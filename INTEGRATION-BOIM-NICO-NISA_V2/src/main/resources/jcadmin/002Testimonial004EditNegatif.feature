Feature: Edit Testimonial Negatif

  Background: Background login tambah negative
    When Admin login dan open page testimonials edit negative
    And Admin click button edit testimonial data pertama
    
    Scenario: Mengedit nama peserta dengan karakter dikecualikan pada data pertama
    When TE049N Admin edit field nama dengan karakter
    And TE049N Admin click button simpan edit nama peserta
    Then TE049N Admin tidak berhasil mengedit nama

  Scenario Outline: Mengedit nama peserta full di data pertama
    When <kode test case> Admin edit full nama peserta publish <publish> data pertama
    And <kode test case> Admin klik tombol simpan edit full nama peserta
    Then <kode test case> Admin berhasil edit full nama peserta

    Examples: 
      | publish   | kode test case |
      | active    | TE050N         |
      | no active | TE051N         |
