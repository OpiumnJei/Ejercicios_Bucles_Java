/*
Pedir 10 numeros al usuario mediante teclado e imprimir la sumatoria de los numeros introducidos.
 */
package bucles;

import java.util.Scanner;

public class SumaTotalNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n, sumatoria = 0;
        
        for(int i = 1; i<=10; i++){
         System.out.println("Introd un numero: ");
        n = sc.nextInt();
        sumatoria+=n;
        }
  
        
        System.out.println("Suma total de todos los numeros: "+sumatoria);
    
    
    
    
    }
}
