package com.pe.practicingfinalexam1.services.impls;

import com.pe.practicingfinalexam1.entities.DetalleVenta;
import com.pe.practicingfinalexam1.repositories.DetalleVentaRepository;
import com.pe.practicingfinalexam1.services.DetalleVentaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    private DetalleVentaRepository detalleVentaRepository;


    @Override
    public DetalleVenta save(DetalleVenta entity) throws Exception {
        return detalleVentaRepository.save(entity);
    }

    @Override
    public List<DetalleVenta> findAll() throws Exception {
        return detalleVentaRepository.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(Long id) throws Exception {
        return detalleVentaRepository.findById(id);
    }

    @Override
    public DetalleVenta update(DetalleVenta entity) throws Exception {
        return detalleVentaRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        detalleVentaRepository.deleteById(id);
    }
}
