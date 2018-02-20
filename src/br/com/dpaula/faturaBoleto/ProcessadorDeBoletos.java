package br.com.dpaula.faturaBoleto;

import java.util.List;

import br.com.dpaula.notaFiscal.Fatura;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		double total = 0;
		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			fatura.getPagamentos().add(pagamento);

			total += fatura.getValor();
		}

		if (total >= fatura.getValor()) {
			fatura.setPago(true);
		}
	}
}