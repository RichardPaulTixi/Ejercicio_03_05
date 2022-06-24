/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Estudiante {
    private String nombre;
    private String carrera;
    private String correo;
    private int codigo;
    private int ciclo;

    public Estudiante(String nombre, String carrera, String correo, int codigo, int ciclo) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.correo = correo;
        this.codigo = codigo;
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + ", correo=" + correo + ", codigo=" + codigo + ", ciclo=" + ciclo + '}';
    }

    
    
}
