package la.devacademy.java;

public class Main {
	
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(5);
		Rectangulo rectangulo = new Rectangulo(5, 10);
		Triangulo triángulo = new Triangulo(5);
		
		cuadrado.calcularPerimetro();
		rectangulo.calcularPerimetro();
		triángulo.calcularPerimetro();
		
		cuadrado.calcularArea();
		rectangulo.calcularArea();
		System.out.println(triángulo.calcularArea() + 5) ;
		
	}

}
	