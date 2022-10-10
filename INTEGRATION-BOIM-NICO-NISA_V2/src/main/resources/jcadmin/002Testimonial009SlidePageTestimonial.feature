Feature: Slide Page Testimonial

  Background: Background login slide page
    When Admin login dan membuka page testimonial slide page

  Scenario: Memindahkan halaman pertama
    When TE002P Admin scroll page dan klik button halaman pertama ke kedua
    Then TE002P Data halaman kedua berhasil ditemukan

  Scenario: Memindahkan halaman kedua
    When TE003P Admin full scroll dan klik tombol halaman satu ke ketiga
    Then TE003P Data halaman ketiga berhasil ditemukan

  Scenario: Memindahkan halaman ketiga
    When TE004P Admin scroll page full dan klik tombol halaman pertama ke next
    Then TE004P Data halaman keempat berhasil ditemukan
