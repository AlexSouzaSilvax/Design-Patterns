package Investimento;

public class RealizadorDeInvestimentos {

	public void realiza(ContaBancaria conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);

		conta.investimento( resultado * 0.75 );
		System.out.println ( "Novo saldo: " + conta.getSaldo());
	}
}
