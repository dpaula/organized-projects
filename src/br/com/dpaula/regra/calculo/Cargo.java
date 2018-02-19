package br.com.dpaula.regra.calculo;

/**
 * Quando criar uma nova regra, basta criar uma nova função de cargo e uma nova
 * classe coesa para esta regra
 * 
 * @author ferna
 *
 */
public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()), DBA(new QuinzeOuVinteCincoPorcento()), TESTER(
			new QuinzeOuVinteCincoPorcento());

	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return this.regra;
	}
}