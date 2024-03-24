/*
pedir 10 sueldos, Mostrar su suma y cuantos hay mayores de 1000.

*/

package bucles;

import java.util.Scanner;

public class SumaSueldo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        int sueldos=0, sumatoria=0, mayoresMil=0;
        
        for(int i = 0;i<10;i++){
            System.out.println("Digite un sueldo: ");
            sueldos =  sc.nextInt();
            
            sumatoria+=sueldos;
            
            if(sueldos>1000){
                mayoresMil++;
            }
           
        }
        
        System.out.println("Sumatoria de todos los sueldos: "+sumatoria);
         if(mayoresMil==0){
            
                System.out.println("No se introdujeron cifras mayores a mil.");
            }
         else
         {
           System.out.println("Se introdujeron "+mayoresMil+" sueldos mayores a 1000");
         }    
  
            
    }
}
