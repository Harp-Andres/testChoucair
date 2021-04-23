#Author: Andres Rodriguez Pisa
@test
Feature: Como usaurio externo
  quiero navegar en el modulo empleos y consultar las ofertas laborales.

  Background: 
    Given que requiero ingresar al sitio web
    And estando en el sitio web ingreso a el modulo empleos

  @tag1
  Scenario: Como usuario quiero verificar el ingreso al modulo de empleados
    And valido el ingreso al modulo empleos

  @tag2
  Scenario: Como usuario externo navego en el modulo de empleos
    When se requiere ver el panel superior al navegar en el modulo
    And este en la parte inferior del modulo debo poder usar el boton para regresar a la parte superior
    And el icono de Choucair debe permitir redireccionar a la pagina principal
    Then valido que luego del flujo ingrese nuevamene a empleos

  @tag3
  Scenario Outline: Como usuario externo necesito usar el buscador de empleos
    When ingresar mi ocupacion  <ocuapacion>
    And ingresar la localidad <localidad>
    And realizar busqueda
    Then valido resultados de empleos en la  busqueda

    Examples: 
      | ocuapacion            | localidad  |
      | "analista de pruebas" | "bogota"   |
      | "automatizador"       | "medellin" |
