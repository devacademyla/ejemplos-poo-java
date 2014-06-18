package la.devacademy.java;

public class SuperHeroe {
	int fuerza;
	int resistencia;
	
	public SuperHeroe(int fuerza, int resistencia){
		this.fuerza = fuerza;
		this.resistencia = resistencia;
	}
	
	public void mostrarFuerza(){
		System.out.println("La fuerza del SuperHéroe es: " + fuerza);
	}
	
	public Integer calcularPoder(){
		int poder = fuerza + resistencia;
		return poder;
	}
	
	public static void main(String[] args){
		int poder;
		SuperHeroe sh = new SuperHeroe(10,11);
		sh.mostrarFuerza();
		poder = sh.calcularPoder();
		System.out.println("El poder del SuperHéroe es: " + poder);
	}
}
