package br.zsiffre.gnbfc.presentation_layer.controllers;

import br.zsiffre.gnbfc.business_layer.services.Work.WorkService;
import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import br.zsiffre.gnbfc.presentation_layer.models.works.WorkCreateForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path={"/work"})
public class WorkController {

    private final WorkService workService;

    @Autowired
    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping(path = {"","/"})
    public List<WorkEntity> getAllWork(){
        return this.workService.findAll();
    }

    @PostMapping(path={"","/"})
    @ResponseStatus(HttpStatus.CREATED) // par defaut: 200 - OK
    public ResponseEntity<Integer>  addWork(
            @Valid @RequestBody WorkCreateForm dto
    ){
        WorkEntity entity = this.workService.beginWork(dto.getIdIntern(),dto.getIdClient());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(entity.getId());
    }
}
