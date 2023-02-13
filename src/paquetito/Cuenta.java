package paquetito;

public class Cuenta {
	protected double saldo;
	protected int agencia;
	protected int numero;
	protected String titular;

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}

		return false;
	}

	public boolean tranferir(double valor, Cuenta otraCuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			otraCuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

}
