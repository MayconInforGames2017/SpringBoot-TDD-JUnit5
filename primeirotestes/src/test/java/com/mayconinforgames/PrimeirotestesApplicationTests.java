package com.mayconinforgames;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimeirotestesApplicationTests {

	@Test
	void deveSomarDoisNumeros() {
		// cenário
		int numero1 = 30, numero2 = 90;

		// execução
		int resultado = numero1 + numero2;

		// verificação
		Assertions.assertThat(resultado).isEqualTo(120);

	}

	@Test
	void deveSomarDoisNumerosEVerificarSeFicarEntre119e121() {
		// cenário
		int numero1 = 30, numero2 = 90;

		// execução
		int resultado = numero1 + numero2;

		// verificação
		Assertions.assertThat(resultado).isBetween(119, 121);

	}

	@Test
	void verifiqueSeMaiorQue110() {
		// cenário
		int numero1 = 30, numero2 = 90;

		// execução
		int resultado = numero1 + numero2;

		// verificação
		Assertions.assertThat(resultado).isGreaterThan(110);

	}

}
