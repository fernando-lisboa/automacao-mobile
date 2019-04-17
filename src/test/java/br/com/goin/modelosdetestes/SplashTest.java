//package br.com.goin.modelosdetestes;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import br.com.goin.coreModelos.BaseTest;
//import br.com.goin.pageObjectModelos.MenuPage;
//import br.com.goin.pageObjectModelos.SplashPage;
//
//public class SplashTest extends BaseTest {
//	
//	private MenuPage menu = new MenuPage();
//	private SplashPage page = new SplashPage();
//	
//	
//	@Test
//	public void deveAguardarSplashSumir() {
//		//acessar menu splash
//		
//		menu.acessarSplash();
//		
//		//verificar que o splash está sendo exibido
//		page.isTelaSplashVisivel();
//		
//		
//		//aguardar saida do splash
//		
//		page.aguardarSplashSumir();
//		
//		
//		// verificar se o formulário está aparecendo
//		
//		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
//		
//		
//	}
//
//}
