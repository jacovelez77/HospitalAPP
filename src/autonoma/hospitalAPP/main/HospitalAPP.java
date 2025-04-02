/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.hospitalAPP.main;

/**
 *
 * @author esteb
 */

public class HospitalAPP {
       public static void main(String[] args) {
        
        HospitalAPP hospital = new HospitalAPP();
        VentanaPrincipal ventana = new VentanaPrincipal(hospital);
        ventana.setVisible(true);


        
    }
    
}

