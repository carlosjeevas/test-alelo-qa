package steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.model.HomeModel;
import runner.TestRule;
import utils.ReporterUtils;

public class BuscarCepSteps {

	private static HomeModel home = new HomeModel(TestRule.getDriver());
	
	@When("Insiro o valor (.*)")
	public void insiro_o_cep(String valor) throws Exception {
		home.inserirValor(valor);
	}

	@When("Seleciono o tipo de busca (.*)")
	public void seleciono_o_tipo_de_busca(String tipoDeBusca) throws Exception {
		home.selecionaTipoBusca(tipoDeBusca.toUpperCase());
	}

	@When("Clico em buscar")
	public void clico_em_buscar() throws Exception {
		home.btnBuscar();
	}

	@Then("Devo visualizar as informações buscadas")
	public void devo_visualizar_as_informações_do_CEP_buscado() throws Exception {
		ReporterUtils.logPrint("Resultado da busca");
		Assert.assertEquals(true, home.existsDadosEncontrados());
	}

	@Then("Exibir o resultado da busca")
	public void exibir_o_resultado_da_busca() throws Exception {
		home.gravarDadosEncontrados(true);
	}
}