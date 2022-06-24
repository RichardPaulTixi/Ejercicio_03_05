/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class AsignaturaServicio implements IAsignaturaServicio{
    private final List<Asignatura> asignaturaList=new ArrayList<>();

    @Override
    public Asignatura crearAsig(Asignatura asignatura) {
        this.asignaturaList.add(asignatura);
        return asignatura;
    }

    @Override
    public List<Asignatura> listarAsig() {
        return asignaturaList;
    }

    @Override
    public Asignatura bucarPorCodigo(int codigoAsignatura) {
        Asignatura asignatura=null;
        for(var d:this.asignaturaList){
            if(codigoAsignatura==d.getCodigo()){
                asignatura=d;
                break;
            }
        }
        return asignatura;
    }
    
    
}
