/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author usuario
 */
public class TestHospital {
    public static void main(String[] args){
        Trabajador tr = new Trabajador("Paula", 29938392, 2500);
        Medico md = new Medico(3333, 12, EspecialidadMedico.cardiologo, "Gonzalo", 56478392, 3000);
        TrabajadorNoMedico nm = new TrabajadorNoMedico("Primera Planta", EspecialidadNoMedico.recepcionista, "Jose", 65667596, 1800);
        
    }
}
