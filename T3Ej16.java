/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej16;

/**
 *
 * @author Alfaro
 */
public class T3Ej16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int numero=20; int revisar; int cantMostrada=0;
        
        do {            
            revisar=numero%2;
            
            if (revisar!=0) {
                System.out.println(numero); 
                }
            numero++;
            cantMostrada++;
        } while (numero!=160);
                        
        System.out.println("La cantidad de numeros impares han sido: "+ cantMostrada/2);
        }
    }    

