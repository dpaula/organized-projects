package br.com.dpaula.precos;

/**
 * Ent�o, est� aberto para extens�o, mas est� fechado para modifica��o. Isso � o
 * tal do OCP
 * 
 * @author ferna
 *
 */
public class CalculadoraDePrecos {

	private TabelaPreco tabelaPrecos;
	private ServicoDeEntrega servicoEntrega;

	public CalculadoraDePrecos(TabelaPreco tabelaPrecos, ServicoDeEntrega servicoEntrega) {
		this.tabelaPrecos = tabelaPrecos;
		this.servicoEntrega = servicoEntrega;

	}

	public double calcula(Compra produto) {

		double desconto = tabelaPrecos.descontoPara(produto.getValor());
		double frete = servicoEntrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}