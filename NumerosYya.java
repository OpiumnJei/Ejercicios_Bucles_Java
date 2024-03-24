/*
 Pedir numeros hasta que se digite uno negativo.
Luego imprimir todos los numeros introducidos.
 */
package bucles;

import java.util.Scanner;


public class NumerosYya {
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); 
		
                int n ,i = 0;
		do{
                    System.out.println("Digite un numero: ");
                    n = sc.nextInt();
                   i++;
                }while(n>=0);
		
                System.out.println("se introdujeron "+i+" numeros");
	}
}



