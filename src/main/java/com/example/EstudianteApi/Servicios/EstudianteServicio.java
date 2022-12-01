package com.example.EstudianteApi.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EstudianteApi.Modelos.EstudianteModelo;
import com.example.EstudianteApi.Repositorios.EstudianteRepo;

@Service
public class EstudianteServicio {

    @Autowired
    EstudianteRepo repo;

    public EstudianteModelo guardaEstudiante(EstudianteModelo estudiante){
        return repo.save(estudiante);
    }

    public ArrayList<EstudianteModelo> verEstudiantes(){
        return (ArrayList<EstudianteModelo>) repo.findAll();
    }

    public Optional<EstudianteModelo> verEstudiante(Long id){
        return repo.findById(id);
        
    }

    public ArrayList<EstudianteModelo> buscarXcorreo(String correo){
        return repo.findByCorreo(correo);
    }

    public boolean borrar(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        else{
            return false;    
        }
    }
    
}
