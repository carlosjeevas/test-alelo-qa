Feature: Buscar CEP
  Como usuário
  Quero pesquisar o CEP no site dos Correios
  Para verificar as informações do local

  Scenario: Buscar um CEP qualquer
    Given Que estou na página de busca de CEP
    When Insiro o CEP
    And Clico em buscar
    Then Devo visualizar as informações do CEP buscado