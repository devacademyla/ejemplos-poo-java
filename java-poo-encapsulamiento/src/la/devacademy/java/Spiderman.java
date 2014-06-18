package la.devacademy.java;

public class Spiderman {
	int fuerza;
	int resistencia;
	
	public Spiderman(int fuerza, int resistencia) {
		this.fuerza = fuerza;
		this.resistencia = resistencia;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public static void main(String[] args){
		Spiderman sm = new Spiderman(30, 15);
		System.out.println("La fuerza de Spiderman es: " + sm.getFuerza());
	} 
	
	
}
