package page_object.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import page_object.HomePO;
import page_object.enums.TipoBusca;
import selenium.page_object.BaseWebPage;
import utils.GerarArquivo;

public class HomeModel extends BaseWebPage {

	Actions actions = new Actions(webDriver);
	private HomePO home;

	public HomeModel(WebDriver webDriver) {
		super(webDriver);
		home = new HomePO(webDriver);
	}

	@Override
	public boolean isDisplayed() {
		return false;
	}

	/**
	 * Insere o CEP
	 * 
	 * @author Carlos Moreira
	 * @param cep
	 * @throws Exception
	 */
	public void inserirCep(String cep) throws Exception {
		command.send(home.inputBuscarCep(), cep);
	}

	/**
	 * Clica no botão de busca
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void btnBuscar() throws Exception {
		command.click(home.btnBuscar());
	}

	/**
	 * Seleciona a opção do tipo de busca
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void selecionaTipoBusca(String tipo) throws Exception {
		command.click(home.cxTipoBusca());
		command.click(home.tipoBusca(TipoBusca.valueOf(tipo)));
	}

	/**
	 * Verifica a existência da mensagem de sucesso ao buscar
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public boolean existsDadosEncontrados() throws Exception {
		WebElement msgSucesso = home.msgDadosEncontrados();
		return msgSucesso.getText().equals("DADOS ENCONTRADOS COM SUCESSO.");
	}

	/**
	 * Verifica a existência da página de busca de CEP
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public boolean validarPagina() throws Exception {
		WebElement spanBuscaCep = home.spanBuscaCep();
		return spanBuscaCep.getText().equals("Busca CEP - Endereço");

	}

	/**
	 * Grava os resultados da busca em um arquivo CSV
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void gravarDadosEncontrados() throws Exception {
		
		List<WebElement> logradouro = home.logradouro();
		List<WebElement> bairro = home.bairro();
		List<WebElement> localidade = home.localidade();
		List<WebElement> cep = home.cep();
		
		List<String> logradouroAux = new ArrayList<String>();
		List<String> bairroAux = new ArrayList<String>();
		List<String> localidadeAux = new ArrayList<String>();
		List<String> cepAux = new ArrayList<String>();
		
		for (WebElement linhaLogradouro : logradouro) {
			logradouroAux.add(linhaLogradouro.getText());
		}
		
		for (WebElement linhaBairro : bairro) {
			bairroAux.add(linhaBairro.getText());
		}
		
		for (WebElement linhaLocalidade : localidade) {
			localidadeAux.add(linhaLocalidade.getText());
		}
		
		for (WebElement linhaCep : cep) {
			cepAux.add(linhaCep.getText());
		}
		GerarArquivo.gerarArquivo(logradouroAux, bairroAux, localidadeAux, cepAux);
	}
}