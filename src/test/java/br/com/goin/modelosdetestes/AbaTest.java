//package br.com.goin.modelosdetestes;
//
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import br.com.goin.coreModelos.BaseTest;
//import br.com.goin.pageObjectModelos.AbasPage;
//import br.com.goin.pageObjectModelos.MenuPage;
//
//public class AbaTest extends BaseTest {
//
//	private MenuPage menu = new MenuPage();
//	
//	private AbasPage page = new AbasPage();
//
//	@Test
//	public void deveAbrirAbas() {
//
//		//acessar menu abas
//		
//		menu.acessarAbas();
//		
//		//verificar que esta na aba 1
//		
//		Assert.assertTrue(page.isAba1());
//		
//		//acessar aba2
//		
//		page.clicarAba2();
//		
//		//verificar que está na aba2
//		
//		Assert.assertTrue(page.isAba2());
//	}
//
//}
