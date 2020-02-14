package com.alfonsotienda.holaspring.model;

import com.alfonsotienda.holaspring.model.Clientes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Integer>{

 //   Iterable<Cliente> findByName(String name);
    
}