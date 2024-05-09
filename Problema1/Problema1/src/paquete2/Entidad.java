/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author User
 */
public class Entidad {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public Entidad (String n, double c1, double c2){
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (calificacion1 + calificacion2) / 2;
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
    
    public Entidad(String n, double c1, double c2, double c3){
        nombre = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    @Override
    public String toString() {
        String cadena = String.format("Calificaciones\n\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion1:  %.2f\n"
                + "Calificacion2: %.2f\n"
                + "Calificacion3: %.2f\n"
                + "Promedio Final: %.2f\n",
                obtenerNombre(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerCalificacion1(double n){
        calificacion1 = n;
    }
    public void establecerCalificacion2(double n){
        calificacion2 = n;
    }
    public void establecerCalificacion3(double n){
        calificacion3 = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public double obtenerCalificacion1(){
        return calificacion1;
    }
    public double obtenerCalificacion2(){
        return calificacion2;
    }
    public double obtenerCalificacion3(){
        return calificacion3;
    }
    public double obtenerPromedio(){
        return promedio;
    }
    
}
