package com.everis.capacitacion.streams.consumer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.everis.capacitacion.streams.consumer.modelo.Mensaje;

public interface ModeloRepositorio extends MongoRepository<Mensaje, Long>{

}
