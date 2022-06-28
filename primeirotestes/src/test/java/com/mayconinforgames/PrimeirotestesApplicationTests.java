package com.mayconinforgames;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeirotestesApplicationTests {
	
	@Test
	void deveSomar2Numeros() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 30, numero2 = 90;

		// execução
		int resultado = calculadora.somar(numero1, numero2);

		// verificação
		Assertions.assertThat(resultado).isEqualTo(120);

	}

	@Test
	void deveSomarDoisNumerosEVerificarSeEstesNumerosFicamEntre119e121() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 30, numero2 = 90;

		// execução
		int resultado = calculadora.somar(numero1, numero2);

		// verificação
		Assertions.assertThat(resultado).isBetween(119, 121);

	}

	@Test
	void verifiqueSeNumeroEMaiorQue110() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 30, numero2 = 90;

		// execução
		int resultado = calculadora.somar(numero1, numero2);

		// verificação
		Assertions.assertThat(resultado).isGreaterThan(110);

	}
	
	@Test
	void deveSubtrair2Numeros() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 5, numero2 = 10;

		// execução
		int resultado = calculadora.subtrair(numero1, numero2);

		// verificação
		Assertions.assertThat(resultado).isEqualTo(-5);

	}

	@Test
	void deveMultiplicar2Numeros() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 5, numero2 = 10;

		// execução
		int resultado = calculadora.multiplicar(numero1, numero2);

		// verificação
		Assertions.assertThat(resultado).isEqualTo(50);

	}
	
	@Test
	void deveDividir2Numeros() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 10, numero2 = 5;

		// execução
		int resultado = calculadora.dividir(numero1, numero2);

		// verificação
		Assertions.assertThat(resultado).isEqualTo(2);

	}

	
	/*
	@Test(expected = RuntimeException.class)
	void naoDeveSomarNumerosNegativos() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = -10, numero2 = 5;

		// execução
		int resultado = calculadora.somar(numero1, numero2);
	
	}
	*/
	
	/*
	@Test(expected = ArithmeticException.class)
	void naoDeveDividirPorZero() {
		// cenário
		Calculadora calculadora = new Calculadora();
		int numero1 = 10, numero2 = 0;

		// execução
		int resultado = calculadora.dividir(numero1, numero2);
	
	}
	*/

}

class Calculadora {

	int somar(int num, int num2) {
		if (num < 0 || num2 < 0) {
			throw new RuntimeException("Não é permitido somar números negativos.");
		}
		return num + num2;
	}

	public int dividir(int num, int num2) {
		if (num == 0 || num2 == 0) {
			throw new RuntimeException("Não é permitido somar números negativos.");
		}
		return num / num2;
	}

	public int multiplicar(int num, int num2) {
		return num * num2;
	}

	int subtrair(int num, int num2) {
		return num - num2;
	}

	
}
