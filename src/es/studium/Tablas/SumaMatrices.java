package es.studium.Tablas;

import java.util.Scanner;

public class SumaMatrices
{

	public static void main(String[] args)
	{
		int tabla1[][] = new int[3][3];
		int tabla2[][] = new int[3][3];
		int suma[][] = new int[3][3];
		int i,j;
		Scanner teclado = new Scanner(System.in);

		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++)
			{
				System.out.println("Introducir valores de TABLA1 " + i + "-" + j);
				tabla1[i][j] = teclado.nextInt();

			}

		}
		for ( i = 0; i < 3; i++)
		{
			for ( j = 0; j < 3; j++)
			{
				System.out.println("Introducir valores TABLA2" + i + "-" + j);
				tabla2[i][j] = teclado.nextInt();
			}
			}
			
			//Sumamos los valores de las dos tablas y los metemos en la variable suma
			for ( i = 0; i < 3; i++)
			{
				for ( j = 0; j < 3; j++)
				{
					suma[i][j] = tabla1[i][j] + tabla2[i][j];
				}
			}
			for ( i = 0; i < 3; i++)
			{
				for ( j = 0; j < 3; j++)
				{
					System.out.print(suma[i][j]+" ");
				
					
				}
				System.out.println();

				teclado.close();
			}
		}
	}

