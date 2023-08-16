package br.zsiffre.gnbfc.business_layer.services.Work;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface WorkService {
    Page<WorkEntity> findAll(int page, int offset);
    List<WorkEntity> findAll();
    WorkEntity getOne(Integer id);
    Optional<WorkEntity> findOneById(int id);
    void insert(WorkEntity work);
    void delete(Integer id);
    void updatePartial(Integer id,WorkEntity work);
    void updateAll(Integer id,WorkEntity iwork);
}
