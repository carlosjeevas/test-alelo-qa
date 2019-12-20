Feature: Buscar CEP
  Como usuário
  Quero pesquisar o CEP no site dos Correios
  Para verificar as informações do local

  Scenario: Buscar um CEP qualquer
    Given Que estou na página de busca de CEP
    When Insiro o Logradouro
    And Seleciono o tipo de busca
    And Clico em buscar
    Then Devo visualizar as informações do CEP buscado
    And Gravar o resultado da busca em um arquivo