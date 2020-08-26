Feature: Buscar CEP
  Como usuário
  Quero pesquisar o CEP no site dos Correios
  Para verificar as informações do local

  Scenario Outline: Pesquisar um CEP
    Given Que estou na página de busca
    When Insiro o valor <Valor da busca>
    And Seleciono o tipo de busca <Tipo de busca>
    And Clico em buscar
    Then Devo visualizar as informações buscadas
    And Exibir o resultado da busca

    Examples: 
      | Valor da busca | Tipo de busca |
      |       01226000 | Logradouro    |
