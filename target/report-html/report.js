$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/BuscarCep.feature");
formatter.feature({
  "name": "Buscar CEP",
  "description": "  Como usuário\n  Quero pesquisar o CEP no site dos Correios\n  Para verificar as informações do local",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buscar um CEP qualquer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Que estou na página de busca de CEP",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonsSteps.que_estou_na_página_de_busca_de_CEP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insiro o CEP",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarCepSteps.insiro_o_CEP()"
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
  "name": "Devo visualizar as informações do CEP buscado",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarCepSteps.devo_visualizar_as_informações_do_CEP_buscado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});