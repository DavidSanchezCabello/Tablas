package es.studium.Tablas;

import java.util.Scanner;
import java.util.Vector;

public class Suma2
{

	public static void main(String[] args)
	{
		int numero;
		Vector<Integer>recta=new Vector<Integer>();
		Scanner teclado=new Scanner(System.in);
		//Rellenar por el usuario
		do {

			System.out.println("Introduzca un número entero(0 para salir)");

			numero=teclado.nextInt();
			if(numero!=0) {
				recta.addElement(numero);
			}


		}while(numero!=0);
		//Muestra por pantalla los resultados
		System.out.println("Tamaño: "+recta.size());
		System.out.println("Capacidad: "+ recta.capacity());
		System.out.println("Suma de valores: "+sumar(recta));
		teclado.close();
	}
	public static int sumar(Vector<Integer> v) {
		//Recorre el vector para calcular la suma
		int suma=0;
		for (int i=0;i<v.size();i++) {
			suma += v.elementAt(i);
		}
		return suma;
	}

}
