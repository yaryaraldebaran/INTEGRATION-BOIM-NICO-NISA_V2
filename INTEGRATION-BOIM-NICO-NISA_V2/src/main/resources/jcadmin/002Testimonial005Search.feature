Feature: Search Testimonial

  Background: Background login search
    When Admin login dan membuka halaman testimonials search

  Scenario: Mencari nama peserta
    When TE052P Admin mengetikkan nama peserta
    And TE052P Admin menekan enter pada keyboard
    Then TE052P Data ditemukan
