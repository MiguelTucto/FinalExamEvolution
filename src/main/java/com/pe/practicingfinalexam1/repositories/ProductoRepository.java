package com.pe.practicingfinalexam1.repositories;

import com.pe.practicingfinalexam1.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
