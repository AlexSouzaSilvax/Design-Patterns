package Investimento;

public class TesteInvestimento {
	
	public static void main(String[] args) {
	
	Investimento conservador = new InvestimentoConservador();
	
	ContaBancaria conta = new ContaBancaria(500.0);
	
	RealizadorDeInvestimentos a = new RealizadorDeInvestimentos();
	
	a.realiza(conta, conservador);
	
	}
}
