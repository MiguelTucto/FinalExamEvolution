package com.pe.practicingfinalexam1.services.impls;

import com.pe.practicingfinalexam1.entities.Producto;
import com.pe.practicingfinalexam1.repositories.ProductoRepository;
import com.pe.practicingfinalexam1.services.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Override
    public List<Producto> findAll() throws Exception {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) throws Exception {
        return productoRepository.findById(id);
    }

    @Override
    public Producto update(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        productoRepository.deleteById(id);
    }
}
