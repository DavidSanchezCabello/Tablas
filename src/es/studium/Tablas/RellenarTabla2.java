package es.studium.Tablas;

import java.util.Scanner;

public class RellenarTabla2 {

	public static void main(String[] args) {
		
		int tabla[]= new int[4];
		int i;
		Scanner teclado=new Scanner(System.in);
		for ( i=0;i<=3;i++) {
			
			tabla[i]=0;
			
		}
		for( i=0;i<4;i++) {
			
			System.out.println("Indicar un valor de la tabla");
			tabla[i]=teclado.nextInt();
		}
		for( i=0;i<4;i++) {
			
			System.out.println(tabla[i]);
		}teclado.close();
			
	}

}
