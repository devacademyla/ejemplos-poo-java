package la.devacademy.java;

public class Triangulo {
	double base;
	double altura;
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public void mostrarPerimetro(Figura figura){
		System.out.println("El perimetro del triangulo es: " + (figura.calcularArea(base, altura))*2);
	}

	public static void main(String[] args){
	
		Triangulo t = new Triangulo(3, 4);
		t.mostrarPerimetro(new Figura() {
			
			@Override
			public Double calcularArea(double base, double altura) {
				double area = (base * altura)/2;
				return area;
			}
		}
		);
		
	}
	
}
