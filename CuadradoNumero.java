
/*
Leer un numero y mostrar su cuadrado, repetir hasta que se introduzca un numero negativo.
*/
package bucles;

import java.util.Scanner;


public class CuadradoNumero {
    public static void main(String[]args){
    
    Scanner sc =  new Scanner(System.in);
    
    int n,m;
    
        System.out.println("Introduzca un numero: ");
        n = sc.nextInt();
        
        while(n>0){
            m = n*n;
            System.out.println("Resultado: "+m);
            System.out.println("Digite otro numero: ");
            n= sc.nextInt();
        }
          
    
    
    
    
    
    }
    
}
