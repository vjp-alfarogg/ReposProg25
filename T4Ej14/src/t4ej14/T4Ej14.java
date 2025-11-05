/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej14;
import java.util.Scanner;
/**
 *
 * @author Alfaro
 */
public class T4Ej14 {
    
    public static int metodoPedirNumero() { //metodo que pide un num mayor que 0 al usuario y lo devuelve
        int num; //variable para recoger el numero
        Scanner entrada= new Scanner(System.in); //objeto entrada
        System.out.println("Por favor, introduzca un numero mayor que 0: "); 
        num= entrada.nextInt(); //pido el num y lo guardo
        return num; //devuelvo el numero
    }
    public static int metodoComprobar(int num) {
        Scanner entrada= new Scanner(System.in); //objeto entrada
        while (num<=0){ //mientras el numero sea menor o igual a 0 pedimos otro
            System.out.println("Error, el numero introducido no es mayor que 0, vuelva intentarlo. ");
            System.out.println("Introduzca un numero mayor que 0");
            num=entrada.nextInt(); //guardo el nuevo num
        }
        return num; //devuelvo el num
    }
    public static void metodoMultiplos3 (int num) { //metodo que muestra todos los multiplos de 3 entre 1 y el num introducido
        int cantMostrada= 0;
        System.out.println("Numeros multiplos de 3 entre 1 y "+num+": ");
        for (int i = 3; i <= num; i+=3){ //recorro de 3 en 3 hasta el num introducido
            System.out.println(i);
            cantMostrada++; //aumento el contador
        }
        System.out.println("El total de numeros mostrados es: "+cantMostrada); //muestro el total de multiplos encontrados
    }        
    public static void main(String[] args) {
        int num= metodoPedirNumero();//pido el num al usuario
        num= metodoComprobar(num);//compurebo que sea mayor que 0
        metodoMultiplos3(num);//muestro multiplos de 3
    }
}
