package es.studium.Tablas;

public class SumaPosicion
{

	public static void main(String[] args)
	{
		int tabla[][]=new int[10][10];
		for(int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++) {
				tabla[i][j]=i+j;
			}
		}
		for (int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print("/t"+tabla[i][j]);
			}
		}
		System.out.println("");
	}

}
