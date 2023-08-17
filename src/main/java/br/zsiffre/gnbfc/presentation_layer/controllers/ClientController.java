package br.zsiffre.gnbfc.presentation_layer.controllers;

import br.zsiffre.gnbfc.business_layer.services.client.ClientService;
import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.WorkEntity;
import br.zsiffre.gnbfc.presentation_layer.models.Intern.Intern;
import br.zsiffre.gnbfc.presentation_layer.models.Intern.InternCreateForm;
import br.zsiffre.gnbfc.presentation_layer.models.client.Client;
import br.zsiffre.gnbfc.presentation_layer.models.client.ClientCreateForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(path={"/client"})
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping(path = {"","/"})
    public List<ClientEntity> getAllClient(){
        return this.clientService.findAll();
    }





    @PostMapping(path={"","/"})
    public ResponseEntity<Client> addClient(
            @Valid @RequestBody ClientCreateForm form
    ){
        ClientEntity entity =form.toEntity();
        this.clientService.insert(
                entity
        );
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Client.fromBll(entity))
                ;
    }
















//    @DeleteMapping("/{id}")
//    public void deleteInternById(@PathVariable("id") Integer id){
//        clientService.delete(id);
//    }
//    @PutMapping("/{id}")
//    public void update(@PathVariable Integer id, @RequestBody InternCreateForm intern){
//        System.out.println(intern);
//        clientService.updateAll(id,intern.toEntity());
//    }
//    @PatchMapping("/{id}")
//    public void updatePartial(@PathVariable Integer id, @RequestBody InternCreateForm intern){
//        this.clientService.updatePartial(id,intern.toEntity());
//    }
//
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<?> handle(RuntimeException ex){
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                .body(ex.getMessage());
//    }



}
