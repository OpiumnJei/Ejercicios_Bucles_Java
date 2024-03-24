/*
 Pedir un numero mediante teclado y calcular su factorial.
 */
package bucles;

import java.util.Scanner;


public class Factorial {
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            
            int n, factorial = 1;
            
            System.out.println("Digite un numero: ");
            n = sc.nextInt();
            
            for(int i = 1;i<=n;i++){
            factorial*=i;
            }
            
            System.out.println("El factorial es: "+factorial);
        
            }
}
