package br.com.goin.pageObject;

import org.openqa.selenium.By;

import br.com.goin.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaDeLogin() {

		clicar(By.id("br.com.goin.develop:id/buttonGoToStart"));
	}
	
	public void clicarEmCadastrar() {

		clicarPorTexto("Cadastrar");
	}

	
	public void acessarPeloFaceBook() {

		clicarPorTexto("Entrar com Facebook");
	}

	public void logarComEmail() {

		clicarPorTexto("Entrar");
	}

}
