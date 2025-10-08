/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej32;

import java.util.Scanner;

/**
 *
 * @author Alfaro
 */
public class T2Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);//Creo el objeto entrada
    
        int dinero; int billetes50; int billetes20; int billetes10; int billetes5; int monedas2; int monedas1;//Declaro las variables
    
        System.out.println("Por favor, introduzca una cantidad de dinero: ");//Creo la frase donde le solicito al usuario una cantidad de dinero 
    
        dinero= entrada.nextInt();//Asocio el valor dinero al número que le solicito al usuario 
        
        billetes50= dinero/50;
        billetes20= dinero%50/20;
        billetes10= ((dinero%50)%20)/10;
        billetes5= (((dinero%50)%20)%10)/5;
        monedas2= dinero%50%20%10%5/2;
        monedas1= dinero%50%20%10%5%2/1;//Realizo los cálculos
        
        System.out.println(dinero+"Euros se descomponen en "+billetes50+" billetes de 50 euros, "+billetes20+" billetes de 20 euros, "+billetes10+" billetes de 10 euros, "+billetes5+" billetes de 5 euros, "+monedas2+" monedas de 2 euros, "+monedas1+" monedas de 1 euro.");
          
    }
    
}
