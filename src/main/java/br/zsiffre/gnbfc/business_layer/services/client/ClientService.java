package br.zsiffre.gnbfc.business_layer.services.client;

import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Page<ClientEntity> findAll(int page, int offset);
    List<ClientEntity> findAll();
    ClientEntity getOne(Integer id);
    Optional<ClientEntity> findOneById(int id);
    void insert(ClientEntity intern, long clientId);
    void insert(ClientEntity client);
    void delete(Integer id);
    void updatePartial(Integer id,ClientEntity client);
    void updateAll(Integer id,ClientEntity client);
}
