package com.programandoenjava.spring_boot_docker.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.programandoenjava.spring_boot_docker.Model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
