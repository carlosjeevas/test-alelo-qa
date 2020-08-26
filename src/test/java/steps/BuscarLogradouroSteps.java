package steps;

import io.cucumber.java.en.Then;
import page_object.model.HomeModel;
import runner.TestRule;

public class BuscarLogradouroSteps {

	private static HomeModel home = new HomeModel(TestRule.getDriver());

	@Then("Gravar o resultado da busca em um arquivo")
	public void gravar_o_resultado_da_busca_em_um_arquivo() throws Exception {
		home.gravarDadosEncontrados(false);
	}
}