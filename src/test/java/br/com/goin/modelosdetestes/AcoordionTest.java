//package br.com.goin.modelosdetestes;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import br.com.goin.coreModelos.BaseTest;
//import br.com.goin.pageObjectModelos.AcoordionPage;
//import br.com.goin.pageObjectModelos.MenuPage;
//
//public class AcoordionTest extends BaseTest {
//	
//	private MenuPage menu = new MenuPage();
//	
//	private AcoordionPage page = new AcoordionPage();
//	
//	
//	@Test
//	public void iteragirComAcoordion() throws InterruptedException {
//		
//		//acessar menu
//		
//		menu.acessarAcoordion();
//		
//		// clicar opção 1
//		
//		page.selecionarOpcao1();
//		
//		//verificar texto opçAo 1
//		
//		page.esperar(1000);
//	
//		
//		
//		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());
//		
//		
//	}
//	
//	
//
//}
