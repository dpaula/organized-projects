package br.com.dpaula.regra.calculo;

/**
 * Coesão: uma única responsabilidade ?Será que esta classe vai parar de
 * crescer?
 * 
 * @author ferna
 *
 */
public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.calculaSalario();
	}

}
