package es.studium.Tablas;

import java.util.Scanner;

public class PosicionMaximo
{

	public static void main(String[] args)
	{

		int tabla[] = new int[10];
		int maximo = tabla[0];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 9; i++)
		{
			System.out.println("Introduzca un valor para la posición " + i);
			tabla[i] = teclado.nextInt();

		}
		for (int i = 0; i <= 9; i++)
		{

			if (tabla[i] > maximo)
			{

				maximo = tabla[i];

			}
			System.out.println("El valor máximo es:" + maximo);

			for (i = 0; i <= 9; i++)
			{

				if (tabla[i] == maximo)
				{

					System.out.println(i);
				}
			}
		}

		teclado.close();
	}

}
