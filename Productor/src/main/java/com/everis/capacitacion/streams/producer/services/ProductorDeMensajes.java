package com.everis.capacitacion.streams.producer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.everis.capacitacion.streams.producer.modelo.Mensaje;

@Service
public class ProductorDeMensajes {
	@Autowired
	private Source source;
	
	@SendTo(Source.OUTPUT)
	public String registrarMensajeEnCola(Mensaje mensaje) {
		
		source.output().send(MessageBuilder.withPayload(mensaje).build());
		
		return "poniendo en cola el mensaje: " + mensaje;
		
	}
	

}
