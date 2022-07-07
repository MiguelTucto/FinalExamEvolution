package com.pe.practicingfinalexam1.services;

import com.pe.practicingfinalexam1.entities.Cliente;

import java.util.Optional;

public interface ClienteService extends CrudService<Cliente, Long>{
    Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception;
}
