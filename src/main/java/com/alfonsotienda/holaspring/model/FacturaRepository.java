package com.alfonsotienda.holaspring.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
/**
 * FacturaRepository
 */
@Repository
public interface FacturaRepository 
    extends CrudRepository<Factura, Integer>{
    
}