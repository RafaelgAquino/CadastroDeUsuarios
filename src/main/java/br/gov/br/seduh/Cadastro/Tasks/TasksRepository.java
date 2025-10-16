package br.gov.br.seduh.Cadastro.Tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface   TasksRepository extends JpaRepository<TasksModel, Long> {
}
