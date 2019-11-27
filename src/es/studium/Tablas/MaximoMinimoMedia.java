package es.studium.Tablas;

import java.util.Scanner;

public class MaximoMinimoMedia
{

	public static void main(String[] args)
	{

		Scanner teclado=new Scanner(System.in);
		
		int tabla[]= new int[10];
		int suma=0;
		int maximo,minimo;
		for(int i=1;i<=9;i++) {
			
			System.out.println("Introduzca un número");
			tabla[i]=teclado.nextInt();
			
			
			}
		for (int i=0;i<=9;i++) {	
			
			
	}
		maximo=tabla[0];
		minimo=tabla[0];
		
		for(int i=0;i<=9;i++) {
			suma=suma+tabla[i];
			
			if(tabla[i]>maximo) {
				maximo=tabla[i];
			}
			
			if(tabla[i]<minimo) {
				minimo=tabla[i];
			}
		}
		
		System.out.println("El valor maximo de la tabla es: "+ maximo);
		System.out.println("El valor minimo de la tabla es: "+ minimo);
		System.out.println("La media de los valores introducidos es: "+ (float)suma/(float)10);
		
	}

}
