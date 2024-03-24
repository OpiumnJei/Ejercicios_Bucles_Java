/*
Dadas 6 notas escribir la cantidad de alumnos aprobados > 5, condionados = 4, reprobados < 4;

*/
package bucles;

import java.util.Scanner;

public class CantidadAlumnosAprobados {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        int NotaAlum, aprob = 0, condicionados = 0, reprobados =0;
        
        for(int i = 0; i<6; i++){
            System.out.println("Introduzca una calificacion: ");
            NotaAlum = sc.nextInt();
            
            if(NotaAlum >= 5){
                aprob++;
            }
            if(NotaAlum == 4){
                condicionados++;
            }
            else if(NotaAlum <=3){
                 reprobados++;
            }
                          
        }
        
        
        System.out.println("Cantidad de alumnos aprobados: "+aprob);
        System.out.println("Cantidad de alumnos condicionados: "+condicionados);
         System.out.println("Cantidad de alumnos reprobados: "+reprobados);
    }
    
}
