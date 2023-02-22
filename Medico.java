/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author usuario
 */
public class Medico extends Trabajador{
    private int ncol;
    private int pacientes;
    private EspecialidadMedico EspecialidadMedico;
    
    public Medico(int ncol, int pacientes, EspecialidadMedico EspecialidadMedico, String nombre, int ide, double sueldo) {
        super(nombre, ide, sueldo);
        this.ncol = ncol;
        this.pacientes = pacientes;
        this.EspecialidadMedico = EspecialidadMedico;
    }

    public EspecialidadMedico getEspecialidadMedico() {
        return EspecialidadMedico;
    }

    public void setEspecialidadMedico(EspecialidadMedico EspecialidadMedico) {
        this.EspecialidadMedico = EspecialidadMedico;
    }

    public int getNcol() {
        return ncol;
    }

    public void setNcol(int ncol) {
        this.ncol = ncol;
    }

    public int getPacientes() {
        return pacientes;
    }

    public void setPacientes(int pacientes) {
        this.pacientes = pacientes;
    }
    
    
}
