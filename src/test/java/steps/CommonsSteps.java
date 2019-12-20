package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.model.HomeModel;
import runner.TestRule;

public class CommonsSteps {

	private static HomeModel home = new HomeModel(TestRule.getDriver());
	
	@Given("Que estou na página de busca de CEP")
	public void que_estou_na_página_de_busca_de_CEP() throws Exception {
		Assert.assertEquals(true, home.validarPagina());
	}
}