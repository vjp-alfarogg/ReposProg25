/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej17;
import java.util.Scanner;
/**
 *
 * @author Alfaro
 */
public class T4Ej17 {
    
    public static char generarLetraAleatoria(){//clase para generar letra
        return (char) (Math.random()*(122-97+1)+97);//metodo math random para generar la letra
    }
    public static char pedirLetra(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Por favor, introduzca una letra minuscula: ");
        return entrada.nextLine().charAt(0);
    }
    public static boolean comprobaLetra(char letraUsuario, char letraAleatoria){
        if (letraUsuario<letraAleatoria) {
            System.out.println("Su letra seleccionada esta despues en el abecedario.");
        }else if (letraUsuario>letraAleatoria) {
            System.out.println("Su letra seleccionada esta antes en el abecedario.");
        }else {
            System.out.println("Correcto, ha adivinado la letra.");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        char letraAleatoria= generarLetraAleatoria();
        boolean acertado= false;
        int intentos= 0;
        System.out.println("Adivina la letra entre 'a' y 'z'.");
        
        do {            
            char letraUsuario= pedirLetra();
            intentos++;
            acertado= comprobaLetra(letraUsuario, letraAleatoria);
        } while (!acertado);
        
        System.out.println("Numero de intentos: "+intentos);
    }
}
