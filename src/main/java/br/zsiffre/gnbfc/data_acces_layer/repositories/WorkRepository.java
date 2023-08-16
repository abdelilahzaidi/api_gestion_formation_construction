package br.zsiffre.gnbfc.data_acces_layer.repositories;


import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<WorkEntity,Integer> {}


