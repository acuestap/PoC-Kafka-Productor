package com.everis.capacitacion.streams.consumer.services;

import java.util.UUID;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

import com.everis.capacitacion.streams.consumer.modelo.Mensaje;
import com.everis.capacitacion.streams.consumer.repository.ModeloRepositorio;

@Service
public class ConsumidorDeMensajes {
	//private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ConsumidorDeMensajes.class);

	@Autowired
	private ModeloRepositorio modeloRepositorio;
	
	@StreamListener(Sink.INPUT)
	public void leerMensajeDeCola(Mensaje mensaje) {
		mensaje.setGuid(UUID.randomUUID().toString());
		modeloRepositorio.save(mensaje);
		
		//LOGGER.info("ingresando mensaje: "+mensaje.getGuid());
		
		
	}
	
}
