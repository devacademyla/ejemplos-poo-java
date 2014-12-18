package la.devacademy.java;

public class Triangulo extends Figura {
	int base;
	
	public Triangulo(int base) {
		this.base = base;
	}
	
	@Override
	public Double calcularArea() {
		double area = (double) (base * base/2);
		System.out.println("El area del triangulo es :" + area);
		return area;
	}
	
	@Override
	public void calcularPerimetro() {
		int perimetro = base * 3;
		System.out.println("El perimetro del triangulo es :" + perimetro);
	}
}
