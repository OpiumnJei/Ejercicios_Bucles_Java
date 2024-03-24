/*
Pedir numeros hasta que el usuario digite un cero. 
Luego imprimir la sumatoria de todos los numeros introducidos.
 */
package bucles;

import java.util.Scanner;

public class PedirNumeros {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       
       int num, sumatoria=0;
       
        System.out.println("Digite un numero: ");
        num = sc.nextInt();
        
       while(num!=0){
           System.out.println("Digite otro numero: ");
           num = sc.nextInt();
           sumatoria+=num;
       }
       
        System.out.println("La sumatoria de todos los numeros introducidos es: "+sumatoria);
    
    
    
    }
}
