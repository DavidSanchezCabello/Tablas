package es.studium.Tablas;

import java.util.Scanner;

public class Traspuesta
{

	public static void main(String[] args)
	{
		int tabla[][] = new int[3][3];
		int traspuesta[][] = new int[3][3];

		Scanner teclado = new Scanner(System.in);
		// Leemos los valores de la tabla
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println("Valor de " + i + "-" + j);
				tabla[i][j] = teclado.nextInt();
			}
			//Asignar los valores de tabla i,j a traspuesta j,i
		}
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				traspuesta[j][i] = tabla[i][j];

			}

		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.print(traspuesta[i][j]+" ");
			}
			System.out.println();
		teclado.close();
	}
	}

}
