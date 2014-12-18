package la.devacademy.java;

public class Rectangulo extends Figura {
	int base;
	int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public Double calcularArea() {
		double area = (double) (base * altura);
		System.out.println("El area del rectangulo es :" + area);
		return area;
	}
	
	@Override
	public void calcularPerimetro() {
		int perimetro = 2*base + 2*altura;
		System.out.println("El perimetro del rectangulo es :" + perimetro);
	}
	
}
