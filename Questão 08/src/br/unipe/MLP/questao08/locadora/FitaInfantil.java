package br.unipe.MLP.questao08.locadora;

public class FitaInfantil extends Fita{

	private double valorInfantil;
	
	public FitaInfantil(){
		this.valorInfantil = valorInfantil;
	}
	
	
	
	public double calcularPrecoInfantil(){
		this.valorInfantil = getPrecoLocacao() - (getPrecoLocacao() * 0.4); 
		
		return valorInfantil;
	}



	public double getValorInfantil() {
		return valorInfantil;
	}



	public void setValorInfantil(double valorInfantil) {
		this.valorInfantil = valorInfantil;
	}
}
