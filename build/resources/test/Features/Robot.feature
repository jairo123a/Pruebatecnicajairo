Feature: Ingresar al sitio web  y realizar dos automatizaciones
  @regresion

  @caso1
  Scenario: Ingresar al sitio web y verificar un pdf
    Given ingresar al sitio web
    When  buscar el pdf para objetos extraviados
    Then  verificar el pdf tecto"politicas-objetos-extraviados.pdf"

  @caso2
  Scenario: ingresar al sitio web y verificar en la pestaña quienes somos el texto historia
    Given Ingresar al sitio web
    When  Buscar la pestaña quienes somos
    Then  Verificar que aparezca la historia en quienes somos Respuesta"Historia"