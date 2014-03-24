package br.unipe.MLP.questao08.locadora;

public class FitaLancamento extends Fita{

	private double valorLancamento;
	
	public FitaLancamento(){
		this.valorLancamento = valorLancamento;
	}
	
	public double calcularPrecoLancamento(){
		this.valorLancamento = getPrecoLocacao() + (getPrecoLocacao() * 0.2); 
		
		return valorLancamento;
		
	}

	public double getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(double valorLancamento) {
		this.valorLancamento = valorLancamento;
	}
}
