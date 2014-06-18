package la.devacademy.java;

public class Rectangulo implements Figura{
	
	double base, altura;
	
	
	public Rectangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		double area = base * altura;
		System.out.println("El area del rectangulo es: " + area);
	}
	
	@Override
	public void calcularPerimetro() {
		double perimetro = (2 * base) + (2 * altura);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
	}
	
	public static void main(String[] args){
		
		Rectangulo rectangulo = new Rectangulo(10, 12);
		rectangulo.calcularArea();
		rectangulo.calcularPerimetro();
	}

}
