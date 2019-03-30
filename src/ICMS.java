
public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		//return orcamento.getValor() * 0.1;
		//ICMS deve ser 5% do valor do orçamento mais o valor fixo de R$ 50,00
		return (orcamento.getValor() * 0.05) + 50.0;		
	}
}
