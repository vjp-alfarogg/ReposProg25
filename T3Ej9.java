/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej9;

import java.util.Scanner;
/**
 *
 * @author Alfaro
 */
public class T3Ej9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int num1; int num2; int num3; int num4; int aux;//Creo las variables
    
    Scanner entrada=new Scanner(System.in);//Creo el objeto entrada
    
    System.out.println("Por favor, introduzca el primer numero: "); num1 = entrada.nextInt(); 
    System.out.println("Ahora, introduzca un segundo numero: "); num2 = entrada.nextInt();
    System.out.println("Introduzca el tercer numero: "); num3 = entrada.nextInt();
    System.out.println("Por ultimo, introduzca un cuarto numero: "); num4 = entrada.nextInt();//solicito al usuario que me introduzca los 4 numeros
    //Primera iteración
    if (num1>num2) {  
        aux=num2; num2=num1; num1=aux;
    }
    if (num2>num3) {
        aux=num3; num3=num2; num2=aux;    
    }
    if (num3>num4) {
        aux=num4; num4=num3; num3=aux; 
    }
    //Segunda iteración
    if (num1>num2) {  
        aux=num2; num2=num1; num1=aux;
    }
    if (num2>num3) {
        aux=num3; num3=num2; num2=aux;    
    }
    if (num3>num4) {
        aux=num4; num4=num3; num3=aux;    
    }
    //Tercera iteración
    System.out.println("El orden de los numeros introducidos es el "+num1+"-"+num2+"-"+num3+"-"+num4);//Creo la muestra del resultado al usuario
    }
}
