package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.model.HomeModel;
import runner.TestRule;

public class BuscarLogradouroSteps {

	private static HomeModel home = new HomeModel(TestRule.getDriver());

	@When("Insiro o Logradouro")
	public void insiro_o_Logradouro() throws Exception {
		home.inserirCep("Albuquerque Lins");
	}

	@When("Seleciono o tipo de busca")
	public void seleciono_o_tipo_de_busca() throws Exception {
		home.selecionaTipoBusca("LOGRADOURO");
	}

	@Then("Gravar o resultado da busca em um arquivo")
	public void gravar_o_resultado_da_busca_em_um_arquivo() throws Exception {
		home.gravarDadosEncontrados();
	}
}