package com.everis.capacitacion.streams.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.capacitacion.streams.producer.modelo.Mensaje;
import com.everis.capacitacion.streams.producer.services.ProductorDeMensajes;

@RestController
@RequestMapping("/everis/capacitacion")
public class ControladorProductor {
	
	@Autowired
	private ProductorDeMensajes productorDeMensajes;
	
	@PostMapping(path = "/taller1/publicarMensaje", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public void registrarItemsEnCesta(@RequestBody Mensaje mensaje) {
		productorDeMensajes.registrarMensajeEnCola(mensaje);
	}

}
