package la.devacademy.java;

public class Cuadrado {
	
	double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public void mostrarArea(Figura figura){
		System.out.println("El area del cuadrado es: " + figura.calcularArea(lado, lado));
	}
	
	public static void main(String[] args){
		Cuadrado cuadrado = new Cuadrado(10);
		cuadrado.mostrarArea(new Figura() {
			
			@Override
			public Double calcularArea(double lado, double base) {
				double area = lado * lado;
				return area;
			}
		});
	}
	
}
