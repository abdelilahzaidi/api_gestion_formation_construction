package br.zsiffre.gnbfc.data_acces_layer.repositories;


import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity,Integer>{}


