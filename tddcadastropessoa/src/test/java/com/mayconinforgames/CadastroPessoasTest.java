package com.mayconinforgames;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mayconinforgames.model.CadastroPessoas;
import com.mayconinforgames.model.Pessoa;

@SpringBootTest
class CadastroPessoasTest {

	@Test
	void deveCriarOCadastroDePessoas() {
		// cenário e execução 
		CadastroPessoas cadastro = new CadastroPessoas();
	
		// Verificação 
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
		
	}
	
	@Test
	void deveAdicionarUmaPessoa() {
		// cenário  
		CadastroPessoas cadastro = new CadastroPessoas();
		Pessoa pessoa = new Pessoa();
	
		// execução
		 cadastro.adicionar(pessoa);
		 
		 // verificação
		
		// Verificação 
		Assertions
			.assertThat(cadastro.getPessoas())
			.isNotEmpty()
			.hasSize(1)
			.contains(pessoa);
	}

	@Test
	void naoDeveAdicionarPessoaComNomeVazio() {
		// cenário  
		CadastroPessoas cadastro = new CadastroPessoas();
		Pessoa pessoa = new Pessoa();
	
		// execução
		 cadastro.adicionar(pessoa);
		 
		 // verificação
		
		// Verificação 
		Assertions
			.assertThat(cadastro.getPessoas())
			.isNotEmpty()
			.hasSize(1)
			.contains(pessoa);
	}
	
}
