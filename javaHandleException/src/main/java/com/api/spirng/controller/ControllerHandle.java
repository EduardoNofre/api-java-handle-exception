package com.api.spirng.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spirng.model.Cliente;
import com.api.spirng.service.HandleService;

@RestController
@Validated
@RequestMapping("/v1/handle")
public class ControllerHandle {

	@Autowired
	HandleService handleService;

	@GetMapping(path = "/teste", produces = MediaType.APPLICATION_JSON_VALUE)
	public String testandoHandle() {

		handleService.testeHandle(1);

		return "teste";
	}

	@PostMapping(path = "/simulaSave", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> testandoHandle(@Valid @RequestBody Cliente cliente) {

		System.out.println(cliente.getEmail());
		
		Cliente responseCliente = cliente;
		
		return new ResponseEntity<>(responseCliente,HttpStatus.OK);
	}
}
