Feature: Negative Login Test

  @as
  Scenario Outline: Negative Login Test Devex
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>" credentials
    Then The warning message contains "<message>"
    Examples:
      | userType                   | password          | message                                                                                                |
      | aliserdan.tester@gmail.com | a                 | Lütfen bu metni 6 karakter veya daha fazla olacak şekilde uzatın (şu anda 1 karakter kullanıyorsunuz). |
      | aliserdan.tester           | As12345.          | Lütfen e-posta adresine bir \"@\" işareti ekleyin. \"aliserdan.tester\" adresinde \"@\" eksik.               |
      | aliserdan.tester@          | As12345.          | Lütfen \"@\" işaretinden sonra gelen kısmı ekleyin. \"aliserdan.tester@\", tam bir adres değil.            |
      | aliserdan.tester@@@        | As12345.          | Başında \"@\" bulunan kısımda \"@\" simgesi bulunmamalıdır.                                                |
      | aliserdan.tester@gmail.com | As12345.srtgfdfuj | Invalid Credentials!                                                                                   |
      | aliserdan.tester@gmail     | As12345.          | Please include a valid email!                                                                          |
