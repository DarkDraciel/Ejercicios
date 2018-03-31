package vistaPrin;

import java.util.InputMismatchException;
import java.util.Scanner;

import modelo.Cuadrado;
import modelo.Cubo;

public class Principal {


	public static void main(String[] args) {
		Scanner sn = null;
		Scanner d = null;
		int var=0;
		boolean salir = false;
		boolean cancelar = false;
		int opcion=0; //Guardaremos la opcion del usuario

		while (!salir) {


			switch (opcion) {
			case 0:
				try{
					System.out.println("Ingresa el tamaño del lado");
					d = new Scanner(System.in);
					var=d.nextInt();
					if(var!=0 && var<6){
						opcion=6;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("Debes insertar un número");
					d.next();
					opcion=0;
					break;
				}

			case 1:
				Cuadrado cuadrado = new Cuadrado(var);
				System.out.println("El area es: \n"+cuadrado.calcularArea()+"\n");
				opcion=7;
				break;
			case 2:
				Cuadrado cuadrado2 = new Cuadrado(var);
				System.out.println("El perimetro es: \n"+cuadrado2.calcularPerimetro()+"\n");
				opcion=7;
				break;
			case 3:
				Cubo cubo = new Cubo(var);
				System.out.println("El volumen es: \n"+cubo.calcularVolumen());
				opcion=7;
				break;
			case 4:
				opcion=0;
				break;
			case 5:
				salir = true;
				break;
			case 6:
				try{
					sn = new Scanner(System.in);	
					System.out.println("¿Qué desea hacer?");
					System.out.println("Ingrese el número de la acción que desea");
					System.out.println("1- Calcular area cuadrado");
					System.out.println("2- Calcular perimetro cuadrado");
					System.out.println("3- Calcular volumen cubo");
					System.out.println("4- Cancelar");
					System.out.println("5- Salir");
					System.out.println("Escribe una de las opciones");
					opcion = sn.nextInt();
					if(opcion==4){
						opcion=4;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("Debes insertar un número");
					sn.next();
					break;
				}
			case 7:
				try{
					sn= new Scanner(System.in);
					System.out.println("Ingrese el número de la acción que desea");
					System.out.println("7.- ¿Desea hacer otro calculo con el mismo dato? "+var);
					System.out.println("8.- ¿Desea ingresar un nuevo dato?");
					opcion = sn.nextInt();
					if(opcion==7){
						opcion=6;
					}
					if(opcion==8){
						opcion=0;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("Debes insertar un número");
					sn.next();
					break;
				}
			

			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}

	}







}
