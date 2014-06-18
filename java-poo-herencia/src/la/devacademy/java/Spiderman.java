package la.devacademy.java;

public class Spiderman extends SuperHéroe{
	
	int fuerza;
	
	public Spiderman(String nombre){
		super(nombre);
		
	}
	
	public static void main(String[] args){
		Spiderman sm = new Spiderman("Peter Parker");
		sm.nombre.toString();
		System.out.println("Mi nombre es: " + sm.nombre.toString());
	}
}
