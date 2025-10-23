/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej1;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);//Creo el objeto entrada
        
        int numero;//introduzco la variable 
        
        System.out.println("Por favor, introduzca un numero:");//Solicito al usuario que introduzca un número
        
        numero = entrada.nextInt();
            
        if (numero > 0) {
            System.out.println("El numero introducido es positivo");
        }
        else if (numero < 0) {
            System.out.println("El numero introducido es negativo");// mediante if y else combruebo que el número introducido sea positivo o negativo
        }
    }
}