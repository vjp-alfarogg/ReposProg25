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
    
    public static int metodoPedirNumero() {
        int num;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero mayor que 0: ");
        num= entrada.nextInt();
        return num; 
    }
    public static int metodoComprobar(int num) {
        Scanner entrada= new Scanner(System.in);
        while (num<=0){
            System.out.println("Error, el numero introducido no es mayor que 0, vuelva intentarlo. ");
            System.out.println("Introduzca un numero mayor que 0");
            num=entrada.nextInt();
        }
        return num;
    }
    public static void metodoMultiplos3 (int num) {
        int cantMostrada= 0;
        System.out.println("Numeros multiplos de 3 entre 1 y "+num+": ");
        for (int i = 3; i <= num; i+=3){
            System.out.println(i);
            cantMostrada++;
        }
        System.out.println("El total de numeros mostrados es: "+cantMostrada);
    }        
    public static void main(String[] args) {
        int num= metodoPedirNumero();
        num= metodoComprobar(num);
        metodoMultiplos3(num);
    }
}
