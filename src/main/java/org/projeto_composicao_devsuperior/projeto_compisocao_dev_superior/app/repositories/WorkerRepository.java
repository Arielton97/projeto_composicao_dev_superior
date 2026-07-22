package org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.app.repositories;

import org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
