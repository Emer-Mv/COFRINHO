package poupanca;

public class Euro extends Moeda{

	public Euro(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {

		System.out.println("Euro - " + valor);

	}

	@Override
	public double converter() {
		return this.valor * 5.41;
	}
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}

		Euro objetoDeEuro = (Euro) objeto;

		if(this.valor != objetoDeEuro.valor) {
			return false;
		}
		return true;

	}
}