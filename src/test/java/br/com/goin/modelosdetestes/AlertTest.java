//package br.com.goin.modelosdetestes;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import br.com.goin.coreModelos.BaseTest;
//import br.com.goin.pageObjectModelos.AlertPage;
//import br.com.goin.pageObjectModelos.MenuPage;
//
//public class AlertTest extends BaseTest {
//	
//	private MenuPage menu = new MenuPage();
//	private AlertPage page = new AlertPage();
//	
//	@Before
//	public void setUp() {
//		
//		menu.acessarAlert();
//	}
//	
//	@Test
//	public void deveConfirmarAlert() {
//		
//		//clicar em alert confirm
//		
//		page.clicarAlertaConfirm();
//		
//		//verificar os textos
//		
//		assertEquals("Info", page.obterTituloAlert());
//		assertEquals("Confirma a operação?", page.obterMensagenAlerta());
//		
//		
//		//Confirmar alerta
//		
//		 page.confirmar();
//		 
//		 //verificar nova mensagem
//		 
//		 assertEquals("Confirmado", page.obterMensagenAlerta());
//		
//		
//		//clicar em sair
//		 
//		 page.clicarEmSair();
//		
//		
//		
//	}
//
//}
