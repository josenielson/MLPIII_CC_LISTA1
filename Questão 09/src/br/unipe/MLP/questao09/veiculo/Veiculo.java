package br.unipe.MLP.questao09.veiculo;

/**
 * Um programa apresenta o relacionamento entre uma classe veículo, veículo
de carga e veículo de passeio, implemente tais classes de acordo com as
seguintes regras:
a) O veículo deve possuir os seguintes atributos: placa, marca, modelo,
ano, valorKmRodado, kmInicial, kmFinal e o valor da locação.
b) O veículo de carga possui como atributos além dos apresentados pelo
veículo, a capacidade de carga.
c) O veículo de passeio possui como atributos além dos apresentados pelo
veículo, se possui ar-condicionado e quantidade de portas.
d) O valor da locação do veículo é calculada de acordo com a seguinte
regra: (kmInicial – kmFinal) * valorKmRodado.
 */

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;	
	private int ano;
	private double valorKmRodado;
	private double kmInicial;
	private double kmFinal;
	private double valorLocacao;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public double setValorLocacao(double valorLocacao) {
		return this.valorLocacao = valorLocacao;
	}
	
	public double CalcularValorLocacao(double valorLocacao){
		return setValorLocacao((kmInicial - kmFinal) * valorKmRodado);
	}
	

}
