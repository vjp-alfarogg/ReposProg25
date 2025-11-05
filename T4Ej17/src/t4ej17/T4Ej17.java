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
    
    public static char generarLetraAleatoria(){//metodo para generar letra en codigo ASCII
        return (char) (Math.random()*(122-97+1)+97);
    }
    public static char pedirLetra(){//metodo para pedir una letrea al usuario
        Scanner entrada= new Scanner(System.in);//objeto scanner
        System.out.println("Por favor, introduzca una letra minuscula: ");
        return entrada.nextLine().charAt(0);
    }
    public static boolean comprobaLetra(char letraUsuario, char letraAleatoria){
        if (letraUsuario<letraAleatoria) {//sim la letra del usuario esta antes en del abecedario
            System.out.println("Su letra seleccionada esta despues en el abecedario.");
        }else if (letraUsuario>letraAleatoria) {//si la letra esta despued en el abecedario
            System.out.println("Su letra seleccionada esta antes en el abecedario.");
        }else {//si la letra coincide
            System.out.println("Correcto, ha adivinado la letra.");
            return true;//devuelve true si acierta
        }
        return false;//devuelve false si no acierta
    }
    public static void main(String[] args) {
        char letraAleatoria= generarLetraAleatoria();//genero letra secreta
        boolean acertado= false;
        int intentos= 0;//contador de intentos
        System.out.println("Adivina la letra entre 'a' y 'z'.");
        
        do {            
            char letraUsuario= pedirLetra();//se pide una letra al usuario
            intentos++;//cuento num de intentos
            acertado= comprobaLetra(letraUsuario, letraAleatoria);
        } while (!acertado);//el bucle continua hasta que acierte
        
        System.out.println("Numero de intentos: "+intentos);//cuando acierte se muestra el num total de aciertos
    }
}
