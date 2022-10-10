Feature: List Testimonial

  Scenario: Melihat data dalam page list testimonials
    When TE001P Admin login dan membuka page list testimonials
    And TE001P Admin scroll page dan klik button halaman 
    And TE001P Admin mengetikkan nama peserta pada field search
    And TE001P Admin enter keyboard untuk mencari nama peserta
    Then TE001P Data peserta berhasil ditemukan
