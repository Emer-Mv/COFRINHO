package poupanca;

public class Dollar extends Moeda{

	public Dollar(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {

		System.out.println("Dollar - " + valor);

	}

	@Override
	public double converter() {
		return this.valor * 4.97;
	}

	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}

		Dollar objetoDeDollar = (Dollar) objeto;

		if(this.valor != objetoDeDollar.valor) {
			return false;
		}
		return true;

	}
}