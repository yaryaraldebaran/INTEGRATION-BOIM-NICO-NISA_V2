Feature: Search Testimonial Negative

  Background: Background login search negative
    When Admin login dan membuka halaman testimonials search negative

  Scenario: Mencari nama peserta dengan karakter
    When TE052N Admin mengetikkan jumlah karakter nama peserta yang dicari
    And TE052N Admin menekan enter untuk melakukan pencarian data
    Then TE052N Data tidak ditemukan

  Scenario: Mencari isi testimonial peserta
    When TE053N Admin mengetikkan jumlah isi testimonial yang dicari
    And TE053N Admin enter keyboard untuk pencarian data
    Then TE053N Data isi testimonial tidak ditemukan
