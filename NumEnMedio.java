//pedir un numero N, y luego mostrar todos los numeros que hay entre 1 y N.
package bucles;

import java.util.Scanner;

public class NumEnMedio {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digita un numero mmg: ");
        num = sc.nextInt();
        
        for(int i = 1;i<=num;i++){
            System.out.println(i);
        }
            
    }
            
    
}
