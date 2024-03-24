/*
Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca un 0. 

*/
package bucles;

import java.util.Scanner;


public class IndicarNegativoPositivo {
    public static void main(String[] args){
         Scanner sc =  new Scanner(System.in);
         
    int n;
    
        System.out.println("Digite un numero: ");
        n = sc.nextInt();
        
    while(n!=0){
        if(n>0){
            System.out.println("El numero introducido es positivo");
        }
            else{
                    System.out.println("EL numero introducido es negativo");
                    }
        System.out.println("Digite otro numero: ");
        n = sc.nextInt();
        }
        
        
    }
   
}
