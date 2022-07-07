package com.pe.practicingfinalexam1.services.impls;

import com.pe.practicingfinalexam1.entities.Venta;
import com.pe.practicingfinalexam1.repositories.VentaRepository;
import com.pe.practicingfinalexam1.services.VentaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    private VentaRepository ventaRepository;

    @Override
    public Venta save(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Override
    public List<Venta> findAll() throws Exception {
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> findById(Long id) throws Exception {
        return ventaRepository.findById(id);
    }

    @Override
    public Venta update(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        ventaRepository.deleteById(id);
    }
}
