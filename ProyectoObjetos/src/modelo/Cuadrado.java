package modelo;

public class Cuadrado {

	protected int lado;
	//Constructor
	public Cuadrado(int lado) {
		this.lado = lado;
	}

	//Métodos

	public int calcularArea(){
		int area;
		area=lado*lado;
		return area;		
	}
	
	public int calcularPerimetro(){
		int perimetro;
		perimetro=lado*4;
		return perimetro;		
	}


}
