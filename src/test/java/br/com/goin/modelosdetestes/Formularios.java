//package br.com.goin.modelosdetestes;
//
//import static org.junit.Assert.assertEquals;
//
//import java.net.MalformedURLException;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//
//import br.com.goin.coreModelos.BaseTest;
//import br.com.goin.pageObjectModelos.FormularioPage;
//import br.com.goin.pageObjectModelos.MenuPage;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//
//public class Formularios extends BaseTest{
//	
////	AndroidDriver<MobileElement> driver;
//	
//	private MenuPage menu = new MenuPage();
//	private FormularioPage page =new FormularioPage();
//	
//	@Before
//	public void abreNavegador() throws MalformedURLException {
//		
//		menu.acessarFormulario();
//		
//	}
//	
//
//	@Test
//	public void devePreencherCampoTexto() throws MalformedURLException {
//
//		page.escreverNome("Amanda");
//		
//		assertEquals(page.obterNome(), "Amanda");
//	
//	}
//	
//	@Test
//	public void deveIteragirComElemento() throws MalformedURLException {
//
//		
//		page.selecionaCombo("PS4");
//		page.obterValorDoCombo();
//		
//		Assert.assertEquals("PS4", page.obterValorDoCombo());
//		
//	}
//	
//	@Test
//	public void deveAlterarData() {
//		
//		page.clicarPorTexto("01/01/2000");
//		page.clicarPorTexto("20");
//		page.clicarPorTexto("OK");
//		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
//	}
//	
//	@Test
//	public void deveAlterarHora() {
//		
//		page.clicarPorTexto("06:00");
//		page.clicar(MobileBy.AccessibilityId("10"));
//		page.clicar(MobileBy.AccessibilityId("40"));
//		page.clicarPorTexto("OK");
//		Assert.assertTrue(page.existeElementoPorTexto("10:40"));
//	}
//	
//	
//	
//	@Test
//	public void salvarDemorado() throws MalformedURLException {
//
//		
////		String nome = "Nome: Amanda";
////		String console = "Console: ps4" ;
////		String checkBox = "Checkbox: Marcado";
////		String switcSelecionado = "Switch: Off";
////		
////		
////		// escrever nome
////		
////		page.escreverNome("Amanda");
////		
////		//seleciona o combo
////		driver.findElement(MobileBy.AccessibilityId("console")).click();
////		MobileElement combo = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text = 'PS4']"));
////		combo.click();
////		
////		//selecionar checkd
////		MobileElement check = driver.findElement(By.className("android.widget.CheckBox"));
////				check.click();
////		MobileElement switc = driver.findElement(MobileBy.AccessibilityId("switch"));
////				switc.click();
////		
////		//salvar alterações
////		
////		driver.findElement(By.xpath("//android.widget.TextView[@text='SALVAR DEMORADO']")).click();
////		
////		//validação dos campos
////		
////		String resultNome = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Nome: Amanda']")).getText();
////		String consoleResult = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Console: ps4']")).getText();
////		String switchResult = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Switch: Off']")).getText();
////		String checkboxResult = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Checkbox: Marcado']")).getText();
////		
////		assertEquals(nome, resultNome);
////		assertEquals(console, consoleResult);
////		assertEquals(checkBox, checkboxResult);
////		assertEquals(switcSelecionado, switchResult);
//		
//		
//	}
//	
//	@Test
//	public void deveIteragirCheckBox() throws MalformedURLException {
//
//		
//		Assert.assertFalse(page.isCheckedMarcado());
//		Assert.assertTrue(page.isSwitchMarcado());
//		
//		page.clicarCheck();
//		page.clicarSwitch();
//		
//		Assert.assertTrue(page.isCheckedMarcado());
//		Assert.assertFalse(page.isSwitchMarcado());
//		
//		
//	}
//	
//	@Test
//	public void desafioAppium() throws MalformedURLException {
//		
////		String nome = "Nome: Amanda";
////		String console = "Console: ps4" ;
////		String checkBox = "Checkbox: Marcado";
////		String switcSelecionado = "Switch: Off";
////		
////		
////		// escrever nome
////		
////		page.escreverNome("Amanda");
////		
////		//seleciona o combo
////		driver.findElement(MobileBy.AccessibilityId("console")).click();
////		MobileElement combo = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text = 'PS4']"));
////		combo.click();
////		
////		//selecionar checkd
////		MobileElement check = driver.findElement(By.className("android.widget.CheckBox"));
////				check.click();
////		MobileElement switc = driver.findElement(MobileBy.AccessibilityId("switch"));
////				switc.click();
////		
////		//salvar alterações
////		
////		driver.findElement(By.xpath("//android.widget.TextView[@text='SALVAR']")).click();
////		
////		//validação dos campos
////		
////		String resultNome = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Nome: Amanda']")).getText();
////		String consoleResult = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Console: ps4']")).getText();
////		String switchResult = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Switch: Off']")).getText();
////		String checkboxResult = driver.findElement(By.xpath("//android.widget.TextView[@text= 'Checkbox: Marcado']")).getText();
////		
////		assertEquals(nome, resultNome);
////		assertEquals(console, consoleResult);
////		assertEquals(checkBox, checkboxResult);
////		assertEquals(switcSelecionado, switchResult);
////		
////		System.out.println(resultNome + " " +consoleResult + " " +checkboxResult + " " +switchResult );
////		
////		
//	}
//
//	
//	
//	
//}
