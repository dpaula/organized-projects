package br.com.dpaula.notaFiscal;

import java.util.List;

import br.com.dpaula.faturaBoleto.Pagamento;

public class Fatura {

	private double valorMensal;
	private String cliente;
	private List<Pagamento> pagamentos;
	private int valor;
	private boolean pago;

	public Fatura() {
	}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPago(boolean b) {
		// TODO Auto-generated method stub

	}

	public List<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public void adicionaPagamento(Pagamento pagamento) {

		this.pagamentos.add(pagamento);

		if (valorTotalDosPagamentos() >= this.valor) {
			this.pago = true;
		}

	}

	private double valorTotalDosPagamentos() {
		double total = 0;

		for (Pagamento p : pagamentos) {
			total += p.getValor();
		}

		return total;
	}

}
