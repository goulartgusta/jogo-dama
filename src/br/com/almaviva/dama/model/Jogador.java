package br.com.almaviva.dama.model;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private String cor;
	private ArrayList<Peca> pecas;

	public Jogador(String nome, String cor, ArrayList<Peca> pecas) {
		this.setNome(nome);
		this.setCor(cor);
		this.setPecas(pecas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public ArrayList<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(ArrayList<Peca> pecas) {
		this.pecas = pecas;
	}

}
