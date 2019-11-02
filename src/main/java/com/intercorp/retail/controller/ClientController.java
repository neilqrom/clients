package com.intercorp.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intercorp.retail.model.CreateClientRequest;
import com.intercorp.retail.service.ClientService;

@RestController
@RequestMapping("/channel/client")
public class ClientController {

	@Autowired
	 ClientService clientService;
	
    
	@PostMapping(path = "/creacliente" , consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createClient(@RequestBody CreateClientRequest request) {
		if(clientService.addClient(request)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
	
	@GetMapping(path = "/kpideclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> kpiClients() {
		return ResponseEntity.ok(clientService.kpiClients());
	}
	
	@GetMapping(path = "/listclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listClients() {
		return ResponseEntity.ok(clientService.listClients());
	}
}