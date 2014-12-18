package la.devacademy.fundamentos;

import java.util.Scanner;

public class Bienvenida {
	public static void main(String[] args) {
		// Este es un comentario, no se leerá en el programa
		
		// Declarar variable nombre
		String nombre = "";
				
		// Declarar el objeto scanner para el ingreso de datos por consola
		Scanner scanner = new Scanner(System.in);
				
		// Preguntar el nombre
		System.out.println("Cuál es tu nombre?");
		nombre = scanner.next();
				
		// Mostrar el nombre
		System.out.println("Bienvenido " + nombre + " al pueblo Paleta");
	}
}
