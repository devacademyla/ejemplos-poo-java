package la.devacademy.tienda;

import java.util.Scanner;

public class Pago {
	public static void main(String[] args) {
		
		// Declarar variables
		String nombre;
		String opcion;
		double valorBici;
		double comision = 0;
		
		// Declarar objeto scanner para el ingreso de datos
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar el Nombre del vendedor");
		nombre = scanner.nextLine();
		
		System.out.println("Desea ingresar una bici? s: si, n: no");
		opcion = scanner.nextLine();
		while (opcion.equalsIgnoreCase("s")) {
			System.out.println("Ingresar valor de la bici");
			valorBici = scanner.nextDouble();
			comision = comision + (0.03 * valorBici) + 50;
			System.out.println("Desea ingresar bici? s: si, n: no");
			opcion = scanner.nextLine();
		}
		double salario = 1000 + comision;
		System.out.println(nombre + " recibe un salario de " + salario + " soles" );
	}
}
