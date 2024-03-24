
/*
Pedir 5 notas, y decir al final si hay algun suspendido.

*/
package bucles;

import java.util.Scanner;

public class CincoNotas {
    public static void main(String[]args){
    
         Scanner sc = new Scanner(System.in);
    
    int nota;
    boolean suspendido = false;
    
    for(int i = 0; i<5; i++){
        
        System.out.println("Digite una calificacion: ");
        nota = sc.nextInt();
        
        if(nota <= 4){
            suspendido = true;
        
        }

}
    
    if(suspendido == true){
        System.out.println("Hay almenos un alumno suspendido");
    
    }
    else{
        System.out.println("No hay alumnos suspendidos");
    
    }
    
    }
   
    
}
