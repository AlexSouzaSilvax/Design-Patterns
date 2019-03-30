package Investimento;

import java.util.Random;

public interface Investimento {

	double calcula(ContaBancaria conta);
}

class Conservador implements Investimento{
	public double calcula(ContaBancaria conta) {
		return conta.getSaldo() * 0.008;
	} 
}

class Moderado implements Investimento {
	private Random random;

	public Moderado() {
		this.random = new Random();
	}

	public double calcula(ContaBancaria conta) {
		if(random.nextInt(2) == 0) return conta.getSaldo() * 0.025;
		else return conta.getSaldo() * 0.007;
	}
}

class Arrojado implements Investimento {
	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	public double calcula(ContaBancaria conta) {
		int chute = random.nextInt(10);
		if(chute >= 0 && chute <= 1) return conta.getSaldo() * 0.05;
		else if (chute >= 2 && chute <= 4) return conta.getSaldo() * 0.03;
		else return conta.getSaldo() * 0.006;
	}
}
