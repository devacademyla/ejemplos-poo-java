package la.devacademy.java;

public class Cuadrado implements Figura{
	
	double lado;
	
	public Cuadrado(int lado){
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		double area = lado * lado;
		System.out.println("El area del cuadrado es: " + area);
	}

	@Override
	public void calcularPerimetro() {
		double perimetro = 4 * lado;
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	}
	
	public static void main(String[] args){
		
		Cuadrado cuadrado = new Cuadrado(10);
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
	}
}
