package br.com.almaviva.dama.model;

public class Peca {
	private int linha;
	private int coluna;
	private String cor;
	private boolean ehDama;
	
	public Peca(int linha, int coluna, String cor, boolean ehDama) {
		this.setLinha(linha);
		this.setColuna(coluna);
		this.setCor(cor);
		this.ehDama = ehDama;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
