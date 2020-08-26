$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/BuscarLogradouro.feature");
formatter.feature({
  "name": "Buscar CEP",
  "description": "  Como usuário\n  Quero pesquisar um CEP no site dos Correios\n  Para verificar as informações do local",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Pesquisar um logradouro",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Que estou na página de busca",
  "keyword": "Given "
});
formatter.step({
  "name": "Insiro o valor \u003cValor da busca\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Seleciono o tipo de busca \u003cTipo de busca\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Clico em buscar",
  "keyword": "And "
});
formatter.step({
  "name": "Devo visualizar as informações buscadas",
  "keyword": "Then "
});
formatter.step({
  "name": "Gravar o resultado da busca em um arquivo",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Valor da busca",
        "Tipo de busca"
      ]
    },
    {
      "cells": [
        "Rua Martim Francisco",
        "Logradouro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Pesquisar um logradouro",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Que estou na página de busca",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonsSteps.que_estou_na_página_de_busca_de_CEP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insiro o valor Rua Martim Francisco",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarCepSteps.insiro_o_cep(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seleciono o tipo de busca Logradouro",
  "keyword": "And "
});
formatter.match({
  "location": "BuscarCepSteps.seleciono_o_tipo_de_busca(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clico em buscar",
  "keyword": "And "
});
formatter.match({
  "location": "BuscarCepSteps.clico_em_buscar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Devo visualizar as informações buscadas",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarCepSteps.devo_visualizar_as_informações_do_CEP_buscado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Gravar o resultado da busca em um arquivo",
  "keyword": "And "
});
formatter.match({
  "location": "BuscarLogradouroSteps.gravar_o_resultado_da_busca_em_um_arquivo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});