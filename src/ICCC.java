
public class ICCC implements Imposto {


	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		Orcamento orcamento = new Orcamento(3010.0);
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, iccc);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		/*
		 * Implemente mais uma estratégia de cálculo de imposto.
		 * Crie o imposto que se chama ICCC, 
		 * que retorna 5% do valor total caso o orçamento seja menor do que R$ 1000,00 reais,
		 * 7% caso o valor esteja entre R$ 1000 e R$ 3000,00 com os limites inclusos, ou 8% mais 30 reais, caso o valor esteja acima de R$ 3000,00.
		 * Escreva um método main que testa sua implementação.
		 */

		if (orcamento.getValor() > 3000.0) {
			return orcamento.getValor() * 0.08 + 30.0;
		} else if (orcamento.getValor() >= 1000.0 || orcamento.getValor() <= 3000.0 ) {
			return orcamento.getValor() * 0.07;
		} else if(orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} 
		return 0;
	}
}

/*
     public double calcula(Orcamento orcamento) {
          if(orcamento.getValor() < 1000) {
            return orcamento.getValor() * 0.05;
          }
          else if (orcamento.getValor() <= 3000) {
            return orcamento.getValor() * 0.07;
          }
          else {
            return orcamento.getValor() * 0.08 + 30;
          }
        }
      }

     public  class Teste {
        public static void main(String[] args) {
          Orcamento reforma = new Orcamento(500.0);

          Imposto novoImposto = new ICCC();
          System.out.println(novoImposto.calcula(reforma));
        }
      }
 */