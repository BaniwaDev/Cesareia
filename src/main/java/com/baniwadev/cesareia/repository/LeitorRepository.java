package com.baniwadev.cesareia.repository;

import com.baniwadev.cesareia.model.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeitorRepository extends JpaRepository<Leitor, Long>{
    // Adicione métodos de consulta personalizada se necessário

}
