package br.com.dpaula.faturaBoleto;

import java.util.List;

import br.com.dpaula.notaFiscal.Fatura;

/**
 * Encapsular � esconder os detalhes da implementa��o dentro da classe. Dessa
 * forma, as classes que far�o uso dela, n�o saber�o como ela funciona
 * internamente. A vantagem disso � que conseguimos depois facilmente alterar a
 * implementa��o, sem que ela impacte nas classes dependentes.
 * 
 * @author ferna
 *
 */
public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			// encapsulamento.. regras de fatura, dentro da fatua
			fatura.adicionaPagamento(pagamento);
		}
	}
}