package br.zsiffre.gnbfc.business_layer.services;

import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface InternService {
    Page<InternEntity> findAll(int page, int offset);
    List<InternEntity> findAll();
    InternEntity getOne(Integer id);
    Optional<InternEntity> findOneById(int id);
    void insert(InternEntity intern, long workId);
    void insert(InternEntity intern);
    void delete(Integer id);
    void updatePartial(Integer id,InternEntity intern);
    void updateAll(Integer id,InternEntity intern);
}
