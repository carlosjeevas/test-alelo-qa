package page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_object.enums.TipoBusca;
import selenium.page_object.BaseWebPage;

/**
 * Page Object dos Correios
 * 
 * @author Carlos Moreira
 */
public class HomePO extends BaseWebPage {

	private static By INPUT_BUSCAR_CEP = By.xpath(".//*[contains(text(),'Endereço ou CEP')]/..//input");
	private static By BTN_BUSCAR = By.xpath("//input[@value='Buscar']");
	private static By MSG_DADOS_ENCONTRADOS_COM_SUCESSO = By.xpath("//p[text()='DADOS ENCONTRADOS COM SUCESSO.']");
	private static By SPAN_BUSCA_CEP = By.xpath(".//*[text()='Busca CEP - Endereço']");
	private static By CAIXA_SELECAO_TIPO_BUSCA = By.xpath("//select[@name='tipoCEP']");
	private static By COLUNA_LOGRADOURO = By.xpath("//tr/td[1]");
	private static By COLUNA_BAIRRO = By.xpath("//tr/td[2]");
	private static By COLUNA_LOCALIDADE = By.xpath("//tr/td[3]");
	private static By COLUNA_CEP = By.xpath("//tr/td[4]");
	
	public HomePO(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public boolean isDisplayed() {
		return true;
	}

	/**
	 * Input 'Buscar CEP'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement inputBuscarCep() throws Exception {
		return searchElement.findElementBy(INPUT_BUSCAR_CEP, "Input 'Buscar CEP'");
	}

	/**
	 * Botão 'Buscar'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement btnBuscar() throws Exception {
		return searchElement.findElementBy(BTN_BUSCAR, "Botao 'Buscar'");
	}
	
	/**
	 * Mensagem 'DADOS ENCONTRADOS COM SUCESSO.'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement msgDadosEncontrados() throws Exception {
		return searchElement.findElementBy(MSG_DADOS_ENCONTRADOS_COM_SUCESSO, "Mensagem 'DADOS ENCONTRADOS COM SUCESSO.'");
	}
	
	/**
	 * Span que contem o texto 'Busca CEP - Endereço'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement spanBuscaCep() throws Exception {
		return searchElement.findElementBy(SPAN_BUSCA_CEP, "Span que contem o texto 'Busca CEP - Endereço'");
	}
	
	/**
	 * Lista com os registros da coluna 'Logradouro/Nome'
	 * 
	 * @author Carlos Moreira(Cognizant)
	 * @return
	 * @throws Exception
	 */
	public List<WebElement> logradouro() throws Exception {
		return searchElement.findElementsBy(COLUNA_LOGRADOURO, "Lista com os registros da coluna 'Logradouro/Nome'");
	}
	
	/**
	 * Lista com os registros da coluna 'Bairro/Distrito'
	 * 
	 * @author Carlos Moreira(Cognizant)
	 * @return
	 * @throws Exception
	 */
	public List<WebElement> bairro() throws Exception {
		return searchElement.findElementsBy(COLUNA_BAIRRO, "Lista com os registros da coluna 'Bairro/Distrito'");
	}
	
	/**
	 * Lista com os registros da coluna 'Localidade/UF'
	 * 
	 * @author Carlos Moreira(Cognizant)
	 * @return
	 * @throws Exception
	 */
	public List<WebElement> localidade() throws Exception {
		return searchElement.findElementsBy(COLUNA_LOCALIDADE, "Lista com os registros da coluna 'Localidade/UF'");
	}
	
	/**
	 * Lista com os registros da coluna 'CEP'
	 * 
	 * @author Carlos Moreira(Cognizant)
	 * @return
	 * @throws Exception
	 */
	public List<WebElement> cep() throws Exception {
		return searchElement.findElementsBy(COLUNA_CEP, "Lista com os registros da coluna 'CEP'");
	}
	
	/**
	 * Caixa de seleção do tipo de busca
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement cxTipoBusca() throws Exception {
		return searchElement.findElementBy(CAIXA_SELECAO_TIPO_BUSCA, "Span que contem o texto 'Busca CEP - Endereço'");
	}

	/**
	 * Campo da caixa de seleção do tipo da busca
	 * 
	 * @param tipo
	 * @return
	 * @throws Exception
	 */
	public WebElement tipoBusca(TipoBusca tipo) throws Exception {
		return searchElement.findElementBy(tipo.getBy(), tipo.toString());
	}
}