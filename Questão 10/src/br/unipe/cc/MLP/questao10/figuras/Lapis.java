package br.unipe.cc.MLP.questao10.figuras;

public class Lapis {

	private FiguraGeometrica figuraGeometrica;

	public Lapis(FiguraGeometrica novaFiguraGeometrica){
		this.figuraGeometrica = novaFiguraGeometrica;
	}
	
	public void acao(){
		this.figuraGeometrica.desenhar();
	}
	
	public FiguraGeometrica getFiguraGeometrica() {
		return figuraGeometrica;
	}

	public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
		this.figuraGeometrica = figuraGeometrica;
	}

}
