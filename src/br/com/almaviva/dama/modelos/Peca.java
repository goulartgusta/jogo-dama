package br.com.almaviva.dama.modelos;

public class Peca {
	private int posicaoX;
	private int posicaoY;
	private String cor;
	
	public Peca(int posicaoX, int posicaoY, String cor) {
		this.setPosicaoX(posicaoX);
		this.setPosicaoY(posicaoY);
		this.setCor(cor);
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
