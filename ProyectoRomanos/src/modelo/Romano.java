package modelo;

import java.util.Scanner;

public class Romano {



	public static void main(String[] args) {
		System.out.println("Ingresa numero entre 1 y 1000");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();

		int unidad = n%10;
		//System.out.println(unidad);
		int decena = (n/10)%10;
		//System.out.println(decena);

		int centena = (n/100)%10;
		//System.out.println(centena);

		int unidadM = (n/1000)%10;
		//System.out.println(unidadM);

		String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String UnidadM[]={"","M"};


		if(n<=10){
			System.out.println(Decena[decena]+Unidad[unidad]);
		}else{
			if(n<=100){
				System.out.println(Centena[centena]+Decena[decena]+Unidad[unidad]);
			}else{
				if (n<=1000) {
					System.out.println(UnidadM[unidadM]+Centena[centena]+Decena[decena]+Unidad[unidad]);
				}        
			}}




	}
}
