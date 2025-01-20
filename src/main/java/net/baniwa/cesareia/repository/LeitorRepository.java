package net.baniwa.cesareia.repository;

import net.baniwa.cesareia.model.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LeitorRepository extends JpaRepository<Leitor, Long> {
    // Adicione métodos de consulta personalizada se necessário

}
