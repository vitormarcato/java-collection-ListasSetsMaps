package br.com.alura.arrayslist;

public class Recibo implements Comparable<Recibo> {
	private int numeroRecibo;
	private String empresa;
	private double valorTotal;

	public Recibo(int numeroRecibo, String empresa, double valorTotal) {
		this.numeroRecibo = numeroRecibo;
		this.empresa = empresa;
		this.valorTotal = valorTotal;
	}

	public int getNumeroRecibo() {
		return numeroRecibo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	@Override
	public int compareTo(Recibo o) {
		return 0;
	}

	@Override
	public String toString() {
		return "[numero do Recibo: " + numeroRecibo + " nome da empresa: " + empresa + "valor: " + valorTotal + "]";
	}
}