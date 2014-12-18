package la.devacademy.fundamentos;

import java.util.Scanner;

public class Desicion {
	public static void main(String[] args){
		// Declarar la variable local
		String pokemon;
		
		// Declarar objeto scanner para la lectura de datos
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Que pokemon eliges?(Bulbasaur, Squirtle, Charmander)");
		pokemon = scanner.next();
		
		// Utilizar condicional simple if
		
		if(pokemon.equals("Bulbasaur")){
			System.out.println("Bulbasaur es un pokemon tipo planta");
		} else if(pokemon.equals("Squirtle")){
			System.out.println("Squirtle es un pokemon tipo agua");
		} else if(pokemon.equals("Charmander")){
			System.out.println("Charmander es un pokemon tipo fuego");
		} else {
			System.out.println("Tu elección no es válida");
		}
		
		// Utilizar la condicional múltiple switch
		
		switch (pokemon) {
			case "Bulbasaur":
				System.out.println("Bulbasaur es un pokemon tipo planta");
				break;
			case "Squirtle":
				System.out.println("Squirtle es un pokemon tipo agua");
				break;
			case "Charmander":
				System.out.println("Charmander es un pokemon tipo fuego");
				break;
			default:
				System.out.println("Tu elección no es válida");
				break;
		}
	}
}
