package br.zsiffre.gnbfc.business_layer.services;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import br.zsiffre.gnbfc.data_acces_layer.repositories.InternRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Service
public class InternServiceImplement implements InternService {


    private final InternRepository internRepository;
    private final List<InternEntity> interns =new ArrayList<>();

    public InternServiceImplement(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    @Override
    public Page<InternEntity> findAll(int page, int offset) {
        return null;
    }

    @Override
    public List<InternEntity> findAll() {
        return this.internRepository.findAll();
    }

    @Override
    public InternEntity getOne(Integer id) {
        return interns.stream()
                .filter(intern -> intern.getId()== id)
                .findAny()
                .orElseThrow( () -> new RuntimeException("Intern doesn't exist") );
    }
    @Override
    public Optional<InternEntity> findOneById(int id) {
        return Optional.empty();
    }

    @Override
    public void insert(InternEntity intern, long workId) {

    }

    @Override
    public void insert(InternEntity intern) {
         this.internRepository.save(intern);
    }

    @Override
    public void delete(Integer id) {

         this.internRepository.deleteById(id);

    }

    @Override
    public void updatePartial(Integer id, InternEntity intern) {
        InternEntity internTmp =this.internRepository.findById(id).orElseThrow();
        internTmp.setFirstName(intern.getFirstName());
        internTmp.setLastName(intern.getLastName());
        this.internRepository.save(internTmp);
    }

    @Override
    public void updateAll(Integer id, InternEntity intern) {
        intern.setId(id);
        this.internRepository.save(intern);
    }


}
