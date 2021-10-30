package br.com.alura.leilao.acceptance.steps; // CODIGO ASSOCIADO AOS PASSOS SCENARIO,GIVEN,WHEN,THEN

import java.math.BigDecimal;

import org.junit.Assert;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PropondoLanceSteps {

	private Lance lance;
	private Leilao leilao;

	@Dado("um lance valido")
	public void dado_um_lance_valido() {

		Usuario usuario = new Usuario("fulano");
		new Lance(usuario, BigDecimal.TEN);
	}

	@Quando("propoe o lance")
	public void quando_propoe_o_lance() {
		new Leilao("Tablet XPTO");
		leilao.propoe(lance);
	}

	@Entao("o lance e aceito")
	public void entao_o_lance_e_aceito() {
		Assert.assertEquals(1, leilao.getLances().size());
		Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());

	}
}
