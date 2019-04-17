//package br.com.goin.coreModelos;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Rule;
//import org.junit.rules.TestName;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//public class BaseTest {
//
//
//	@Rule
//	public TestName testName = new TestName();
//	
//	@AfterClass
//	public static void finalizaSessao() {
//		DriverFactory.killDrive();
//
//	}
//
//	@After
//	public void tearDown() {
//		gerarScreeshot();
//		DriverFactory.getDriver().resetApp();
//	}
//	
//	public void gerarScreeshot() {
//		
//		try {
//			File imagem = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(imagem, new File ("target/sreenshots/"+testName.getMethodName()+".png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
