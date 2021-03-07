#Author Name: Igor Veras da Silva
#Author E-mail: vrs.igor@gmail.com
#Tecnologies: Junit, Cucumber, Robot, Action, SOLID, Page Objects, WebDriverChrome, Selenium, Maven, Git and Java.
#enjoy

Feature: 
  Preencher formulario de teste no site do tricentis

  Scenario: Preencher formulario tricentis
    Given eu acesse o site do formulario
    When preencher o formulario das infos do veiculos
    And preencher o formulario do seguro
    And preencher infos do produto
    And selecionar um valor
    Then conseguirei enviar o pedido de cotacao