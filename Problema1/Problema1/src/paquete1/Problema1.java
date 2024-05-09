/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import java.util.Scanner;
import paquete2.Entidad;

public class Problema1 {

    public static void main(String[] args) {
        
        String n;
        double calificacion1, calificacion2, calificacion3;
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("Menú:");
            System.out.println("1. Crear estudiante con nombre, calificación 1 y calificación 2");
            System.out.println("2. Crear estudiante con nombre, calificación 1, 2 y 3");

            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del estudiante:");
                n = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese la calificación 1:");
                calificacion1 = sc.nextDouble();
                System.out.println("Ingrese la calificación 2:");
                calificacion2 = sc.nextDouble();
                sc.nextLine();
                Entidad e = new Entidad(n, calificacion1, calificacion2);
                e.toString();
                System.err.printf("%s\n",e);
                sc.nextLine();
                System.out.println("Estudiante ingresado:");
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del estudiante:");
                n = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese la calificación 1:");
                calificacion1 = sc.nextDouble();
                System.out.println("Ingrese la calificación 2:");
                calificacion2 = sc.nextDouble();
                System.out.println("Ingrese la calificación 3:");
                calificacion3 = sc.nextDouble();
                sc.nextLine();
                Entidad e = new Entidad(n, calificacion1, calificacion2, calificacion3);
                e.toString();
                System.err.printf("%s\n", e);
                System.out.println("Estudiante ingresado...!");
                
            } else {
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }
    }
    
}
