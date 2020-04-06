package br.com.gft.sistemafinanceiro;

public class GerenciadoraDeDividas {

	public void efetuaPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		divida.getPagamentos().registra(pagamento);
		
	}

}
