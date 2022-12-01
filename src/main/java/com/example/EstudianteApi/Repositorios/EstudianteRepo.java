package com.example.EstudianteApi.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.EstudianteApi.Modelos.EstudianteModelo;

@Repository
public interface EstudianteRepo extends MongoRepository<EstudianteModelo,Long>{
    ArrayList<EstudianteModelo> findByCorreo(String correo);
}
