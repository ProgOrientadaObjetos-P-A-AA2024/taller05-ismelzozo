/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.Automovil;
import java.util.Scanner;

public class EjecutorDos {

    public static void main(String[] args) {
        boolean bandera;
        String opcion;
        Scanner sc = new Scanner(System.in);
        bandera = true;
        while (bandera) {
            System.out.println("Ingrese los datos del automovil:");
            System.out.println("Cedula del Dueño: ");
            String cedulaDueño = sc.nextLine();
            System.out.println("Marca del Vehículo: ");
            String marcaVehiculo = sc.nextLine();
            System.out.println("Año de Fabricación: ");
            int añoFabricacion = sc.nextInt();
            System.out.println("Valor del Vehículo: ");
            double valorVehiculo = sc.nextDouble();
            sc.nextLine();
            Automovil auto = new Automovil(cedulaDueño, marcaVehiculo, añoFabricacion, valorVehiculo);
            auto.calcularValorMatri();
           
            System.out.println("¿Desea ingresar otro automovil presione enter para continuar o 'no' para salir? : ");
            opcion = sc.nextLine();
            if (opcion.equals("no")) {
                bandera = false;
            }
            System.out.println("Resultados de los automóviles ingresados:\n");
            System.err.printf("%s\n", auto);
        }
    }
}
