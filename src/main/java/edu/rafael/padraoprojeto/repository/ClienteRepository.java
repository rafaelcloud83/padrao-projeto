package edu.rafael.padraoprojeto.repository;

import edu.rafael.padraoprojeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
