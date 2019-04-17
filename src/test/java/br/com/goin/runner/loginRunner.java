package br.com.goin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, glue = { "br.com.goin.steps" }, // plugin = { "pretty",
		// "com.cucumber.listener.ExtentCucumberFormatter:target/output/login/Relatório
		// NewHome.html" },
		features = { "src/main/resources/feature/login.feature" }, tags = {
				"@tag01" }, snippets = cucumber.api.SnippetType.CAMELCASE)

public class loginRunner {

}
