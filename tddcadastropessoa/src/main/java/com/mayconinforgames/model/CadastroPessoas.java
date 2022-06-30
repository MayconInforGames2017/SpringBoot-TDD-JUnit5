package com.mayconinforgames.model;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

	private List<Pessoa> pessoas;
	
	public CadastroPessoas() {
		this.pessoas = new ArrayList<>();
	}
	
	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}

	public void adicionar(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}

}
