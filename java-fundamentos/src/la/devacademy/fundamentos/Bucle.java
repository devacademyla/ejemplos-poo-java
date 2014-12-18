package la.devacademy.fundamentos;

public class Bucle {
	public static void main(String[] args) {
		// Declarar un array
		String [] lista = new String [] {"Pikachu", "Butterfly", "Pidgeot", "Bulbasaur", "Charizard", "Squirtle"};
				
		// Iterar con while
		int i = 0;
		while (i < lista.length) {
			System.out.println(lista[i]);
			i = i + 1;
		}
				
		// Iterar con for
		for(int x = 0; x < lista.length; x++ ){
			System.out.println(lista[x]);
		}
				
		// Iterar con do while
		int y = 0;
		do {
			System.out.println(lista[y]);
			y = y + 1;
		} while (y < lista.length);
	}
}
