package com.mirellalves.prideDevBank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mirellalves.prideDevBank.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity,Integer>{
	
}