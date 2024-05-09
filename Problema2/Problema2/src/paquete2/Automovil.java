/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author User
 */
public class Automovil {
    private String cedula;
    private String marcaVehi;
    private int anioFab;
    private double valorVehi;
    private double valorMatri;
    
    public Automovil(String c, String n, int x, double y){
        cedula = c;
        marcaVehi = n;
        anioFab = x;
        valorVehi = y;
    }
    
    public void calcularValorMatri(){
        int antiguedad = 2024 - anioFab;
        valorMatri = (0.002 * valorVehi) * antiguedad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del automavil\n\n"
                +"Cedula del dueño: %s\n"
                + "Marca de Vehiculo: %s\n"
                + "Año de Fabricacion: %s\n"
                + "Valor de Vehiculo: %.3f\n"
                + "Valor de Matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarcaVehi(),
                obtenerAnioFab(),
                obtenerValorVehi(),
                obtenerValorMatri());
        return cadena;
    }
    
    
    public void establecerCedula(String n){
        cedula = n;
    }
    public void establecerMarcaVehi(String n){
        marcaVehi = n;
    }
    public void establecerAnioFab(int n){
        anioFab = n;
    }
    public void establecerValorVehi(double n){
        valorVehi = n;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerMarcaVehi(){
        return marcaVehi;
    }
    public int obtenerAnioFab(){
        return anioFab;
    }
    public double obtenerValorVehi(){
        return valorVehi;
    }
    public double obtenerValorMatri(){
        return valorMatri;
    }
    
}
