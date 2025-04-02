/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalAPP.models;

/**
 *
 * @author esteb
 */
public class Empleado {
    private String nombre;
    private int numeroDocumento;
    private int edad;
    private double salarioBase = 225;
    private String area;

    public Empleado(String nombre, int numeroDocumento, int edad, String area) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.area = area;
    }
    
    public double calcularSalarioNeto() {
        return salarioBase * 1.2; // 20% adicional
    }
    
    
    
    
}
