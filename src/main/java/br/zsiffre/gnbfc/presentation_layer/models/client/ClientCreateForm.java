package br.zsiffre.gnbfc.presentation_layer.models.client;

import br.zsiffre.gnbfc.data_acces_layer.entities.ClientEntity;
import br.zsiffre.gnbfc.data_acces_layer.entities.InternEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



@Data
public class ClientCreateForm {
    @NotBlank(message="client_name field can't be empty")
    private String clientName;

    public ClientEntity toEntity(){
        ClientEntity entity=new ClientEntity();
        entity.setClientName(clientName);
        return entity;
    }
}
