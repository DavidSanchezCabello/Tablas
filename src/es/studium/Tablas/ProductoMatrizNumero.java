package es.studium.Tablas;

import java.util.Scanner;

public class ProductoMatrizNumero
{

	public static void main(String[] args)
	{

		int tabla[][] = new int[3][3];
		int resultado[][]=new int[3][3];
		int numero=0;

		int i,j;
		Scanner teclado = new Scanner(System.in);



		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++)
			{
				System.out.println("Introducir valores de TABLA1 " + i + "-" + j);
				tabla[i][j] = teclado.nextInt();

			}

		}
		System.out.println("Introduzca un número");
		numero=teclado.nextInt();
		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++)
			{
				resultado[i][j]= numero*tabla[i][j];
			}
		}
		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++)
			{
				System.out.print(resultado[i][j]+" ");
				
			}
			System.out.println();
		}teclado.close();
	}

}
