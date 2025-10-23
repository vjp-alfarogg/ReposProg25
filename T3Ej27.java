/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej27;

import java.util.Scanner;

/**
 *
 * @author Alfaro
 */
public class T3Ej27 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);//Objeto entrada
        int num1, num2, opcion; //Variables
        
        System.out.println("Por favor, introduzca un numero: ");
            num1= entrada.nextInt();//SOlicito primer numero
        System.out.println("Ahora introduzca un segundo numero: ");
            num2= entrada.nextInt();//solicito segundo numero
        
        do {            
            System.out.println("1- Sumar los numeros");
            System.out.println("2- Restar los numeros");
            System.out.println("3- Multiplicar los numeros");
            System.out.println("4- Dividir los numeros");
            System.out.println("5- Salir del programa");//muestro todas las opreaciones posibles
            
            opcion= entrada.nextInt();//asocio las opciones de antes al numero que me introduzca el usuario
            
        switch (opcion) {//mediante la regla switch hago que muestre la operacion que solicite el usuario
            case 1 -> 
                System.out.println("La suma es: " + (num1 + num2));
            case 2 -> 
                System.out.println("La resta es: " + (num1 - num2));
            case 3 -> 
                System.out.println("El producto es: " + (num1 * num2));
            case 4 -> {
                try {
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: no se puede dividir entre 0.");//excepcion de dividir entr 0
                    }
                    System.out.println("La división es: " + (num1 / num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                }
            case 5 -> System.out.println("Ha salido del programa, hasta pronto.");
            default -> System.out.println("Opcion no valida. Intenta de nuevo.");
            }

        } while (opcion != 5);
        
    }
}
