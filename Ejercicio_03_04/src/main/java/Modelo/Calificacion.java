/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Calificacion {
    private int calificacion;
    private int promedio;
    private int codigoEst;
    private int codigoAsig;
    private Asignatura asignatura; 
    private Estudiante estudiante;

    public Calificacion(int calificacion, int promedio, int codigoEst, int codigoAsig) {
        this.calificacion = calificacion;
        this.promedio = promedio;
        this.codigoEst = codigoEst;
        this.codigoAsig = codigoAsig;
    }

    public Calificacion(int calificacion, int promedio, int codigoEst, int codigoAsig, Asignatura asignatura, Estudiante estudiante) {
        this.calificacion = calificacion;
        this.promedio = promedio;
        this.codigoEst = codigoEst;
        this.codigoAsig = codigoAsig;
        this.asignatura = asignatura;
        this.estudiante = estudiante;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getCodigoEst() {
        return codigoEst;
    }

    public void setCodigoEst(int codigoEst) {
        this.codigoEst = codigoEst;
    }

    public int getCodigoAsig() {
        return codigoAsig;
    }

    public void setCodigoAsig(int codigoAsig) {
        this.codigoAsig = codigoAsig;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "calificacion=" + calificacion + ", promedio=" +
                promedio + ", codigoEst=" + codigoEst + ", codigoAsig=" + codigoAsig +
                ", asignatura=" + asignatura.toString() + ", estudiante=" +
                estudiante.toString() + '}';
    }
    
    
    
}
