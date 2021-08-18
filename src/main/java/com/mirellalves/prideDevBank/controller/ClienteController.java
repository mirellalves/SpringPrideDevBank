package com.mirellalves.prideDevBank.controller;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mirellalves.prideDevBank.entity.ClienteEntity;
import com.mirellalves.prideDevBank.services.ClienteService;

@RestController
public class ClienteController {
	@Autowired
	ClienteService service;
	
	@GetMapping("/cliente")
	public ResponseEntity<ClienteEntity> criarCliente(@RequestParam("nome") String nome,
			@RequestParam("cpf") String cpf, @RequestParam("nomeSocial") String nomeSocial) {
		
		ClienteEntity cliente = service.criarNovoCliente (nome, cpf, nomeSocial);
		URI uri = URI.create("/cliente/"+cliente.getId());
		
		return ResponseEntity.created(uri).body(cliente);
		
		//return("<h1>Cliente cadastrado com sucesso</h1>");
		
	}
	
	@GetMapping("/cliente/{id}")
	@ResponseBody
	public ClienteEntity consultaCliente(@PathVariable("id") Integer id) {
		
		ClienteEntity cliente = service.pesquisaCliente(id);
		
		return cliente;
	}
	
}