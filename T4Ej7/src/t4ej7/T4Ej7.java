/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej7;
import java.util.Scanner;

/**
 *
 * @author Alfaro
 */
public class T4Ej7 {

    public static void metodoBurbuja(int a,int b, int c, int d){
        int aux;
        for (int i = 0; i < 3; i++) {
            if (a>b) {
                aux=b; b=a; a=aux;
            }
            if (b>c) {
                aux=c; c=b; b=aux;
            }
            if (c>d) {
                aux=d; d=c; c=aux;
            }
        }
        System.out.println("El orden de los numeros introducidos es el: "+a+"-"+b+"-"+c+"-"+d);
    }
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner entrada=new Scanner(System.in);    
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        
        metodoBurbuja(num1, num2, num3, num4);
    }      
}

