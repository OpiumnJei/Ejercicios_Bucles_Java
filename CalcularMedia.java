//Pedir numeros hasta que se introduzca un 0, luego calcular la media de los numeros introducidos.
package bucles;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       
       int num, media, sumatoria = 0,  j = 0;
       
        System.out.println("Digite un numero: ");
        num = sc.nextInt();
        
        for(int i = 0;num!=0;i++){
            System.out.println("digite otro numero: ");
            num = sc.nextInt();
            sumatoria+=num;
            j = i;
        }
        
       media = sumatoria / j ;
        
        System.out.println("La media es: "+media);
    
    }
    
}
