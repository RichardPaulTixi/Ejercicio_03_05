/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Asignatura;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IAsignaturaServicio {
    public Asignatura crearAsig(Asignatura asignatura);
    public Asignatura bucarPorCodigo(int codigoAsignatura);
    public List<Asignatura> listarAsig();
    
}
