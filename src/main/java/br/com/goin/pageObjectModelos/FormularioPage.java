//package br.com.goin.pageObjectModelos;
//
//import org.openqa.selenium.By;
//
//import br.com.goin.coreModelos.BasePage;
//import io.appium.java_client.MobileBy;
//
//public class FormularioPage extends BasePage {
//	
//	
//	public void escreverNome(String nome) {
//		
//		escrever(MobileBy.AccessibilityId("name"),nome);
//	}
//
//	public String obterNome() {
//		
//		return obterTexto(MobileBy.AccessibilityId("name"));
//		
//	}
//	
//	public void selecionaCombo(String valor) {
//		
//		selecionarCombo(MobileBy.AccessibilityId("console"),valor);
//		
//	}
//	
//	public String obterValorDoCombo() {
//		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
//	}
//	
//	public void clicarCheck() {
//		clicar(By.className("android.widget.CheckBox"));
//	}
//	
//	public void clicarSwitch() {
//		clicar(MobileBy.AccessibilityId("switch"));
//	}
//	
//	public boolean isCheckedMarcado() {
//		return ischeckMarcado(By.className("android.widget.CheckBox"));
//		
//	}
//	
//	public boolean isSwitchMarcado() {
//	return ischeckMarcado(MobileBy.AccessibilityId("switch"));
//	}
//			
////			Assert.assertTrue(ischeckMarcado(By.className("android.widget.CheckBox")));
////			Assert.assertFalse(ischeckMarcado(MobileBy.AccessibilityId("switch")));
////			
////			driver.quit();
//}
