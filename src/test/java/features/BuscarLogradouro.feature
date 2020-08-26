Feature: Buscar CEP
  Como usuário
  Quero pesquisar um CEP no site dos Correios
  Para verificar as informações do local

  Scenario Outline: Pesquisar um logradouro
    Given Que estou na página de busca
    When Insiro o valor <Valor da busca>
    And Seleciono o tipo de busca <Tipo de busca>
    And Clico em buscar
    Then Devo visualizar as informações buscadas
    And Gravar o resultado da busca em um arquivo

    Examples: 
      | Valor da busca       | Tipo de busca |
      | Rua Martim Francisco | Logradouro    |
