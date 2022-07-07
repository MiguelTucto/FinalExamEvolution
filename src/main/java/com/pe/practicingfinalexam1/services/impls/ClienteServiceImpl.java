package com.pe.practicingfinalexam1.services.impls;

import com.pe.practicingfinalexam1.entities.Cliente;
import com.pe.practicingfinalexam1.repositories.ClienteRepository;
import com.pe.practicingfinalexam1.services.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    @Override
    public Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception {
        return clienteRepository.findByNumeroDocumento(numeroDocumento);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) throws Exception {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        clienteRepository.deleteById(id);
    }
}
