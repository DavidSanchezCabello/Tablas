package es.studium.Tablas;

import java.util.Scanner;

public class LetraPorPosicion
{

	public static void main(String[] args)
	{
		char tabla[][] = new char[3][3];
		int matriz[][] = new int[3][3];

		int i,j;
		Scanner teclado = new Scanner(System.in);

		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++)
			{
				System.out.println("Introducir valores de TABLA1 " + i + "-" + j);
				tabla[i][j] = teclado.next().charAt(0);

			}

		}
		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++) {


				matriz[i][j]=tabla[i][j]-96;


			}
		}
		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++) {


				System.out.print(matriz[i][j]+" ");


			}
			System.out.println();
		}
		teclado.close();
	}

}
