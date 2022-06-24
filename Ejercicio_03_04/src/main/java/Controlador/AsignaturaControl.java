/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Asignatura;
import Servicio.AsignaturaServicio;
import java.util.List;

/**
 *
 * @author HP
 */
public class AsignaturaControl {
    private final AsignaturaServicio asignaturaServicio=new AsignaturaServicio();
    public Asignatura crearAsig(String [] args){
        var asignatura= new Asignatura(args[0],Integer.valueOf(args[1]),
                Integer.parseInt(args[2]),Integer.parseInt(args[3]),
                Integer.parseInt(args[4]));
        
        this.asignaturaServicio.crearAsig(asignatura);
        return asignatura;
    }
    public List<Asignatura> listarAsig(){
        return this.asignaturaServicio.listarAsig();
        
    }
    
}
