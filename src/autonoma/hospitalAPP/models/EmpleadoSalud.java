/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalAPP.models;

/**
 *
 * @author esteb
 */
//se crea empeladosalud que hace polimorfismo y hereda atributos de la clase Empleado
public class EmpleadoSalud extends Empleado {
    private String especialidad;
    private int horasTrabajadas;
    
    // constructor

    public EmpleadoSalud(String especialidad, int horasTrabajadas, String nombre, int numeroDocumento, int edad, String area) {
        super(nombre, numeroDocumento, edad, area);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }
        //getters and setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
  
    @Override
    public double calcularSalarioNeto() {
        return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }
 }

    