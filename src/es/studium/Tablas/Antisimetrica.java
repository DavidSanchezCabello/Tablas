package es.studium.Tablas;

import java.util.Scanner;

public class Antisimetrica
{

	public static void main(String[] args)
	{	
		int tabla[][]=new int[3][3];
		boolean antisimetrica=true;
		Scanner teclado = new Scanner(System.in);
		//Leemos los valores de la tabla
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.println("Valor de"+i+"-"+j);				
				tabla[i][j]=teclado.nextInt();
			}
		}
		//Recorremos la tabla para ver si es correcta
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(tabla[i][j]!=tabla[j][i]) {
					antisimetrica = false;
					i=3;
					j=3;
				}
			}
		}
		if(antisimetrica) {
			System.out.println("Es antisimétrica");
		}else {
			System.out.println("No es antisimetrica");
		}
		teclado.close();	
		}

}
