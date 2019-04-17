package br.com.goin.modelosdetestes;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class loginSteps {
	
	AndroidDriver<MobileElement> driver;
	
	@Dado("^que o Emulador esta disponivel com app sem dados$")
	public void queOEmuladorEstaDisponivelComAppSemDados() throws Throwable {
		
		
		
	}

	@Dado("^que abri o app em Android$")
	public void que_abri_o_app_em_Android() throws Throwable {
	}

	@Quando("^inserir o usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void inserir_o_usuario_e_senha(String arg1, String arg2) throws Throwable {
	}

	@Quando("^clicar em entrar$")
	public void clicar_em_entrar() throws Throwable {
	}

	@Entao("^verifico se foi autentidado como \"([^\"]*)\"$")
	public void verifico_se_foi_autentidado_como(String arg1) throws Throwable {
	}

}
