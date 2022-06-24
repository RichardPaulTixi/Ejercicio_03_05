/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Calificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CalificacionServicio implements ICalificacionServicio{
    
    private static List<Calificacion> calificacionesList=new ArrayList<>();

    @Override
    public Calificacion crearCal(Calificacion calificacion) {
        this.calificacionesList.add(calificacion);
        return calificacion;
    }

    @Override
    public Calificacion modificarCal(int codigoCalificacion, Calificacion calificacionNuevo) {
       var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoCalificacion));
       this.listarCal().get(posicion).setCalificacion(calificacionNuevo.getCalificacion());
       this.listarCal().get(posicion).setPromedio(calificacionNuevo.getPromedio());
       this.listarCal().get(posicion).setAsignatura(calificacionNuevo.getAsignatura());
       this.listarCal().get(posicion).setEstudiante(calificacionNuevo.getEstudiante());
       this.listarCal().get(posicion).setCodigoAsig(calificacionNuevo.getCodigoAsig());
       return calificacionNuevo;
    }

    @Override
    public Calificacion eliminarCal(int codigoCalificacion) {
        Calificacion calificacion=this.buscarPorCodigo(codigoCalificacion);
        var posicion=this.buscarPosicion(calificacion);
        this.listarCal().remove(posicion);
        return calificacion;
       
    }

    @Override
    public Calificacion buscarPorCodigo(int codigoCalificacion) {
        Calificacion calificacion=null;
        for(var b:this.calificacionesList){
            if(codigoCalificacion==b.getCodigoEst()){
                calificacion=b;
                break;
            }
        }
        return calificacion;
    }

    @Override
    public List<Calificacion> listarCal() {
        return this.calificacionesList;
    }

    @Override
    public int buscarPosicion(Calificacion calificacion) {
        int posicion=-1;
       for(var b:this.calificacionesList){
           posicion++;
           if(b.getCodigoEst()==calificacion.getCodigoEst()){
               break;
           }
       }
       return posicion;
    }

}
