package paquetito;

public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		System.out.println("El saldo de la "
				+ "cuenta es: " + primeraCuenta.saldo);
		primeraCuenta.saldo += 100;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 50;
		System.out.println("-------------");
	
		 System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
	     System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);
	     System.out.println("-------------");
	     System.out.println(primeraCuenta);
	     System.out.println(segundaCuenta);
	}
	
}
