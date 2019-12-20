package page_object.enums;

import org.openqa.selenium.By;

public enum TipoBusca {
	LOGRADOURO(By.xpath("//option[@value='LOG']"), "Localidade/Logradouro"),
	CEP_PROMOCIONAL(By.xpath("//option[@value='PRO']"), "CEP Promocional"),
	CAIXA_POSTAL_COMUNITARIA(By.xpath("//option[@value='CPC']"), "Caixa Postal Comunitária"),
	GRANDE_USUARIO(By.xpath("//option[@value='GRU']"), "Grande Usuário"),
	UNIDADE_OPERACIONAL(By.xpath("//option[@value='UOP']"), "Unidade Operacional"),
	TODOS(By.xpath("//option[@value='ALL']"), "Todos");

	private Object[] option;

	TipoBusca(Object... vals) {
		option = vals;
	}

	public By getBy() {
		return (By) option[0];
	}

	public String getTexto() {
		return (String) option[1];
	}
}