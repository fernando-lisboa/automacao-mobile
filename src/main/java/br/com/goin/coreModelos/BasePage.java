//package br.com.goin.coreModelos;
//
//import static br.com.goin.core.DriverFactory.getDriver;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//
//import io.appium.java_client.MobileElement;
//
//public class BasePage {
//	
//	public void escrever(By by, String texto) {
//		
//		getDriver().findElement(by).sendKeys(texto);
//	}
//
//	public String obterTexto(By by) {
//
//		return getDriver().findElement(by).getText();
//	}
//
//	public void selecionarCombo(By by, String valor) {
//
//		getDriver().findElement(by).click();
//		clicarPorTexto(valor);
//
//	}
//
//	public void clicar(By by) {
//		getDriver().findElement(by).click();
//	}
//
//	public void clicarPorTexto(String texto) {
//
//		clicar(By.xpath("//*[@text='" +texto+ "']"));
//
//	}
//
//	public boolean ischeckMarcado(By by) {
//
//		return getDriver().findElement(by).getAttribute("checked").equals("true");
//
//	}
//	
//	public boolean existeElementoPorTexto(String texto) {
//		List<MobileElement> felementos = getDriver().findElements(By.xpath("//*[@text = '"+texto+"']"));
//		
//		return felementos.size()>0;
//	}
//	
//	public void esperar(long valor) throws InterruptedException {
//		
//		Thread.sleep(valor);
//	}
//	
//}
