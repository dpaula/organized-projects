package br.com.dpaula.regra.calculo;

/**
 * Classe coesa � mais facil de ser lida, tem mais reuso(mais facil levar para
 * outro sistema), menos c�digo, menos complexa
 * <p>
 * 
 * S - Coesao <br>
 * O <br>
 * L <br>
 * I <br>
 * D <br>
 * E <br>
 * 
 * @author ferna
 *
 */
public class DezOuVintePorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}
