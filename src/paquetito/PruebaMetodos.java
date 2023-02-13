package paquetito;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		Cuenta otraCuenta = new Cuenta();
		
		miCuenta.depositar(1000);
		miCuenta.retirar(500);
		
		miCuenta.tranferir(200,otraCuenta);
		System.out.println("Mi cuenta: "+miCuenta.saldo);
		System.out.println("OtraCuenta: "+otraCuenta.saldo);
	}
}
