/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej6;

import java.util.Scanner;
/**
 *
 * @author Alfaro
 */
public class T3Ej6 {
    
    public static void main(String[] args) {
    
        Scanner entrada=new Scanner(System.in);//creo el objeto entrada

        float nota;//introduzco la variable nota
    
        System.out.println("Por favor, introduzca su nota(numerica): ");// solicito al usuario que introduzca su nota de forma numerica
        
        nota = entrada.nextFloat();//asocio la cifra que me de el usuario a la variable nota
        
        if ((nota>0)&(nota<=4)) {
            System.out.println("Su calificacion es un suspenso");
        } else if ((nota>4)&(nota<7)) {
            System.out.println("Su calificacion es un bien");
        } else if ((nota>=7)&(nota<=8)) {
            System.out.println("Su calificacion es un notable");
        } else if ((nota>=9)&(nota<=10)) {
            System.out.println("Su calificacion es un exccelente");
        } else {
            System.out.println("La nota introducidad no es correcta, ERROR");
        }   
    }  
}
