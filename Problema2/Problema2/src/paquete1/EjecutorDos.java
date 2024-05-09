/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.Automovil;
import java.util.Scanner;

public class EjecutorDos {
    Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese la cédula del dueño del automóvil:");
            String cedulaDueño = sc.next();
            System.out.println("Ingrese la marca del automóvil:");
            String marca = sc.next();
            System.out.println("Ingrese el año de fabricación del automóvil:");
            int añoFabricacion = sc.nextInt();
            System.out.println("Ingrese el valor del vehículo:");
            double valorVehiculo = sc.nextDouble();

            Automovil auto = new Automovil(cedulaDueño, marca, añoFabricacion, valorVehiculo);
            auto.calcularValorMatri();

            System.out.println("¿Desea ingresar otro automóvil? (s/n):");
            auto = sc.next().charAt(0);
        } while (auto == 's' || continuar == 'S');

        System.out.println("Resultados de los automóviles ingresados:");
        System.err.printf("%s\n", auto);

    }
}
