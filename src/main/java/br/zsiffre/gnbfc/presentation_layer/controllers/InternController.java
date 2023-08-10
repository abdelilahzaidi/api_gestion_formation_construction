package br.zsiffre.gnbfc.presentation_layer.controllers;


import br.zsiffre.gnbfc.business_layer.services.InternService;
import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import br.zsiffre.gnbfc.presentation_layer.models.Intern;
import br.zsiffre.gnbfc.presentation_layer.models.InternCreateForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path={"/intern"})
public class InternController {
    private final InternService internService;
    @Autowired
    public InternController(InternService internService) {
        this.internService = internService;
    }

    @GetMapping({"/", ""})
    public  List<InternEntity> getAllIntern(){
        return this.internService.findAll();
    }


    @PostMapping(path={"","/"})
    public ResponseEntity<Intern> addIntern(
            @Valid @RequestBody InternCreateForm form
            ){
            InternEntity entity =form.toEntity();
            this.internService.insert(
                    entity
            );
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Intern.fromBll(entity));
    }
    @DeleteMapping("/{id}")
    public void deleteInternById(@PathVariable("id") Integer id){
        internService.delete(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody InternCreateForm intern){
        internService.updateAll(id,intern.toEntity());
    }
    @PatchMapping("/{id}")
    public void updatePartial(@PathVariable Integer id, @RequestBody InternCreateForm intern){
        this.internService.updatePartial(id,intern.toEntity());
    }

}
