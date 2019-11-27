package es.studium.Tablas;

import java.util.Scanner;

public class SumaFilasColumnas
{

	public static void main(String[] args)
	{
		int tabla[][] = new int[3][3];

		int i, j;
		int sumaFila0 = 0;
		int sumaFila1 = 0;
		int sumaFila2 = 0;
		int sumaColumna0 = 0;
		int sumaColumna1 = 0;
		int sumaColumna2 = 0;
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++)
			{
				System.out.println("Introducir valores de TABLA1 " + i + "-" + j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		//Calcular la suma
		
		sumaFila0= tabla[0][0]+ tabla[0][1]+tabla[0][2];
		for ( j=0;j<3;j++) {
			sumaFila0= sumaFila0 + tabla[i][j];
		}
		for ( j=0;j<3;j++) {
			sumaFila0= sumaFila0 + tabla[i][j];
		}
		for ( j=0;j<3;j++) {
			sumaFila0= sumaFila0 + tabla[i][j];
		}
		for ( j=0;j<3;j++) {
			sumaFila0= sumaFila0 + tabla[i][j];
		}
	/*	System.out.println("La suma de las filas es: " + sumaFila());
		teclado.close();
		System.out.println("La suma de las columnas es: " + sumaColumna);*/

	}

}
