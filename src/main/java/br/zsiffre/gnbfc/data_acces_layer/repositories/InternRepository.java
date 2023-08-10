package br.zsiffre.gnbfc.data_acces_layer.repositories;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<InternEntity,Integer>{}


