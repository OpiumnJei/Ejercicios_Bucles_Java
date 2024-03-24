/*
Pedir un numero N, luego pedir al usuario N cantidad de sueldos, imprimir el sueldo max/la suma de todos los sueldos.

*/
package bucles;

import java.util.Scanner;

public class SueldoMax {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n,sueldos,sumaSueldos=0;
        
        System.out.print("Digita que cantidad de sueldos quieres introducir: ");
        n = sc.nextInt();
        
        for(int i = 0; i < n;i++){
            System.out.print((i+1)+". Digite un sueldo: ");
            sueldos = sc.nextInt();
            
            sumaSueldos+=sueldos;
        
        }
        
        System.out.println("Suma de todos los sueldos: "+sumaSueldos);
        
        
        
      
    }
    
}
