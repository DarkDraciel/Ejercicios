package modelo;

public class Cubo extends Cuadrado{

	int volumen;
	
	public Cubo(int lado) {
		super(lado);
		// TODO Auto-generated constructor stub
	}
	
	public int calcularVolumen(){
		volumen=lado*lado*lado;
		return volumen;		
	}
	


 
}
