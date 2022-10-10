Feature: Login Valid

  Background: BG login
    When Admin membuka browser JC
#1
  Scenario: User valid login Outlinee
    When LO001P Admin input valid username dan password
    And LO001P Admin klik button simpan
    Then LO001P Admin berhasil login
#1
  Scenario: User valid login uppercase user Outlinee
    When LO002P Admin input username dan password upper user
    And LO002P Admin klik button simpan upper user
    Then LO002P Admin berhasil login upper user
#1
  Scenario: User valid login uppercase email Outlinee
    When LO003P Admin input username dan password upper email
    And LO003P Admin klik button simpan upper email
    Then LO003P Admin berhasil login upper email
#1
  Scenario: User valid login uppercase Outlinee
    When LO004P Admin input username dan password upper
    And LO004P Admin klik button simpan upper
    Then LO004P Admin berhasil login upper
#1
  Scenario: User valid login upperlower case user Outlinee
    When LO005P Admin input username dan password uplow user
    And LO005P Admin klik button simpan uplow user
    Then LO005P Admin berhasil login uplow user
#1
  Scenario: User valid login upperlower case email Outlinee
    When LO006P Admin input username dan password uplow email
    And LO006P Admin klik button simpan uplow email
    Then LO006P Admin berhasil login uplow email
#1
  Scenario: User valid login upperlower case Outlinee
    When LO007P Admin input username dan password uplow
    And LO007P Admin klik button simpan uplow
    Then LO007P Admin berhasil login uplow
