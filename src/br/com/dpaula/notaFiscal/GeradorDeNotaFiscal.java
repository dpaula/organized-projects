package br.com.dpaula.notaFiscal;

import java.util.List;

/**
 * O problema do acoplamento � que, a partir do momento que uma classe A depende
 * de uma classe B, qualquer mudan�a em B pode impactar A. Ou seja, quanto mais
 * dependermos de outras classes, mais chances temos de uma mudan�a na
 * depend�ncia afetar a classe dependente. E, como sabemos, na pr�tica, temos
 * classes que mudam com muita frequ�ncia.
 * 
 * @author ferna
 *
 */
public class GeradorDeNotaFiscal {

	private final List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}