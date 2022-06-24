/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Asignatura {
    private String nombre;
    private int codigo; 
    private int ciclo;
    private int horas; 
    private int matricula; 

    public Asignatura(String nombre, int codigo, int ciclo, int horas, int matricula) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.horas = horas;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return ciclo;
    }

    public void setNivel(int nivel) {
        this.ciclo = nivel;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", codigo=" + codigo + ", nivel=" + ciclo + ", horas=" + horas + ", matricula=" + matricula + '}';
    }
    
    
    
    
}
