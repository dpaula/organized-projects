package br.com.dpaula.contas;

/**
 * para se fazer bom uso de heran�a, o desenvolvedor deve pensar em cada m�todo
 * que a classe filha herdou e sobrescreveu, e lembrar que as pr�-condi��es n�o
 * podem ser apertadas, e as p�s-condi��es n�o podem serem afrouxadas.
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