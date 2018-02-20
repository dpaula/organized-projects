package br.com.dpaula.contas;

public class ContaComum {

	private ManipuladorDeSaldo manipulador;

	public ContaComum() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		manipulador.deposita(valor);
	}

	public double getSaldo() {
		return manipulador.getSaldo();
	}

	public void rende() {
		manipulador.rende(1.1);
	}

	public void saca(double valor) {
		// ..faz coisas aqu..
		manipulador.saca(valor);
	}
}