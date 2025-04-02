/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalAPP.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class  Nomina {
    private List<Empleado> empleados;
    private double presupuestoHospital;

    public Nomina(double presupuestoHospital) {
        this.empleados = new ArrayList<>();
        this.presupuestoHospital = presupuestoHospital;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void generarNomina() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados en la nómina.");
            return;
        }
        
        double totalNomina = empleados.stream().mapToDouble(Empleado::calcularSalarioNeto).sum();
        presupuestoHospital -= totalNomina;
        
        System.out.println("Total de nómina generado: " + totalNomina);
        System.out.println("Presupuesto restante del hospital: " + presupuestoHospital);
        
        if (presupuestoHospital < 0) {
            System.out.println("Alerta: El hospital está en quiebra. Ejecutar medidas de emergencia.");
        }
}}