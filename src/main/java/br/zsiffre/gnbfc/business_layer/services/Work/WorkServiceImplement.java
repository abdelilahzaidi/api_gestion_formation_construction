package br.zsiffre.gnbfc.business_layer.services.Work;

import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import br.zsiffre.gnbfc.data_acces_layer.repositories.ClientRepository;
import br.zsiffre.gnbfc.data_acces_layer.repositories.InternRepository;
import br.zsiffre.gnbfc.data_acces_layer.repositories.WorkRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Service
public class WorkServiceImplement implements WorkService {

    private final ClientRepository clientRepository;
    private final WorkRepository workRepository;
    private final InternRepository internRepository;
    private final List<WorkEntity> works =new ArrayList<>();

    public WorkServiceImplement(ClientRepository clientRepository, WorkRepository workRepository, InternRepository internRepository) {
        this.clientRepository = clientRepository;
        this.workRepository = workRepository;
        this.internRepository = internRepository;
    }

    @Override
    public Page<WorkEntity> findAll(int page, int offset) {
        return null;
    }

    @Override
    public List<WorkEntity> findAll() {
        return this.workRepository.findAll();
    }

    @Override
    public WorkEntity getOne(Integer id) {
        return null;
    }

    @Override
    public Optional<WorkEntity> findOneById(int id) {
        return Optional.empty();
    }

    @Override
    public void insert(WorkEntity work) {
        this.workRepository.save(work);
    }

//    public void beginWork(int internId, int trolleyId, int clientId) {
//        WorkEntity work = new WorkEntity();
//        InternEntity intern = this.internRepository.findById(internId).orElseThrow();
//        work.setInternEntities(intern);
//        this.workRepository.save(work);
//    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void updatePartial(Integer id, WorkEntity work) {

    }
    @Override
    public void updateAll(Integer id, WorkEntity iwork) {

    }

    @Override
    public WorkEntity beginWork(int internId, int clientId) {
        WorkEntity work = new WorkEntity();
        InternEntity intern = this.internRepository.findById(internId).orElseThrow();
        ClientEntity client = this.clientRepository.findById(clientId).orElseThrow();
        work.setInternEntities(intern);
        work.setClientEntities(client);
        return this.workRepository.save(work);
    }

}
