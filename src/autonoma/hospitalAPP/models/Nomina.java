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
public class Nomina {
    
    private List<Empleado> empleado;
    private double presupuestoHospital = 1000000;

    public Nomina(double presupuestoHospital) {
        
        this.empleado = new ArrayList<>();
        this.presupuestoHospital = presupuestoHospital;
    }
    
public void generarNomina(){
    double totalNomina = 200;
    for (Empleado empleado : empleado) {
        totalNomina += empleado.calcularSalarioNeto();
    }
    presupuestoHospital -= totalNomina;
    if (presupuestoHospital < 0){
        System.out.print("Alerta el hospital esta en ");
    }
}
     
     
    
}
