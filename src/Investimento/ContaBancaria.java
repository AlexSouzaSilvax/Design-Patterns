package Investimento;

public class ContaBancaria {
	/*
Muitas pessoas optam por investir o dinheiro das suas contas banc�rias.
Existem diversos tipos de investimentos, desde investimentos conservadores at� mais arrojados.

Independentemente do investimento escolhido, o titular da conta recebe apenas 75% do lucro do investimento, pois 25% � imposto.

Implemente um mecanismo que invista o valor do saldo dela em um dos v�rios tipos de investimento e, 
dado o retorno desse investimento, 75% do valor � adicionado no saldo da conta.

Crie a classe RealizadorDeInvestimentos que recebe uma estrat�gia de investimento,
a executa sobre uma conta banc�ria, e adiciona o resultado seguindo a regra acima no saldo da conta.

Os poss�veis tipos de investimento s�o:

"CONSERVADOR", que sempre retorna 0.8% do valor investido;

"MODERADO", que tem 50% de chances de retornar 2.5%, e 50% de chances de retornar 0.7%;

"ARROJADO", que tem 20% de chances de retornar 5%, 30% de chances de retornar 3%, e 50% de chances de retornar 0.6%.

Para verificar se a chance � maior que 30%, por exemplo, use:

boolean escolhido = new java.util.Random().nextDouble() > 0.30;

	 */

	private double saldo;

	public ContaBancaria(Double valor) {
		this.saldo = valor;		
	}

	public void investimento(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}	

}
