package br.com.dpaula.regra.calculo;

/**
 * Coes�o: uma �nica responsabilidade ?Ser� que esta classe vai parar de
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
