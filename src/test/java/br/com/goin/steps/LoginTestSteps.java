package br.com.goin.steps;

import org.junit.Assert;
import org.junit.Test;

import br.com.goin.core.BaseTest;
import br.com.goin.core.DriverFactory;
import br.com.goin.pageObject.LoginPage;
import br.com.goin.pageObject.MenuPage;

public class LoginTestSteps extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private LoginPage page = new LoginPage();
	
	
	
	@Test
	public void efetuarLogin() {
		
		//autorizar localização
		
//		menu.clicarPorTexto("PERMITIR");
		
//		//acessar tela de login
//		menu.acessarTelaDeLogin();
//		
//		//logar com o e-mail
//		
		menu.logarComEmail();
//		
//		//escrever email
//		
		page.escreverEmail("fernandols.1979@gmail.com");
//		
		//ecrever sennha
//		
//		page.escreverSenha("Lisbo@79");
		
		Assert.assertTrue(page.existeElementoPorTexto("Destaques"));
		
		DriverFactory.killDrive();
		
	}

}
