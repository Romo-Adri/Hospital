/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author usuario
 */
public class TrabajadorNoMedico extends Trabajador{
    private String area;
    private EspecialidadNoMedico EspecialidadNoMedico;

    public TrabajadorNoMedico(String area, EspecialidadNoMedico EspecialidadNoMedico, String nombre, int ide, double sueldo) {
        super(nombre, ide, sueldo);
        this.area = area;
        this.EspecialidadNoMedico = EspecialidadNoMedico;
    }

    public EspecialidadNoMedico getEspecialidadNoMedico() {
        return EspecialidadNoMedico;
    }

    public void setEspecialidadNoMedico(EspecialidadNoMedico EspecialidadNoMedico) {
        this.EspecialidadNoMedico = EspecialidadNoMedico;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
