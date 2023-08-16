package br.zsiffre.gnbfc.presentation_layer.controllers;

import br.zsiffre.gnbfc.business_layer.services.Work.WorkService;
import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import jakarta.validation.Valid;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<Work> addWork(
            @Valid @RequestBody WorkCreateForm form
    ){

    }
}
