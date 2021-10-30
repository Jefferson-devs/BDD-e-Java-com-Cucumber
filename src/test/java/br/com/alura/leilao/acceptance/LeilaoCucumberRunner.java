package br.com.alura.leilao.acceptance; // FAZENDO A INTEGRAÇÃO DO CUCUMBER COM O JUnit

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "classpath:features")
public class LeilaoCucumberRunner {

}
