/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Automovil;

/**
 *
 * @author User
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de automóviles a ingresar:");
        int numeroAutomoviles = sc.nextInt();

        for (int i = 1; i <= numeroAutomoviles; i++) {
            System.out.println("Ingrese la cédula del dueño del " + i + "° automóvil :");
            String cedulaDueño = sc.next();
            System.out.println("Ingrese la marca del " + i + "° automóvil :");
            String marca = sc.next();
            System.out.println("Ingrese el año de fabricación del " + i + "° automóvil :");
            int añoFabricacion = sc.nextInt();
            System.out.println("Ingrese el valor del " + i + "° vehículo:");
            double valorVehiculo = sc.nextDouble();

            Automovil auto = new Automovil(cedulaDueño, marca, añoFabricacion, valorVehiculo);
            auto.calcularValorMatri();
            System.out.println("Resultados de los automóviles ingresados:\n");
            System.err.printf("%s\n", auto);
        }
    }
}
