package br.com.dpaula.faturaBoleto;

import java.util.List;

import br.com.dpaula.notaFiscal.Fatura;

/**
 * Encapsular é esconder os detalhes da implementação dentro da classe. Dessa
 * forma, as classes que farão uso dela, não saberão como ela funciona
 * internamente. A vantagem disso é que conseguimos depois facilmente alterar a
 * implementação, sem que ela impacte nas classes dependentes.
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