/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class EstudianteServicio implements IEstudianteServicio{
    private final List<Estudiante> estudianteList= new ArrayList<>();

    @Override
    public Estudiante crearEst(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
        return estudiante;
        
    }

    @Override
    public List<Estudiante> listarEst() {
       return this.estudianteList;
    }

    @Override
    public Estudiante bucarPorCodigo(int codigoEstudiante) {
        Estudiante estudiante=null;
        for(var c:this.estudianteList){
            if(codigoEstudiante==c.getCodigo()){
                estudiante=c;
                break;
            }
        }
        return estudiante;
    }
    
}
