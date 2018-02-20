package br.com.dpaula.contas;

/**
 * para se fazer bom uso de herança, o desenvolvedor deve pensar em cada método
 * que a classe filha herdou e sobrescreveu, e lembrar que as pré-condições não
 * podem ser apertadas, e as pós-condições não podem serem afrouxadas.
 * 
 * @author ferna
 *
 */
public class ContaDeEstudante {

	private ManipuladorDeSaldo m;
	private int milhas;

	public ContaDeEstudante() {
		m = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		m.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}
}