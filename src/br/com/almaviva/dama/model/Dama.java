package br.com.almaviva.dama.model;

public class Dama extends Peca {
	private boolean ehDama = true;

	public Dama(int linha, int coluna, String cor, boolean ehDama) {
		super(linha, coluna, cor, ehDama);
		this.ehDama = true;
	}

}
