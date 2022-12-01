package com.example.EstudianteApi.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EstudianteApi.Modelos.EstudianteModelo;
import com.example.EstudianteApi.Servicios.EstudianteServicio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/estudiante")
@CrossOrigin("*")
public class EstudianteControl {
    @Autowired
    EstudianteServicio servicio;
    
    
    @PostMapping(path="/guardar")
    public EstudianteModelo guardaEstudiante(@RequestBody EstudianteModelo estudiante) {
        return servicio.guardaEstudiante(estudiante);
    }

    @GetMapping(path    = "/ver")
    public ArrayList<EstudianteModelo> verEstudiante(){
        return servicio.verEstudiantes();
    }

    @GetMapping(path="/verestudiante/{id}")
    public Optional<EstudianteModelo> verEstudiante(@PathVariable("id") Long id){
        return servicio.verEstudiante(id);
    }

    @GetMapping(path="/buscarcorreo/{correo}")
    public ArrayList<EstudianteModelo> buscaXcorreo(@PathVariable("correo") String correo){
        return servicio.buscarXcorreo(correo);
    }

    @DeleteMapping(path = "borrar/{id}")
    public boolean borrarestudiante(@PathVariable("id") Long id){
        return servicio.borrar(id);
    }
   
    
}
