/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Calificacion;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ICalificacionServicio {
    public Calificacion crearCal(Calificacion calificacion);
    public Calificacion modificarCal(int codigoCalificacion, Calificacion calificacionNuevo);
    public Calificacion eliminarCal(int codigoCalificacion);
    public Calificacion buscarPorCodigo(int codigoCalificacion);
    public int buscarPosicion(Calificacion calificacion);
    public List<Calificacion> listarCal();
    
}
