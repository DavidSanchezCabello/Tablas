package es.studium.Tablas;

import java.util.Scanner;

public class Cuadrados 
{

	public static void main(String[] args) 
	{
		Scanner teclado=new Scanner(System.in);
		int num1[]=new int[10];
		int numero;
		System.out.println("Introduzca un número");
		numero=teclado.nextInt();

		for(int i=0;i<10;i++) 
		{
			num1[i]=i+numero+1;
		}
		for(int i=0;i<10;i++) 
		{
			num1[i]=num1[i]*num1[i];
		}teclado.close();
		for(int i=0;i<10;i++) {
			System.out.println(num1[i]);
		}
	}

}