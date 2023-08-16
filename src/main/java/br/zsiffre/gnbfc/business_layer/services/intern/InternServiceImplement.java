package br.zsiffre.gnbfc.business_layer.services.intern;

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
//Methode valable pour les listes et non pour la base de données
    @Override
    public InternEntity getOne(Integer id) {
        return interns.stream()
                .filter(intern -> intern.getId().equals(id))
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

        InternEntity toUpdate= this.internRepository.findById(id).orElseThrow();

        toUpdate.setFirstName(intern.getFirstName());
        toUpdate.setLastName(intern.getLastName());
        this.internRepository.save(toUpdate);
        System.out.println("Je suis là");
        System.out.println(intern.getFirstName());
        System.out.println(intern.getLastName());
    }
}
