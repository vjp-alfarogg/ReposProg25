/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej26;

import java.util.Scanner;

/**
 *
 * @author Alfaro
 */
public class T2Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);// Creo el objeto entrada
        
            System.out.println("Por favor, introduzca un número de 4 cifras:");
        
        long numeroEntero; long millar; long centena; long decena; long unidad;//Introduzco las variables
        
        numeroEntero= entrada.nextLong();
                
        millar= numeroEntero/1000;//Divido el número del usuario entre mil para obtener la primera crifra
            System.out.println("La primera cifra es "+millar);
        centena= (numeroEntero%1000)/100;//Con el resto de la anterior operación, la divido entre cien para obtener la segunda cifra
            System.out.println("La segunda cifra es "+centena);
        decena= (numeroEntero%100)/10;//Calculo el resto de la anterior operación para esta vez dividirlo entre cien y obtener la tercera cifra
            System.out.println("La tercera cifra es "+decena);
        unidad= numeroEntero%10;
            System.out.println("La cuarta cifra es "+unidad);//Por último, calculo el resto directamente para obtener la cuarta cifra
       
         
        
        
        
        
        
        
        
        
    }
    
}
