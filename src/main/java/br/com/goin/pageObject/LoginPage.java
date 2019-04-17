package br.com.goin.pageObject;

import org.openqa.selenium.By;

import br.com.goin.core.BasePage;

public class LoginPage extends BasePage {

	public void escreverEmail(String email) {

		escrever(By.id("br.com.goin.develop:id/input_e"), email);
	}

	public void escreverSenha(String password) {

		escrever(By.id("br.com.goin.develop:id/input_password"), password);
	}

	public void clicarBotaoEntrar(String password) {

		clicarPorTexto("Entrar");

	}

}