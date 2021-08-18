package com.mirellalves.prideDevBank.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirellalves.prideDevBank.entity.ClienteEntity;
import com.mirellalves.prideDevBank.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	ClienteEntity cliente;

	public ClienteEntity criarNovoCliente(String nome, String cpf, String nomeSocial) {
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setNomeSocial(nomeSocial);
		
		clienteRepository.save(cliente);

		return cliente;
	}
	
	public ClienteEntity pesquisaCliente(Integer id) {
		Optional<ClienteEntity> clienteOptional = clienteRepository.findById(id);
		
		if(clienteOptional.isPresent()) {
			return clienteOptional.get();
			
		}
		return null;
		
	}

}