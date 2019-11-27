package es.studium.Tablas;

import java.util.Scanner;

public class RellenarTable {

	public static void main(String[] args) {
		
		int tabla[]= new int[20];
		int i;
		Scanner teclado= new Scanner(System.in);
		
		for ( i=0 ; i<20;i++ ) {
			
		tabla[i]= i*2;
			
		}
		for (i=0;i<20;i++) {
			System.out.println(tabla[i]);
		}
		teclado.close();

	}

}
