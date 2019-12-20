package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.model.HomeModel;
import runner.TestRule;

public class BuscarCepSteps {

	private static HomeModel home = new HomeModel(TestRule.getDriver());
	
	@When("Insiro o CEP")
	public void insiro_o_CEP() throws Exception {
		home.inserirCep("Albuquerque Lins");
	}

	@When("Clico em buscar")
	public void clico_em_buscar() throws Exception {
		home.selecionaTipoBusca("LOGRADOURO");
		home.btnBuscar();
	}

	@Then("Devo visualizar as informações do CEP buscado")
	public void devo_visualizar_as_informações_do_CEP_buscado() throws Exception {
		Assert.assertEquals(true, home.existsDadosEncontrados());
	}

	@Then("Gravar os dados buscados em uma planilha")
	public void gravar_os_dados_buscados_em_uma_planilha() throws Exception {
		home.gravarDadosEncontrados();
	}
}