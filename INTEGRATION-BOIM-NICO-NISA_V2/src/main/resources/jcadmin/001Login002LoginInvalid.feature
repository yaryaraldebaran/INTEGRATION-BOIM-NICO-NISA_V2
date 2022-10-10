Feature: Login Invalid

  Background: BG login
    When Admin membuka browser JCAdmin

  Scenario: Admin invalid login simpan
    When LO001N Admin klik button simpan
    Then LO001N Admin gagal login simpan

  Scenario: Admin invalid login klik submit
    When LO002N Admin klik username dan password
    And LO002N Admin klik button simpan klik
    Then LO002N Admin gagal login klik submit

  Scenario: Admin invalid login input username
    When LO003N Admin input username
    And LO003N Admin klik button simpan input uname
    Then LO003N Admin gagal login input uname

  Scenario: Admin invalid login input password
    When LO004N Admin input password
    And LO004N Admin klik button simpan input pass
    Then LO004N Admin gagal login input pass

  Scenario: Admin invalid login input password uppercase
    When LO005N Admin input username dan password upper
    And LO005N Admin klik button simpan input pass upper
    Then LO005N Admin gagal login input pass upper

  Scenario: Admin invalid login upper
    When LO006N Admin input upper username dan password
    And LO006N Admin klik button simpan upper
    Then LO006N Admin gagal login upper

  Scenario: Admin invalid login input spasi
    When LO007N Admin input username dan password spasi
    And LO007N Admin klik button simpan spasi
    Then LO007N Admin gagal login input spasi

  Scenario: Admin invalid login user tanpa format email
    When LO008N Admin input username dan password tanpa format
    And LO008N Admin klik button simpan tanpa format
    Then LO008N Admin gagal login tanpa format
