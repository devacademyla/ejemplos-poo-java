package la.devacademy.java;

public class Spiderman implements Poder{
	int fuerza;
	int resistencia;
	int agilidad;
	
	public Spiderman(int fuerza, int resistencia, int agilidad) {
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.agilidad = agilidad;
	}

	@Override
	public Integer calcularPoder() {
		int poder = fuerza + resistencia + agilidad;
		return poder;
	}
	
	public static void main(String[] args){
		Spiderman sm = new Spiderman(10, 15, 10);
		System.out.println("El poder de Spiderman es: " + sm.calcularPoder());
	} 

}
