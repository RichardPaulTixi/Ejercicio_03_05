/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Asignatura;
import Modelo.Calificacion;
import Modelo.Estudiante;
import Servicio.AsignaturaServicio;
import Servicio.CalificacionServicio;
import Servicio.EstudianteServicio;
import java.util.List;

/**
 *
 * @author HP
 */
public class CalificacionControl {
    
    private final CalificacionServicio calificacionServicio=new CalificacionServicio();
    private final EstudianteServicio estudianteServicio=new EstudianteServicio();
    private final AsignaturaServicio asignaturaServicio= new AsignaturaServicio();
    
    public Calificacion crear(String [] args){
        
        Estudiante estudiante= this.estudianteServicio.bucarPorCodigo(Integer.parseInt(args[3]));
        Asignatura asignatura= this.asignaturaServicio.bucarPorCodigo(Integer.parseInt(args[2]));
        Calificacion calificacion= new Calificacion(Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),Integer.parseInt(args[2]),
                Integer.parseInt(args[3]),asignatura,estudiante);
        this.calificacionServicio.crearCal(calificacion);
        return calificacion;
    }
    
    public Calificacion buscarCalificacion(String arg){
        return this.calificacionServicio.buscarPorCodigo(Integer.valueOf(arg));
    }

    public Calificacion eliminarCalificacion(String arg){
        return this.calificacionServicio.eliminarCal(Integer.valueOf(arg));
    }
    
    public List<Calificacion> listarCal(){
        return this.calificacionServicio.listarCal();
    }
    
    public Calificacion modificarCal(String [] args){
        Asignatura asignatura= this.asignaturaServicio.bucarPorCodigo(Integer.valueOf(args[3]));
        Estudiante estudiante=this.estudianteServicio.bucarPorCodigo(Integer.valueOf(args[3]));
        Calificacion calificacionNuevo=new Calificacion(Integer.valueOf(args[0]),
                Integer.valueOf(args[1]),Integer.valueOf(args[2]),Integer.valueOf(args[3]),
                asignatura, estudiante);
        this.calificacionServicio.modificarCal(Integer.valueOf(args[0]), calificacionNuevo);
        return calificacionNuevo;
        
    }
    
}
