/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoria;

import futbolista.Futbolista;
import java.util.Scanner;

/**
 *
 * @author 57305
 */
public class Convocatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada  = new Scanner (System.in);
        int opcion;
        int contador=0;
        
        Futbolista[] futbolistas= new Futbolista[5];
        
        do{
        
            System.out.println("Bienvenidos");
            System.out.println("************");
            System.out.println("1. Agregar Futbolista");
            System.out.println("2. Buscar Futbolista");
            System.out.println("3. Editar Futbolista");
            System.out.println("4. Mostrar Convocatoria");
            System.out.println("5. Salir");
            System.out.println("");
            
            System.out.print("Digite una opción: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
            
                case 1:
                    if(contador<=5){
                    
                    }else{
                    
                        System.out.println("No se permiten más jugadores");
                        
                    }
                    futbolistas[contador]=new Futbolista();
                    
                    System.out.println("Digite el numero de la camiseta: ");
                    futbolistas[contador].setNumeroCamiseta(entrada.nextInt());
                    
                    System.out.println("Digite el nombre del futbolista: ");
                    futbolistas[contador].setNombre(entrada.next());
                    
                    System.out.println("Digite el apellido del futbolista: ");
                    futbolistas[contador].setApellido(entrada.next());
                    
                    System.out.println("Digite la posición del futbolista: ");
                    futbolistas[contador].setPosicion(entrada.next());
                    
                    System.out.println("Digite la edad del futbolista: ");
                    futbolistas[contador].setEdad(entrada.nextInt());
                    
                    System.out.println("Digite el club del futbolista: ");
                    futbolistas[contador].setEquipo(entrada.next());
                    contador++;
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    
                    for (int i=0; i<contador; i++) {
                        System.out.println(futbolistas[i].getNumeroCamiseta());
                        System.out.println(futbolistas[i].getNombre());
                        System.out.println(futbolistas[i].getApellido());
                        System.out.println(futbolistas[i].getPosicion());
                        System.out.println(futbolistas[i].getEdad());
                        System.out.println(futbolistas[i].getEquipo());
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
                
            }
            
        }while(opcion!=5);
        
    }
    
}
