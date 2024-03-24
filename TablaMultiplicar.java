/*
Pedir un numero entre 0  y 10, y luego mostrar la tabla de multiplicar de dicho numero.
 */
package bucles;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	    int n, mult = 0;

		System.out.print("Introduzca un numero: ");
             		n = sc.nextInt();

		for(int i = 1; i <= 10; i++)
		{
			mult = n * i;
			 System.out.print("\n Multiplicacion: " + n + " * " + i + " " + " = " + mult);
		}

	}
}
    

