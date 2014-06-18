package la.devacademy.java;


public class Hulk implements Poder{
	int fuerza;
	int resistencia;
	int agilidad;
	
	public Hulk(int fuerza, int resistencia, int agilidad) {
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.agilidad = agilidad;
	}

	@Override
	public Integer calcularPoder() {
		int poder = fuerza + resistencia - agilidad;
		return poder;
	}
	
	public static void main(String[] args){
		Hulk h = new Hulk(30, 40,5);
		System.out.println("La fuerza de Hulk es: " + h.calcularPoder());
	} 
	
}
