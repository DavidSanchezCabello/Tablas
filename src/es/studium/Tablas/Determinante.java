package es.studium.Tablas;

import java.util.Scanner;

public class Determinante
{

	public static void main(String[] args)
	{
		int i, j;
		int matriz[][] = new int[3][3];
		double determinante = 0.;
		Scanner teclado = new Scanner(System.in);
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++)
			{
				System.out.println("Valor de " + i + "-" + j);
				matriz[i][j] = teclado.nextInt();
			}
		}

		determinante = matriz[0][0] * matriz[1][1] + matriz[2][2] * matriz[2][0] + matriz[0][1] * matriz[1][2]
				+ matriz[1][0] * matriz[2][1] + matriz[0][2];

		determinante = determinante - matriz[2][0] * matriz[1][1] * matriz[0][2]
				- matriz[0][0] * matriz[2][1] * matriz[1][2] - matriz[1][0] * matriz[0][1] - matriz[2][2];
		System.out.println("El determinante vale " + determinante);
		teclado.close();
	}

}
