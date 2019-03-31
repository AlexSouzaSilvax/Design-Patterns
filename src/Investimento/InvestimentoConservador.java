package Investimento;

public class InvestimentoConservador implements Investimento{
	public double calcula(ContaBancaria conta) {
		return conta.getSaldo() * 0.008;
	} 
}
