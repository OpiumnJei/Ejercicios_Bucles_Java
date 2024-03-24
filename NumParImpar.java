
/*
Leer un numero por teclado e indicar si es par o impar.
El proceso se repetira hasta que se introduzca un 0. 
 */
package bucles;

import java.util.Scanner;


public class NumParImpar {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite un numero: ");
        n = sc.nextInt();
        
        while(n!=0){
             if(n % 2 == 0){
                 System.out.println("El numero " +n+" es par");
             }
             else
             {
                 System.out.println("El numero " +n+" es impar");
             }
             System.out.println("\nDigite otro numero");
             n = sc.nextInt();
             
        }
    }
}
