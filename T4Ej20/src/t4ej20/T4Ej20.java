/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej20;
import java.util.Scanner;
/**
 *Ej 21, 26, 27 Saber hacer 
 * @author Alfaro
 */
public class T4Ej20 {
    
    public static String capital = "Madrid";
    public static String descubridor= "Colon";//meto las dos respuestas como constantes
    
    public static boolean capital(Scanner entrada) {//metodo para la primera pregunta
        System.out.println("1ªPregunta ¿Cuál es la capital de España?");
        String respuesta= entrada.nextLine();
        
        if (respuesta.equalsIgnoreCase(capital)) {
            System.out.println("Muy bien, respuesta correccta.");
            return true;
        } else {
            System.out.println("No es correcto, la respuesta correcta es "+capital+".");
            return false;
        }
    }
    public static boolean descubridor(Scanner entrada) {//metodo para la segunda pregunta
        System.out.println("2ªPregunta: ¿Quién descubrió América?");
        String respuesta= entrada.nextLine();//hago la pregunta y guardo la respuesta
        
        if (respuesta.equalsIgnoreCase(descubridor)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto la respuesta correcta es "+descubridor+".");
            return false;
        }
    }
    public static void main(String[] args) {//metodo con el titulo del examen y la forma de sumar y mostrar la nota mediante switch 
        Scanner entrada= new Scanner(System.in);
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        int aciertos= 0;
        
        if (capital(entrada)) aciertos++;
        if (descubridor(entrada)) aciertos++;//sumo los aciertos
        
        int nota;
        switch (aciertos) {
            case 2:
                nota=10;
                break;
            case 1:
                nota=5;
                break;
            default:
                nota=0;
                break;
        }
        System.out.println("NOTA DEL EXAMEN: "+nota); //muestro la nota       
    }    
}
