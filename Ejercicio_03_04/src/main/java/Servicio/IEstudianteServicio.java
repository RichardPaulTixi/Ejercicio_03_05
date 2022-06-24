/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Estudiante;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IEstudianteServicio {
    public Estudiante crearEst(Estudiante estudiante);
    public Estudiante bucarPorCodigo(int codigoEstudiante);
    public List<Estudiante> listarEst();
    
}
