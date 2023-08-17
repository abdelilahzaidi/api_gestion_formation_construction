package br.zsiffre.gnbfc.business_layer.services.client;

import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import br.zsiffre.gnbfc.data_acces_layer.repositories.ClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Service
public class ClientServiceImplement implements ClientService{

    private final ClientRepository clientRepository;
    private final List<ClientEntity> interns =new ArrayList<>();

    public ClientServiceImplement(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Page<ClientEntity> findAll(int page, int offset) {
        return null;
    }

    @Override
    public List<ClientEntity> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public ClientEntity getOne(Integer id) {
        return null;
    }

    @Override
    public Optional<ClientEntity> findOneById(int id) {
        return Optional.empty();
    }

    @Override
    public void insert(ClientEntity intern, long workId) {

    }

    @Override
    public void insert(ClientEntity client) {
        this.clientRepository.save(client);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void updatePartial(Integer id, ClientEntity client) {

    }

    @Override
    public void updateAll(Integer id, ClientEntity client) {

    }
}
