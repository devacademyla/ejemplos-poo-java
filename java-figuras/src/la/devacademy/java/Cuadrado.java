package la.devacademy.java;

public class Cuadrado extends Figura{
	int longitudLado;
	
	public Cuadrado(int longitudLado) {
		this.longitudLado = longitudLado;
	}
	
	
	
	public int getLongitudLado() {
		return longitudLado;
	}



	public void setLongitudLado(int longitudLado) {
		this.longitudLado = longitudLado;
	}



	@Override
	public Double calcularArea() {
		double area = (double) (longitudLado * longitudLado);
		System.out.println("El area del cuadrado es :" + area);
		return area;
	}
	
	@Override
	public void calcularPerimetro() {
		int perimetro = 4*longitudLado;
		System.out.println("El perimetro del cuadrado es :" + perimetro);
	}
	
}
