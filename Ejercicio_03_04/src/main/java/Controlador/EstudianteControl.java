/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Servicio.EstudianteServicio;
import java.util.List;

/**
 *
 * @author HP
 */
public class EstudianteControl {
    private final EstudianteServicio estudianteServicio=new EstudianteServicio();
    
    public Estudiante crearEst(String [] args){
        var estudiante=new Estudiante(args[0],args[1],args[2],Integer.parseInt(args[3]),
                Integer.parseInt(args[4]));
        
        this.estudianteServicio.crearEst(estudiante);
        return estudiante;
    }
    
    public List<Estudiante> listarEst(){
        return this.estudianteServicio.listarEst();
    }
    
}
